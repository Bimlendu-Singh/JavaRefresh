import java.util.Scanner;

public class ArrayNameAndPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students: ");
        int no_Of_Students = sc.nextInt();

        String[] studName = new String[no_Of_Students];
        float[] percentage = new float[no_Of_Students];

        for (int i = 0; i < no_Of_Students; i++) {
            System.out.println((i+1)+".) Enter Student Name: ");
            studName[i]=sc.nextLine();
            System.out.println("Enter their percentage : ");
            percentage[i]=sc.nextFloat();
        }
    }
}
