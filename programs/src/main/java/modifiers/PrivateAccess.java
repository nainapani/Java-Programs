package modifiers;

public class PrivateAccess {

	private void tell()
	{
		System.out.println("Private Access modifier example");
		
	}
	public static void main(String[] args) 
	{
		
		PrivateAccess p = new PrivateAccess();
		p.tell();
	}

}
