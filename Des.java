package fr.gtm.JeuMonopoly;

import java.util.Random;

public class Des {
	int desValue;
	Random DiceValue = new Random();
	public Des() {
		this.desValue=DiceValue.nextInt(6)+1;
	}

	public int getDesValue() {
		return desValue;
	}
	
	public int lancerDeDes() {
		Random DiceValue = new Random();
		int desResult= DiceValue.nextInt(6)+1;
		return desResult;
	}

}
