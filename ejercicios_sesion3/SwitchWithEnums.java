public class SwitchWithEnums{

	public static void main(String args[]){
		ButtonState bt = ButtonState.ON;
		switch(bt){
			case ON: System.out.println("ON");break;
			case OFF: System.out.println("OF");break; 
		}

	}

}

public enum ButtonState{
	ON, OFF;
}