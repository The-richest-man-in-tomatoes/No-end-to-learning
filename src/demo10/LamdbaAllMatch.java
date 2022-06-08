package demo10;

import java.util.ArrayList;

public class LamdbaAllMatch {
    public static void main(String[] args) {
        ArrayList<UserVO> userList = new ArrayList<>();
        userList.add(new UserVO("ZHY-0", 10));
        userList.add(new UserVO("ZHY-01", 11));
        userList.add(new UserVO("ZHY-0", 12));


        int sum = userList.stream().filter(userVO -> userVO.getName().equals("ZHY-0")).mapToInt(userVO -> userVO.getAge()).sum();
        System.out.println(sum);

        // list中UserVO.name的值是否都等于"ZHY-00"
        System.out.println(userList.stream().allMatch(userVO -> userVO.name.equals("ZHY-00")));
        // list中UserVO.name的值是否存在等于"ZHY-00"的个体
        System.out.println(userList.stream().anyMatch(userVO -> userVO.name.equals("ZHY-01")));


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
