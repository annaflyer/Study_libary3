
public class InitieraObject2 {

	public int x = 22;     //instans variabel
	private int y = 23;	 // g�r y private f�r att g�ra den mer s�ker. 
						// Kommer �t den nedan:
	
	public void findY(){
		y = 15; 			//anropar den privata i en publik metod.
		System.out.println(y+" - Nu skriver vi ut variabeln y inom samma\nclass i och med att den �r privat!");
	}
	
	public void barkingMethod(){
	 //�r en metod. Kan �ven skriva public eller private. En metod �r en handling. Metodhuvud.
	// Vad metoden ska g�ra? G�r ej att k�ra pga?
		System.out.println("Leiha Sk�ller");  
	}
	
	public void eatingMethod(){
		for (int x = 1; x <= 3; x++){
		System.out.println(x +" g�nger,"); 
	}}
	}
