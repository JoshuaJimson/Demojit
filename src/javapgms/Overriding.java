package javapgms;

public class Overriding extends Parrent {

	public static void main(String[] args) {
	Overriding ob= new Overriding();
	ob.overmethod();
	ob.overmethod2();
	}
	
	public void overmethod()
	{
		System.out.println("I am from Child");
	}

}
