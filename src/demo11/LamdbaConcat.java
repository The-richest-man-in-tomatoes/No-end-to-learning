package demo11;


import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LamdbaConcat {
    public static void main(String[] args) {
        ArrayList<UserVO> userListA = new ArrayList<>();
        userListA.add(new UserVO("ZHY-00", 10));
        userListA.add(new UserVO("ZHY-01", 11));
        userListA.add(new UserVO("ZHY-02", 12));

        ArrayList<UserVO> userListB = new ArrayList<>();
        userListB.add(new UserVO("ZHY-03", 10));
        userListB.add(new UserVO("ZHY-04", 11));
        userListB.add(new UserVO("ZHY-05", 12));

        Stream<UserVO> concat = Stream.concat(userListA.stream(), userListB.stream());

//        concat.forEach(userVO -> System.out.println(userVO));
        Map<String, Integer> collect = concat.collect(Collectors.toMap(userVO -> userVO.getName(), userVO -> userVO.getAge()));
        collect.forEach((k, v)->{
            System.out.println(k + "  " + v);
        });
    }
}

class UserVO {
    String name;
    Integer age;

    public UserVO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

