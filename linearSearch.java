import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int[] array = { 12, 13, 14, 15, 16, 17 };

        int target = 17;

        for (int i = 0; i < array.length; i++) {
            if (target == array[i]) {
                System.out.print(i);
            }
        }

    }

}
