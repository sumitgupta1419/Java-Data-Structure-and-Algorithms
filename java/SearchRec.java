public class SearchRec {
    static boolean search(int[] a, int target, int idx) {
        // base case
        if (idx >= a.length) {
            return false;
        }
        // self work
        if (a[idx] == target) {
            return true;
        }
        // recursive call
        return search(a, target, idx + 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 6};
        int target = 16;
        if (search(a, target, 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
