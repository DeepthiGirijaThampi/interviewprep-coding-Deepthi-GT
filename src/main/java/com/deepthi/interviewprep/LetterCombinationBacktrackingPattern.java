package com.deepthi.interviewprep;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationBacktrackingPattern {

        public List<String> letterCombinations(String digits) {
            // 2 → abc
            // 3 → def
            // 4 → ghi
            // 5 → jkl
            // 6 → mno
            // 7 → pqrs
            // 8 → tuv
            // 9 → wxyz

            List<String> result = new ArrayList();
            if (digits == null || digits.isEmpty())
            {
                return result;
            }
            String[] mapping = {
                    "",
                    "",
                    "abc",
                    "def",
                    "ghi",
                    "jkl",
                    "mno",
                    "pqrs",
                    "tuv",
                    "wxyz"
            };

            backtrack(digits,0,new StringBuilder() ,result, mapping);
            return result;

        }
        private void backtrack(
                String digits,
                int index,
                StringBuilder current,
                List<String> result,
                String[] mapping) {
            //Base case
            if (index == digits.length()) {

                result.add(current.toString());

                return;

            }
            char digit = digits.charAt(index);
            int number = digit - '0';
            String letters = mapping[number];
            for (int i = 0; i < letters.length(); i++) {
                char letter = letters.charAt(i);
                // Choose
                current.append(letter);
                // Explore the next digit
                backtrack(digits, index + 1, current, result, mapping);
                // Undo
                current.deleteCharAt(current.length() - 1);
            }
        }

}
