
/* import java.util.Scanner;


// import java.util.Random;


public class Uppgift25 {

public static void main (String[]args){
	
		int random;
		
		random = Math.random(1;100);
	
	
	Scanner	gissning = new Scanner(System.in);	
	
	int g;
	
	System.out.println("Gissa ett tal mellan 1-100: ");

	g = gissning.nextInt();
	
	System.out.println("Du gissade " + g);
	
	
	if (g>100){
		System.out.println("Ditt tal är större än 100...");
	}
	else if (g<0){
		System.out.println("Ditt tal är ett minustal...");
	}
	else if (g<random){
		System.out.println("Ditt tal var för lågt.");
	}
	else if (g>random){
		System.out.println("Ditt tal var för högt.");
	}
	else if (g==random){
		System.out.println("Wow, du gissade rätt!!!"+ " Du klarade det efter "+ "???");
	}
	

}
}
*/