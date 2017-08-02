
public class InitieraObject {

	public static void main (String args[]){  	//public/private eller protected beh�vs inte.

		//1.Initierar objektet. Vi har gjort ett objekt genom att kalla p� klassen. variablenamn=referensvariabel. Objektet �r en referens till klassen, h�ller alla v�rden i den andra klassen. Men genom ett variabelnamn? //() visar att vi s�tter upp en konstrukt�r.
		InitieraObject2 variabelnamn = new InitieraObject2(); 
		variabelnamn.barkingMethod();   //2.Kallar p� metoden, anropar metoden. Punkten skiljer objektet fr�n metoden som vi vill anropa.
		
		InitieraObject2 variabelnamn2 = new InitieraObject2();
		variabelnamn2.eatingMethod();
		
		InitieraObject2 variabelnamn3 = new InitieraObject2();
		
		// variabelnamn3.x();  - Du kan inte kalla direkt p� en variabel, m�ste kalla p� en METOD.
		
		System.out.println(variabelnamn3.x); // h�mtar variabeln x direkt fr�n klassen (utan egen metod men
											// genom att initiera ett object ovan) pga att den �r offentlig.
		
		variabelnamn3.x = 15;  				// �ndrar direkt h�r.Anv�nder objektet variabelnamn3 f�r att komma �t variabeln x som ligger i den andra klassen.
		System.out.println(variabelnamn3.x);	 //�ndrar v�rdet p� x, men det �r inte s� s�kert pga att x-variabeln inte �r privat.
		
		InitieraObject2 variabelnamn4 = new InitieraObject2();
		variabelnamn4.findY();						 //h�mtar variabeln y fr�n en public metod i och med att insansvariabeln �r privat.
		
		// man kan �ven anropa en PRIVAT metod inuti en PUBLIK METOD. Och sedan anropa den  
		// publika fr�n denna klass.
		// En metod �r beteendet som utf�rs beroende av variablen/tillst�ndet.  
		// �r hunden tr�tt (variabel) s� sover (metoden) hunden.
		
	}}