package superprogram;

public class ChildConstruct extends ParentConstruct{
	public ChildConstruct()
	{
		super();
		System.out.println("This is a child constructor");
	}

	public static void main(String[] args) {
	
		ChildConstruct c = new ChildConstruct();

	}

}
