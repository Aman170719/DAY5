import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Division Results Printing For no reason");
        Scanner D = new Scanner(System.in);
        System.out.println("Enter the 2 number which you want to Divide");
        int A = D.nextInt();
        int B = D.nextInt();
        int Q = A/B;
                int R= A % B;
        System.out.println("The Quotient is " +Q );
        System.out.println("The Remainder is " + R);
    }
}