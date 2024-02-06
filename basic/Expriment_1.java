import java.util.Scanner;

class Bank{
    String account_no;
    String name;
    double xamt;

    Bank(String ac, String ne , double a){
        account_no=ac;
        name=ne;
        xamt=a;
    }
    double Deposit(){
        return 40000+xamt;
    }
    double withdraw(){
        if(40000>=xamt)
        {
        return 40000-xamt;
        }
        return 0;
    }
    void display(){
        System.out.println("Account Number " + account_no);
        System.out.println("Name " + name);
        System.out.println("Balance" + xamt);
    }
}
public class Expriment_1 {
    public static void main(String[] args) {
        System.out.println(" Enter your detail 1. A/c 2. name 3. amount");
        Scanner sc = new Scanner(System.in);
        String ac = sc.next();
        String n1= sc.next();
        double xa = sc.nextDouble();
        Bank b1= new Bank(ac,n1,xa);
        if (ac=="19310011000299"){
            int n = sc.nextInt();
            System.out.println(" Hi Harshal \n Enter the option \n 1. Withdraw \n 2.deposit");
            switch (n){
                case 1:
                    System.out.print("Enter the amount that should be withdraw ");

                    b1.withdraw();
                case 2:
                    System.out.println("Enter the amount that should be deposit");

                    b1.Deposit();
                default:
                    System.out.println("invalid");
            }
            b1.display();
        } else if (ac=="18300040567221") {
            int n = sc.nextInt();
            System.out.println(" Hi Anikit \n Enter the option \n 1. Withdraw \n 2.deposit");
            switch (n){
                case 1:
                    System.out.println("Enter the amount that should be withdraw");

                    b1.withdraw();
                case 2:
                    System.out.println("Enter the amount that should be deposit");

                    b1.Deposit();
                default:
                    System.out.println("invalid");
        }
           b1.display();
    }
        else {
            System.out.println("Invalid");
        }
}
}
