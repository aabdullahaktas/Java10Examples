package lesson23.tryCatch;

public class EksiDegerException extends RuntimeException {
	private String message;

	public EksiDegerException(String message) {
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
