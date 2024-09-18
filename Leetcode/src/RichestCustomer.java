public class RichestCustomer {
    public static void main(String[] args) {
        int [][] a = new int[][] {{6,59,64,19,30,76,71,86,90,25,56,17,19,72,61,56,24,40,35,39,67,28,52,11,82,72,8,82,81,47}};
        System.out.println(maximumWealth(a));
    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        int highestTotal = 0;

        for (int i = 0; i < accounts.length; ++i) {
            for (int j = 0; j < accounts[i].length; ++j) {
                if (i < accounts.length) highestTotal += accounts[i][j];
            }
            if (highestTotal > result) {
                result = highestTotal;
            }
            highestTotal = 0;
        }

        return result;
    }
}
