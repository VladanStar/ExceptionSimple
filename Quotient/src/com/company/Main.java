package com.company;

import java.util.Scanner;

public class Main {
    public static int quontient(int number1, int number2){
        if(number2 ==0){
            throw new ArithmeticException("Wrong number");
        }
        return number1/number2;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        // Upit korisnika za unos dva cela broja
        System.out.println("Enter two numbers: ");
        System.out.println("a= ");
        int a = input.nextInt();
        System.out.println("b= ");
        int b = input.nextInt();
        try {


            int rezultat = quontient(a, b);
            System.out.println("Rezultat je: " + rezultat);

        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
