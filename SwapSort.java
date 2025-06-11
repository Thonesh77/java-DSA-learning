public class SwapSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2 };

        // Sorting logic using linear comparisons + swapping
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Swap if the current element is greater than the next
                if (arr[i] > arr[j]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
