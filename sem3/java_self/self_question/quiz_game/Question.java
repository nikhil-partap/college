package self_question.quiz_game;

public abstract class Question {
    private String prompt;
    
    void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    String getPrompt() {
        return this.prompt;
    }

    abstract boolean checkAnswer(String answer);
}
