public class SelectionSort {
    public static void selectionsort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            int min_index = i;
            for (int j = i + 1; j < n; j++){ // Corrected initialization of inner loop

                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 51, 2, 54};
        selectionsort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Print each element on a new line
        }
    }
}
