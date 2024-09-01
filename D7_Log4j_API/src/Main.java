
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.*;
import java.io.*;
import java.util.logging.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Main
{
	public static void main(String[] args) throws IOException
	{		
		System.out.println("--------- App Starts ---------");
		
//		BasicConfigurator.configure();
		Logger logger = Logger.getLogger("Main");
		
		logger.fatal("This is fatal message");
		logger.error("This is error message");
		logger.warn("This is warn message");
		logger.info("This is info message");
		
		System.out.println("--------- App Stops ---------");
	}
}
