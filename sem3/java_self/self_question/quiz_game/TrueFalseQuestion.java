public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;
    
    TrueFalseQuestion(String prompt, boolean ans ){
        this.correctAnswer = ans;
        super.setPrompt(prompt);
    }

    @Override
    boolean checkAnswer(String userInput){
        boolean input = Boolean.parseBoolean(userInput);
        return (input == correctAnswer) ; 
    }

    
}
