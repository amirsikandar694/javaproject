package assignment;

import java.util.Scanner;

public class MonthCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month;
		System.out.println("Enter the month");
		Scanner sc=new Scanner(System.in);
		month=sc.nextInt();
		sc.close();
		
		switch(month)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		System.out.println("31 Days");
		break;
		case 2:
		System.out.println("28 Days");	
		break;
		case 4:
		case 6:
		case 9:
		System.out.println("30 Days");
		break;
		default :
		System.out.println("Wrong input");
			
		}
		
	}

}
