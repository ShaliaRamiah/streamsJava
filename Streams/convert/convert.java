import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class convert {
    private static Stream<String[]> getMapStream() {
        return Stream.of(new String[][] { {"Fruit", "Kiwi"}, {"Flower", "Orchid"} }); }
    public static void main(String args[]) {
        Stream<String[]> stream = getMapStream();
        Map<String, String> result = stream.collect(Collectors.toMap(e -> e[0], e -> e[1]));
        System.out.println(result);
    }
}