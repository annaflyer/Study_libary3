
public class Switch30 {
	
	// Switch fungerar som If-satser, men de �r mer effektiva ist�llet f�r m�nga if-else satser.
	// OBS, det g�r inte att l�gga till villkor, te x number < 10 - d� f�r man anv�nda if-satser.
	
	public static void main (String[]args){
		
		int number = 7;

		switch(number)	{		//Inom parantesen skriver man det man vill j�mf�ra.
		
		case 1: 
			System.out.println("Variabeln number 1 = "+ number);
			break; 			//f�r att bryta sig ur switch-satsen (fungerar �ven i loopar).
							//Varf�r vill man bryta sig ur???
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
