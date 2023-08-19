interface Movable{
	void move1(int x);		//1
	public void move2(int x);	//2
	//private void move3(int x);	//3
	//protected void move4(int x);	//4
	private void move5(int x){};	//5
	private void move6(int x){};	//6
	
	static void sayHello(){
		System.out.println("hello");
	};

	public default void sayHello2(){
		System.out.println("hello");
	}
}