
public class Chap1617 {

	//public, private, protected (har med paket att g�ra).
			// S�tter klassen s� privat som m�jligt - men anv�nder METODER som s�tter 
			// v�rden (set) och h�mtar v�rden (get). !!!
		
	// static - anropa en metod utan att anv�nda en referensvariablel f�r att komma �t den.
			// Se Metod15 och AnropMetod15
			// Man beh�ver BARA skriva KLASSNAMNET OCH METODEN du vill komma �t.
			// public static void main (String[]args);
			// alla metoder ska inte vara statiska - ska inte kommas �t �verallt.
			// HUR ANV�NDS DET??? EXEMPEL?? G�ller v�l inte AnropMetod15 trots att vi har 
			// en static void -klass d�r?
	
	public static void main (String[]args){  
	Metod15.minMetodStatic();
		}
	
	// void - betyder att metoden INTE ska RETURNERA n�got v�rde.
		// Om vi vill returnera ett v�rde s� m�ste vi skriva ut datatypen p� v�rdet vi ska returnera...
		//... te x - public static void minMetod- blir - public static int minMetod  !!!
	//return - om det ska returnera n�got, te x en variabel. 
			// s�tts inanf�r metodkroppen (inte ist�llet f�r void verkar det som).
	
	//System.out.println = Man anropar klassen "System"(b�rjar med stor bokstav).
	// .out. = en referensvariabel till System. Som sedan anropar en metod .println
	//.println = En metod som heter println - den tar in en parameter (av te x typen str�ng ("Hello world").
	
	
	}

