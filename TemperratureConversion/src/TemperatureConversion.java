/*
 *Java 100題目第8題 攝氏溫度轉化是溫度
 */
import java.io.Console;
import java.lang.*;
public class TemperatureConversion 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Console console=System.console();
		String strc ; 
		//String strf ;
		//int f ; 
		int c ;
		System.out.println("Import Celsius:");
		strc = console.readLine();
		c=Integer.parseInt(strc);
		System.out.println("Outport Fahrenheit = " + ((c*9)/5+32) );
		// TODO Auto-generated method stub

	}

}
