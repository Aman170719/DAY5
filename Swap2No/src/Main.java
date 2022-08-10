import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Z = 0;
        System.out.println("Swapping of Two Numbers");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value of X");
        int X = S.nextInt();
        System.out.println("Enter the value of Y");
        int Y = S.nextInt();

            Z = X;
            X = Y;
            Y = Z;
            System.out.println("Swapped Number : " + "X =  " + X + ", Y = " + Y);


    }
}