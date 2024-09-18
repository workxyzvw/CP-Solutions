import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int ori[] =  new int[100];
        int copy[] = new int[ori.length + 100];
        System.out.println(ori.length);
        System.out.println(copy.length);



        System.out.println(Arrays.toString(runningSum(new int[] {1, 4, 5, 6})));
    }

    public static int[] runningSum(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i <= numbers.length-1; i++) {
            if (i == 0) result[i] = numbers[i];
            if (i >= 1 && i <= numbers.length) {
                result[i] = numbers[i] + result[i-1];
            }
        }

        return result;
    }
}
