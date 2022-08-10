import java.util.*;
import java.io.*;

public class Array2D{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        PrintStream print = new PrintStream(System.out);
        System.out.println("2D Array");
         public void intTwoArray(int m , int n){
                 int [] [] array =new int[m][n];

                 for (int i =0; i<m; i++) {
                     for (int j = 0; j < n; j++) {
                         System.out.println("Enter values:");
                         array[i][j] = scan.nextInt();
                     }
                 }
        System.out.println("The array : ");
                 for(int i =0; i<m; i++){
                     for(int j=0; j<n; j++){
                         print.println(""+array[i][j]);
                     }
                     System.out.println();
                 }
        }
        public void DoubleTwoArray(int m, int n){
            double[][] array = new double[m][n];

            for(int i =0; i<m; i++){
                for (int j=0; j<n; j++){
                    System.out.println("Enter the Value");
                    array[i][j] = scan.nextDouble();
                }
            }
        }
    }