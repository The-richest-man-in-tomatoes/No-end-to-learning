package demo12;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Peek {
    public static void main(String[] args) {
        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        collect.forEach( x -> System.out.println(x));
    }
}
