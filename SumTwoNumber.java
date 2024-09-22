import java.util.Scanner;

public class SumTwoNumber {
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        a = sc.nextInt();

        System.out.println("Enter second number:");
        b = sc.nextInt();

        System.out.println("Sum of two number is : "+ sumNumber(a,b));
        
    }

    public static int sumNumber(int num1, int num2){
        return num1+num2;
    }

    
}
