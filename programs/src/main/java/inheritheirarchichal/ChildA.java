package inheritheirarchichal;

public class ChildA extends ParentClass {
	
	public void create()
	{
		System.out.println("Child Class A");
	}

	public static void main(String args[])
	{
		ChildA a = new ChildA();
		a.create();
		a.display();
		//b.show();
	}
}
