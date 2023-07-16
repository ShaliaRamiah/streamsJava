import java.util.Arrays;
import java.util.List;
public class FindAny {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc","bca","cab", "cba", "bac");
        list.stream().findAny().ifPresent(s->System.out.println(s));
    }
}