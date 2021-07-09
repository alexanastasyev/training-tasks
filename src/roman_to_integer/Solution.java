package roman_to_integer;

/*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000

    For example, 2 is written as II in Roman numeral, just two one's added together.
    12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right.
    However, the numeral for four is not IIII. Instead, the number four is written as IV.
    Because the one is before the five we subtract it making four.
    The same principle applies to the number nine, which is written as IX.
    There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.

    Given a roman numeral, convert it to an integer.
*/
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        while (s.length() > 0) {
            if (checkDoubleRomanSign(s)) {
                result += intValueOf(s.substring(0, 2));
                s = s.substring(2);
            } else {
                result += intValueOf(s.substring(0, 1));
                s = s.substring(1);
            }
        }
        return result;
    }

    private boolean checkDoubleRomanSign(String s) {
        if (s.length() < 2) {
            return false;
        }

        String candidate = s.substring(0, 2);
        return candidate.equals("IV") || candidate.equals("IX") ||
                candidate.equals("XL") || candidate.equals("XC") ||
                candidate.equals("CD") || candidate.equals("CM");
    }

    private int intValueOf(String s) {
        if (s.length() == 2) {
            if (s.equals("IV")) {
                return 4;
            }
            if (s.equals("IX")) {
                return 9;
            }
            if (s.equals("XL")) {
                return 40;
            }
            if (s.equals("XC")) {
                return 90;
            }
            if (s.equals("CD")) {
                return 400;
            }
            if (s.equals("CM")) {
                return 900;
            }
        } else {
            if (s.equals("I")) {
                return 1;
            }
            if (s.equals("V")) {
                return 5;
            }
            if (s.equals("X")) {
                return 10;
            }
            if (s.equals("L")) {
                return 50;
            }
            if (s.equals("C")) {
                return 100;
            }
            if (s.equals("D")) {
                return 500;
            }
            if (s.equals("M")) {
                return 1000;
            }
        }
        return 0;
    }
}
