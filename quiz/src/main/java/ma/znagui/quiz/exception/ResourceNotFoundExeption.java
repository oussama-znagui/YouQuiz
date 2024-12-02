package ma.znagui.quiz.exception;

public class ResourceNotFoundExeption extends RuntimeException{
    public ResourceNotFoundExeption(String entity,Long id){
        super(String.format("%s avec ID : %d N'existe pas. Merci!",entity,id));
    }


    public ResourceNotFoundExeption(String entity,Long id1,Long id2){
        super(String.format("%s avec ID : %d , %d N'existe pas. Merci!",entity,id1,id2));
    }
}
