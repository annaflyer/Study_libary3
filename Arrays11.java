
public class Arrays11 {
 
	//en array är ett objekt
	
	public static void main (String[]args){
		
		
		// Int Array 1:
		
		System.out.println("\nEn array med 5 olika rader: ");

		//börja med att skriva vilken datatyp du vill ha, te x int.
		
		int array[] = new int[5];    //använder new för att visa att vi skapar ETT NYTT OBJEKT AV TYPEN INT!
		
		array[0]=10;
		array[1]=5;
		array[2]=3;
		array[3]=1;
		array[4]=77;
		
		System.out.println(array[0] + "  <<<--- Här är numret på plats 0");
		
		
		
		// Int Array 2:
		
		System.out.println("\nEn array på en rad med hjälp av {}: ");

		int array2[] = {1,2,3,11,22,33,44};
		
		System.out.println(array2[2]);
		
		
		
		// Int Array 3:
		
		System.out.println("\nEnhanced for loop med array kap 12 Rickard Borg: ");
		
		
		int array3[] = new int [3];
		
		array3[0] = 93;
		array3[1] = 11;
		array3[2] = 22;
		
		//deklararer variabeln x:
		
		for(int x : array3){ 
			System.out.println("for (int x : array3)  visar talet " + x + ".");
		
		}
		
	}
}
