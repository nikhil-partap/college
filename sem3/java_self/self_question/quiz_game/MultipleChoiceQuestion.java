public class MultipleChoiceQuestion extends Question {
    private String ans;
    private String[] option = new String[4];
    
    MultipleChoiceQuestion(String prompt,String[] options, String ans){
        super.setPrompt(prompt);
        this.ans = ans;
        for(int i= 0; i < options.length; i ++){
            this.option[i] = options[i];
        }
    }

    @Override
    boolean checkAnswer(String userInput){
        return ans.equals(userInput);
    }

}
