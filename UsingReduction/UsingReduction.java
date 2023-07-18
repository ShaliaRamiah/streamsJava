import java.util.*;
public class UsingReduction {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Wel", "Welcome", "for", "Welcoming", "Welcome Here");
        Optional<String> longestString = words.stream()
        .reduce((word1, word2)-> word1.length() > word2.length()? word1 : word2);
        longestString.ifPresent(System.out::println);
    }
}