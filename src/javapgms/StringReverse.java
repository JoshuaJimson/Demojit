package javapgms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enetr the string");
		String str=s.nextLine();
		String dumm="";
		for(int i=str.length()-1;i>=0;i--)
		{
			dumm=dumm+str.charAt(i);
		}
System.out.println(dumm);

//String class dosent contain reverse() method . for this we need to convert string to string builder
System.out.println("########Using string builder class########");
StringBuilder strrv= new StringBuilder();
strrv.append(str);
System.out.println(strrv.reverse());

//using char array
System.out.println("##########using char array##########");
char[] ab= str.toCharArray();
for(int j=str.length()-1;j>=0;j--)
{
	System.out.print(ab[j]);
}
	}

}
