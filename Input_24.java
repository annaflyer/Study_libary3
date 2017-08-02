/* import java.util.Scanner;


public class Input_24 {

	public static void main (String[]args){
		
	
	//Output = skärm, skrivare (te x system.out.println).
	//Input = mus, tangentbord.
	
	Scanner	scan = new Scanner(System.in);				//Skapa ett objekt scan av scanner.

	int x;												// en variabel
	
	System.out.println("Skriv in en siffra: ");

	
	x = scan.nextInt();								// använder objektet för att tilldela variabeln ett värde...
													// ...av vad användaren skriver in.
	System.out.println("Du skrev siffran: " + x);
		
		
	// ??? Måste först stänga 'scan' innan jag lägger in nedan, men hur gör man det då???
	
	/* Scanner scanObject = new Scanner(System.in);
	

	String y;


	System.out.println("\nVad heter du? ");
	
	y = scanObject.nextLine();		//Line= String			// använder objektet för att tilldela variabeln ett värde...

	System.out.println("Hej " + y + "!");
*/
	
	// Man kan använda samma för double och float:
	// float f;   
	// f = scan.nextFloat();

	// double d;
	// d = scan.nextDouble();
//}
//}
