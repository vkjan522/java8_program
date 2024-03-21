package Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> evenInt = IntStream.range(1, 100)
                                        .boxed()
                                        .filter(e ->e % 2 ==0)
                                        .collect(Collectors.toList());
        System.out.println("Even Numbers: "+evenInt);

        List<Integer> oddInt = IntStream.range(1, 50)
                                     .boxed()
                                    .filter(e ->e % 2 !=0)
                                    .collect(Collectors.toList());
        System.out.println("ODD Numbers: "+oddInt);

    }
}
