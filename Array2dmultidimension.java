import java.util.Scanner;
public class Array2dmultidimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] salary = new int[3][];
        salary[0]= new int[2];
        salary[1]= new int[3];
        salary[2]= new int[4];

        System.out.println(salary[0].length);
        System.out.println(salary[1].length);
        System.out.println(salary[2].length);
    }
}
