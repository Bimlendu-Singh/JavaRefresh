import java.util.ArrayList;

public class ArrayListStarter {
    public static void main(String[] args) {
      ArrayList<String> Students = new ArrayList<>();

      Students.add("Yogi");
      Students.add("Bhogi");
      Students.add("Rogi");

      System.out.println("First element of Students is : "+Students.get(0));

      System.out.println("All elements of arraylist Students are: "+Students);
      Students.remove("Rogi");
      System.out.println("All elements of arraylist Students are: "+Students);
      System.out.println("Size of arraylist is: "+Students.size());

    }
}
