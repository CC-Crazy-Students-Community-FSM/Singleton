package singleton;
/*
 * 
 * 
 * 
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


public final class PrinterFeatures {
	//das attribut, welches das einzige objekt dieser klasse im speicher hält:
	private static PrinterFeatures instance;
	
	
	
	private PrinterFeatures() {
		
	}
	
	//diese methode ist nach außen die einzige möglichkeit, um auf das singleton-objekt zuzugreifen:
	public static PrinterFeatures getInstance() {
		
		//Das Singleton-Objekt wird nur dann instanziiert, wenn es noch kein Objekt hinter der Referenzvariablen instance 
		//gibt
		if(instance==null)
		{
			instance=new PrinterFeatures();
		}
		return instance;
	}
	
	
	

}
