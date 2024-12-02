package ma.znagui.quiz.exception;

public class QuestionDoesNotExistInQuiz extends RuntimeException{
    public QuestionDoesNotExistInQuiz(Long qstID,Long qzID){
        super("la question ID : " + qstID + " N'existe Pas Dans Le Quiz ID : " + qzID);
    }
}
