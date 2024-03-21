package Test;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FabonacciSeries {
    public static void main(String[] args) {

        Stream.iterate(new Long[]{0L, 1L}, i -> new Long[]{i[1], i[0]+i[1]})
                .limit(10)
                .map( arr -> arr[0])
                .forEach(System.out::println);

       Long sum = Stream.iterate(new Long[]{0L, 1L}, i -> new Long[]{i[1], i[0]+i[1]})
                .limit(10)
                .map( arr -> arr[0])
                .mapToLong(e -> e)
                .sum();
       System.out.println("Sum of fibonacci series:"+sum);












    }
}
