package com.deepthi.interviewprep;

public class JavaGenerics {

    public <T> void printArray(T[] array){
        for(T elements : array){
            System.out.println(elements);
        }
    }
}
