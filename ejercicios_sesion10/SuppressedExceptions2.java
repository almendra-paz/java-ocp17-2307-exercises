public class SuppressedExceptions2{

	public static void main(String args[]){
		try(MyFileReader mr = new MyFileReader("1");
			MyFileReader mr2 = new MyFileReader("2")){
			//throw new IllegalArgumentException("runtime");
			
		}catch(RuntimeException e){
			System.out.println("exception captured");
			for(Throwable t: e.getSuppressed()){
				System.out.println("Suppressed:"+t.getMessage());
			}
		}
	}

}

class MyFileReader implements AutoCloseable{
	private String tag;
	public MyFileReader(String tag){this.tag = tag;}

	@Override public void close(){
		throw new RuntimeException("exception closing tag: "+tag);
	}
}