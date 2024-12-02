package ma.znagui.quiz.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationException(MethodArgumentNotValidException e){
        Map<String,String> errors = new HashMap<>();
        e.getBindingResult().getFieldErrors().forEach(fieldError -> {
            errors.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return ResponseEntity.badRequest().body(errors);
    }

    @ExceptionHandler(ResourceNotFoundExeption.class)
    public ResponseEntity<String> handelResourceNotFoundExeption(ResourceNotFoundExeption e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(DatesAreNotValidException.class)
    public ResponseEntity<String> handelDatesAreNotValidException(DatesAreNotValidException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(MaxAttemptsReachedException.class)
    public ResponseEntity<String> handelMaxAttemptsReachedException(MaxAttemptsReachedException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(HasSubSubjectException.class)
    public ResponseEntity<String> handelHasSubSubjectException(HasSubSubjectException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(SingleQuestionException.class)
    public ResponseEntity<String> handelSingleQuestionException(SingleQuestionException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(TooMuchCorrectAnswersException.class)
    public ResponseEntity<String> handelSTooMuchCorrectAnswersException(TooMuchCorrectAnswersException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(PointsException.class)
    public ResponseEntity<String> handelPointsException(PointsException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(MaxQuestionAnswersException.class)
    public ResponseEntity<String> handelMaxQuestionAnswersException(MaxQuestionAnswersException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
    @ExceptionHandler(MaxCorrectAnswerException.class)
    public ResponseEntity<String> handelMaxCorrectAnswerException(MaxCorrectAnswerException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(MaxWrongQuestionException.class)
    public ResponseEntity<String> handelMaxWrongQuestionException(MaxWrongQuestionException e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(QuestionDoesNotExistInQuiz.class)
    public ResponseEntity<String> handelQuestionDoesNotExistInQuiz(QuestionDoesNotExistInQuiz e){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }


}
