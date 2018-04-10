package util.exception;

public class NotFoundEsception extends RuntimeException {
    public NotFoundEsception(String massage){
        super(massage);
    }
}
