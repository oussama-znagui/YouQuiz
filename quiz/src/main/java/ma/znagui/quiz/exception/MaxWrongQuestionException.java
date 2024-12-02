package ma.znagui.quiz.exception;

public class MaxWrongQuestionException extends RuntimeException{

    public MaxWrongQuestionException(Long id, int wa) {

        super("la question ID : " + id + " peut avoir que " + wa +" reponses fausse");
    }
}
