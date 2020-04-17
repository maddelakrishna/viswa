package dt17042020;

public class DiceGame {

	public static void main(String[] args) {
    // Two Dice
		Dice diceOne;  // declaration
		
		diceOne = new Dice();  // Dice(); contructor
		
		Dice diceTwo = new Dice() ;
		
		// Two Players

		Player p1 = new Player(); // default constructor
		Player p2 = new Player();
		p1.throwDice(diceOne, diceTwo);
		p2.throwDice(diceOne, diceTwo);
		if(p1.value > p2.value)
		{
			System.out.println("P1 won the game");
		}
		else
		{
			System.out.println("p2 won the game");
		}
		

	}

}
