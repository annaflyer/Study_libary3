
public class AnropaKonstrukt33 {

	// Vi gör en konstruktor - liknar en metod.
	// konstruktorn används för att initiera te x  instansvariablernas värde,
	// för första gången när de skapas ...
	
	String name;
	int age;
	
	public AnropaKonstrukt33(String name, int age){
		this.name = name;    //nyckelord this - syftar på det nuvarande objectet.
		this.age = age;			// som anropas. Eftersom varje object har en kopia 
		
		metod();  //Vi kan anropa metoden när objektet skapas (i andra klassen).
				// ??? Vad är detta?
		
		// av alla instansvariabler som ligger i det objektet 
		// den här instansvariablen ska få värdet av den
		// här variabeln som finns i den klassen som anropas
		// pekar på det objekt som anropas.
		// Den här instansvariablen ska få värdet av den här lokala variabeln
		// är angiven inom det här metodhuvudet (konstruktor i det här fallet),
		// name och age under :  public AnropaKonstrukt33(String name, int age) .
	
	}
	
	public void metod(){		 // vi gör en metod
		System.out.println("Hej " + name + ", du är " + age + " år gammal.");
	
		// vi skriver ut name och age, eftersom vi inte har någon lokal variabel
		// som heter name så den kollar ovanför där den hittar name och age.
		// Vi kan anropa metoden när objektet skapas.
	}
}