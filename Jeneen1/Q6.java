import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        input_Num();
    }

    public static void input_Num() {
        int num[] = new int[4];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter your number: ");
            num[i] = s.nextInt();
        }
        System.out.println("_________________");
        System.out.println(" The Numbers : ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


    }
}

