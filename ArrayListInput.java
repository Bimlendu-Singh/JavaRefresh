import java.util.Scanner;
import java.util.ArrayList; //Importing arraylist before using it

public class ArrayListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> Salary = new ArrayList<Float>(); //Declaring and defining arraylist
        
        // Loop to take input in ArrayList
        for (int i = 0; i != 1; ) {
            System.out.println("Enter salary of Employee: ");
            float sal = sc.nextFloat();//First taking input salary in sal float variable
            Salary.add(sal);//Then adding sal value into salary object everytime, this way adding the input in Salary
            System.out.println("Enter 1 to end the loop and any other key to continue..");//Condition for ending the loop
            i=sc.nextInt();
        }

        System.out.println("Salary of each emplyee are: "+Salary);
        sc.close();
    }
}
