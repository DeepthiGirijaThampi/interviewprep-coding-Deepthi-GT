package com.deepthi.interviewprep;

//mom -> palindrome -> true
public class StringPalindrome {

    public boolean isStringPalindrome(String s){
        String ss = s.toLowerCase();
        int left = 0;
        int right = ss.length()-1;

        while(left < right){

            if(ss.charAt(left) == ss.charAt(right)){
                left ++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}
