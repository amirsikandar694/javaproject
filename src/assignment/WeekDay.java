package assignment;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		
		System.out.println("Enter the day number");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		sc.close();
		
		switch(ch)
		{
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Wrong input");
			
	
		}
		
		
	}

}
