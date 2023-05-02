package singleton;
/*
 * 	SINGLETON:
 * 
 * 		-> Problem?
 * 
 * 			-> Wie erstellt man Klassen, von denen es im Speicher zur Laufzeit immer nur ein einziges 
 * 				Objekt geben kann?
 * 
 * 	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {
		//PrinterFeatures pf= new PrinterFeatures();
		PrinterFeatures.getInstance();
		
		
		DBConnector connector=DBConnector.getConnector();
		connector.dbConnect(null);
		
		
		
		DBConnector.getConnector().dbConnect("Shop");
		DBConnector.getConnector().sqlQuery("SELECT * FROM Kunden");
		DBConnector.getConnector().dbDisconnect("Shop");
		
		
		

	}

}
