package integer_to_roman;

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

    Given an integer, convert it to a roman numeral.
*/
class Solution {
    public String intToRoman(int num) {
        int decrementor = 1000;
        String result = "";
        while (num > 0) {
            if (num >= decrementor) {
                num -= decrementor;
                result += romanValueOf(decrementor);
            } else {
                decrementor = nextDecrementor(decrementor);
            }
        }
        return result;
    }

    private String romanValueOf(int number) {
        switch (number) {
            case 1:
                return "I";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 9:
                return "IX";
            case 10:
                return "X";
            case 40:
                return "XL";
            case 50:
                return "L";
            case 90:
                return "XC";
            case 100:
                return "C";
            case 400:
                return "CD";
            case 500:
                return "D";
            case 900:
                return "CM";
            case 1000:
                return "M";
        }
        return "";
    }

    private int nextDecrementor(int decrementor) {
        switch (decrementor) {
            case 1:
                return 0;
            case 4:
                return 1;
            case 5:
                return 4;
            case 9:
                return 5;
            case 10:
                return 9;
            case 40:
                return 10;
            case 50:
                return 40;
            case 90:
                return 50;
            case 100:
                return 90;
            case 400:
                return 100;
            case 500:
                return 400;
            case 900:
                return 500;
            case 1000:
                return 900;
        }
        return 0;
    }
}
