package studios.quiz;
import java.util.Scanner;

public abstract class Question {

    private String prompt;
    private String response;
    private String correctAnswer;

    public Question(String prompt, String response, String correctAnswer){
        this.prompt = prompt;
        this.response = response;
        this.correctAnswer = correctAnswer;
    }

    public String getPrompt() {
        return prompt;
    }
    public String getResponse() {
        return response;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
