package com.bridgelabz;

public class SnakeAndLadderUC5 {

	public static void main(String[] args) {
		
	
	int noPlay=0;
	int ladder=1;
	int snake=2;
	
	int i=0;
	int count=0;
	
	
	while(i<=99) {
		
		count = count +1;
		//play role whether it is noplay,snake or ladder
		int playRole=(int)Math.floor((Math.random()*10) % 3);
		//System.out.println("Player role is "+playRole);
		
		//Random number generator for dice
		int dicevalue=(int)Math.floor((Math.random()*10) %6 )+1;
		//System.out.println(dicevalue);
		
		if(playRole==noPlay) {

			System.out.println("No Play " +i);
			System.out.println("Number of times Dice played " +count);
		}
		else if(playRole==ladder) {
			System.out.println("Number of times Dice played " +count);
			if(i<=100) {
				i=i+dicevalue;
				System.out.println("Ladder " +i);

			}
			else {
				i=i-dicevalue;
			}

		}

		else {
			System.out.println("Number of times Dice played " +count);
			
			i=i-dicevalue;
			if(i<=0) {
				i=0;
				System.out.println("Snake   "+i);
			}
			else {
				System.out.println("Snake   "+i);
			}


		}
	}
	System.out.println("Total Number of times Dice played " +count);
}
}