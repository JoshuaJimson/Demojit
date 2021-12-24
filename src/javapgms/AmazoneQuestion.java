package javapgms;

import java.util.ArrayList;

public class AmazoneQuestion {

	public static void main(String[] args) {
		// you have given an array. print each number wit how many times they are repeated and also print the unique number
		
		
		int[] num={9,5,3,11,1,2,6,3,4,9,5,6,8,7,3,5,4,2,3,4,1};
		
		ArrayList<Integer> arlis=new ArrayList<Integer>();
		
		for(int i=0;i<num.length;i++)
		{
			int k=1;
			int v=num[i];
			if(!(arlis.contains(v)))
			{
				arlis.add(v);
				for(int j=i+1;j<num.length;j++)
				{
					if(v==num[j])
						k=k+1;
				}
				if(k!=1)
				System.out.println("Number "+ v + " is repeated on " + k + " times");
				else
					System.out.println(v + " is a uniques number");
			}
		}

	}

}
