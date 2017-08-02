
public class Chap1617 {

	//public, private, protected (har med paket att göra).
			// Sätter klassen så privat som möjligt - men använder METODER som sätter 
			// värden (set) och hämtar värden (get). !!!
		
	// static - anropa en metod utan att använda en referensvariablel för att komma åt den.
			// Se Metod15 och AnropMetod15
			// Man behöver BARA skriva KLASSNAMNET OCH METODEN du vill komma åt.
			// public static void main (String[]args);
			// alla metoder ska inte vara statiska - ska inte kommas åt överallt.
			// HUR ANVÄNDS DET??? EXEMPEL?? Gäller väl inte AnropMetod15 trots att vi har 
			// en static void -klass där?
	
	public static void main (String[]args){  
	Metod15.minMetodStatic();
		}
	
	// void - betyder att metoden INTE ska RETURNERA något värde.
		// Om vi vill returnera ett värde så måste vi skriva ut datatypen på värdet vi ska returnera...
		//... te x - public static void minMetod- blir - public static int minMetod  !!!
	//return - om det ska returnera något, te x en variabel. 
			// sätts inanför metodkroppen (inte istället för void verkar det som).
	
	//System.out.println = Man anropar klassen "System"(börjar med stor bokstav).
	// .out. = en referensvariabel till System. Som sedan anropar en metod .println
	//.println = En metod som heter println - den tar in en parameter (av te x typen sträng ("Hello world").
	
	
	}

