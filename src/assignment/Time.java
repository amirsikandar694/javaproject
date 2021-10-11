package assignment;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time,hour;
		
		System.out.println("Enter the date in sec");
		Scanner sc=new Scanner(System.in);
		time=sc.nextInt();
		sc.close();
		hour=time/3600;
		int remHour = time%3600;
		int min = remHour/60;
		int sec = remHour%60;
		
		System.out.println("Time = "+hour+"hours : "+min+"min : "+sec+"sec");

	}

}
