
public class Accessors19 {

	// med en privat variabel (1.) tilldelar man värden genom set-metoder (2.) och hämtar värden genom
	// get-metoder (3.).
	
	private int x;					// Instansvariabeln x (vad är en instansvariabel? skillnad mot 
									// variabel???)
									// När variabeln x är privat, så går det inte att ändra direkt i 
									// den andra klassen,utan måste gå igenom en publik metod.
									
	
	public void setX (int x){		// x = en parameter. Första metoden som sätter värdet x kommer alltid 
		this.x = x; 				// att heta SET. Då vet man att det är en accessor.
	 								// "This" tar instansvariabeln x och tilldelar värdet som finns i 
									// metodhuvudet. Nu tar x från public void accessors (int x); - sin egen metod.
									// om man vill undvika det så kan man ändra til y:    private int = y;
	}
	
	public int getX (){ 		// Metod.
		return x;				// ??? Lägger man någonsin något inom paranteserna?
						  		// Eftersom vi inte har någon parameter som heter x letar den efter 
								// instansvariaveln i   private int = x;.
								//Därför behöver vi inte använda this.
	}							//return = nyckelord.		
	
	
	
	}								
			

