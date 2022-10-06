package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello vom asem branch!");
        System.out.println("Hello world!");
        System.out.println("Dennis war hier!");
        System.out.println("Mit seinem 1 side Branch vom Masterbranch!!!");

        System.out.println("Hello vom asem branch!");

        int result = addValue(1,2);
        System.out.println("Result : " + result);
    }

    public static int addValue(int value, int value2){
        return (value+value2);
    }
}