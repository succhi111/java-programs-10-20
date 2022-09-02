import java.util.Scanner;

    public class Factorial {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a= sc.nextInt();
            System.out.println("Factors of the given number are: ");
            for (int i = 1; i <=a ; i++) {
                if (a%i==0){
                    System.out.print(i+", ");
                }
            }
        }
    }
