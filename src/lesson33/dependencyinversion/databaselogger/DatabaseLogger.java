package lesson33.dependencyinversion.databaselogger;

public class DatabaseLogger {
	
	MongoDb mongoDb = new MongoDb();
	PostgreSql postgreSql =new PostgreSql();
	
	
	public void logToMongo(String ex) {
		mongoDb.log(ex);
		
	}
	
	public void logToPostgre(String ex) {
		postgreSql.log(ex);
	}
	
}
