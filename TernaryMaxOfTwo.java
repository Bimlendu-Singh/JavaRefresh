import java.util.Scanner;

public class TernaryMaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;

        System.out.println("Enter two numbers : ");
        a = sc.nextDouble();
        b=sc.nextDouble();
        sc.close();

        double result = (b>a)?b:a;

        System.out.println("Bigger number is : "+result);
    }
}
