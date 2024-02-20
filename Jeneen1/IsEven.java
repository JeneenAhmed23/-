public class IsEven {
    public static void main(String[] args) {
        int i=3;
        boolean even=isEven(i);
        System.out.println(" the number "+i+" is even? "+even);
    }
    public static boolean isEven(int i) {
        return (i ^ 1) == i + 1;
    }
}

