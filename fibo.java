import java.util.Scanner;

public class fibo {

    public static void main(String[] var0) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the position (n): ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
};