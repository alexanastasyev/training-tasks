package letter_combination_of_a_phone_number;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        return recursiveSearch(digits);
    }

    private List<String> recursiveSearch(String digits) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            if (i < digits.length() - 1) {
                result.addAll(recursiveSearch(digits.substring(i + 1, digits.length())));
            }
            List<Character> digitChars = getDigitLetters(digits.charAt(i));
            if (result.isEmpty()) {
                for (Character letter : digitChars) {
                    result.add(String.valueOf(letter));
                }
            } else {
                List<String> newResult = new ArrayList<>();
                for (Character letter : digitChars) {
                    for (String word : result) {
                        String newWord = String.valueOf(letter) + word;
                        newResult.add(newWord);
                    }
                }
                return newResult;
            }
        }
        return result;
    }

    private List<Character> getDigitLetters(Character digit) {
        List<Character> result = new ArrayList<>();
        switch (digit) {
            case '2':
                result.add('a');
                result.add('b');
                result.add('c');
                break;
            case '3':
                result.add('d');
                result.add('e');
                result.add('f');
                break;
            case '4':
                result.add('g');
                result.add('h');
                result.add('i');
                break;
            case '5':
                result.add('j');
                result.add('k');
                result.add('l');
                break;
            case '6':
                result.add('m');
                result.add('n');
                result.add('o');
                break;
            case '7':
                result.add('p');
                result.add('q');
                result.add('r');
                result.add('s');
                break;
            case '8':
                result.add('t');
                result.add('u');
                result.add('v');
                break;
            case '9':
                result.add('w');
                result.add('x');
                result.add('y');
                result.add('z');
                break;
        }
        return result;
    }
}