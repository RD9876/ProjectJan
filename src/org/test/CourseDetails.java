package org.test;

import java.util.Scanner;

public class CourseDetails {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Employee id: ");
		int empId = s.nextInt();
		System.out.println("Employee id: " + empId);

		System.out.println("Enter the employee name: ");
		Scanner s1 = new Scanner(System.in);
		String empName = s1.nextLine();
		System.out.println("Employee email id is: " + empName);

		System.out.println("Enter the employee Mobile number: ");
		long empMob = s1.nextLong();
		System.out.println("Employee mobile numbner: " + empMob);

		System.out.println("Enter the float value: ");
		float f = s1.nextFloat();
		System.out.println("Float value: " + f);

		System.out.println("Enter the double value: ");
		double d = s1.nextDouble();
		System.out.println("Double value: " + d);

		System.out.println("Enter the Employee Gender: ");
		char empGender = s1.next().charAt(0);
		System.out.println("Employee Gender: " + empGender);

		System.out.println("Employee present- True/False: ");
		boolean empPresent = s1.nextBoolean();
		System.out.println("Employee present: " + empPresent);

	}

}
