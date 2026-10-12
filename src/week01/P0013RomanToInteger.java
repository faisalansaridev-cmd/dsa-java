package week01;

// LC 13 Roman to Integer
// Pattern: Math / String Parsing
// Time O(n) Space O(1)
// Easy 09 Oct 2026
// Signal: "If current value is less than the next value, subtract it; otherwise, add it."
// Solved: watched solution

class P0013RomanToInteger {
    public int romanToInt(String s) {
        int roman_num = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            if (i + 1 < s.length() && current < getValue(s.charAt(i + 1))) {
                roman_num -= current;
            } else {
                roman_num += current;
            }
        }
        return roman_num;
    }

    private int getValue(char c) {
         if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        }
        return 0;
    }
}