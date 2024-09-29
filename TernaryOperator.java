import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your age: ");
        age=sc.nextInt();
        sc.close();

        String vote = (age>=18?"Can Vote":"Can't Vote");
        System.out.println("This person "+vote);
    }
}
