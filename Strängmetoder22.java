
public class Str�ngmetoder22 {

	
	public static void main (String[]args){
		
		String x = "Jag heter Anna.";         
		
		int antalTecken = x.length();			//  x.length();  �r en metod.
		
		System.out.println(antalTecken);
		
		
		System.out.println( );

		String z = "Hej, jag heter ";				
		
		System.out.println(z.concat("Anna."));			//Samma som z + "Anna."   Sl�r ihop tv� str�ngar till en str�ng. 
	}
}
