package jayhomeworkweek6;
//java scanner file import

import java.util.Scanner;

// program for calculator
public class Program5 {

    // main method
    public static void main(String args[]) {

        int first, second, add, subtract, multiply;
        float devide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Two Numbers : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        devide = (float) first / second;
        // print statement for output print
        System.out.println("Sum = " + add);
        System.out.println("Subtraction = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
    }
}

