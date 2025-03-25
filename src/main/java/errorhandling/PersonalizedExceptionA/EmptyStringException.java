package errorhandling.PersonalizedExceptionA;

public class EmptyStringException extends RuntimeException {

    private String name;

    public EmptyStringException(String name){
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("The atribute %s is empty", name);


    }
}
