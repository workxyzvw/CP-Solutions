import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        int i = 1;

        while (i <= n) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                result.add("FizzBuzz");
            } else if ((i % 3) == 0) {
                result.add("Fizz");
            } else if ((i % 5) == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
            i++;
        }

        return result;
    }
}
