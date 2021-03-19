package ConstructorConcept;

import java.util.Scanner;

public class ConstBasics {
	int a;
	public ConstBasics(int x) {
		System.out.println("const-");
		a=x;
	}
	//method 
	public void ConstBasics() {
		a=700;
		System.out.println("method");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any value-");
		int num=sc.nextInt();
		ConstBasics obj=new ConstBasics(num);
		System.out.println(obj.a);
		obj.ConstBasics();
		System.out.println(obj.a);

	}

}
