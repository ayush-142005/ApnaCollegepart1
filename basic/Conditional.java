// If-Else Condition
/*import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}*/

/*import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num=sc.nextInt();
        if(Num%2==0){
            System.out.println("Is a Even Number");
        }
        else{
            System.out.println("Is a Odd Number");
        }
    }
}*/
// elif Statment
/*import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        } else if (a>b) {
            System.out.println("A is greater than B");
        }
        else {
            System.out.println(" B is grater than A ");
        }
    }
}*/

//Switch case
import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button= sc.nextInt();
        switch (button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}