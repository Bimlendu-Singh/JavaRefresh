import java.util.Scanner;
import java.util.Arrays;

public class SortingArrayFunction {
    public static void main(String[] args)
    {
        int num[] = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 element in array: ");
        for(int i=0;i<6;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("\nNumber before sorting: ");
        for(int i=0;i<6;i++)
        {
            System.out.print(" "+num[i]);
        }

        Arrays.sort(num);

        System.out.println("Number after sorting: ");

        for(int i : num){
            System.out.print(" "+i);
        }

        sc.close();
    }
}
