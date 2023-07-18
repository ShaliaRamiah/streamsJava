import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class partition {
    public static void main(String[] args) {
        Stream<Integer>
        s = Stream.of(10, 12, 9, 5, 2);
        Map<Boolean, List<Integer> >
        map = s.collect( Collectors.partitioningBy(num -> num > 6));
        System.out.println("Elements in stream are " + "splitted into two parts:" + " True for greater than 6 and False for less than 6\n" + map);
    }
}