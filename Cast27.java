
public class Cast27 {

	public static void main (String[]args){
		
		double x = 18.99;		// int avrundar alltid ner!
		int y;					//OBS, INT!  G�r inte att skriva y = x pga DOUBLE/INT  - om vi inte castar om.
		
		y = (int) x;	//Casta om genom att s�tta INT inom parantes f�re den variabel som ska �ndras.
		
		System.out.println(x);
		System.out.println(y);
	
	double z = 18.1;
	double i = 18.2;
	int produkt;				// m�ste casta eftersom de �r oilka.
	
	produkt = (int) (z + i);   //Castar b�de z och i!
	
	System.out.println(produkt);

	
	}
}
