package jayhomeworkweek6;

import java.util.Scanner; // import java scanner file

public class Program13 {
// main method
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  // creating object form scanner class

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        // pint statement for average of three numbers
        System.out.println("Average of three numbers is: " +
                (num1 + num2 + num3) /3);
    }
}

