public class evendigits {
    public static void main(String[] args) {

        int[] numbers = { 12, 15, 16, 8, 200 };

        int evenDigitCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            int current = numbers[i];

            while (current > 0) {
                current = current / 10;
                count++;
            }

            if (count % 2 == 0) {
                evenDigitCount++;
            }
        }

        System.out.println("Total numbers with even number of digits: " + evenDigitCount);
    }
}
