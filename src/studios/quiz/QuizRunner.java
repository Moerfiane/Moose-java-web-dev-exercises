package studios.quiz;

import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TrueFalse trueFalseQuestion = new TrueFalse("True or false: the earth is round", "true");
        trueFalseQuestion.printPrompt();


    }
}
