import java.util.Random;
import java.util.Scanner;

public class guessthenumbergame {
    public static void main(String[] args) {
        System.out.println(".........................");
        System.out.println("   pick any number!!   ");
        System.out.println(".........................");
        System.out.println();

        Random r = new Random();
        int randomno = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        int Count = 0,K = 5, i =0;
        for( i = 0; i < K; i++) {
            System.out.println("Guess the number between 1-100");
            int guessno = sc.nextInt();
            Count++;

            if (guessno == randomno) {
                System.out.println("Correct! You win.");
                System.out.println("It took you " + Count + " trials.");
                break;
            } else if (guessno > randomno) {
                System.out.println("Guessed number is greater than the actual number, Guess again.");
            } else {
                System.out.println("Guessed number is lower then the actual number, Guess again.");
            }
        }
        if(i == K){
            System.out.println("OOPS! You have exhausted the given number of trials.");
            System.out.println("The number was " + randomno);
        }
    }

}

