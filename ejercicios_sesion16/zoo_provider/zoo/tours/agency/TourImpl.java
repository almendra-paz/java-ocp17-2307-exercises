package zoo.tours.agency;
import zoo.tours.api.*;

public class TourImpl implements Tour {

	public String name(){
		return "nombre implementación";
	}
	public int length(){
		return 20;
	}
	public Double price(){
		return 20.00;
	}


}