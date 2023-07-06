package lesson33.dependencyinversion.exception;

public class VideoException extends RuntimeException{
	
	String message;

	public VideoException(String message) {
		super();
		this.message = message;
	}
	
}
