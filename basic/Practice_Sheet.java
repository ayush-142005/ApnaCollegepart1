// Lecture 2
// Question 1
/*public class Practice_Sheet {
    public static void main(String[] args) {
        int age = 18;
        double money = 50000000.5;
        float percentile=3;
        System.out.println(age);
        System.out.println(money);
        System.out.println(percentile);
    }
}*/
// Question 2
/*import java.util.*;
public
class Practice_Sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double Area = 3.14 * radius *radius;
        System.out.println(" the Area of the Circle is"+ Area);
    }
}*/

// Question 3
/*import java.util.*;
public
class Practice_Sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        for (int i=0;i<=10;i++){
            System.out.println(num + " X " + i +" = " + num*i );
        }
    }
}*/

// Lecture 3
//Question 1
/*import java.util.*;
public class Practice_Sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice \n 1.addition 2. subtraction 3.Multiplication 4.Division 5.Module");
        double choice =sc.nextDouble();
        double a = sc.nextDouble();
        double b =sc.nextDouble();
        if (choice==1){
            System.out.println(a+b);
        } else if (choice==2) {
            System.out.println(a-b);
        } else if (choice==3) {
            System.out.println(a*b);
        } else if (choice==4) {
            System.out.println(a/b);
        } else if (choice==5) {
            System.out.println(a%b);
        }
        else {
            System.out.println("Invalid Error");
        }
    }
}*/

// Question 2
/*import java.util.*;
public class Practice_Sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice for the month");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Jan");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
            default:
                System.out.println("Invalid Case");
        }
    }
}*/
// Lecture 4
// Question 1
/*import java.util.*;
public class Practice_Sheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit ");
        int num = sc.nextInt();
        for (int i=1;i<=num;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("this are the even number");
    }
}*/

import java.util.*;
public class Practice_Sheet {
    public static void main(String[] args) {
        for ( ; ; ){
            System.out.println("Apna College");
        }
    }
}