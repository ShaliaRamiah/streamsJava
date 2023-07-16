import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;
public class createstream {
    private static <T> void getStream(List<T> list) {
        Stream<T> stream = list.stream();
        Iterator<T> it = stream.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
    public static void main(String[] args)  {
        List<String> result = new ArrayList<>();
        result.add("Welcome");
        result.add("to");
        result.add("uCertify!!");
        getStream(result);
    }
}