package arraysandstrings;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string with only parenthesis find out if it is balanced or not
 * Created by domesc on 06/03/16.
 */
public class BalancedParenthesis {

    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{','}');
        map.put('[',']');
        map.put('(',')');

        for (int i=0;i<s.length();i++) {
            if (map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && map.get(stack.peek()).equals(s.charAt(i))) {
                stack.pop();
            } else
                return false;
        }

        return stack.empty();
    }
}
