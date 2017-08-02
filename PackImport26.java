import pack26.ThirdClass;		//går inte att anropa klassen i ett annat paket. Använd IMPORT!
import pack26.*;		//eller:	//Importera ALLA KLASSER från paketet pack26!


public class PackImport26 {
	
public static void main (String[]args){
	



	ThirdClass pack26Import = new ThirdClass();  //går inte att anropa klassen i ett annat paket.
												//importera därför paketet, se ovan.
	pack26Import.metod();
	
	EnTillPackImp26 pack26Imp = new EnTillPackImp26();
	
	pack26Imp.importeraMigMetod();
}
}