import java.util.*;
class Bill{
    double Unit;
    double Hour;
    double Quantity;
    double Month;
    Bill(double u, double h, double q , double m){
        Unit = u;
        Hour = h;
        Quantity = q;
        Month = m;
    }
    double Calc(){
        return (Unit*Hour*Quantity*Month)/1000;
    }
}
public class assigment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Bill b1=new Bill(15,6,5,30);
        Bill b2=new Bill(40,8,3,30);
        Bill b3=new Bill(500,24,1,30);

        double c= b1.Calc() + b2.Calc() + b3.Calc();
        System.out.println("the Unit Consumed by the " + name + " is "+ c);
        if(0<= c || c <=100){
            System.out.println("The Total Bill is "+ c*4.34);
        } else if (101<=c || c<=300) {
            System.out.println("The Total Bill is "+ (100*4.34)+(c-100)*7.44 );
        } else if (301<=c || c<=500) {
            System.out.println("The Total Bill is "+ (100*4.34)+(200*7.44)+(c-300)*10.51);
        }
        else {
            System.out.println("The Total Bill is "+(100*4.34)+(200*7.44)+(200*10.51)+(c-500)*13.59);
        }
    }
}
