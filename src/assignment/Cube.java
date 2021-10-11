package assignment;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		sc.close();
		
		int cube=no*no*no;
		System.out.println("Cube : "+cube);
		

	}

}
