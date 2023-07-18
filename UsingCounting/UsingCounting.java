import java.util.stream.Stream;
import java.util.stream.Collectors;
public class UsingCounting {
    public static void main(String[] args) {
        Stream<Integer> i = Stream.of(12, 2, 33, 45, 5, 6);
        long count_int = i.collect(Collectors.counting());
        System.out.println(count_int);
    }
}