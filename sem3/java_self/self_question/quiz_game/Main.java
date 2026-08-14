// Design a simple class hierarchy for a quiz game. 
// You need a base abstract class Question with a private prompt string, getter-setter, and an abstract checkAnswer method. Then make 
// two subclasses, TrueFalseQuestion and MultipleChoiceQuestion, each overriding checkAnswer. 
// In main, store them in an array or list of Question. Loop through, show the prompt, take user
//  input, call checkAnswer, and keep score. Try to use a constructor, one getter-setter, and 
// polymorphism cleanly
package self_question.quiz_game;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---------- TRUE/FALSE QUESTION ----------

        TrueFalseQuestion tf = new TrueFalseQuestion(
            "Java supports multiple inheritance using classes.",
            false
        );

        System.out.println(tf.getPrompt());
        System.out.print("Enter true or false: ");

        String userAnswer = scanner.nextLine();

        if (tf.checkAnswer(userAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }


        // ---------- MULTIPLE CHOICE QUESTION ----------

        String[] options = {
            "A. Python",
            "B. Java",
            "C. HTML",
            "D. CSS"
        };

        // Create your MultipleChoiceQuestion here
        // Then print the question/options
        // Take input
        // Call checkAnswer()
        MultipleChoiceQuestion MCQ = new MultipleChoiceQuestion( "what is better",options, "Java");
        
        System.out.println(options);

        String ans2 = scanner.nextLine();

        MCQ.checkAnswer(ans2);
        
        scanner.close();
    }
}