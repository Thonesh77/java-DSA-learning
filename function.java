import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        sum();

    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number");
        int a = in.nextInt();

        System.out.println(a);
        in.close();
    }
};