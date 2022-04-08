package lab;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class ExpensesTracker {
   public static void main(String[] args)throws IOException {
	   String name,purchase,account;
	   String answer,question;
	   double ammount;
		  FileWriter output=new FileWriter("expenses.txt",true);
		  Scanner scan= new Scanner(System.in);
	   do {
	   System.out.println("Input your name:");
	   name = scan.nextLine();
	   System.out.println("What did you purchase:");
	   purchase= scan.nextLine();
	   System.out.println("How much did you pay in USD:");
	   ammount= scan.nextDouble();
	  account=name+"purchased"+purchase+"for"+ammount+"USDollars";
	   output.write(account);
	   System.out.println();
	   System.out.println("Would you like to log another purchase?(y/n)");
		  answer=scan.next();
	   }while(answer.equalsIgnoreCase("y"));
		  System.out.println();
		  output.close();
		  System.out.println("Get off ZoodMall!");
		  System.out.println();
		  System.out.println("Would you like to read a summary of your purchases?(y/n)");
		  question=scan.next();
		  File file1 =new File("expenses.txt");
		  Scanner scanfromfile=new Scanner(file1);
	  if (question.equalsIgnoreCase("y")) {
		   while (scanfromfile.hasNext()){
			   String acc = scanfromfile.nextLine();
			   System.out.println(acc);
			   
			  
		  }
		  
	  }
	  
   }
}
