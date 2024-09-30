import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(10,20,30,23,35,32,34);
        List<Integer> newData = data.stream().filter(x -> x%2!=0).collect(Collectors.toList());
        System.out.println(newData);
    }
}
