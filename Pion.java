package fr.gtm.JeuMonopoly;

public class Pion {
	String pionName;
	CaseAbstract positionPion;
	int Score;
	Player playerPion;
	
	public Player getPlayerPion() {
		return playerPion;
	}

	public void setPlayerPion(Player playerPion) {
		this.playerPion = playerPion;
	}

	public String getPionName() {
		return pionName;
	}

	public void setPionName(String pionName) {
		this.pionName = pionName;
	}

	public CaseAbstract getPositonPion() {
		return positionPion;
	}

	public void setPositonPion(CaseAbstract positonPion) {
		this.positionPion = positonPion;
	}

	public Pion(String pionName) {
		this.pionName=pionName;
	}
	
	public void avancerPion(int Score) throws MontantIllegalException {
		this.Score = Score;
		for (int i = 0; i <= Score-1; i++) {
			positionPion=positionPion.getNextCase();
			positionPion.passerSurCase(playerPion);
		}
		positionPion=positionPion.getNextCase();
		positionPion.arretSurCase(playerPion);
}           
	    
}
