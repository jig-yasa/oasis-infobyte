import java.util.Scanner;
public class NumberGuessingGame 
{
    public static void main(String[] args) 
    {
        int attempt = 1;
        int userGuessNumber;
        int secretNumber = (int) (Math.random() * 99 + 1);          
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game.");
        System.out.println(" Guess A Number To Win The Game.");
        System.out.println("You have Maximum attempt limit is 5 .");
        do{
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) 
            {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {    
                    System.out.println("wowww!!!, Your guess is right. You Win the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Your Guess is lower than the number.");
                else if (userGuessNumber > secretNumber)
                    System.out.println("Your Guess is Greater than number.");
                if(attempt == 5) 
                {
                    System.out.println(" so sad !!! You have exceeded the maximum attempt. Try Again");
                    break;
                }
                attempt++;
            }
            else 
            {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}