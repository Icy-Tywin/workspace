package com.app.core;

public class Customer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	private static int COUNT;
	public Customer (String name, String email, int age, double creditLimit) {
		this.age = age;
		this.creditLimit = creditLimit;
		this.email = email;
		this.name = name;
		COUNT++;
	}
	public Customer (String name, String email, int age) {
		this(name, email, age, 10000);
	}
	public Customer() {
		this("Riya", "riya@gmail.com", 25);
	}
	public String getDetails() {
		return "The details of the customer are: Name "+name+", email "+email+ ", age "+age+", creditLimit "+creditLimit;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public static int getCount() {
		return COUNT;
	}
}
