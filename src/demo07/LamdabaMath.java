package demo07;

import demo06.UserVO;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class LamdabaMath {
    public static void main(String[] args) {
        ArrayList<UserVO> arrayList = new ArrayList<>();
        arrayList.add(new UserVO("ZHY1", 21));
        arrayList.add(new UserVO("ZHY2", 22));
        arrayList.add(new UserVO("ZHY3", 23));
        arrayList.add(new UserVO("ZHY4", 24));

        // 求和
        Optional<UserVO> sum = arrayList.stream().reduce(new BinaryOperator<UserVO>() {
            @Override
            public UserVO apply(UserVO userVO1, UserVO userVO2) {
                UserVO userVO = new UserVO("SUM", userVO1.getAge() + userVO2.getAge());
                return userVO;
            }
        });

        System.out.println(sum.get());
    }

}
