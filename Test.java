
/*import java.util.*;

class Test {
	public static void main(String[]args){
		
		Scanner egenScan = new Scanner(System.in);  //Hur st�nger man???
		
		int guess = 0;		// verkar som att man bara m�ste s�tta till 0, f�rst�r ej. 
		int random;
		int count = 0;		// verkar som att man m�ste s�tta till 0 (initieras), f�rst�r ej.		
		
		random = (int) (Math.random()*100);  // cast s� att det blir ett heltal (annars double).
											// Eftersom random slumpar 0.0 eller 1.0 och konverterar
											// det till en int n�r vi anv�nder en cast (int) s� 
											//kommer den alltid att avrunda ner till 0 och sedan ta 
											// det g�nger 100, vilket blir 0. D�rf�r m�ste vi ta 
											//  hela uttrycket i en parentes s� att det inte blir 0.
		System.out.println("Skriv in ett tal mellan 1-100:");

		
		while (guess != random){
			
			guess = egenScan.nextInt();
			
			if (guess < 0 || guess > 100){
				System.out.println("Talet m�ste vara mellan 1-100");
				//Plussa ej p� pga uppmaning count +=1;
			}
			else if (guess<random){
				System.out.println("Talet du gissade var f�r l�gt. F�rs�k igen...");
				count +=1;
			}
			else if (guess>random){
				System.out.println("Talet du gissade var f�r h�gt. F�rs�k igen... ");
				count +=1;
			}
	
		}
		count +=1;
		System.out.println("Du svarade r�tt!!! Efter " + count + " f�rs�k."); //concatenering!!!
	}
}
*/