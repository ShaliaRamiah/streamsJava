import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class collector {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("France", "UK", "London");
        List<String> reverse = countries.stream()
        .collect(Collectors.collectingAndThen(Collectors.toList(),l -> {
            Collections.reverse(l);
            return l.stream();
            } )).collect(Collectors.toList());
    System.out.println(reverse);
    }
}