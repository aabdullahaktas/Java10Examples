package lesson33.dependencyinversion.databaselogger.cozum;

import lesson33.dependencyinversion.WhatsApp;
import lesson33.dependencyinversion.exception.StoryException;
import lesson33.dependencyinversion.exception.VideoException;

public class Test {
	
	public static void main(String[] args) {
		
		WhatsApp whatsApp = new WhatsApp();
		DatabaseLogger databaseLogger = null;
		
		try {
			whatsApp.videoConferancing();
		} catch (VideoException e) {
			//MongoDb mongoDb = new MongoDb();
			MySql mySql = new MySql();
			databaseLogger = new DatabaseLogger(mySql);
			databaseLogger.logToDatabase(e.toString());
			
		}
		try {
			whatsApp.shareStory();
		} catch (StoryException e) {
			PostgreSql postgreSql = new PostgreSql();
			databaseLogger = new DatabaseLogger(postgreSql);
			databaseLogger.logToDatabase(e.toString());
		}
		
		
	}
}
