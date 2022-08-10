import java.util.Scanner;
public class main {
    public main(String[] args) {
        System.out.println("Harmony of a Number");
    System.out.println("Enter any number :");
    Scanner H = new Scanner(System.in);
    double N = H.nextDouble();
    double sum =0;
        for(int i = 1; i<=N; i++ )
        {
        sum = sum + (1/i);
            }
    System.out.println(sum);
    }
}