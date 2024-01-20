/*import java.util.*;
public class Strings {
    public static void main(String[] args) {
      //  String Name=" Ayush hood";
      //  String Class="2nd Year";
      //  String College="Rcoem";
        // System.out.println("My Name is " +Name+"from"+College+Class );
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println(" Your name is "+ name);
    }
}*/
//concatenation
/*import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String firstname="Ayush";
        String lastname="Hood";
        String fullname= firstname +" " + lastname;
        System.out.println(fullname.length());

        //charAt
        for (int i=0;i<=fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}*/

/*import java.util.*;
public class Strings {
    public static void main(String[] args) {
        String name1="ayush";
        String name2="Ayush";
        if (name1.compareTo(name2)==0){
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }
    }
}*/

import java.util.*;
/*public class Strings {
    public static void main(String[] args) {
        String sentence="My name is Ayush";
        String name = sentence.substring(1,11);
        System.out.println(name);
    }
}*/

// String builder
/*import java.util.*;
public class Strings {
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("Ayush");
        System.out.println(sb);
        // Char at index 0
        System.out.println(sb.charAt(0));
        // Set char at index 0
        sb.setCharAt(4,'i');
        System.out.println(sb);
        // insert
        sb.insert(5,'i');
        System.out.println(sb);
        // Delete
        sb.delete(2,3);
        System.out.println(sb);


    }
}*/

/*public class Strings {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("A");
        // Append
        name.append('y');
        name.append('a');
        name.append('n');
        System.out.println(name);
        System.out.println(name.length());
    }
}*/
 // Reverse a string
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("hello");

        for (int i=0;i<sb.length()/2;i++){
            int front = i;
            int back= sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);

    }
}
