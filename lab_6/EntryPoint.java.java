package lab;
import java.util.Scanner;

import chapter4.Die;
public class EntryPoint {
	public static void main(String[] args) {
		int x;
		String s;
	Scanner scan=new Scanner(System.in);
	System.out.println("Which service would like to use?"+"\n"+"[1]:Basic week visualizer"+"\n"+"[2]: Advanced week visualizer"+"\n"+"[3]: Basic calculator"+"\n"+"[4]: Employee repertoire");
	x=scan.nextInt();
	switch (x) {
	case 1:
		BasicWeek week = new BasicWeek();
	 week.printDays();
	 break;
	case 2:
		AdvancedWeek week2 = new AdvancedWeek();
		week2.printDays();
		 
		break;
	case 3:
		Calculator calc=new Calculator();
		break;
	case 4:
		Employee emp=new Employee();
		System.out.println(emp.toString());
		 break;	
		default:
			do {
			System.out.println("Please make sure you pick a number between 1 and 4:");
			System.out.println("Which service would like to use?"+"\n"+"[1]:Basic week visualizer"+"\n"+"[2]: Advanced week visualizer"+"\n"+"[3]: Basic calculator"+"\n"+"[4]: Employee repertoire");
			x=scan.nextInt();
			switch (x) {
			case 1:
				BasicWeek week1 = new BasicWeek();
			 week1.printDays();
			 break;
			case 2:
				AdvancedWeek week3= new AdvancedWeek();
				week3.printDays();
				break;
			case 3:
				Calculator calc1=new Calculator();
				break;
			case 4:
				Employee emp1=new Employee();
				System.out.println(emp1.toString());
				break;
			}
			}
			while(x!=1&&x!=2&&x!=3&&x!=4);
			
	}
	}
}