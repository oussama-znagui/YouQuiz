package ma.znagui.quiz.exception;

public class MaxQuestionAnswersException extends RuntimeException{
    public MaxQuestionAnswersException(Long id, int a){
        super("la question ID : " + id + " peut avoir que " + a +" reponses");
    }
}
