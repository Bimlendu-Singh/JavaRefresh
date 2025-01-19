import java.util.Scanner;

class Functionfirst
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.println("Enter number to round to two decimal places");
        num=sc.nextFloat();
        Functionfirst obj = new Functionfirst();
        float x = obj.round(num);
        System.out.println("Number after rounding of is: "+x);
        sc.close();
    }

    // This method cannot be called directly since is is instance method not static , so you have to make object of Functionfirst class
    // and then call this function using object of that class as shown above.
    float round(float n)
    {
        float x=Math.round(n*100)/100.0f;
        return x;
    }
    
}