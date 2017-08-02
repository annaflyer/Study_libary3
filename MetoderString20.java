
public class MetoderString20 {

	public static void main (String[]args){
		String[] ord = {"boll", "troll", "koll", "Anna", "Leiha", "Jacob"};
				for (String i : ord){
					if(i.endsWith("oll")){
						System.out.println(i);
						
					}}
				
				System.out.println("");

				String[] ord2 = {"boll", "troll", "koll", "Anna", "ansvar", "antal"};
				for (String x : ord2){
					if (x.startsWith("an")){
						System.out.println(x);
	
					}}
				System.out.println("");

					String anna = "Hej på dig!";
					System.out.println(anna.indexOf("p"));   	//p ligger på 4:e plats i Stringen.
				
	}
}
