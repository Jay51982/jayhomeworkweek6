package jayhomeworkweek6;

public class Program3 {
    //declare one instance variable and one static variable
    int a = 100;
    static String string = "Pramukh Swami";

    //declare instance method
    public void print1() {
        System.out.println(a);
       // System.out.println(string);
        Program3 program3 = new Program3();
           System.out.println(program3.string);

    }

    //declare static method
    public static void print2() {
        Program3 program3 = new Program3();

        // print statement for output
        System.out.println(program3.a);
        System.out.println(string);
    }

    public static void main(String[] args) {
        Program3 program3 = new Program3();
        program3.print1();

        System.out.println("------------------------------");
        print2();
    }


}
