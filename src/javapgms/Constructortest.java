package javapgms;

public class Constructortest {
	static int a=0;
	int b=0;
	
	public Constructortest()
	{

		a=a+10;
		b=b+10;
		System.out.println(a);
		System.out.println(b);
		System.out.println();
	}

	public static void main(String[] args) {
		final int a=0;
		Constructortest cd=new Constructortest();
		Constructortest cd1=new Constructortest();

	}

}
