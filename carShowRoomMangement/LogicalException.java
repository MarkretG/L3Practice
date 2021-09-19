package carShowRoomMangement;

public class LogicalException extends Exception{
    int errorCode;
    public LogicalException(String message,int errorCode)
    {
        super(message);
        this.errorCode=errorCode;
    }
}
