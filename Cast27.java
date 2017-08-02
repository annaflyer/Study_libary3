
public class Cast27 {

	public static void main (String[]args){
		
		double x = 18.99;		// int avrundar alltid ner!
		int y;					//OBS, INT!  Går inte att skriva y = x pga DOUBLE/INT  - om vi inte castar om.
		
		y = (int) x;	//Casta om genom att sätta INT inom parantes före den variabel som ska ändras.
		
		System.out.println(x);
		System.out.println(y);
	
	double z = 18.1;
	double i = 18.2;
	int produkt;				// måste casta eftersom de är oilka.
	
	produkt = (int) (z + i);   //Castar både z och i!
	
	System.out.println(produkt);

	
	}
}
