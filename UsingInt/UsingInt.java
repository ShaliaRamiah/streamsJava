import java.util.*;
import java.util.stream.IntStream;
public class UsingInt {
    public static void main(String[] args) {
    IntStream stream = IntStream.range(13, 17);
    stream.forEach(System.out::println);
    }
}