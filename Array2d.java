import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaring 2d-array
        int[][] marks = new int[2][3];
        /*It will be like this
          column1&2and3
          row0[10 20 30]
          row1[10 20 30]
         */

        //Taking input in 2d-array
        System.out.println("Enter marks of students : ");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j]=sc.nextInt();
            }
        }

        //Displaying 2d-array
        System.out.println("Marks of students in multidmensional array are : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println();
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j]+" ");
            }
        }
        sc.close();
    }
}
