package jayhomeworkweek6;
import java.util.Scanner;     //import java file

public class Program17 {

// java program to covner a decimal number to binary number
        public static void main(String args[]) // main method
  {
            int dec_num, quot, i=1, j;  //variable declare
            int bin_num[] = new int[100];  // variable declare
            Scanner scan = new Scanner(System.in);

            System.out.print("Input a Decimal Number : ");
            dec_num = scan.nextInt();

            quot = dec_num;

            while(quot != 0)
            {
                bin_num[i++] = quot%2;
                quot = quot/2;
            }

            System.out.print("Binary number is: ");
            for(j=i-1; j>0; j--)
            {
                System.out.print(bin_num[j]);
            }
            System.out.print("\n");
        }
}
