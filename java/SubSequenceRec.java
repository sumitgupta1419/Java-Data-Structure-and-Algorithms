public class SubSequenceRec {
    static void printssq(String s, String currAns) {
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remstring = s.substring(1);

        printssq(remstring, currAns + curr); // Include current character
        printssq(remstring, currAns);        // Exclude current character
    }

    public static void main(String[] args) {
        String currAns = ""; // Initialize currAns as an empty string
        printssq("abc", currAns);
    }
}
