package Test;

import java.util.Optional;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String s ="vikash";
        String char1 = s.chars()
               .filter(c -> s.indexOf(c)!=s.lastIndexOf(c))
                .mapToObj( c -> String.valueOf((char) c))
               .findFirst()
                .orElseGet( () -> "not found!!");

        System.out.println(char1);







    }
}
