import java.util.Stack;

/**
 * @author anobis
 */
public class Problem20 {
    public static void main(String[] args) {
        System.out.println(isValid("[](){}"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("([{})]"));
        System.out.println(isValid("(())[[{}]])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> braces = new Stack<>();

        for (char paren : s.toCharArray()) {
            switch(paren) {
                case '(':
                    braces.push(')');
                    break;
                case '[':
                    braces.push(']');
                    break;
                case '{':
                    braces.push('}');
                    break;
                default:
                    if (braces.isEmpty()) {
                        return false;
                    }
                    char val = braces.pop();
                    if (val != paren) {
                        return false;
                    }
                    break;
            }
        }
        return braces.isEmpty();
    }
}
