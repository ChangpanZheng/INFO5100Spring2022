public class Q2 {
    public static void main(String[] args) {
        String s1 = "aabcccccaaa";
        String s2 = "ab";
        System.out.println(compressString(s1));
        System.out.println(compressString(s2));
    }

    public static String compressString(String str){
        //TODO: Write your code here
        if (str == null || str.length() == 0) {
            return str;
        }

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while (j < str.length()) {
            if (str.charAt(i) != str.charAt(j)) {
                sb.append(str.charAt(i));
                sb.append(j - i);
                // i point to next one
                i = j;
            }
            j++;
        }
        // put the last item in str to sb
        sb.append(str.charAt(i));
        sb.append(j - i);

        if (sb.length() >= str.length()) {
            return str;
        }

        return sb.toString();
    }
}
