package lesson33.dependencyinversion.databaselogger.cozum;

public class MongoDb implements ILogger{
	
	public void log(String ex) {
		System.out.println(ex+" ---> mongoya loglandı");
	}


	/// yorummmmm 
	
}
