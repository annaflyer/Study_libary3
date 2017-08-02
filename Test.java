
/*import java.util.*;

class Test {
	public static void main(String[]args){
		
		Scanner egenScan = new Scanner(System.in);  //Hur stänger man???
		
		int guess = 0;		// verkar som att man bara måste sätta till 0, förstår ej. 
		int random;
		int count = 0;		// verkar som att man måste sätta till 0 (initieras), förstår ej.		
		
		random = (int) (Math.random()*100);  // cast så att det blir ett heltal (annars double).
											// Eftersom random slumpar 0.0 eller 1.0 och konverterar
											// det till en int när vi använder en cast (int) så 
											//kommer den alltid att avrunda ner till 0 och sedan ta 
											// det gånger 100, vilket blir 0. Därför måste vi ta 
											//  hela uttrycket i en parentes så att det inte blir 0.
		System.out.println("Skriv in ett tal mellan 1-100:");

		
		while (guess != random){
			
			guess = egenScan.nextInt();
			
			if (guess < 0 || guess > 100){
				System.out.println("Talet måste vara mellan 1-100");
				//Plussa ej på pga uppmaning count +=1;
			}
			else if (guess<random){
				System.out.println("Talet du gissade var för lågt. Försök igen...");
				count +=1;
			}
			else if (guess>random){
				System.out.println("Talet du gissade var för högt. Försök igen... ");
				count +=1;
			}
	
		}
		count +=1;
		System.out.println("Du svarade rätt!!! Efter " + count + " försök."); //concatenering!!!
	}
}
*/