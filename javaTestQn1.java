import java.util.Scanner;
import java.util.Arrays;

public class javaTestQn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0,a,b,x,y,pd,product,temp;
        int n[]= new int[4];
        int p[]=new int[4];

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

        //Code will enter if block only when both entered number is two digit number..
        if(count==0)
        {
           pd=a*b;
           product = pd;
           for(int i=0;i<4;i++)
           {
                p[i]=product%10;
                product=product/10;
           }
        //    System.out.println("Printing product "+p[0]+p[1]+p[2]+p[3]);

        //    Let's sort the product array
        //    int min=p[0];
           for (int i = 0; i < p.length-1; i++) {
             for (int j = i; j < p.length-1; j++) {
                if(p[i]>p[j+1])
                  {
                    temp=p[i];
                    p[i]=p[j+1];
                    p[j+1]=temp;
                  }
             }
           }
        // Displaying after sorting
        //    System.out.println("Printing product after sorting");
        //    for(int i=0;i<4;i++)
        //    {
        //         System.out.print(p[i]);
        //    }

           x=a;
           y=b;

           n[0]=x%10;
           x=x/10;
           n[1]=x;

           n[2]=y%10;
           y=y/10;
           n[3]=y;

        //    System.out.println("\nPrinting two digit together "+n[0]+n[1]+n[2]+n[3]);

        //    Let's sort the two number together array
        //    int min=p[0];
          for (int i = 0; i < n.length-1; i++) {
            for (int j = i; j < n.length-1; j++) {
               if(n[i]>n[j+1])
                 {
                   temp=n[i];
                   n[i]=n[j+1];
                   n[j+1]=temp;
                 }
            }
          }
          // Displaying after sorting
        //   System.out.println("Printing product after sorting");
        //   for(int i=0;i<4;i++)
        //   {
        //        System.out.print(n[i]);
        //   }

           if(Arrays.equals(n,p))
          {
            System.out.println("\n"+a+" and "+b+" both are Ignite friends!");
          }
          else
          {
            System.out.println(a+" and "+b+" both are not Ignite friends!");
          }


        }
        else{
            System.out.println("Invalid Input!");
        }
        sc.close();
        
        

    }
}
