
public class VarLengthArgList31 {

	public static void main (String[]args){
		
		AnropaVarLength31 nyMetod = new AnropaVarLength31();
		System.out.println(nyMetod.medeltal(9, 8, 8, 6, 10));  
		

		// Anropar metoden medeltal och lägger in 5 betyg.
		
		System.out.printf("%.2f", nyMetod.medeltal(9, 8, 8, 6, 10));  
		// print f = man formaterar text.
		// Måste ha en text sträng här.
		//   "%.1f"  Säger att vi vill ha en decimal - "%.3f" = 3 decimaler
		// f säger att det är en decimal-tal. d är för integers. s är för sträng.
		// man kan formatera olika text-strängar (googla).
		// Varför kan man inte bara anropa utan att skriva System.out.println???
		
	}

}
