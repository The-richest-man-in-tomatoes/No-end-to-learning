package demo09;

import java.time.Duration;
import java.time.Instant;
import java.util.OptionalLong;
import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class LamdbaParallel {
    public static void main(String[] args) {
        Instant start = Instant.now();
        LongStream longStream = LongStream.rangeClosed(0, 50000000000L);

        OptionalLong result = longStream.parallel().reduce(new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left + right;
            }
        });

        System.out.println(result.getAsLong());
        Instant end = Instant.now();
        System.out.println(Duration.between(start,end).toMillis());

    }
}
