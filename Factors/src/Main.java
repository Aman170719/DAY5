import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
    int number= 0;

     System.out.println("This is how we find the Factors of a number");
     System.out.println("Enter the Number ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

     System.out.println("The Value you have Entered is : " + number);
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)

                System.out.print(i + " ");
        }
     System.out.println("The Factors for this number are : ");

                }
    }
