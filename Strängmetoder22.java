
public class Strängmetoder22 {

	
	public static void main (String[]args){
		
		String x = "Jag heter Anna.";         
		
		int antalTecken = x.length();			//  x.length();  är en metod.
		
		System.out.println(antalTecken);
		
		
		System.out.println( );

		String z = "Hej, jag heter ";				
		
		System.out.println(z.concat("Anna."));			//Samma som z + "Anna."   Slår ihop två strängar till en sträng. 
	}
}
