
public class AnropaVarLength31 {

	public double medeltal (int ... vitsord){ 	//metod som ska returnera double.
										// inom parantes de datatyper som ska tas in.
									// notera att "int ... vitsord" m�ste vara sist om 
								//... du har flera parametrar in! Det f�r dessutom 
								// ... bara finnas en s�n per metod. F�RST�R EJ???
		//Med de tre punkterna s�ger vi att vi anv�nder Variable Length Argument List.
		//...D� kan vi skicka in hur m�nga parametrar som helst, beh�ver ej best�mma.
	
	int total = 0;			// I metoden g�r vi en int-variabel som heter total.
							// vi initierar avriablen n�r vi ger den ett v�rde (0).

	for (int x : vitsord) {
		total += x;
	}
	
	return total / vitsord.length;
}
}
