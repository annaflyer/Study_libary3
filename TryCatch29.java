
public class TryCatch29 {

	public static void main (String[]args){
		
		int x = 10;
		int y = 0;
		
		try {										// Gick ej att dela y/x, varför???
				int z = x / y;						//Det går ju inte att dela något med 0 och ger errror.
	}													// Testar här koden genom Try och Catch.
		catch (ArithmeticException e){						//Matematik - Undantag								
		System.out.println("Något gick fel i beräkningen.");
	}
		finally{ 					 // All kod som ska utföras oavsett error...
				System.out.println("Den här koden utförs oavsett error. ");		
						// Varför går det inte att lägga in z ovan???
						// Lade till int z; högst upp, men det gällde inte???
		}
	}
}
