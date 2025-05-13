import java.util.Scanner;
import java.util.Random;
class NumberGame
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        final int MAX_ATTEMPTS=5;
        int score=0;
        boolean playAgain;
        System.out.println("---Welcome to the Number Game ---");
        do
		{
            int numberToGuess=random.nextInt(100)+1;
            int attemptsLeft=MAX_ATTEMPTS;
            boolean guessedCorrectly=false;
            System.out.println("\nI have picked a number between 1 and 100.");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it!");
            while(attemptsLeft>0) 
			{
                System.out.print("Enter your guess: ");
                int guess=sc.nextInt();
                if(guess==numberToGuess)
					{
                    System.out.println("Congratulations! You guessed it right!");
                    guessedCorrectly=true;
                    score++;
                    break;
                }
				else if(guess<numberToGuess) 
				{
                    System.out.println("Too low!");
                } 
				else 
				{
                    System.out.println("Too high!");
                }
                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }
            if (!guessedCorrectly)
				{
                System.out.println("Out of attempts! The number was: " + numberToGuess);
            }
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = sc.next().trim().toLowerCase();
            playAgain = response.equals("yes");
        } 
		while (playAgain);
        System.out.println("\n=== Game Over ===");
        System.out.println("Your total score: " + score);
        sc.close();
    }
}
