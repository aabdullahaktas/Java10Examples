package lesson32.factory;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bir database ismi giriniz");
		String dbName = scanner.nextLine();
		ILogger logger = DatabaseFactory.createDatabase(dbName);
		
		
//		switch (dbName) {
//		case "postgre": 
//			logger = new PostgreSql();
//			break;
//		case "mongo": 
//			logger = new MongoDb();
//			break;
//		default:
//			System.out.println("Yanlış bir database ismi girdiniz");
//			break;
//		}
		logger.logToDatabase("Log mesajı");

		
	}
	
}
