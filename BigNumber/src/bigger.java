import java.util.Scanner;
public class bigger {
    public static void main(String[] args) {
        System.out.println("How To Find The Biggest Number ??");
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the 1st Value");
        int First = SC.nextInt();
        System.out.println("Enter the 2nd Value");
        int Second = SC.nextInt();
        System.out.println("Enter the 3rd Value");
        int Third = SC.nextInt();
    int biggest;
        if( First > Second)
            biggest = First;
        else
            biggest = Second;
        if (Third  > biggest);
            biggest = Third;
        System.out.println("The Biggest number is " + biggest);
        }

    }
