public class SearchAtIndex {
    static int findindex(int[] a, int n, int target, int idx) {
        if (idx >= n) return -1; // Base case: if index exceeds array length, return -1
        if (a[idx] == target) return idx; // If target is found, return the current index

        return findindex(a, n, target, idx + 1); // Recursive call to check the next index
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6};
        int target = 16;
        int n = a.length;
        System.out.println(findindex(a, n, target, 0)); // Output the index of the target
    }
}
