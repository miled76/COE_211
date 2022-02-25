package chapter4;
public class Employee{
	
    private String FirstName;
    private String LastName;
    private int Age;
    private double Salary;
    public Employee(String FirstName,String LastName,int Age,double Salary) {
    this.FirstName=FirstName;
    this.LastName=LastName;
    this.Age=Age;
    this.Salary=Salary;
    }
    public String toString() {
    	String s="Employee Information:"+FirstName+","+LastName+","+Age+","+Salary+".";
    	return s;
    }
    }
