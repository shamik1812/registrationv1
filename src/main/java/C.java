import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("mike","me","bike","madam");
        List<String> newData = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
        System.out.println(newData);
    }
}
