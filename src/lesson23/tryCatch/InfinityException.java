package lesson23.tryCatch;

public class InfinityException extends Exception {
	private String message;

	public InfinityException(String message) {
		super();
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
