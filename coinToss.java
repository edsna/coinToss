import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Queue; 
import java.util.Arrays;
import java.lang.Integer;
import java.io.File;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;
/*
 @Author: Edson ZAndamela
 @Date: April 24th 2019
 @Version: 1.0
*/
public class coinToss {
	//Variables
	static int maxRounds = 0;
	static int userWins = 0;
	static int compWins = 0;

	/*
	 *Generates random number between 1 and 2
	 *@ret: Returns 1 or two for heards or tails
	 *@param: takes minimum and maximum numbers to be generated
	*/
	public static int randomGen(int min, int max){
		int range = max - min + 1;
		int rand = 0; 
		// generate random numbers within 1 to 2 
		for (int i = 0; i < 1; i++) { 
			rand = (int)(Math.random() * range) + min;
		}  
		return rand;
	}

	/*
	 *Determines who is the winner for every single game
	 *@ret: Returns 0 if computer wins and 1 if user wins
	 *@param: computer's throw and user's guess
	*/
	public static int roundWinner(int compThrow, int userGuess){
		if(compThrow == userGuess){
			return 1;
		}else{
			return 0;
		}
	}



	public static void main(String[]args){
		Scanner keyBoard = new Scanner(System.in);	//Call keyboard for input
		int select = 0;
		int headsOrTails;								//Stores Menu selection input

		while(select!= 2){
			System.out.println("\n**********Welcome to Coin Toss Game***********");
			System.out.println("\n**********Instructions***********");
			System.out.println("\n \t1. Enter 1 to start game");
			System.out.println("\n \t2. Enter 2 to return to main Menu");
			System.out.println("Select an option from the Menu");

			select = keyBoard.nextInt();
			keyBoard.nextLine();
			if(select == 1){
				System.out.println("Enter an odd number to serve as the maximum number of rounds");	//prompt for number
				maxRounds = keyBoard.nextInt();		//Store number in var
				if(maxRounds % 2 == 0){
					System.out.println("Error!!! Please enter an odd number");
				}else{	//if its odd
					/*Check for winner
					* like while either winner is < =  total maxrounds
					* continue to play, otherwise declare winner.	
					*/
					System.out.println("maxRounds is: " + maxRounds);	//print for testing
					System.out.println("\n \t1. Choose '1' for heads or '2' for tails");	//prompt for input
					headsOrTails = keyBoard.nextInt();		//scan for input
					//keyBoard.nextLine();
					if(headsOrTails == 1){
						System.out.println("You selected heads");
					}else if(headsOrTails == 2){
						System.out.println("You selected Tails");
					}else{
						System.out.println("Error!!! Enter a Valid Option");
					}
					//MAke computer throw an integer - 1 or 2
					int pcThrow = randomGen(1,2); 
			        System.out.println("Computer has: " + pcThrow);
			        int result = roundWinner(pcThrow, headsOrTails);
			        if(result == 0){
			        	System.out.println("You lost this round!");
			        	compWins++;
			        }else{
			        	System.out.println("You won this round!!!");
			        	userWins++;
			        }
			        //update maxRounds = maxRounds -1;
				}
				System.out.println();		//Get some space
				System.out.println();		//Get some space
			}else if(select == 2){
				System.out.println("Return to Main Menu ...."); 
			}else if(select == 4){
			}else{
				System.out.println("Error!!! Enter a Valid Option");
			}
			System.out.println();		//Get some space
		}//End of while
		//System.out.println("maxRounds in main is: " + maxRounds);
	}//End of Main
}