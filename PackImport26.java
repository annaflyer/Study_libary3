import pack26.ThirdClass;		//g�r inte att anropa klassen i ett annat paket. Anv�nd IMPORT!
import pack26.*;		//eller:	//Importera ALLA KLASSER fr�n paketet pack26!


public class PackImport26 {
	
public static void main (String[]args){
	



	ThirdClass pack26Import = new ThirdClass();  //g�r inte att anropa klassen i ett annat paket.
												//importera d�rf�r paketet, se ovan.
	pack26Import.metod();
	
	EnTillPackImp26 pack26Imp = new EnTillPackImp26();
	
	pack26Imp.importeraMigMetod();
}
}