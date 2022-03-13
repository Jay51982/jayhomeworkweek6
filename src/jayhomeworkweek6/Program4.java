package jayhomeworkweek6;
/*
4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.
*/
public class Program4 {
         //4.1 Declare two instance and two static variables.

    static String string3 = "Pramukh Swami";
    int a = 100;

    //4.1 Declare two instance and two static variables.
    static String string1 = "Mahotsave Ni";
    static String string2 = " Jay";

    // 4.2 Declare one instance method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public void print1() {
        System.out.println(string3);
        System.out.println(a);
        System.out.print(string1);
        System.out.println(string2);

    }

    //4.3 Declare one static method.
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void print2() {
        Program4 program4 = new Program4();
        System.out.println(program4.string3);
        System.out.println(program4.a);
        System.out.print(string1);
        System.out.println(string2);

    }
// 4.5 Declare the Main method.
// 4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.print1();
        System.out.println("*************");
        print2();
    }

}

