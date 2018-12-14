
public class QuizDiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int compWins = 0;
	int playWins = 0;
	for(int i=0; i  < 10; i++) {
		//start with randomizing the rolls 
		int dieRoll = (int)(Math.random() * 6) + 1;
		int playerRoll = (int)(Math.random() * 6) + 1;
		
		System.out.println("The computer rolled a " + dieRoll + ". The player rolled a " + playerRoll);
		
		if (dieRoll > playerRoll) {
			compWins ++;
			System.out.println("It's a win for the computer!");
			
		}
		if (playerRoll > dieRoll) {
			playWins ++;
			System.out.println("The player takes this one!!");
		}
		else if (playerRoll == dieRoll) {
			System.out.println("Looks like we have a tie..");
			
		}
	
		}
	
	System.out.println("And the results...");
	if (compWins > playWins) {
		System.out.println("The computer wins with a score of " + compWins + " to " + playWins);
	}
	if (playWins > compWins) {
		System.out.println("The player wins with a score of " + playWins + " to " + compWins);
	}
	else if (playWins == compWins) {
		System.out.println("It's a tie between the player and the computer: " + compWins + " to " + playWins);
	}
	
}
}


