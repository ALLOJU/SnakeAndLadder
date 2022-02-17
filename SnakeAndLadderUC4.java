package com.bridgelabz;

public class SnakeAndLadderUC4 {

	public static void main(String[] args) {
		
	
	int noPlay=0;
	int ladder=1;
	int snake=2;
	
	int i=0;
	
	
	while(i<=99) {
		
		//play role whether it is noplay,snake or ladder
		int playRole=(int)Math.floor((Math.random()*10) % 3);
		//System.out.println("Player role is "+playRole);
		
		//Random number generator for dice
		int dicevalue=(int)Math.floor((Math.random()*10) %6 )+1;
		//System.out.println(dicevalue);
		
		if(playRole==noPlay) {

			System.out.println("No Play " +i);
		}
		else if(playRole==ladder) {
			if(i<=100) {
				i=i+dicevalue;
				System.out.println("Ladder " +i);

			}
			else {
				i=i-dicevalue;
			}

		}

		else {
			
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
}
}