package assignment;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		sc.close();
		int temp=1;
		
		while(temp<=no)
		{
		if(temp%2!=0)
		{
		System.out.println(temp);
			sum=sum+temp;
		}
		temp++;
		}
		System.out.println("Sum of odd number "+sum);
	}

}
