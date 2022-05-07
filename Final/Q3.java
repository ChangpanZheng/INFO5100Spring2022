import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        //TODO: Write your code here
        int[] array = new int[128];

        Arrays.fill(array, -1);
        int left = 0, right = 0, max = 0;

        for (right = 0; right < s.length(); right++) {
            if (array[s.charAt(right)] >= 0) {
                left = Math.max(left, array[s.charAt(right)] + 1);
            }
            array[s.charAt(right)] = right;
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
