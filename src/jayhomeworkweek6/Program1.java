package jayhomeworkweek6;
//
public class Program1 {
  //Declaring 2 instance variable
    int a = 100;
    int b = 200;

    // Declaring main method and calling instance method
    public static void main(String[] args) {
        Program1 obj = new Program1();
        obj.test();
    }
    //declare instance method and print statement
    public void test(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
    }

}
