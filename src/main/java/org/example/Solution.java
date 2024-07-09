package org.example;

public class Solution {
    public int numDecodings(String s) {
        int[] result = new int[s.length() + 1];
        result[0] = 1;
        result[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            int numOne = Integer.valueOf(s.substring(i - 1, i));
            int numTwo = Integer.valueOf(s.substring(i - 2, i));
            if (numOne >= 1) {
                result[i] += result[i - 1];
            }
            if (numTwo >= 10 && numTwo <= 26) {
                result[i] += result[i - 2];
            }
        }
        return result[s.length()];
    }
}
