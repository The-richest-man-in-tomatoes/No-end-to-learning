package demo05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class LamdbaStream {
    public static void main(String[] args) {
        UserVO userVO1 = new UserVO("ZHY", 20);
        UserVO userVO2 = new UserVO("ZHY", 20);

        // 在默认的情况下 equals 方法比较两个对象的内存地址是否相等
        System.out.println(userVO1.equals(userVO2));
        System.out.println("1".equals("1"));

        HashMap<UserVO, String> map = new HashMap<>();
        map.put(userVO1, "abc");
        map.put(userVO2, "def");
        map.forEach((k,v)->{
            if (map.containsKey(k)){
                System.out.println("key: " + k + " --- " + "value: " + v);
            } else {
                map.put(k, v);
            }
        });

        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(userVO1);
        arrayList.add(userVO2);

        Set<Object> objectSet = arrayList.stream().collect(Collectors.toSet());
        objectSet.forEach((s)-> {
            System.out.println(s);
        } );
    }
}
