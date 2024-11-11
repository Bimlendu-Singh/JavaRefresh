import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
        // Creating Outer ArrayList
        ArrayList<ArrayList<Integer>> studentScores = new ArrayList<>();
        // Making inner ArrayList
        ArrayList<Integer> student1Scores = new ArrayList<>();
        student1Scores.add(30);
        student1Scores.add(50);
        student1Scores.add(60);

        ArrayList<Integer> student2Scores = new ArrayList<>();
        student2Scores.add(38);
        student2Scores.add(55);
        student2Scores.add(70);

        ArrayList<Integer> student3Scores = new ArrayList<>();
        student3Scores.add(56);
        student3Scores.add(79);
        student3Scores.add(69);


    }
}
