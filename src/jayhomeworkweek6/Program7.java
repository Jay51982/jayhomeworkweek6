package jayhomeworkweek6;
//program Fahrenheit to Celsius
import java.util.Scanner;

public class Program7 {

    static Scanner sc = new Scanner(System.in);
// main method
    public static void main(String args[]) {
        System.out.print("Enter the radius: ");

        double radius = sc.nextDouble();
        //Area = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        //Circumference = 2*PI*radius
        double circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is:" + circumference);
    }
}