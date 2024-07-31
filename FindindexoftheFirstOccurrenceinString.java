package CrackYourPlacementDay11;

public class FindindexoftheFirstOccurrenceinString {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        FindindexoftheFirstOccurrenceinString solution = new FindindexoftheFirstOccurrenceinString();

        // Test cases
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(solution.strStr(haystack1, needle1)); // Output: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(solution.strStr(haystack2, needle2)); // Output: -1
    }
}
