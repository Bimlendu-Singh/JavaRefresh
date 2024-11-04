import java.util.ArrayList;

public class ArrayListStarter {
    public static void main(String[] args) {
      ArrayList<String> Students = new ArrayList<>();

      Students.add("Yogi");
      Students.add("Bhogi");
      Students.add("Rogi");

      System.out.println("First element of Students is : "+Students.get(0));
    }
}
