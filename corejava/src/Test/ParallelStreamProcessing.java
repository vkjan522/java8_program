package Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamProcessing {
    public static void main(String[] args) {
        String[] arr = {"vikash", "deepak","sonam","khushboo"};
        List<String> list1 = Arrays.stream(arr)
                .map(e -> e.toLowerCase())
                .collect(Collectors.toList());
        System.out.println(list1);
        System.out.println("++++++++++++++++++++++++++++++");
        List<String> list2 = Arrays.stream(arr)
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("++++++++++++++++++++++++++++++");
        List<String> list3 = Arrays.asList(arr).parallelStream()
                                                .map(e -> e.toLowerCase())
                                                .map(e -> e.toUpperCase()+"!")
                                                .collect(Collectors.toList());
        System.out.println(list3);

    }
}
