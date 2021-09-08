package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// exercise 1
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double Celsius = Scanner.nextDouble();

        double Fahrenheit = Celsius * 9 / 5 + 32;

        System.out.printf("%.1f C = %.1f F\n", Celsius, Fahrenheit);



    }
}
