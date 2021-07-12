package generate_parentheses;

/*
    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

    https://leetcode.com/problems/generate-parentheses/
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> parenthesis = new ArrayList<>();
        parenthesis.add("");
        for (int i = 0; i < 2 * n; i++) {
            List<String> tempParanthesis = new ArrayList<>();
            for (String string : parenthesis) {
                int openAmount = countChar(string, '(');
                int closeAmount = countChar(string, ')');
                if (closeAmount < n && closeAmount < openAmount) {
                    tempParanthesis.add(string + ")");
                }
                if (openAmount < n) {
                    tempParanthesis.add(string + "(");
                }
            }
            parenthesis = tempParanthesis;
        }
        return parenthesis;
    }

    private int countChar(String s, char c) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }
}
