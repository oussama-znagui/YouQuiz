package ma.znagui.quiz.exception;

public class TooMuchCorrectAnswersException extends RuntimeException{
    public TooMuchCorrectAnswersException(){
        super("les reponse correcte sont plus que les reponses Merci!");
    }
}
