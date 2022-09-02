import java.util.Scanner;

public class ArmstrongRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int num2 = sc.nextInt();
        for (int i = num1; i <=num2 ; i++) {
            int a=i;
            int b=a,c=a;
            int length=0, rem, arm=0;
            while (a!=0){
                length+=1;
                a=a/10;
            }
            while (b!=0) {
                rem=b%10;
                int multi=1;
                for (int j = 0; j < length; j++) {
                    multi*=rem;
                }
                arm+=multi;
                b=b/10;
            }
            if (c==arm){
                System.out.println(i+" is an armstrong number.");
            }
        }
    }
}