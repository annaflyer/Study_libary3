
public class VarLengthArgList31 {

	public static void main (String[]args){
		
		AnropaVarLength31 nyMetod = new AnropaVarLength31();
		System.out.println(nyMetod.medeltal(9, 8, 8, 6, 10));  
		

		// Anropar metoden medeltal och l�gger in 5 betyg.
		
		System.out.printf("%.2f", nyMetod.medeltal(9, 8, 8, 6, 10));  
		// print f = man formaterar text.
		// M�ste ha en text str�ng h�r.
		//   "%.1f"  S�ger att vi vill ha en decimal - "%.3f" = 3 decimaler
		// f s�ger att det �r en decimal-tal. d �r f�r integers. s �r f�r str�ng.
		// man kan formatera olika text-str�ngar (googla).
		// Varf�r kan man inte bara anropa utan att skriva System.out.println???
		
	}

}
