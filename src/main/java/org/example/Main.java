package org.example;
import java.util.Scanner;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float celsius;
        // Get celsius input
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextFloat();
        // Fahrenheit input
        float fahrenheit = celsius * (9/5.0f) + 32;
        //Display Fahrenheit output
        System.out.printf("Temperature in Fahrenheit: %.2f", fahrenheit );
    }
}