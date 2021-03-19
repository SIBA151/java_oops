package Methods;

import java.util.Scanner;

public class ParametericMethod {
	public void m1(int a,int b,String n) {
		
		System.out.println("value of a is-"+a+"-"+b+"-"+n);
	}

	public static void main(String[] args) {
		ParametericMethod ob=new ParametericMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to find the sum");
		int num=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Enter the name of user");
		
		String name=sc.next();
		
		ob.m1(num, num2, name);
	}

}
