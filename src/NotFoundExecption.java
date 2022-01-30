public class NotFoundExecption extends Exception {

    private String errorMessage;

    public NotFoundExecption(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMessage() {
        return errorMessage;
    }
}
