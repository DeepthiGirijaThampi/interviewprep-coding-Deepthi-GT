package com.deepthi.interviewprep;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

//Sample Input
//
//{}()
//({()})
//{}(
//[]
//Sample Output
//
//true
//true
//false
//true
public class StackProblems {


    Scanner sc = new Scanner(System.in);
    public void machingParanthesis(){

        while(sc.hasNext()){
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i<input.length(); i++){
                char ch = input.charAt(i);
                if(ch == '(' || ch == '{' || ch == '['){
                    stack.push(ch);
                }else{
                    if(stack.isEmpty()){
                        stack.push(ch);
                        break;
                    }

                    char top = stack.pop();

                    if(ch == ')' && top != '(' || ch == '}' && top != '{'|| ch == ']' && top != '['){
                       stack.push(ch);
                       break;
                    }
                }
            }

            System.out.println(stack.isEmpty());
        }
    }

}
