package Custom_Exception;

public class AgeInvalidException extends Exception{

	public AgeInvalidException() {
		super("Age is invalid");
	}
	public AgeInvalidException(String msg) {
		super(msg);
	}
	
}
