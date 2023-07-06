package lesson33.dependencyinversion.databaselogger.cozum;

public class MySql implements ILogger{
	
	
	public void log(String ex) {
		System.out.println(ex+" ---> MySql loglandı");
	}
}
