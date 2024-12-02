package ma.znagui.quiz.exception;

public class HasSubSubjectException extends RuntimeException{
    public HasSubSubjectException(Long id){
        super("le sujet ID : " + id + "a des subsubject");
    }
}
