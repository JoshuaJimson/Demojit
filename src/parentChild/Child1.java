package parentChild;

public class Child1 extends Parrent {

	public void test()
	{
		super.getdata();
		
	}
	public void getdata()
	{
		System.out.println("I am from child1");
	}
	

	public static void main(String[] args) {
		Child1 ob=new Child1();
		ob.getdata();
		
	}

}
