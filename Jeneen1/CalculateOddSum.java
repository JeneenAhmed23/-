public class CalculateOddSum {
    public static void main(String[] args) {
        int n = 10;
        int oddSum = calculateOddSum(n);
        System.out.println( "the number: "+n + " is: " + oddSum+" oddSum");
    }
    public static int calculateOddSum(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

}
