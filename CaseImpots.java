package fr.gtm.JeuMonopoly;

public class CaseImpots extends CaseAbstract {
	
	double impots, montant, MAX=500;

	public CaseImpots(String caseName) {
		super(caseName);
		// TODO Auto-generated constructor stub
	}

	public double getImpots() {
		return impots;
	}

	@Override
	public void arretSurCase(Player j) throws MontantIllegalException {
	double montant =j.getSolde()*0.1;
	montant = montant>MAX? MAX : montant;
	j.debiter(montant);		
	}

	@Override
	public void passerSurCase(Player j) {}

}
