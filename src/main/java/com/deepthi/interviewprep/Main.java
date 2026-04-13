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
    }
}