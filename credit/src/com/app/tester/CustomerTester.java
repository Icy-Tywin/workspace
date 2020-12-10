package com.app.tester;
import java.util.Scanner;

import com.app.core.Customer;

public class CustomerTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter customer details: name, email, age, credit limit");
		Customer c1 = new Customer(sc.next(), sc.next(),sc.nextInt(), sc.nextDouble());
		System.out.println("enter customer details: name, email, age");
		Customer c2 = new Customer(sc.next(), sc.next(),sc.nextInt());
		Customer c3 = new Customer();
		
		System.out.println(c1.getDetails());
		System.out.println(c2.getDetails());
		System.out.println(c3.getDetails());
		System.out.println("Set new credit limit for  the customer c3");
		c3.setCreditLimit(sc.nextDouble());
		System.out.println(c3.getCreditLimit());
		System.out.println("count = " +Customer.getCount());
		sc.close();
		

	}

}
