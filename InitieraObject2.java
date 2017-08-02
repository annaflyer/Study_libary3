
public class InitieraObject2 {

	public int x = 22;     //instans variabel
	private int y = 23;	 // gör y private för att göra den mer säker. 
						// Kommer åt den nedan:
	
	public void findY(){
		y = 15; 			//anropar den privata i en publik metod.
		System.out.println(y+" - Nu skriver vi ut variabeln y inom samma\nclass i och med att den är privat!");
	}
	
	public void barkingMethod(){
	 //är en metod. Kan även skriva public eller private. En metod är en handling. Metodhuvud.
	// Vad metoden ska göra? Går ej att köra pga?
		System.out.println("Leiha Skäller");  
	}
	
	public void eatingMethod(){
		for (int x = 1; x <= 3; x++){
		System.out.println(x +" gånger,"); 
	}}
	}
