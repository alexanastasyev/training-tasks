package valid_parentheses;

/*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    An input string is valid if:

    - Open brackets must be closed by the same type of brackets.
    - Open brackets must be closed in the correct order.

    https://leetcode.com/problems/valid-parentheses/
*/

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> openParentheses = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                openParentheses.push(c);
            } else {
                if (openParentheses.empty()) {
                    return false;
                }
                if (areParenthesesSameType(openParentheses.peek(), c)) {
                    openParentheses.pop();
                } else {
                    return false;
                }
            }
        }

        return openParentheses.empty();
    }

    private boolean areParenthesesSameType(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}