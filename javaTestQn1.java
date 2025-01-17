import java.util.Scanner;

public class javaTestQn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0,a,b,x,y;

        a=sc.nextInt();
        b=sc.nextInt();

        x=a;
        y=b;

        x=x/10;
        if(x==0||x>9)
            count++;

        y=y/10;
        if(y==0||y>9)
            count++;

        if(count==0)
        {
            System.out.println("Two digit number");
        }
        else{
            System.out.println("Invalid Input!");
        }
        
        

    }
}
