
public class For7While8 {

	public static void main (String[]args){
		
		System.out.println("For Loop kap 7 Rickard Borg Youtube:");

		for (int x = 1; x <= 3; x+=2){   //or minus-- or (x +=1 means ++) or (x +=2 means 2,4,6 osv)
				System.out.println("Loop nr " + x);
	}
		
		System.out.println("\nWhile Loop kap 8 Rickard Borg Youtube:");

		int y = 1;
		
		while (y <= 3){
			System.out.println("While nr " + y);
			y++;
		}
		
		
		
		// Booleans: Se ConditionalOperators20 TheBoston
		
		int age = 60;
		
		System.out.println(age > 50 ? "\nÖver 50" : "\nUnder 50" );
		
		
		
		
		// While loop:
				
	System.out.println("\nDo While Loop kap 9 Rickard Borg Youtube:");
	
	int x = 1;
		do {
			System.out.println("Do while loop nr " + x);
			x++;
			}
		
		while (x <= 3);
		System.out.println("\nSammanfattning kap 10 Rickard Borg Youtube:");
		
	for (int z = 1; z < 3; z++){
		System.out.print("\n" + z);
	
	if (z < 5){
			System.out.println(" = z is less than 5.");
	}
	else if (z > 5){
		System.out.println(" = z is more than 5.");
	}
	else if (z==5){
		System.out.println(" = z is 5.");
	}
		
		
	
	
	
	System.out.println("\nMultiplikation kap 10 Rickard Borg Youtube:");
		
		int times = 2;    //initierar variabeln times till 2.
		int total;        //deklararer variabeln. EJ INITIERAD ÄNNU!
		
		for (int i=1; i<=3; i++){
			total = times * i;
			System.out.println("Antal varv multiplicerat med två - "+ i + "x" + "2 = " + total);
		
		
		}
	}
}
}
