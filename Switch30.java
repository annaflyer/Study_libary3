
public class Switch30 {
	
	// Switch fungerar som If-satser, men de är mer effektiva istället för många if-else satser.
	// OBS, det går inte att lägga till villkor, te x number < 10 - då får man använda if-satser.
	
	public static void main (String[]args){
		
		int number = 7;

		switch(number)	{		//Inom parantesen skriver man det man vill jämföra.
		
		case 1: 
			System.out.println("Variabeln number 1 = "+ number);
			break; 			//för att bryta sig ur switch-satsen (fungerar även i loopar).
							//Varför vill man bryta sig ur???
		case 2: 
			System.out.println("Variabeln number 2 = "+ number);
			break;
		case 3: 
			System.out.println("Variabeln number 3 = "+ number);
			break;
		default: 
			System.out.println("Switch-satsens motsvarighet till Else.");

		}
	}

}
