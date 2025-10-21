package inherit;

public class SingleSubInherit extends SingleInherit
{

	public void create()
	{
		System.out.println("This is example of child class");
		
	}
	public static void main(String[] args)
	{
		SingleSubInherit s = new SingleSubInherit();
		s.display();
		s.create();

	}

}
