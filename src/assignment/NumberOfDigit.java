package assignment;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no,sum=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		sc.close();
		
		while(no>0)
		{
			no=no/10;
			sum++;

		}
		System.out.println(sum);
	}

}
