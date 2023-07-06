package lesson33.dependencyinversion.databaselogger;

import lesson33.dependencyinversion.WhatsApp;
import lesson33.dependencyinversion.exception.StoryException;
import lesson33.dependencyinversion.exception.VideoException;

public class Test {
	public static void main(String[] args) {
		
		WhatsApp whatsApp = new WhatsApp();
		DatabaseLogger databaseLogger = new DatabaseLogger();
		
		try {
			whatsApp.videoConferancing();
		} catch (VideoException e) {
			databaseLogger.logToMongo(e.toString());
		}
		try {
			whatsApp.shareStory();
		} catch (StoryException e) {
			databaseLogger.logToPostgre(e.toString());
		}
		
	}

}
