import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int num [] = new int[4];
        Scanner ele = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter your number: ");
            num[i] = ele.nextInt();
        }
        System.out.println("________________");
        System.out.println(" The Numbers : ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    }

