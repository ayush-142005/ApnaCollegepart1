/*import java.util.*; // input
public class Varibles{
    public static void main(String[] args)  { //Bioler plate code
        // Output
        System.out.println("Hello World with Java");
        System.out.println("hello world with java");
        System.out.println("*\n**\n***\n****\n*****");
        // Variable
        //String name="Ayush hood";
        int age=18;
        long Package=5000000;
        int a=10;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        Scanner sc = new Scanner(System.in); // Input Function
        String name = sc.next();
        String fullname = sc.nextLine();
        System.out.println(name);
        System.out.println(fullname);

    }
}*/
// Take 2 variable 'a' & b' and print the sum
import java.util.*;
public class Varibles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
