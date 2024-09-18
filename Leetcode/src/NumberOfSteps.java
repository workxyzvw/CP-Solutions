public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    public static int numberOfSteps(int num) {
        int result = 0;
        while (num > 0) {
            if ((num | 1) > num) {
                num /= 2;
                result += 1;
            }
            if ((num | 1) == num) {
                num -= 1;
                result +=1;
            }
        }
        return result;
    }
}
