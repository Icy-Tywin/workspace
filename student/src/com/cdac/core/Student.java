package com.cdac.core;

public class Student {
    private int id;
    private String name;
    private String email;
    private int age;
    private double gpa;
    public Student(int id, int age, String name, String email){
        this.id = id;
        this.age=age;
        this.name=name;
        this.email = email;
    }
    public String fetchDetails(){
        return "The details of this stufent are: id: "+id+", name: "+name+", age: "+age+", email: "+email;
    } 
    public void computeGPA(double scoreQuiz, double scoreTest, double scoreAssignments){
        gpa = Math.ceil((2*scoreQuiz+5*scoreTest+3*scoreAssignments)/10);//assuming that the scores are out of 10.
    }
    public double getGPA() {
    	return gpa;
    }
    public String getName() {
    	return name;
    }

    

}
