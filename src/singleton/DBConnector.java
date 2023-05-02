package singleton;

public final class DBConnector {
	
	private static DBConnector connector;
	
	
	private DBConnector() {
		
	}
	
	
	
	
	
	//baut db-verbindung zur übergebenen datenbank auf und dann wieder ab
	public void dbConnect(String db) {
		
	}
	
	public void dbDisconnect(String db) {
		
	}
	
	public String sqlQuery(String selectStatement) {
		return null;
	}
	
	public static DBConnector getConnector() {
		if(connector==null) {
			connector = new DBConnector();
		}
		
		return connector;
		
	}
	
	
	

}
