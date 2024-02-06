// Class and Object
/*public class oops {
    // creating a new data type
    public static class student{
        String name;
        int roll;
        double percentage;
        public static String fun(student x){
            System.out.println(x.name);
        }

    }
    public static class car{
        String namec;
        String type;
        int price;
    }
    public static void main(String[] args) {
        student s1=new student();
        car c1=new car();
        s1.name="Ayush";
        s1.roll=23;
        s1.percentage=83.3;
        c1.namec="Alto";
        c1.price=300000;
        System.out.println(s1.name);
        System.out.println(c1.namec + c1.price);
    }
}*/
// Constructor
/*import java.util.*;
class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void statement(){
        System.out.println(this.color);
    }
}
class Student{
        String name;
        int age;
        public void print(){
            System.out.println(this.age + " " +this.name);
        }
        /*Student(){
            System.out.println(" Constructor is called non parameteries .");
        }*/
   /* Student (String name ,int age){
        this.name=name;
        this.age=age;
    }
}
// Polymorphism
public class oops {
    public static void main(String[] args) {
        /*pen p1= new pen();
        p1.color = "Blue";
        p1.type="gel";
        p1.write();
        pen p2 = new pen();
        p2.color="black";
        p2.type="Ball point";
        p2.statement();*/
       /* Student s1 = new Student();
        s1.name="Ayush";
        s1.age=20;                         // non parametries constructr block
        s1.print();*/

        /*Student s1 = new Student("Ayush",18);
        s1.print();

    }
}*/
// Polymorphism
/*class Student{
    String Name ;
    int age;
    double cgpa;
    public void printinfo(String Name, int age){
        System.out.println(Name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String Name,int age,double cgpa){
        System.out.println(Name +" "+age+" "+cgpa);
    }
}
public class oops {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Name="Ayush hood";
        s1.age=50;
        s1.cgpa= 7.29;
        
        s1.printinfo(s1.Name,s1.age,s1.cgpa);
    }
}
*/
// inheritance
import java.util.*;
/*class shape{
    public void area(){
        System.out.println(" displace area");
    }
}
class traingle extends shape{
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
class circle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }

}*/



