import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }

    public static boolean isValid(String s) {
        //TODO: Write your code here
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        // cannot return true here
        // stack here may not be null and it's false
        return stack.isEmpty();
    }
}
