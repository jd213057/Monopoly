package fr.gtm.JeuMonopoly;

public class Propriete extends CaseAbstract {
	
	String proprieteName, RueName, GareName, CompagnieName;
    int prixAchat=100, loyer= 10;
    Player proprietaire;
    
    

	public String getProprieteName() {
		return proprieteName;
	}

	public void setProprieteName(String proprieteName) {
		this.proprieteName = proprieteName;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public int getLoyer() {
		return loyer;
	}

	public void setLoyer(int loyer) {
		this.loyer = loyer;
	}

	public Propriete(String caseName) {
		super(caseName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arretSurCase(Player j) throws MontantIllegalException {
		if (proprietaire==null) {
			System.out.println("Le joueur\t"+j.playerName +"est à la case\t" +j.positionPion+".");
			System.out.println("Le joueur\t"+j.playerName+"s'est arrete sur une case sans propriétaire.");
			System.out.println("Le joueur réflechit si il achete ou pas la propriété");
			if (j.isInterressedParAchat(this.prixAchat)==true) {
				j.debiter(prixAchat);
				setProprietaire(j);
				System.out.println("Le joueur a acheté la propriété. Il a déboursé: "+prixAchat +" €.");
			}
		    }
		else if (proprietaire!=null && proprietaire!=j) {
				j.debiter(loyer);
				proprietaire.crediter(prixAchat);
				System.out.println("Le joueur\t"+j.playerName+"est tombé sur la case appartenant à\t"+proprietaire.playerName+".");
				System.out.println("Il a du débourser\t" + loyer +".");
			}
		}
		

	public Player getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Player proprietaire) {
		this.proprietaire = proprietaire;
	}

	@Override
	public void passerSurCase(Player j) throws MontantIllegalException {
		// TODO Auto-generated method stub
		
	}

}
