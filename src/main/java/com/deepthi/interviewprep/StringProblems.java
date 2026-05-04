package com.deepthi.interviewprep;

import java.util.HashMap;
import java.util.Map;

public class StringProblems {

    //Given a string, find the first non-repeating character
    // and return its index.

    public int returnNonRepeatingIndex(String s){
        Map<Character,Integer> freq = new HashMap<>();
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int count = freq.getOrDefault(c,0);
            freq.put(c,count+1);
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(freq.get(c)==1){
                return i;
            }

        }

        return -1;

    }

    //Anagrams
    public boolean isAnagram(String a , String b){
        HashMap<Character,Integer> freqA = new HashMap<>();
        HashMap<Character,Integer> freqB = new HashMap<>();
        if(a.length() != b.length()){
            return false;
        }
        for(int i =0;i<a.length();i++){
            char c = a.charAt(i);
            int count = freqA.getOrDefault(c,0);
            freqA.put(c,count+1);

        }
//        System.out.println(freqA);
        for(int i =0;i<b.length();i++){
            char c = b.charAt(i);
            int count = freqB.getOrDefault(c,0);
            freqB.put(c,count+1);
        }
//        System.out.println(freqB);
        if(freqA.equals(freqB)){
            return true;
        }

        return false;
    }

    //Anangram with one Map
    public boolean isAnagramWithOneMap(String a,String b){
        if(a.length() != b.length()){
            return false;
        }
        HashMap<Character,Integer> freq = new HashMap<>();
        for(char c : a.toCharArray()){
            // a = "listen" ->["l","i","s","t","e","n"]
            int count = freq.getOrDefault(c,0);
            freq.put(c,count+1);
        }
        for(char c : b.toCharArray()){
            //b = "silent"
            if(!freq.containsKey(c)){
                return false;
            }
            freq.put(c,freq.get(c)-1);
            if(freq.get(c)==0){
                freq.remove(c);
            }
        }
        return freq.isEmpty();
    }

//    Longest Substring Without Repeating Characters
//s = "abcabcbb" , Longest substring without repeating characters is:"abc" Answer:3
//    Simple idea
//
//Use a sliding window.
//
//Think of it like two pointers:
//
//left
//right
//
//The window keeps characters that are currently unique.



}
