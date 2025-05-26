import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        swaper();
    }

    static void swaper() {
        int temp;
        int a = 10;
        int b = 30;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(temp);
    }
}
