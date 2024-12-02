package ma.znagui.quiz.exception;

public class MaxCorrectAnswerException extends RuntimeException {
    public MaxCorrectAnswerException(Long id, int ca) {

        super("la question ID : " + id + " peut avoir que " + ca +" reponses corrects");
    }
}
