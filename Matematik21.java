
public class Matematik21 {

	public static void main (String[]args){
		
		
		double variabel = 9;
		double matematikVariabel; 					//Vi tilldelar variabeln Math.sqrt();  nedan.
		
		matematikVariabel = Math.sqrt(variabel);   //St�r f�r Square Root (kvadrat roten).  //M�ste anv�nda CAST f�r att g�ra om till int.	
		System.out.println(matematikVariabel);
												// Metoden .sqrt �r statisk och d�rf�r kan vi anropa den...
												// Math. �r klassnamnet som vi skiljer �t med punkt f�r att komma �t metoden .sqrt
												// S� vi beh�ver inte skapa ett object f�r att anropa. Utan kan g�ra det direkt.
		
		double variabel2 = 3;
		double matematikVariabel2; 					
		
		matematikVariabel2 = Math.PI * variabel2; 
		System.out.println(matematikVariabel2);
		
												//docs.oracle.com -> OTN -> Java Developers -> Java SE -> 
												// java platform standard edition... ->Reference -> Java SE API Documentation
												// http://docs.oracle.com/javase/7/docs/api/
		
	}
	
	
}

								