
public class Accessors19 {

	// med en privat variabel (1.) tilldelar man v�rden genom set-metoder (2.) och h�mtar v�rden genom
	// get-metoder (3.).
	
	private int x;					// Instansvariabeln x (vad �r en instansvariabel? skillnad mot 
									// variabel???)
									// N�r variabeln x �r privat, s� g�r det inte att �ndra direkt i 
									// den andra klassen,utan m�ste g� igenom en publik metod.
									
	
	public void setX (int x){		// x = en parameter. F�rsta metoden som s�tter v�rdet x kommer alltid 
		this.x = x; 				// att heta SET. D� vet man att det �r en accessor.
	 								// "This" tar instansvariabeln x och tilldelar v�rdet som finns i 
									// metodhuvudet. Nu tar x fr�n public void accessors (int x); - sin egen metod.
									// om man vill undvika det s� kan man �ndra til y:    private int = y;
	}
	
	public int getX (){ 		// Metod.
		return x;				// ??? L�gger man n�gonsin n�got inom paranteserna?
						  		// Eftersom vi inte har n�gon parameter som heter x letar den efter 
								// instansvariaveln i   private int = x;.
								//D�rf�r beh�ver vi inte anv�nda this.
	}							//return = nyckelord.		
	
	
	
	}								
			

