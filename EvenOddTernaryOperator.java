import java.util.Scanner;

public class EvenOddTernaryOperator {
    public static void main(String[] args) {
        int num ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        num=sc.nextInt();
        sc.close();

        String result = ((num%2==0)?"Even":"Odd");  //Ternary operator conditon?ture-expression1:false-expression2;
        System.out.println("Number is : "+result);
    }
}
