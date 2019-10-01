package fr.gtm.JeuMonopoly;
import java.util.Random;

public class Player {
	String playerName;
	int Score = 0;
	CaseAbstract positionPion;
	Pion pionJoueur;
	double Solde;
	
	public Player(String playerName) {
		this.playerName=playerName;
		this.Score=0;
		this.Solde=1500;
	}

	public Pion getPionJoueur() {
		return pionJoueur;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPionJoueur(Pion pionJoueur) {
		this.pionJoueur = pionJoueur;
	}


	public int lancerDeDes(Des de1, Des de2) throws MontantIllegalException {
		Score = de1.lancerDeDes() + de2.lancerDeDes();
		this.pionJoueur.avancerPion(Score);
		return Score;
	}
	
	public void crediter(double Money) {
		this.Solde+=Money;
	}
	
	public void debiter(double Money) throws MontantIllegalException{
		if (Money<0 ) {
		}
		this.Solde-=Money;
	}


	public double getSolde() {
		return Solde;
	}
	
	public boolean isInterressedParAchat (int prixAchat) {
		if (this.Solde<prixAchat) {
			return false;
		} else if(this.Solde>(2*prixAchat)) {
			Random willIBuy = new Random();
			int decision= willIBuy.nextInt(1);
			if (decision==0) return false;
			if (decision==1) return true;
		}
		return true;
	}

	}


