package jayhomeworkweek6;

import java.util.Scanner; // import java scanner file

public class Program9 {
    //program written for convert upper case to lowercase.

    private static Scanner sc;

    public static void main(String[] args) {
        String uppStr;

        sc = new Scanner(System.in);

        System.out.print("\nEnter Uppercase String to convert =  ");
        uppStr = sc.nextLine();

        String uppStr2 = uppStr.toLowerCase();
        System.out.println("\nThe Lowercase String  =  " + uppStr2);
    }
}
