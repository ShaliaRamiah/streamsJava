import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class UsingCollect {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of (12, 20, 3, 4, 1, 666, 17, 8);
        Map<Boolean, List<Integer>> map = s.collect (
        Collectors.partitioningBy(num -> num > 13));
        System.out.println ("List are"+ map);
    }
}