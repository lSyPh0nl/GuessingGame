package guessinggame;

/*
 * Date: 13/09/2020
 * Student Number: 11001826
 * Student Name: Connor Macleod 
 * Version:  1
 */

public class Player {

	int number = 0;
	
	public void guess() {
		number =(int) (Math.random() *10);
		//System.out.println("I am guessing " + number);
	}
}
