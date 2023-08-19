public abstract class InnerInterface implements Zoo.Paper{
}

class Zoo{
	public interface Paper{
		public String getId();		
	}
	public class Ticket implements Paper{
		private String serialNumber;
		public String getId(){
			return serialNumber;
		}
	}
}
