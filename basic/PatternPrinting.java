// Block Rectangle
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=0;i<6;i++){
            for (int j=0;j<6;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }*/

// Single line
/*public class PatternPrinting {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("*");
        }
    }
}*/

// hollow rectangle
/*public class PatternPrinting {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/
// right angle
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

// number pyramid
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=4;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}*/
/*public class PatternPrinting {
    public static void main(String[] args) {
        int a=1;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                a+=1;
                System.out.print(a +" ");
            }
            System.out.println();
        }
    }
}*/
/*public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1 +" ");
                }
                else {
                    System.out.print(0 +" ");
                }
            }
            System.out.println();
        }
    }
}*/
public class PatternPrinting {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }

        }
    }
}

