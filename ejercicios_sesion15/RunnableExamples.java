public class RunnableExamples{

	public static void main(String args[]) throws Exception{
		Runnable task1 = () -> System.out.println("task");
		Runnable task2 = () -> {return ;};
		Runnable task3 = () -> { };
		Runnable task4 = () -> {int i =10; i++;};

		System.out.println("---- Ejecuciones de Runnable");
		task1.run();
		task2.run();

		System.out.println("---- Creando un hilo");
		(new Thread(task1)).start(); //start ante que run()
		(new MyThread()).start();

		System.out.println("--- end");
	}

}

class MyThread extends Thread{
	//sobrescrito
	public void run(){
		System.out.println("implementacion propia");
	}
}