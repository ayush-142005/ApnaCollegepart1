import java.util.Scanner;

// print number from 5 to 1
/*import java.util.*;
public class Recursion {
    public static void num_p(int n){
        if (n==0){
            return ;
        }
        System.out.println(n);
        num_p(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number"+" ");
        int n= sc.nextInt();
        num_p(n);
    }
}*/
// print sum of first n natural numbers
/*import java.util.*;
public class Recursion {
    public static void sum(int n,int sum){
        if (n==0){
            System.out.println(sum);
        }
        sum+=n;
        sum(n-1,sum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the number ");
        int n=sc.nextInt();
        sum(n,0);
    }
}*/
// factorial series
/*import java.util.*;
public class Recursion {
    public static int fact_cal(int n){
        if (n==0||n==1){
            return 1;
        }
        int fact_num1 = fact_cal(n-1);
        int fact = n*fact_num1;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        System.out.println(fact_cal(n));
    }
}*/

// fibonnaci series
/*import java.util.*;
public class Recursion {
    public static void fib_print(int a, int b, int n){
        if(n==0){
            return ;
        }
        int c=a+b;
        fib_print(b,c,n-1);
        return ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number ");
        int n = sc.nextInt();
        System.out.println(fib_print(0,1,n));
    }
}*/
import java.util.*;
public class Recursion {
    public static void function(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}