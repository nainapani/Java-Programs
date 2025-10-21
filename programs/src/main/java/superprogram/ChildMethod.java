package superprogram;

public class ChildMethod extends ParentMethod {
public void display() //This method is overridden
{
  System.out.println("This is a child method");	
}

public void tell()
{
  display();
  super.display();
}
	public static void main(String[] args) {
		ChildMethod m = new ChildMethod();
		m.tell();
	}

}
