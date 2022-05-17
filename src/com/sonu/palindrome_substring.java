package com.sonu;

public class palindrome_substring {
    public static void main(String[] args) {
        String s = "bb";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }

    static String longestPalindrome(String s) {
        String substr ;
        int length = s.length() ;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                substr = s.substring(j, length-i + j);
                boolean palin = isPalindrome(substr);
                if(palin){
                    return substr;
                }
            }
        }
        return "nothing";
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}