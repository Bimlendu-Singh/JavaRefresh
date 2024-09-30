import java.util.Scanner;

public class TernaryMinThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a,b,c;

        System.out.println("Enter three numbers : ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        sc.close();

        //float result = (a<=b&&a<=c)?a:(b<=a&&b<=c)?b:(c<=a&&c<=b)?c:0.0f;// Here i can't write string with float like, "All are equal"
        float result = (a<=b&&a<=c)?a:(b<=a&&b<=c)?b:c;

        if(a==b&&b==c)
        System.out.println("All numbers are equal :"+a);
        else
        System.out.println("Minimum among three is : "+result);


    }
}
