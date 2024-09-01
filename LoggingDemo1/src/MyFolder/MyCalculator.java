package MyFolder;
import java.util.*;
import java.io.*;
import java.util.logging.*;


public class MyCalculator {
	public static void main(String[] args) throws IOException
	{
		int first, second, result=0;
		Scanner scan= new Scanner(System.in);
		FileHandler fl= new FileHandler("d:\\RecordCalc1.log", true);
		
		SimpleFormatter simpleFormatter = new SimpleFormatter();
		fl.setFormatter(simpleFormatter);
		Logger logg= Logger.getLogger("MyCalculator");
		logg.addHandler(fl);
		
		
		System.out.println("Enter first number");
		first= scan.nextInt();
		logg.log(Level.INFO,"User has provided no. 1 "+first);
		
		
		System.out.println("Enter Second number");
		second= scan.nextInt();
		logg.log(Level.INFO,"User has provided no. 2 "+second);


		System.out.println("Which action do you want to perform...");
		
		String symbol= scan.next();
		logg.log(Level.INFO,"User has provided symbol "+symbol);

		
		switch(symbol)
		{
		case "+": result= first+second; break;
		case "-": result= first-second;  break;
		case "/": result= first/second; break;
		case "*": result= first*second; break;
		default: System.out.println("Invalid Symbol");
		logg.log(Level.INFO,"Invalid symbol you selected");	
		}
		
			System.out.print("Result is "+result);
			logg.log(Level.INFO,"The result obtained is "+result);

	}
	
	
}
