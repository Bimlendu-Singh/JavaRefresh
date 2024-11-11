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

        // Adding values or elment to inner arraylist
        ArrayList<Integer> student2Scores = new ArrayList<>();
        student2Scores.add(38);
        student2Scores.add(55);
        student2Scores.add(70);

        ArrayList<Integer> student3Scores = new ArrayList<>();
        student3Scores.add(56);
        student3Scores.add(79);
        student3Scores.add(69);

        // Adding inner ArrayList to the outer ArrayList
        studentScores.add(student1Scores);
        studentScores.add(student2Scores);
        studentScores.add(student3Scores);

        // Displaying each values of Arraylist containing inner ArrayList
        for(int i=0;i<studentScores.size();i++)
        {
            System.out.println("Student "+(i+1)+" score is :"+studentScores.get(i));
        }


    }
}
