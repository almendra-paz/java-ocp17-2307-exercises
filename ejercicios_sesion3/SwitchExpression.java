public class Switch{

	public static void main(String args[]){
		// Devolviendo un valor
		int mesNumber = 10;
		String mes = switch(mesNumber){
			case 1,2,3-> "Enero"; 
			case 4,5,6-> "Abril";
			case 7,8,9-> {
							System.out.println("before");
							yield "Julio";
						} //yield = return
			default -> "Invalid mes";
		};
		
		System.out.println("mes: "+mes);
		
		// Cuando No devuelve un valor
		mesNumber = 5;
		System.out.println("--- Switch Expression ---");
		switch(mesNumber){
			case 1,2,3-> System.out.println("Enero");
			case 4,5,6-> System.out.println("Abril");
			case 7,8,9-> System.out.println("Julio");
		};
		System.out.println("--- Switch Statement ---");
		switch(mesNumber){
			case 1,2,3: System.out.println("Enero");
			case 4,5,6: System.out.println("Abril");
			case 7,8,9: System.out.println("Julio");
		};
		
		ButtonState bt = ButtonState.ON;
		var button = switch(bt){
			case ON-> "ON";
			case OFF-> "OFF";
			default-> "OFF";
		};
		System.out.println(button);
	}
}

enum ButtonState{
	ON, OFF, MEDIUM;
}

