package ma.znagui.quiz.exception;

public class DatesAreNotValidException extends Exception{
    public DatesAreNotValidException(){
        super("la date debut que vous aves fournit et superieur a la date de fin !!");
    }
}
