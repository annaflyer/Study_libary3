
public class Metod15 {

	// Metoder �r det som ska utf�ra en viss uppgift i v�rt program.
	// Kan b�rjar med public, private eller protected - precis som klassen.
	// men vi kan ocks� SKRIVA BARA VOID och sen namnet p� v�r metod (om det �r ett litet program).
	
	// Denna metod har till uppgift att skriva ut en sak.
	
	
	
	public void minMetod(){ 				
		System.out.println("Min f�rsta metod!");
	
	}
	
	// I och med att vi har static h�r s� kommer vi �t den 
		// i Chap1617 utan att g�ra en ny metod...
		//...s� det st�r bara Metod15.minMetod(); - s� execuveras koden.
	
	public static void minMetodStatic(){ 				
			System.out.println("\nMin andra metod med STATIC och ENDAST anrop med hj�lp av "
					+ "Metod15.minMetodStatic();!");
			
	}
}