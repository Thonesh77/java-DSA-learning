import java.util.Scanner;
    public static void main(String[] args) {
        sample();

    }

    static void sample() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number");
        int a = in.nextInt();

        System.out.println(a);
        in.close();
    }
};