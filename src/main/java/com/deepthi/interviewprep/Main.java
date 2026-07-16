package com.deepthi.interviewprep;

import java.util.Scanner;

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

        //Stack problems..
        StackProblems st = new StackProblems();
        st.machingParanthesis();

        //java generics
        JavaGenerics jg = new JavaGenerics();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");

        // Read integers
        int n = sc.nextInt();
        Integer[] intArray = new Integer[n];
        System.out.println("Enter the int elements : ");
        for (int i = 0; i < n; i++) {

            intArray[i] = sc.nextInt();

        }

        //Important: consume leftover newline
        sc.nextLine();

        // Read strings
        System.out.println("Enter number of elements : ");
        int s = sc.nextInt();
        String[] stringArray = new String[s];
        sc.nextLine(); // consume newline again
        System.out.println("Enter string elements : ");
        for(int i = 0;i<s;i++){
            stringArray[i] = sc.nextLine();
        }
        //

        jg.printArray(intArray);
        jg.printArray(stringArray);
        sc.close();

        //Sudoku
        Sudoku sudoku = new Sudoku();
        char[][] board = {

                {'5','3','.','.','7','.','.','.','.'},

                {'6','.','.','1','9','5','.','.','.'},

                {'.','9','8','.','.','.','.','6','.'},

                {'8','.','.','.','6','.','.','.','3'},

                {'4','.','.','8','.','3','.','.','1'},

                {'7','.','.','.','2','.','.','.','6'},

                {'.','6','.','.','.','.','2','8','.'},

                {'.','.','.','4','1','9','.','.','5'},

                {'.','.','.','.','8','.','.','7','9'}

        };
        boolean resultSudoku = sudoku.isValidSudoku(board);

        System.out.println(resultSudoku);

        //Linked List Example
        LinkedListExample list = new LinkedListExample();
        System.out.println("Linked List : ");
        list.createList();
        list.printList();
    }


}