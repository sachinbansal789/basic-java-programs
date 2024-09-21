import java.util.ArrayList;
import java.util.List;

public class QuizCombinations {
    public static void main(String[] args) {
        int totalQuestions = 180; // Total number of questions
        List<Combination> combinations = generateCombinations(totalQuestions);

        System.out.println("All Combinations of Correct and Incorrect Answers:");
        for (Combination combination : combinations) {
            System.out.println("Correct: " + combination.correctAnswers + ", Incorrect: " + combination.incorrectAnswers + ", Score: " + combination.score);
        }
    }

    public static List<Combination> generateCombinations(int totalQuestions) {
        List<Combination> combinations = new ArrayList<>();

        for (int correctAnswers = 0; correctAnswers <= totalQuestions; correctAnswers++) {
            int incorrectAnswers = totalQuestions - correctAnswers;
            int score = calculateScore(correctAnswers, incorrectAnswers);
            combinations.add(new Combination(correctAnswers, incorrectAnswers, score));
        }

        return combinations;
    }

    public static int calculateScore(int correct, int incorrect) {
        int pointsForCorrect = 4;
        int pointsForIncorrect = -1;
        return (correct * pointsForCorrect) + (incorrect * pointsForIncorrect);
    }

    static class Combination {
        int correctAnswers;
        int incorrectAnswers;
        int score;

        Combination(int correctAnswers, int incorrectAnswers, int score) {
            this.correctAnswers = correctAnswers;
            this.incorrectAnswers = incorrectAnswers;
            this.score = score;
        }
    }
}