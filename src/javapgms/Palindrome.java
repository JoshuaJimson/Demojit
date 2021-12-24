package javapgms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enetr the string");
		String str=s.nextLine();

			
		String dumm="";
		for(int i=str.length()-1;i>=0;i--)
		{
			dumm=dumm+str.charAt(i);
		}
		
if(str.equals(dumm))
{
	System.out.println("Palindrome");
}
else
	System.out.println("no palindrome");


	}

}
