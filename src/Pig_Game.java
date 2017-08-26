import java.util.Random;
import java.util.Scanner;

public class Pig_Game {

	public static int currScore= 0;
	public static int finalScore = 0;
	public static int comcurrScore= 0;
	public static int comfinalScore = 0;
	public static Scanner s = new Scanner(System.in); // get to scan the user input
	
	public static String RetrieveNum(int x, int y) { 
		String[] Number = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN",
				"TWELVE" };
		int together = x + y;
		return Number[together - 1];
	} 
	
	public static int RollDice(){
		int dice = 0;
		Random rnd = new Random();
		dice = rnd.nextInt(6) + 1;
		return dice;
	}
	
	public static void Check(char PorC,int dice1, int dice2){
		String name;
		if(PorC == 'c'){
			name = "Computer";
		}
		else{
			name = "Player";
		}
		
		if(dice1 == 1 && dice2 ==1){
			System.out.println("Oh no! " + name + " has rolled 2 ones! The total score has been reset! \n");
			if(name == "Player")
			finalScore=0;
			else
			comfinalScore=0;
		}
		else if(dice1 == 1 || dice2 ==1){
			System.out.println(name + " have rolled a: " + RetrieveNum(dice1, 0) + " and a: " + RetrieveNum(0, dice2));
			System.out.println(name +" turn has ended because one was rolled \n");
			if(name == "Player")
			currScore = 0;
			else
			comcurrScore = 0;
		}
		else if (dice1 == dice2) {
			System.out.println( name + " has rolled a: " + RetrieveNum(dice1, 0) + " and a: " + RetrieveNum(0, dice2));
			System.out.println("Oops! Both dice match, must roll again\n");
			if(name == "Player")
			P1Turn();
			else
			comTurn();
		}
		else{
			System.out.println( name + " has rolled a: " + RetrieveNum(dice1, 0) + " and a: " + RetrieveNum(0, dice2));
			if(name == "Player"){
				currScore = currScore + dice1 + dice2;
				System.out.println("Player score: " + currScore + "\n");
				P1Turn();
			}
			else{
				comcurrScore = comcurrScore + dice1 + dice2;
				System.out.println("Computer score: " + comcurrScore + "\n");
				comTurn();
			}
		}
	}
	
	
	public static void P1Turn(){
		int dice1;
		int dice2;
		
		
		System.out.println("Enter 1 to roll or 2 to hold");	
		int UserInput = s.nextInt();
		
		
		if (UserInput == 2) { 
			finalScore = finalScore + currScore;
			currScore = 0;
			System.out.println("Final Player score: " + finalScore + "\n");
		}
		else if (UserInput == 1) { 
			dice1 = RollDice();
			dice2 = RollDice();
			Check('p',dice1,dice2);	
		}
		else{ 
			System.out.println("Error: Please only enter 1 or 2");	
			P1Turn();
		}
		
	}
	
	public static void comTurn(){
		int dice1;
		int dice2;
		
		if (comcurrScore < 16) {
			dice1 = RollDice();
			dice2 = RollDice();
			Check('c',dice1,dice2);
			
		}
		
		else{
			comfinalScore = comfinalScore + comcurrScore;
			comcurrScore = 0;
			System.out.println("Final Computer score: " + comfinalScore + "\n");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello and welcome to the game of Pig! \n");
		
		while (comfinalScore <= 100 || finalScore <= 100){
		    P1Turn();
		    comTurn();
		    System.out.println("Final Player score: " + finalScore);
		    if (finalScore >= 100){
				System.out.println("Congratulations! You have beaten the computer with " + finalScore + " points! Thanks for playing!");
				break;
				}
		    System.out.println("Final Computer score: " + comfinalScore + "\n");
		    if (comfinalScore >= 100) {
				System.out.println("The computer has beaten you with " + comfinalScore + " points! Better Luck Next Time!");
				break;
			} 
		}
		
		
	}
}

