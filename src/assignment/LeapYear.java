package assignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		System.out.println("Enter the year");		
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		sc.close();
		
		if(year%4==0)
		{
			System.out.println("Leap year");
		}
		else 
		{
			System.out.println("Not a leap year");
		}

	}

}
