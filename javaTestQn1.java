import java.util.Scanner;

public class javaTestQn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0,a,b,x,y;

        // User input 
        a=sc.nextInt();
        b=sc.nextInt();

        // Assigning a and b to x and y so data doesn't loss
        x=a;
        y=b;

        // If a or x is not a two digit number count will be increased by 1
        x=x/10;
        if(x==0||x>9)
            count++;

        // If b or y is not a two digit number count will be increased by 1
        y=y/10;
        if(y==0||y>9)
            count++;

        //Only will enter if block when both entered number is two digit number..
        if(count==0)
        {
           
        }
        else{
            System.out.println("Invalid Input!");
        }
        
        

    }
}
