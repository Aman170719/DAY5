import java.util.Scanner;
interface  VowelORConsonants {
    public static void main(String[] args) {
        System.out.println("Welcome to the Stimulator");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Any Character :");
        char CH = scan.next().charAt(0);
        if (CH == 'a' || CH == 'A')
            System.out.println("It is Vowel");
        else if (CH == 'e' || CH == 'E')
            System.out.println("It is Vowel");
        else if (CH == 'i' || CH == 'I')
            System.out.println("It is Vowel");
        else if (CH == 'o' || CH == 'O')
            System.out.println("It is Vowel");
        else if (CH == 'u' || CH == 'U')
            System.out.println("It is Vowel");
        else {
        System.out.println("It's Consonants");
        }
    }
    }
