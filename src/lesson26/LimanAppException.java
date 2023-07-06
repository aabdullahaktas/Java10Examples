package lesson26;

public class LimanAppException extends Exception {

	private ErrorType errorType;

	public LimanAppException(ErrorType errorType) {
		super(errorType.getMessage());
		this.errorType = errorType;
	}

	public LimanAppException(ErrorType errorType, String message) {
		super(message);
		this.errorType = errorType;
	}

	public ErrorType getErrorType() {
		return errorType;
	}

}
