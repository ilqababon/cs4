package exercise04;

import java.util.Scanner;

public class RockPaperScissors{
	public static void main(String[] args){
		Move rock = new Move("Rock");
		Move paper = new Move("Paper");
		Move scissors = new Move("Scissors");
		
		rock.setStrongAgainst(scissors);
		paper.setStrongAgainst(rock);
		scissors.setStrongAgainst(paper);
		
		int choice = 0;
		int roundsToWin = 2;
		
		do {

		System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
        System.out.println("1. Start game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");

        Scanner scan = new Scanner(System.in);
		System.out.print("> ");
        choice = Integer.parseInt(scan.nextLine());

			if (choice == 2) {
				System.out.print("Change to: ");
				int newRoundsToWin = Integer.parseInt(scan.nextLine());
				roundsToWin = newRoundsToWin;
				System.out.println("New setting has been saved!");
			}
			if (choice == 1) {
				System.out.printf("This match will be first to %d wins. \n", roundsToWin);
				int playerWins = 0;
				int compWins = 0;

				Move comp = null;
				Move player = null;

				while (playerWins != roundsToWin && compWins != roundsToWin) {

					int compRand = (int) Math.floor(Math.random()*3) + 1;

					if (compRand == 1) comp = rock;
					if (compRand == 2) comp = paper;
					if (compRand == 3) comp = scissors;
					
					System.out.println("The computer has selected its move. Select your move:");
					System.out.println("1. Rock");
					System.out.println("2. Paper");
					System.out.println("3. Scissors");

					System.out.print("> ");
					int playerChoice = Integer.parseInt(scan.nextLine());
					
					if (playerChoice == 1) player = rock;
					if (playerChoice == 2) player = paper;
					if (playerChoice == 3) player = scissors;

					if (Move.compareMoves(comp, player) == 0) {
						compWins++;
						System.out.println("Player chose " + player.getName() + ". Computer chose " + comp.getName() + ". Computer wins round!");
						System.out.println("Player: " + playerWins + " - Computer: " + compWins);
					}
					if (Move.compareMoves(comp, player) == 1) { 
						playerWins++;
						System.out.println("Player chose " + player.getName() + ". Computer chose " + comp.getName() + ". Player wins round!");
						System.out.println("Player: " + playerWins + " - Computer: " + compWins);
					}
					if (Move.compareMoves(comp, player) == 2) {
						System.out.println("Player chose " + player.getName() + ". Computer chose " + comp.getName() + ". Round is tied!");
						System.out.println("Player: " + playerWins + " - Computer: " + compWins);
						continue;
					}

				}
				if (compWins > playerWins) {
					System.out.println("Computer wins!");
				}
				else if (playerWins > compWins) {
					System.out.println("Player wins!");
				}
				break;
			}
		} while (choice != 3);
		System.out.println("Thank you for playing!");
	}
}