import javax.swing.*;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int r = 0;
        int arm = 0;
        System.out.println("Enter the number to check ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = num;
        while (num > 0) {
            r = num % 10;
            arm = (r * r * r) + arm;
            num = num / 10;
        }
        if (c == arm)
            System.out.println("the number is armstrong");
        else
            System.out.println("the number is not armstrong");
    }
}
