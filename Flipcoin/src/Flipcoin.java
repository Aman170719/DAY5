import java.util.Random;
public class Flipcoin {
    public static void main(String[] args) {
        System.out.println("The Flip-coin Counter");
        int coin= 0;
        int flipped = 0;
        int loopcount =0;
        Random flip = new Random();
        while (loopcount <= 9){
            coin =flip.nextInt(3);
            if(coin <= 1)
                System.out.println("Coin has been flipped and it has Landed on Heads");
            else
                System.out.println("Coin has been flipped and it has Landed on Tails");
        loopcount++;
        }    System.out.println("Number of Turns coin has been flipped : " + loopcount );

    }
}