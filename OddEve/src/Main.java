import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           System.out.println("Checking number is Even or Odd");
            Scanner e = new Scanner(System.in);
            System.out.println("Enter The number You want to check: ");
            int A = e.nextInt();
            if(A%2 == 0){
                System.out.println("The number is Even");
            }
            else{
                System.out.println("The number is Odd");
            }
        }
}