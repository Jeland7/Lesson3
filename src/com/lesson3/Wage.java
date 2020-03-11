package com.lesson3;

import java.util.Scanner;

public class Wage {
	
	// declare instance variables name as a String ,salary, rate, netSalary, allowance, taxDue, taxable as double
	
	private String name = new String(); //we can do also private String name;
	
	private double grossSalary;
	private double allowance;
	private double taxRate;
	private double taxable;
	private double taxDue;
	private double netSalary;
	
	//process
    //run calculate methods() which we created in our Wage class
		
		
	// declare the main method to calculate and run the app
	public static void main(String[] args) {
		//inside the main
	    // declare and create objects of type Scanner and objects of type of Wage Class to access all instance variables and methods()
	Scanner sc = new Scanner(System.in);
	Wage myWage;
	myWage = new Wage();
	// get input from user
    // System.out.print("Please enter your name : ");
    //and store inside String name
	System.out.println("Please enter your name: ");
	String name;
	myWage.name = sc.nextLine();
	
	System.out.println("Hi " + name + " can you please enter your salary: ");
    double grossSalary;
	myWage.grossSalary = sc.nextDouble();
	
	System.out.println("Thank you, " + name + ", can you now enter the tax rate ie .45 or .24: ");
	double taxRate;
	myWage.taxRate = sc.nextDouble();
	
	System.out.println("Finally, " + name + " please enter your tax free allowance: ");
	double allowance;
	myWage.allowance = sc.nextDouble();
	
	
	double taxbl, taxD;
	myWage.taxable = myWage.calculateTaxable(myWage.allowance, myWage.grossSalary);
	myWage.taxDue = myWage.calculateTaxDue(myWage.taxable, myWage.taxRate);
	myWage.netSalary = myWage.calculateNetSalary(myWage.taxable, myWage.taxDue);
	
	
	
	}//end of main
	
	public double calculateTaxable(double allowance, double grossSalary) {
		return grossSalary - allowance;
	}
	public double calculateTaxDue(double taxable, double taxRate) {
		return taxable * taxRate;
	}
	public double calculateNetSalary(double taxable, double taxDue) {
		return taxable - taxDue;
	}
		
	System.out.println("\n\tHere's the bad news, " + myWage.name + "\n" + "\tGross salary = \t" + myWage.grossSalary + "\n" + "\tAllowance = \t" + myWage.allowance + "\n" +"\t\t\t______________\n" + "\tTaxable = \t" + myWage.taxable + "\n" + "\ttaxRate = \t\t" + myWage.taxRate*100 + "%\n" + "\tTax due = \t" + myWage.taxDue + "\n" + "\tNet Salary = \t" + myWage.netSalary + "n");

	}


