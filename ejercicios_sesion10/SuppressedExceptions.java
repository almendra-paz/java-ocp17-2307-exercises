public class SuppressedExceptions{

	public static void main(String args[]){
		try(MyFileReader mr = new MyFileReader("1"); MyFileReader mr2 = new MyFileReader("2")){
			throw new IllegalArgumentException("runtime");
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