import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        System.out.println("To Find Power 2 of n");
        Scanner N = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = N.nextInt();

        for(int i=0; i <= n; i++)
        {
            System.out.println("The power of " + n + " is " + ((int) (Math.pow(2,n))));
        break;
        }
    }
}