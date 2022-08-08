import java.util.*;
import java.io.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("To Check Find The Leap Year");
        System.out.println("Enter the Year");
        int a = scan.nextInt();
        if((a % 400 == 0) || (a%4 == 0)||(a % 100 != 0)) {
            System.out.println("this " + a + " year is an Leap year");
        }
        else{
        System.out.println("This is not an leap year");
    }
}}