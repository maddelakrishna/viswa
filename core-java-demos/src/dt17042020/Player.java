package dt17042020;

public class Player {
	int value; // data
	
	public void throwDice(Dice diceOne, Dice diceTwo)
	{
		diceOne.roll();
		diceTwo.roll();
		value = diceOne.facevalue + diceTwo.facevalue;
	}

}
