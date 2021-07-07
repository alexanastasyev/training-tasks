package longest_palindromic_substring;

/*
    Given a string s, return the longest palindromic substring in s.
 */

class Solution {
    public String longestPalindrome(String s) {
        String currentLongest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    String currentSubstring = s.substring(i, j + 1);
                    if (isPalindromic(currentSubstring)) {
                        if (currentSubstring.length() > currentLongest.length()) {
                            currentLongest = currentSubstring;
                        }
                        break;
                    }
                }
            }
        }
        return currentLongest;
    }

    private boolean isPalindromic(String s) {
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
