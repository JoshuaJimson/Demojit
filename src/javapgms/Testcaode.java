package javapgms;

public class Testcaode {

	public static void main(String[] args) {
		String j="josha is very good boy";
		
		String[] ar=j.split(" ");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]);
			System.out.print ("\t");
			String dum="";
			for(int m=ar[i].length()-1;m>=0;m--)
			{
				dum=dum+ar[i].charAt(m);
			}
			System.out.println(dum);
		}
	}

}
