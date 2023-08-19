public class Enumerations{

	public static void main(String args[]){
		//name(), valueOf(), ordinal()
		for(Season season: Season.values()){
			System.out.println(season.name() + " "+ season.ordinal());
		}

		//valueOf()
		Season t1 = Season.valueOf("WINTER");
		System.out.println(t1.name());		
		//Season t2 = Season.valueOf("winter"); //Exception
		//Season t3 = Season.valueOf(); //err. compilacion
	}

}

enum Season{
	SUMMER, SPRING, WINTER, FALL
}
