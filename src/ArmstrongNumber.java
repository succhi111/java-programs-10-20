import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Entered number " + a);
        int b = a, c = a;
        int length = 0, rem, arm = 0;
        while (a != 0) {
            length += 1;
            a = a / 10;
        }
        while (b != 0) {
            rem = b % 10;
            int multi = 1;
            for (int i = 0; i < length; i++) {
                multi *= rem;
            }
            arm += multi;
            b = b / 10;
        }
        if (c == arm) {
            System.out.print(" is an armstrong number.");
        } else System.out.print(" is not an armstrong number.");

    }
}