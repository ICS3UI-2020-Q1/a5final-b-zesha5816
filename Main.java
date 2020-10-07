import java.util.Scanner;
/**
 * a program that will ask the user for the last number possible to count to, starting   from 1. Your program will then calculate the sum of all of the odd numbers from 1 to that entered number.
 * @author Ahmad Zeshan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create the Scanner
		Scanner input = new Scanner(System.in);
		//output message to user
		System.out.println("Please enter the maximum number to sum to:");
		//get input from user
		int userInput = input.nextInt();
		//intialize the sum varaible as 0
		int sum = 0;
		//a for loop keeps looping until gets to the the input value 
		for(int i = 1; i <= userInput; i++) {
			// Check if the remainder is 0 if it does meaning its even so we skip the number.
    	if(i % 2 == 0) {
			//else if the remainder is not 0 means an odd number
	  	}else {
			//odd number add up the oddnumbers to the previous one
			  sum += i;
		  }
  	}	
		//output the answer to the user 
   	System.out.println("The sum of the odd numbers is " + sum);
  }
}

