package multilevel;

public class Daughter extends Father {
	
	public void sub()
	{
	    int a =20, b = 15;
	    int c = a-b;
		System.out.println("The subtraction of two numbers is:"+ c);
	}

	public static void main(String[] args) {
		 
		Daughter d = new Daughter();
		d.tell();
		d.add();
		d.sub();

	}

}
