
public class AnropaVarLength31 {

	public double medeltal (int ... vitsord){ 	//metod som ska returnera double.
										// inom parantes de datatyper som ska tas in.
									// notera att "int ... vitsord" måste vara sist om 
								//... du har flera parametrar in! Det får dessutom 
								// ... bara finnas en sån per metod. FÖRSTÅR EJ???
		//Med de tre punkterna säger vi att vi använder Variable Length Argument List.
		//...Då kan vi skicka in hur många parametrar som helst, behöver ej bestämma.
	
	int total = 0;			// I metoden gör vi en int-variabel som heter total.
							// vi initierar avriablen när vi ger den ett värde (0).

	for (int x : vitsord) {
		total += x;
	}
	
	return total / vitsord.length;
}
}
