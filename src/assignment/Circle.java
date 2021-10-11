package assignment;

import java.util.Scanner;

public class Circle {
	float area,per,r;
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Circle cr=new Circle();
		cr.input();
		cr.compute();
	}
	
	
	void input()
	{
	System.out.println("Enter the radius");
	r=sc.nextFloat();	
	}
	
	void compute()
	{
		area=3.14f*r*r;
		System.out.println("Area of cicle : "+area);
		per=2*3.14f*r;
		System.out.println("Perimeter of cicle : "+per);		
	}

}
