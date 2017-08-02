
public class Metod15 {

	// Metoder är det som ska utföra en viss uppgift i vårt program.
	// Kan börjar med public, private eller protected - precis som klassen.
	// men vi kan också SKRIVA BARA VOID och sen namnet på vår metod (om det är ett litet program).
	
	// Denna metod har till uppgift att skriva ut en sak.
	
	
	
	public void minMetod(){ 				
		System.out.println("Min första metod!");
	
	}
	
	// I och med att vi har static här så kommer vi åt den 
		// i Chap1617 utan att göra en ny metod...
		//...så det står bara Metod15.minMetod(); - så execuveras koden.
	
	public static void minMetodStatic(){ 				
			System.out.println("\nMin andra metod med STATIC och ENDAST anrop med hjälp av "
					+ "Metod15.minMetodStatic();!");
			
	}
}