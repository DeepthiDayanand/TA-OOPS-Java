import java.util.ArrayList;
import java.util.Scanner;

public class HighestScorer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.println("Enter student names (comma-separated):");
        String[] namesInput = scanner.nextLine().split(",");
        System.out.println("Enter their corresponding test scores (comma-separated):");
        String[] scoresInput = scanner.nextLine().split(",");

        // Populate ArrayLists
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        for (String name : namesInput) {
            studentNames.add(name.trim());
        }
        for (String score : scoresInput) {
            scores.add(Integer.parseInt(score.trim()));
        }

        // Find the highest score
        int highestScore = findHighestScore(scores);

        // Find the names of students with the highest score
        ArrayList<String> highestScorers = findHighestScorers(studentNames, scores, highestScore);

        // Print the names of students with the highest score
        System.out.println("Highest scorer(s):");
        for (String scorer : highestScorers) {
            System.out.println(scorer);
        }
    }

    // Function to find the highest score
    private static int findHighestScore(ArrayList<Integer> scores) {
        int highestScore = scores.get(0);
        for (int score : scores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }
        return highestScore;
    }

    // Function to find the names of students with the highest score
    private static ArrayList<String> findHighestScorers(ArrayList<String> names, ArrayList<Integer> scores, int highestScore) {
        ArrayList<String> highestScorers = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == highestScore) {
                highestScorers.add(names.get(i));
            }
        }
        return highestScorers;
    }
}
