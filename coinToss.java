import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Queue; 
import java.util.Arrays;
import java.lang.Integer;
import java.io.File;
import java.util.concurrent.ThreadLocalRandom;
/*
 @Author: Edson ZAndamela
 @Date: April 24th 2019
 @Version: 1.0
*/
public class coinToss {
	//Variables
	static int maxRounds = 0;


	public static void main(String[]args){
		Scanner keyBoard = new Scanner(System.in);	//Call keyboard for input
		int select = 0;								//Stores Menu selection input

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
					//System.out.println("Invalid input, please enter an odd number");
				}else{
					System.out.println("maxRounds is: " + maxRounds);
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
	}
}