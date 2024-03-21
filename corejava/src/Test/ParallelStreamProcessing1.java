package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamProcessing1 {
    public static void main(String[] args) {
        String[] arr = {"vikash", "deepak","sonam","khushboo"};

        List<String> list1 = Arrays.asList(arr).stream()
                .map(e -> {
                            System.out.println("lowerCasing:"+e);
                           return e.toLowerCase();
                        })
                .map(e ->{
                          System.out.println("Adding exclamation Symbol:"+e);
                          return e+"!";
                        })
                .collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("=++++++++++++++++++++");
        List<String> list2 = Arrays.asList(arr).parallelStream()
                .map(e -> {
                    System.out.println("lowerCasing:"+e);
                    return e.toLowerCase();
                })
                .map(e ->{
                    System.out.println("Adding exclamation Symbol:"+e);
                    return e+"!";
                })
                .collect(Collectors.toList());

        System.out.println(list2);




    }
}
