/* import java.util.Scanner;


public class Input_24 {

	public static void main (String[]args){
		
	
	//Output = sk�rm, skrivare (te x system.out.println).
	//Input = mus, tangentbord.
	
	Scanner	scan = new Scanner(System.in);				//Skapa ett objekt scan av scanner.

	int x;												// en variabel
	
	System.out.println("Skriv in en siffra: ");

	
	x = scan.nextInt();								// anv�nder objektet f�r att tilldela variabeln ett v�rde...
													// ...av vad anv�ndaren skriver in.
	System.out.println("Du skrev siffran: " + x);
		
		
	// ??? M�ste f�rst st�nga 'scan' innan jag l�gger in nedan, men hur g�r man det d�???
	
	/* Scanner scanObject = new Scanner(System.in);
	

	String y;


	System.out.println("\nVad heter du? ");
	
	y = scanObject.nextLine();		//Line= String			// anv�nder objektet f�r att tilldela variabeln ett v�rde...

	System.out.println("Hej " + y + "!");
*/
	
	// Man kan anv�nda samma f�r double och float:
	// float f;   
	// f = scan.nextFloat();

	// double d;
	// d = scan.nextDouble();
//}
//}
