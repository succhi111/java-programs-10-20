import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {

        System.out.println("Enter the number to find sum ");
        Scanner r= new Scanner(System.in);
        int num=r.nextInt();
        int sum = 0;

        while (num != 0) {

            sum += num % 10;
            num = num / 10;
        }

        System.out.println("the sum of all digit of the given number is " + sum);
    }

}
