
public class Matematik21 {

	public static void main (String[]args){
		
		
		double variabel = 9;
		double matematikVariabel; 					//Vi tilldelar variabeln Math.sqrt();  nedan.
		
		matematikVariabel = Math.sqrt(variabel);   //Står för Square Root (kvadrat roten).  //Måste använda CAST för att göra om till int.	
		System.out.println(matematikVariabel);
												// Metoden .sqrt är statisk och därför kan vi anropa den...
												// Math. är klassnamnet som vi skiljer åt med punkt för att komma åt metoden .sqrt
												// Så vi behöver inte skapa ett object för att anropa. Utan kan göra det direkt.
		
		double variabel2 = 3;
		double matematikVariabel2; 					
		
		matematikVariabel2 = Math.PI * variabel2; 
		System.out.println(matematikVariabel2);
		
												//docs.oracle.com -> OTN -> Java Developers -> Java SE -> 
												// java platform standard edition... ->Reference -> Java SE API Documentation
												// http://docs.oracle.com/javase/7/docs/api/
		
	}
	
	
}

								