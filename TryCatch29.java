
public class TryCatch29 {

	public static void main (String[]args){
		
		int x = 10;
		int y = 0;
		
		try {										// Gick ej att dela y/x, varf�r???
				int z = x / y;						//Det g�r ju inte att dela n�got med 0 och ger errror.
	}													// Testar h�r koden genom Try och Catch.
		catch (ArithmeticException e){						//Matematik - Undantag								
		System.out.println("N�got gick fel i ber�kningen.");
	}
		finally{ 					 // All kod som ska utf�ras oavsett error...
				System.out.println("Den h�r koden utf�rs oavsett error. ");		
						// Varf�r g�r det inte att l�gga in z ovan???
						// Lade till int z; h�gst upp, men det g�llde inte???
		}
	}
}
