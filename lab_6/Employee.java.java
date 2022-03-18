import java.util.Scanner;

public class Employee {
    private String FirstName;
    private String LastName;
    private int Age;
    private double Salary;

    public Employee() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input the employee'sfirstname:");
    	firstname=scan.nextLine();
    	System.out.println("Please input the employee'slastname:");
    	lastname=scan.nextLine();
    	System.out.println("Please input the employee'sage:");
    	age=scan.nextInt();
    	System.out.print("Please input the employee's salary:");
    	salary=scan.nextDouble();

    }

    public String toString() {
        String s="Employee Information:"+FirstName+","+LastName+","+Age+","+Salary+".";
    	return s;
    }
}