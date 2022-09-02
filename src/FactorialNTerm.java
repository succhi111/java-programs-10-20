import java.util.Scanner;
public class FactorialNTerm {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the range: ");
            int c = sc.nextInt();
            int a = 0, b = 1, sum = 0;
            System.out.print("Fibonacci series: "+a+", "+b+", ");
            for (int i = 2; i < c; i++) {
                sum = a + b;
                a = a + b;
                b = a - b;
                a = a - b;
                b = sum;
                System.out.print(sum+", ");
            }
        }
    }
