package zoo.visitor;

import java.util.*;
import zoo.tours.api.*;
import zoo.tours.reservations.*;

public class Tourist{

	public static void main(String[] args){
		Tour tour = BuscadorTour.buscadorUnicoTour();
		System.out.println("Unico tour: "+tour);

		List<Tour> tours = BuscadorTour.buscarTodosTours();
		System.out.println("# tours: "+tours.size());		
	}
}