
public class AnropMetod15 {

	public static void main (String[]args){
		
		Metod15 anropaMetod15 = new Metod15();
		anropaMetod15.minMetod();
		
		Metod15.minMetodStatic();
		
		// n�r vi �ndrar metoden i Metod15 till "static void" beh�vs det bara 
		// Metod15.minMetod(); f�r att anropa den...
		//... vilket programmet varnar f�r h�r.
		//?? fr�gan sen blir; n�r ska man anv�nda static och n�r anropa p� det h�r s�ttet...
		// ?? dvs f�rdel med att skapa object ist f�r static?
		// Svar: b�ttre med object f�r att kunna anv�nda private?
		 
		
	}
}
