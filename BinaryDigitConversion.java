import java.util.Scanner;

public class BinaryDigitConversion {
    public static void main(String[] args) {
        
        int i, num,n ;
        int binaryDigit[] = new int[8];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to get it's binary digit: ");
        num = sc.nextInt();
        n=num;

        for(i=7;num!=1;i--){
            binaryDigit[i]=(num%2);
            num = (num/2);

            if(num==1)
              binaryDigit[i-1]=1;
        }

        System.out.println("Binary Code for the given number : "+n + " is : ");
        for(i=0;i<8;i++)
        {
            System.out.print(binaryDigit[i]);
        }

        sc.close();
    }
}
