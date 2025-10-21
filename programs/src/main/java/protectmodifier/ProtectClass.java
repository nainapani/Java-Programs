package protectmodifier;

public class ProtectClass {
    protected void display()
    {
    	System.out.println("Example for protected access modifier");
    }
	public static void main(String args[])
	{
		ProtectClass p = new ProtectClass();
		p.display();
	}
}
