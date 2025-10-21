package modifiers;

public class DefaultAccess {
	void display()
	{
		System.out.println("Default Acess Modifier");
		
	}

	public static void main(String[] args) {
		DefaultAccess d = new DefaultAccess();
		d.display();
	}

}
