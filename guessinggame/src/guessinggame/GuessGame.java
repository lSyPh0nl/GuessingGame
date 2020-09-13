package guessinggame;


/*
 * Date: 13/09/2020
 * Student Number: 11001826
 * Student Name: Connor Macleod 
 * Version:  1
 */


public class GuessGame{
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		
		 p1 = new Player();
		 p2 = new Player();
		 p3 = new Player();
		 
		 int guessP1 = 0;
		 int guessP2 = 0;
		 int guessP3 = 0;
		 
		 boolean p1isRight = false;
		 boolean p2isRight = false;
		 boolean p3isRight = false;
		 
		 int targetnumber = (int) (Math.random() * 10);
		 System.out.println("Welcome to the guessing game!");
		 System.out.println("I am thinking of a number between 1 and 10");
		 System.out.println("--------------------------------"); 
		 
		 while(true) {
		     //System.out.println("Number to guess is " + targetnumber);
		     
		     p1.guess(); 
		     guessP1 = p1.number;
		     p2.guess();
		     guessP2 = p2.number;
		     p3.guess();
		     guessP3 = p3.number;
		     
		     
		     

		     System.out.println("Player one guessed " + guessP1);  // Player 1 Guess
		     System.out.println("Player two guessed " + guessP2);  // Player 2 Guess
		     System.out.println("Player three guessed " + guessP3);  // Player 3 Guess
		     System.out.println("--------------------------------");  
		     
		     if (guessP1 == targetnumber) 
		     	{
		    	 p1isRight = true;
		     	}
		     
		     if (guessP2 == targetnumber) 
		     	{
		    	 p2isRight = true;
		     	}
		     
		     if (guessP3 == targetnumber) 
		     	{
		    	 p3isRight = true;
		     	}
		     
		     if (p1isRight || p2isRight || p3isRight) 
		     	{
		    	 System.out.println(">>>>>> We have a winner <<<<<<");
		    	 System.out.println("--------------------------------"); 
		    	 System.out.println("Player one got it right? "+ p1isRight);
		    	 System.out.println("Player two got it right? "+ p2isRight);
		    	 System.out.println("Player three got it right? "+ p3isRight);
		    	 System.out.println("Game Over");
		    	 break;
		     	}
		    	 
		    	 else {
		    		 System.out.println("Nobody won that time. Restarting game"); 
		    		 System.out.println("--------------------------------");  // Spacer for output readability
		    		  }
	    }
		     
	}
}
		 



