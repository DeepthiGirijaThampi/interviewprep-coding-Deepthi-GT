package com.deepthi.interviewprep;

public class Main {
    public static void main(String[] args) {

        //method overloading example
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3));
        System.out.println(calculator.add(2, 3, 4));
        System.out.println(calculator.add(2.5, 3.5));

        //method overriding example
        Dog dog = new Dog();
        dog.makeSound(); // Output: Dog barks

        // Encapsulation example
        UrlService urlService = new UrlService();
        String oUrl = "https://www.example.com";
        String sUrl = urlService.generateUrl(oUrl);

        System.out.println("Original URL: " + oUrl);
        System.out.println("Shortened URL: " +"example/"+ sUrl);

        //Two sum
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,12,7,16,7};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(result[0]+","+result[1]);

        //Two sum optimized
        int[] optimizedResult = twoSum.twoSumOptimized(nums,target);
        System.out.println(optimizedResult[0]+","+optimizedResult[1]);

        //Duplicates
        Duplicates obj = new Duplicates();
        boolean res = obj.duplicate(nums);
        System.out.println(res);

        //without set
        boolean res1 = obj.dublicateNotUnsingSet(nums);
        System.out.println(res1);

        //String Palindrome
        StringPalindrome sp = new StringPalindrome();
        boolean val = sp.isStringPalindrome("Malayalam");
        System.out.println(val);

        //first non-repeating character
        StringProblems spObj = new StringProblems();
        int index = spObj.returnNonRepeatingIndex("malayalam");
        System.out.println("Index = "+index);

        //Anagrams
        boolean op = spObj.isAnagram("listen","silent");
        System.out.println(op);

        //Stack problems
        StackProblems st = new StackProblems();
        st.machingParanthesis();
    }
}