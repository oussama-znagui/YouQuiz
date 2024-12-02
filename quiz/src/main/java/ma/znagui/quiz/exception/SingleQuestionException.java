package ma.znagui.quiz.exception;

public class SingleQuestionException extends RuntimeException{
    public SingleQuestionException(){
        super("si la question est de type single , elle soit avoir 2 reponses et une correcte");
    }
}
