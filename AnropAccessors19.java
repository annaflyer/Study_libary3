
public class AnropAccessors19 {

	public static void main (String[]args){
		
		Accessors19 anropa = new Accessors19();	// Vad �r det f�r parametrar man kan s�tta i New Accessors?
		anropa.setX(5);  						// ?? F�rst m�ste vi S�TTA (set) v�rdet? 
												// Dvs definiera parametern? Kan det g�ras n�gon annan stans?
												// anropa.x = 5;  - funkar ist�llet om vi tar bort 
												// "private" fr�n variabeln i den andra klassen �r privat.
												// l�r mer om det under Metod15.
		
		System.out.println(anropa.getX()); 		// ?? Sen F�R (get) vi v�rdet i sj�lva metoden? Genom att
												// kalla p� objektet-SET h�r ovan?
												// Vi kommer �t den publika return getX n�r instansvariabeln 
												// int x �r privat.   private int x;
	}
	
}
