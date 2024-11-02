import java.util.Scanner;
import java.util.Random;


public class random 
{
    public static void main (String [] args)

    {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int numToGuess = random.nextInt(100)+1;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("****************************************");
        System.out.println("     Welcome Welcome Welcome ");
        System.out.println("     Guess A number Betweeen 1 to 100");
        System.out.println("     Guess Guess ");
        System.out.println("****************************************");


        while(!hasGuessedCorrectly)
        {
            System.out.println("Guess your Number "); 
            int guess = sc.nextInt();
            numberOfTries++;

            if (guess < numToGuess)
            {
                System.out.println("Too Low Try Again ");
            }
            else if (guess > numToGuess)
            {
                System.out.println("TOo High Try Again");
            }
            else
            {
                hasGuessedCorrectly= true;
                System.out.println("Congratulations You guessed it......");
            }
        }

    }
}
