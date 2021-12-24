package javapgms;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("number of row=");
		int r=s.nextInt();
		int c=1;
		int sc=0;
		for(int i=r;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(c);
				c++;
				System.out.print("\t");
			}
			System.out.println();
			sc=sc+1;
			for(int m=sc;m>0;m--)
			{
				System.out.print("\t");
			}
		}

	}

}
