import java.util.*;

public class TwoSums{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        boolean valid = true;

        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else {

                // If stack is empty
                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                // Check matching
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    valid = false;
                    break;
                }
            }
        }

        // If stack still has elements
        if (!stack.isEmpty()) {
            valid = false;
        }

        System.out.println(valid);
    }
}