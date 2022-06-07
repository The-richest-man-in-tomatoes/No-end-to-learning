package demo08;

import demo06.UserVO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author mac
 */
public class LamdbaFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(numbers.stream().filter(i -> i <= 5).count());
        List<Integer> list = numbers.stream().filter(i -> i <= 5).collect(Collectors.toList());
        list.forEach(number -> {
            System.out.println(number);
        });

        System.out.println("-----------------------");
        // 并行（parallel）
        long count = numbers.parallelStream().filter(num -> num <= 8).count();
        System.out.println(count);

        new Random().ints().limit(10).forEach(System.out::println);
        System.out.println("-------------------------");
        List<String> list1 = new ArrayList<>();
        list1.add("zhy");
        list1.add("");
        list1.add("mng");
        list1.add("ahg");
        String collect = list1.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining("--"));
        System.out.println(collect);

        list1.stream().skip(1).limit(2).forEach(str -> System.out.println(str));

        ArrayList<UserVO> userVOArrayList = new ArrayList<>();
        userVOArrayList.add(new UserVO("ZHY1", 21));
        userVOArrayList.add(new UserVO("ZHY2", 22));
        userVOArrayList.add(new UserVO("YUU3", 23));
        userVOArrayList.add(new UserVO("OOO4", 24));

        // Test git rebase
        // 1
        // 2
        userVOArrayList.stream().sorted((o1, o2) -> o2.getAge() - o1.getAge()).filter(userVO -> userVO.getName().contains("ZHY")).limit(1).forEach(userVO -> System.out.println(userVO));
    }
}
