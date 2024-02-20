public class calculatePositiveSum {
    public static void main(String[] args) {
        int n = 5;
        int sum = calculatePositiveSum(n);
        System.out.println("the number: "+n + " is: " + sum+" sum");
    }
    public static int calculatePositiveSum(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
