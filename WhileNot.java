import java.util.Scanner;

public class WhileNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word to guess!");
        String word = sc.nextLine();
        

        String guess="A";

        while (guess!=word ) {
            System.out.println("Guess the word: ");
            guess = sc.nextLine();

            if(guess==word)
            {
                System.out.println("Congratulation, You WON!");
                break;
            }
            else if (guess=="I Loose") {
                System.out.println("It's okay!, Correct word is : "+word);
                break;
            }
            else
               {System.out.println("Try Again!, or Type I Loose");} 
        }
        sc.close();

    }
}
