/*import java.util.*;
public class function {
    public static void PrintMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name=sc.next();

        PrintMyName(name);

    }
}*/
/*import java.util.*;
public class function {
    public static int Calculation(int a,int b) {
        int sum =a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        Calculation(a,b);
        System.out.println("the sum is "+ Calculation(a,b));
    }
}*/
/*import java.util.*;
public class function {
    public static int Multiplication(int a,int b){
        int Mul=a*b;
        return Mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        Multiplication(a,b);
        System.out.println("the Multiplication is "+Multiplication(a,b));
    }
}*/

/*import java.util.*;
public class function {
   public static int fact( int n ){
        int f=1;
        if (n==1 || n==0){
            return 1;
        }
        else {
            for (int i=n;i>=1;i--){
                f=f*i;
            }
            return f;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" the factorial is "+ fact(n));
    }
}*/
// Question 1
/*import java.util.*;
public class function {
    public static int avg(int a,int b,int c){
        int avgrage =(a+b+c)/3;
        return avgrage;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println("the avgrage is "+avg(a,b,c));

    }
}*/

//Question 2
/*import java.util.*;
public class function {
    public static int odd_even(int num){
        if (num%2==0){
           return Even Number;
        }
        else {
            return Odd Number;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("the input number is " + odd_even(num));
    }
}*/

// Bonus Question
/*import java.util.*;
public class function {
    public static int fibo(int n){
        int first=0 , Second =1;
        if (n==1){
            return 1;
        }
        else {
            for(int i=1;i<=n;i++){
                int next=first+Second;
                first=Second;
                Second=next;
                return next;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(" the fibonacci series is "+fibo(n));
    }
}*/

/*import java.util.*;
public class function {
    public static void GCD( int a,int b){

        while (a%b==0){
            int rem= a%b;
            a=b;
            b=rem;
            int gcd =b;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        System.out.println();
    }
}*/