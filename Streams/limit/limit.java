import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class limit {
    public static void main(String[] args) {
        Stream<Integer> result = Stream.iterate(0, n -> n + 2);
        List<Integer> newList = result.limit(10)
        .collect(Collectors.toList());
        System.out.println(newList);
    }
}