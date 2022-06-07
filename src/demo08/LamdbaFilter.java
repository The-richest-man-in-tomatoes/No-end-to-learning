package demo08;

import java.util.Arrays;
import java.util.List;
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
    }
}
