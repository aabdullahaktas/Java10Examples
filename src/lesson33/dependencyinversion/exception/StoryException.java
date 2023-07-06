package lesson33.dependencyinversion.exception;

public class StoryException extends RuntimeException{
	
	String message;

	public StoryException(String message) {
		super();
		this.message = message;
	}
	
}
