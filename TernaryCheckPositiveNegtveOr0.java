import java.util.Scanner;

public class TernaryCheckPositiveNegtveOr0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Enter number: ");
        x = sc.nextInt();
        sc.close();

        String number;
        number = (x>0)?"positive":(x==0)?"zero":"negative";

        System.out.println("\nNumber is : "+ number);
    }
}
