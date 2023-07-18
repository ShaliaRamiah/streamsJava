import java.util.*;
import java.util.stream.LongStream;
public class UsingLong {
    public static void main(String[] args) {
        LongStream stream = LongStream.generate(()-> { return (long)(Math.random() * 10000); });
        stream.limit(7).forEach(System.out::println);
    }
}