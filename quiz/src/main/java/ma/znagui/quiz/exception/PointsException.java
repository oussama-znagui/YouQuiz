package ma.znagui.quiz.exception;

public class PointsException extends RuntimeException{
    public PointsException(Long id,Double min,Double max, String level){
        super("la question ID :  " + id + " est du niveau " + level + " Min Points : " + min + " Mapx Points : " + max + " Merci !");
    }
}
