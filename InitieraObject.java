
public class InitieraObject {

	public static void main (String args[]){  	//public/private eller protected behövs inte.

		//1.Initierar objektet. Vi har gjort ett objekt genom att kalla på klassen. variablenamn=referensvariabel. Objektet är en referens till klassen, håller alla värden i den andra klassen. Men genom ett variabelnamn? //() visar att vi sätter upp en konstruktör.
		InitieraObject2 variabelnamn = new InitieraObject2(); 
		variabelnamn.barkingMethod();   //2.Kallar på metoden, anropar metoden. Punkten skiljer objektet från metoden som vi vill anropa.
		
		InitieraObject2 variabelnamn2 = new InitieraObject2();
		variabelnamn2.eatingMethod();
		
		InitieraObject2 variabelnamn3 = new InitieraObject2();
		
		// variabelnamn3.x();  - Du kan inte kalla direkt på en variabel, måste kalla på en METOD.
		
		System.out.println(variabelnamn3.x); // hämtar variabeln x direkt från klassen (utan egen metod men
											// genom att initiera ett object ovan) pga att den är offentlig.
		
		variabelnamn3.x = 15;  				// ändrar direkt här.Använder objektet variabelnamn3 för att komma åt variabeln x som ligger i den andra klassen.
		System.out.println(variabelnamn3.x);	 //ändrar värdet på x, men det är inte så säkert pga att x-variabeln inte är privat.
		
		InitieraObject2 variabelnamn4 = new InitieraObject2();
		variabelnamn4.findY();						 //hämtar variabeln y från en public metod i och med att insansvariabeln är privat.
		
		// man kan även anropa en PRIVAT metod inuti en PUBLIK METOD. Och sedan anropa den  
		// publika från denna klass.
		// En metod är beteendet som utförs beroende av variablen/tillståndet.  
		// Är hunden trött (variabel) så sover (metoden) hunden.
		
	}}