
public class Variables3 {
	
public static void main (String[] args){
	
	
 int x;  //initierar variabeln, men man kan skriva direkt:  int x = 20;
 x = 20;
 System.out.println(10 + x);

 System.out.println("\nFloats:");
 
float f = (float) 20.333333333333333;   //4 bytes - six or seven decimal digits. (15 3:or exemplet)
float f2 = 20.333333333333333f;        // f is a shorter way of casting float.
System.out.println(f);
System.out.println(f2);
 
System.out.println("\nDoubles:");
 
double y; //8 bytes - decimaler - double variables have a precision of about 15 digits, which is enough for most purposes.In almost all cases, you should use the double type whenever you need numbers with fractional values.
 y = 20.333333333333333;
 double y2 = 20.333333333333333D;  //To save that time, you can add an F or D suffix to a floating-point literal to indicate whether the literal itself is of type float or double
 System.out.println(y+10);
 System.out.println(y2+10);
 
 
 System.out.println("\nStrings:");
 
 String z; //Why not purple? Why uppercase letter?
 z = "Anna";
 System.out.println(z);
 z = "Anna2";
 System.out.println("Hej " + z +"!");
 

String s1 = new String ("Who let the dogs out? ");   //Create a string with a constructor!!!
String s2 = "Who who who who!";    //Just using "" creates a string, so no need to write it the previous way.
String z1;
z1 = " - Anna do!";
String s3 = s1 + s2 + z1;      //Java defined the operator + on strings to concatenate:
System.out.println(s3);
 
System.out.println("\nChar:");
 
char r;
 r = 'R';  
 System.out.println(r);
  

 //byte	Heltal	0	8 bit
 //long	Heltal	0	64 bit
 //short	Heltal	0	16 bit
 
}
}
