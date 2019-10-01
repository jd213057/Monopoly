package fr.gtm.JeuMonopoly;

public class MonopolyMain {

	public static void main(String[] args) {
		
	Monopoly monopoly = new Monopoly();
	monopoly.addPlayer(new Player("JD"), new Pion("jaune"));
	monopoly.addPlayer(new Player("JC"),new Pion("rouge"));
	monopoly.addPlayer(new Player("JB"),new Pion("bleu"));	
	monopoly.addPlayer(new Player("JR"), new Pion("vert"));
	monopoly.play();
		

		
		
		// TODO Auto-generated method stub

	}

}
