package com.cdac.tester;
import com.cdac.core.Student;


import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of the first student: id, age, name, email");
		//new student 1
		Student s1 = new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.next());
		System.out.println("Enter the details of the second student: id, age, name, email");
		//new student 2
		Student s2 = new Student(sc.nextInt(), sc.nextInt(), sc.next(), sc.next());
		//taking student scores input; caution while input, validations have not been added!
		System.out.println("Enter the quiz, test and assignment scores (0.0 - 10.0) for the first student: ");
		s1.computeGPA(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("Enter the quiz, test and assignment scores (0.0 - 10.0) for the second student: ");
		s2.computeGPA(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println("the name of the topper is: "+(s1.getGPA()>=s2.getGPA()?s1.getName():s2.getName()));
		//close scanner instance
		sc.close();
	}

}
