public class GarageExceptionHandler extends Exception {

    String message;

    public GarageExceptionHandler(String errMessage){
        message = errMessage;
    }

    public String getMessage() {
        return message;
    }


}
