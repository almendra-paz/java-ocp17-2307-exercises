public class SuppressedExceptionsFinally{

	public static void main(String args[]){
		try(MyFileReader mr = new MyFileReader("1")){
			throw new IllegalArgumentException("runtime");
		}finally{
			throw new RuntimeException("perdiendo las demás excepciones");
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