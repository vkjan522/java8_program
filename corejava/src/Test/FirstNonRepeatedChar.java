package Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s ="vikash ikash ";
        int char1 = s.chars()
               .filter(c -> s.indexOf(c)==s.lastIndexOf(c))
               .findFirst()
                .orElseGet( () ->-1);
        System.out.println(char1);







    }
}
