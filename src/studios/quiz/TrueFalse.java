package studios.quiz;

public class TrueFalse extends Question {


    public TrueFalse(String prompt, String correctAnswer) {
        super(prompt, correctAnswer);
    }

    @Override
    public void printPrompt() {
        System.out.println(this.getPrompt());
    }

    public void printResponse() {
        System.out.println(this.getResponse());
    }

    public void printCorrectAnswer() {
        System.out.println(this.getCorrectAnswer());
    }


}
