package longest_substring;

import java.util.LinkedList;
import java.util.List;

/*
    Given a string s, find the length of the longest substring without repeating characters.
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = 0;
        List<Character> currentSequence = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!currentSequence.contains(s.charAt(i))) {
                currentSequence.add(s.charAt(i));
            } else {
                if (currentSequence.size() > size) {
                    size = currentSequence.size();
                }
                while (currentSequence.contains(s.charAt(i))) {
                    currentSequence.remove(0);
                }
                currentSequence.add(s.charAt(i));
            }
        }
        if (currentSequence.size() > size) {
            size = currentSequence.size();
        }
        return size;
    }
}
