import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number for it's table :");
        int table = sc.nextInt();
        sc.close();

        for(int i=1;i<=100;i++){
            System.out.println(table+"*"+i+" = "+(table*i));
        }

    }
}
