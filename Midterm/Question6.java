import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {

    }

    public int LongestSubstring(String s) {
        int[] array = new int[128];

        Arrays.fill(array, -1);
        int l = 0, r = 0;
        int maxSize = 0;

        for (r = 0; r < s.length(); r++) {
            if (array[s.charAt(r)] > -1) {
                l = Math.max(l, array[s.charAt(r)] + 1); // make l never retreat
            }
            array[s.charAt(r)] = r;
            maxSize = Math.max(maxSize, r - l + 1);
        }

        return maxSize;
    }
}
