import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);// set variables to default
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double wallSide = 0.0;
        double wallTop = 0.0;
        double WallArea = 0.0;
        double gallonspaintneeded = 0.0;
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
      
      	boolean successful = true;//sets boolean to default
      
      	do {
            try{
             System.out.println("Enter wall height (feet): ");
              wallHeight = scnr.nextDouble();
             if (wallHeight <= 0) {//if loop that checks for valid number
               wallHeight = wallTop; //variable change allows the inputted value to be set to wallside
              successful = false;//sets boolean to false when loop executes
             }
           } catch (exception ex){//catch for if number is invalid
             System.out.println("number must be above 0, please input a valid number.");
             successful = false;
           }
          
          System.out.println("Please enter a valid number.");
        } while (!successful);//while successful boolean is false loops
       		
         
      
        // Prompt user to input wall's height
        

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            try{
             System.out.println("Enter wall height (feet): ");
              wallWidth = scnr.nextDouble();
             if (wallWidth <= 0) {//if loop that checks for valid number
               wallWidth = wallSide; //variable change allows the inputted value to be set to wallside
              successful = false;
             }
           } catch (exception ex){//catch for if number is invalid
             System.out.println("number must be above 0, please input a valid number.");
             successful = false;
           }
          
          System.out.println("Please enter a valid number.");
        } while (!successful);//while successful boolean is false loops
     
 

        // Calculate and output wall area
        wallArea = wallTop * wallSide;//calculates the variables from the do while loops together
        System.out.println("Wall area:  square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wal
        gallonsPaintNeeded =  WallArea / squareFeetPerGallons; 
        System.out.println("Paint needed: " + gallonspaintneeded + " gallons");
        
    }
}

