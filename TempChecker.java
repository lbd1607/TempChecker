import java.util.Scanner;
import java.text.DecimalFormat;

/**
* Laura Davis CIS 260 903
* This program assists a technician to check the temperature of a substance
*
* Methods must include the proper data type, especially if returning values.
* Since methods are their own entities, each must include variable initialization
* and object creation. 
* I had to change while into do-while in order to run through the loop at least once,
* otherwise the loop wouldn't initialize.
* Remember that the main method is its own entity. It must end before other methods.
* Methods must return a locally initialized variable unless using final. Initializing a variable
* like temp with a method call will mean that the localized value will be passed into that var area.
* 
**/

public class CheckTemp
{
	public static void main(String[] args)
	{
		//declare variables
		final double MAX_TEMP = 102.5; 
		String conversion; 
		double temp;
		
		//creates a scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//Asks user if they will enter Farenheit or Celsius for conversion
		System.out.print("Will you be entering the temperature in degrees Farenheit, Celsius, or Kelvin? \n"
				+ "Enter f, k, or c: ");
		conversion = keyboard.nextLine();

		//tells the technician to adjust the temperature
		do
		{
			
			if (conversion.equalsIgnoreCase("f"))
			{
				temp = convertF();
			}
			else if (conversion.equalsIgnoreCase("k"))
			{
				temp = convertK();
			}
			else 
			{
				temp = convertC();
			} 
			
			
				if (temp > MAX_TEMP)
				{
					System.out.println("The temperature is too high. \n" +
							"Turn the thermostat down and wait 5 minutes, " +
							"then re-enter the temperature here. ");
				}
				else
				{
					//Remind the technician to check the temperature.
					System.out.println("The temperature is OK. Check it again in 15 minutes. ");
				}

		} while (temp > MAX_TEMP);

	}//end of main
		
		/**
		 * The user was asked which temperature system they will be using. 
		 * The user is asked to input a substance's temperature in degrees Farenheit.
		 * The input is entered in Farenheit and converted to degrees Celsius, which
		 * is then returned to main so it can be used in the nested do-while and else-ifs.
		 * 
		 * @return the temperature in farenheit
		 */
		public static double convertF()
		{
			//declare local variables
			double tempF;
			double input;
		
			Scanner keyboard = new Scanner(System.in);
			DecimalFormat formatter = new DecimalFormat("#0.000");
		 
			//Get the temperature
			System.out.println("Please enter the substance's temperature: ");
			input = keyboard.nextDouble();
			//convert the temperature to farenheit
			tempF = ((input - 32) * 5/9);
			System.out.println(formatter.format(input) + " degrees F = " + formatter.format(tempF)
			+ " degrees C. ");
			return tempF;
		}//end of convertF
		
		/**
		 * The user was asked which temperature system they will be using. 
		 * The user is asked to input a substance's temperature in degrees Kelvin.
		 * The input is entered in Kelvin and converted to degrees Celsius, which
		 * is then returned to main so it can be used in the nested do-while and else-ifs.
		 * 
		 * @return the temperature in kelvins
		 */
		public static double convertK()
		{
			//declare variables
			double tempK;
			double input;
		
			Scanner keyboard = new Scanner(System.in);
			DecimalFormat formatter = new DecimalFormat("#0.000");
		
			//Get the temperature
			System.out.println("Please enter the substance's temperature: ");
			input = keyboard.nextDouble();
		
			//convert the temperature to celsius
			tempK = (input - 273.15);
			System.out.println(formatter.format(input) + " degrees K = " + formatter.format(tempK) 
			+ " degrees C. ");
			return tempK;
		}//end of convertK()
		
		/**
		 * The user was asked which temperature system they will be using. 
		 * The user is asked to input a substance's temperature in degrees Celsius.
		 * Celsius temperature is then returned to main so it can be used in the 
		 * nested do-while and else-ifs.
		 * 
		 * @return he temperature in celsius
		 */
		public static double convertC()
		{
			//declare variables
			double tempC;
			
			Scanner keyboard = new Scanner(System.in);
			DecimalFormat formatter = new DecimalFormat("#0.000");
			
			//Get the temperature
			System.out.println("Please enter the substance's temperature: ");
			tempC = keyboard.nextDouble();
			System.out.println("The temperature is " + formatter.format(tempC) + " degrees C. ");
			return tempC;
		}//end of tempC
	
}//end of class
	

