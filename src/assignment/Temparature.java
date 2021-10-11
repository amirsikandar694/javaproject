package assignment;

import java.util.Scanner;

public class Temparature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float far;
		float cal;
		System.out.println("Enter the temp in farenheit");
		Scanner sc=new Scanner(System.in);
		far=sc.nextFloat();
		sc.close();
		cal=((far-32)*5)/9;
		System.out.println("Temp. in celcius "+cal);

		
	}

}
