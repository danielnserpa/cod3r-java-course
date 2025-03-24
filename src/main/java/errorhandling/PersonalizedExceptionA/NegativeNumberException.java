package errorhandling.PersonalizedExceptionA;

public class NegativeNumberException extends RuntimeException {

    private String name;

    public NegativeNumberException(String name){
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("The atribute %s is negative", name);


    }
}
