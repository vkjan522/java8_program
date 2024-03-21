package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamProcessing2 {
    public static void main(String[] args) {
            String[] arr = {"vikash", "deepak","sonam","khushboo"};

        List<String> list1 = Arrays.asList(arr).stream()
                .map(e -> {
                            System.out.println("UpperCasing: "+e);
                           return e.toUpperCase();
                        })
                .filter(e ->{
                          System.out.println("Checking Upper Case: "+e);
                          return e.equals(e.toUpperCase());
                        })
                .collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("=++++++++++++++++++++");
        List<String> list2 = Arrays.asList(arr).parallelStream()
                .map(e -> {
                    System.out.println("UpperCasing: "+e);
                    return e.toUpperCase();
                })
                .filter(e ->{
                    System.out.println("Checking Upper Case: "+e);
                    return e.equals(e.toUpperCase());
                })
                .collect(Collectors.toList());

        System.out.println(list2);


        Stream.of(3,5,3,2,1,2,44,4,5,5,5,50)
                .filter(e -> e % 2 ==0)
                .forEach(System.out::println);

    }
}
