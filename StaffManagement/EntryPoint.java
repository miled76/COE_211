package chapter4;
import java.util.Scanner;
import java.util.Random;
    public class EntryPoint {
    	public static void main(String[] args) {
    		
    	String firstname,lastname;
    	int age;
    	double salary;
    	Scanner scan=new Scanner(System.in);
    	int i = 0,r1;
    	Random generator=new Random();
    	r1= generator.nextInt(10)+1;
    		while (i<r1){
    			System.out.println("You have"+(r1-i++)+"insertions left");
    		
    	System.out.println("Please input the employee'sfirstname:");
    	firstname=scan.nextLine();
    	System.out.println("Please input the employee'slastname:");
    	lastname=scan.nextLine();
    	System.out.println("Please input the employee'sage:");
    	age=scan.nextInt();
    	System.out.print("Please input the employee's salary:");
    	salary=scan.nextDouble();
    	Employee emp=new Employee(firstname,lastname,age,salary);
    	System.out.println(emp.toString());
    		}
    	}
    }
    	    