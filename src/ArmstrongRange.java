import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        int arm = 0;
        int r = 0;

        System.out.println("program to find armstrong in the given range");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the upper limit");
        int u = sc.nextInt();
        System.out.println("enter the lower limit");
        int l = sc.nextInt();
        for (int i = u; i <= l; i++) {
            int num = i;

            while (num >0) {
                r = num % 10;
                arm = (r * r * r) + arm;
                num = num / 10;

                if (arm == i)
                    System.out.println(arm);
            }
        }
    }

}