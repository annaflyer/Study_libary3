
public class AnropaKonstrukt33 {

	// Vi g�r en konstruktor - liknar en metod.
	// konstruktorn anv�nds f�r att initiera te x  instansvariablernas v�rde,
	// f�r f�rsta g�ngen n�r de skapas ...
	
	String name;
	int age;
	
	public AnropaKonstrukt33(String name, int age){
		this.name = name;    //nyckelord this - syftar p� det nuvarande objectet.
		this.age = age;			// som anropas. Eftersom varje object har en kopia 
		
		metod();  //Vi kan anropa metoden n�r objektet skapas (i andra klassen).
				// ??? Vad �r detta?
		
		// av alla instansvariabler som ligger i det objektet 
		// den h�r instansvariablen ska f� v�rdet av den
		// h�r variabeln som finns i den klassen som anropas
		// pekar p� det objekt som anropas.
		// Den h�r instansvariablen ska f� v�rdet av den h�r lokala variabeln
		// �r angiven inom det h�r metodhuvudet (konstruktor i det h�r fallet),
		// name och age under :  public AnropaKonstrukt33(String name, int age) .
	
	}
	
	public void metod(){		 // vi g�r en metod
		System.out.println("Hej " + name + ", du �r " + age + " �r gammal.");
	
		// vi skriver ut name och age, eftersom vi inte har n�gon lokal variabel
		// som heter name s� den kollar ovanf�r d�r den hittar name och age.
		// Vi kan anropa metoden n�r objektet skapas.
	}
}