import java.util.*;
public class project_basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int myNum=(int)(Math.random()*100);
        int usernum=0;
        do{
            System.out.println("Enter your number 0-100 !!!");
            usernum = sc.nextInt();
            if (usernum==myNum){
                System.out.println("You found Right");
            } else if (usernum>myNum) {
                System.out.println("Your number is to large");
            }
            else{
                System.out.println(" Your Number is to small");
            }
        }while (usernum>=0);
        System.out.println(" Number was "+myNum);
    }
}
