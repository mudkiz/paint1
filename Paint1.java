import java.util.Scanner;
import java.lang.Math;

public class Paint1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); // set variables to default
		double wallHeight = 0.0;
		double wallWidth = 0.0;
		double wallArea = 0.0;
		double gallonsPaintNeeded = 0.0;
		final double squareFeetPerGallons = 350.0;

      
  
		// Prompt user to input wall's height
		// Implement a do-while loop to ensure input is valid
		boolean successful = true; //sets boolean to default
		do {
			successful = true; //sets boolean to true when loop executes
			try {
				System.out.println("Enter wall height (feet): ");
				wallHeight = scnr.nextDouble();

				if (wallHeight <= 0) { //if loop that checks for valid number
                    System.out.println("number must be above 0, please input a valid number.");
                    successful = false;
				}
			} catch (Exception ex) { //catch for if number is invalid 
				successful = false;
			}

		} while (!successful); //while successful boolean is false loops

		// Implement a do-while loop to ensure input is valid
		// Prompt user to input wall's width
		do {
			successful = true; //sets boolean to true when loop executes
			try {
				System.out.println("Enter wall Width (feet): ");
				wallWidth = scnr.nextDouble();

				if (wallWidth <= 0) //if loop that checks for valid number
					System.out.println("number must be above 0, please input a valid number."); 
			} catch (Exception ex) { //catch for if number is invalid
				successful = false;
			}
		} while (!successful); //while successful boolean is false loops

		// Calculate and output wall area
		wallArea = wallHeight * wallWidth; //calculates the variables from the do while loops together
		System.out.println(wallArea + ": square feet");

		// Calculate and output the amount of paint (in gallons) needed to paint the wall
		gallonsPaintNeeded = wallArea / squareFeetPerGallons;

		System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

		//close scanner
		scnr.close();
	

	}
}