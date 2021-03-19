package InheritanceConcept;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//at.regressionTesting();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		AutomationTesting at = new AutomationTesting(num);

	}

}
