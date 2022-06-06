package demo06;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LamdbaListToMap {
    public static void main(String[] args) {
        ArrayList<UserVO> arrayList = new ArrayList<>();
        arrayList.add(new UserVO("ZHY1", 21));
        arrayList.add(new UserVO("ZHY2", 22));
        arrayList.add(new UserVO("ZHY3", 23));
        arrayList.add(new UserVO("ZHY4", 24));

        Map<String, UserVO> userVOMap = arrayList.stream().collect(Collectors.toMap(userVO -> userVO.getName(), userVO -> userVO));
        userVOMap.forEach((key, value) -> {
            System.out.println(key + " ---- " + value);
        });


    }
}
