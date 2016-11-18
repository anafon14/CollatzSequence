/**
 * Name: Ana Luiza Fonseca Teixeira
 * Teacher: Mr. Hardman 
 * Assignment #4, Bonus Program 
 * Date Last Modified: 11/18/2016
 */

import java.util.Scanner;

public class CollatzSequence {

	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int userNumber;
		
		System.out.println("Plese, enter a whole number: ");
		userNumber = userInput.nextInt();
		
		do{
			
			if (userNumber < 1){
				System.out.println("ERROR! Please, enter a number greater than 0!");
				userNumber = userInput.nextInt();
			
		}
			
		} while (userNumber < 1);
		
		do{
			
			System.out.println(userNumber);
			
			if (userNumber % 2 == 0){
				
				userNumber = userNumber/2;
				
			}
			
			else if (userNumber % 2 == 1){
				
				userNumber = (userNumber * 3) + 1;
			
			}
	
		} while (userNumber != 1);
	
		userInput.close();
		

	}

}
