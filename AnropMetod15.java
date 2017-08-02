
public class AnropMetod15 {

	public static void main (String[]args){
		
		Metod15 anropaMetod15 = new Metod15();
		anropaMetod15.minMetod();
		
		Metod15.minMetodStatic();
		
		// när vi ändrar metoden i Metod15 till "static void" behövs det bara 
		// Metod15.minMetod(); för att anropa den...
		//... vilket programmet varnar för här.
		//?? frågan sen blir; när ska man använda static och när anropa på det här sättet...
		// ?? dvs fördel med att skapa object ist för static?
		// Svar: bättre med object för att kunna använda private?
		 
		
	}
}
