/* import java.util.Scanner;

public class twod_Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int [][] number = new int [row][column];
        System.out.println("Enter the Array");
        for (int i=0;i<row;i++){ //row
            for (int j=0;j<column;j++){ //column
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("Array you got is");
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

import java.util.*;
public class twod_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows :");
        int row = sc.nextInt();
        System.out.print("Enter the Column");
        int column =sc.nextInt();
        int [][] number = new int[row][column];
        System.out.print("Enter the Array");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the Search Element");
        int search =sc.nextInt();
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                if (number[i][j]== search){
                    System.out.print("Founded at :"+"["+i+"]["+j+"]");
                }
                else {
                    System.out.print(" Not Fonded");
                }
            }
        }
    }
}