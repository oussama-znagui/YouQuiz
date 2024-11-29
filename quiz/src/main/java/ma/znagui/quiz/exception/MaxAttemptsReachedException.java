package ma.znagui.quiz.exception;

public class MaxAttemptsReachedException  extends Exception{
    public MaxAttemptsReachedException(Long quizID,int chanses){
        super(String.format("Le quiz ID : %d peut pas avoir plus de %d chanses",quizID,chanses));
    }
}
