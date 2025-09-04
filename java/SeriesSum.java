import java.util.Scanner;

public class SeriesSum {

    // 1 - 2 + 3 - 4 + 5 - 6 + ...
    static int seriesSum(int n) {
        // base case
        if (n == 0) return 0;

        if (n % 2 == 0) {
            return seriesSum(n - 1) - n; // Even index
        } else {
            return seriesSum(n - 1) + n; // Odd index
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Series sum: " + seriesSum(n));
        sc.close(); // Close the scanner
    }
}
