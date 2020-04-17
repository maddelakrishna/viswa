package dt17042020;

public class Dice {
	int facevalue; // data
	
	public void roll()
	{
		facevalue = (int)((Math.random())*10)%5+1;

	}

}
