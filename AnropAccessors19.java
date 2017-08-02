
public class AnropAccessors19 {

	public static void main (String[]args){
		
		Accessors19 anropa = new Accessors19();	// Vad är det för parametrar man kan sätta i New Accessors?
		anropa.setX(5);  						// ?? Först måste vi SÄTTA (set) värdet? 
												// Dvs definiera parametern? Kan det göras någon annan stans?
												// anropa.x = 5;  - funkar istället om vi tar bort 
												// "private" från variabeln i den andra klassen är privat.
												// lär mer om det under Metod15.
		
		System.out.println(anropa.getX()); 		// ?? Sen FÅR (get) vi värdet i själva metoden? Genom att
												// kalla på objektet-SET här ovan?
												// Vi kommer åt den publika return getX när instansvariabeln 
												// int x är privat.   private int x;
	}
	
}
