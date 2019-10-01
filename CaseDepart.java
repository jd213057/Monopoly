package fr.gtm.JeuMonopoly;

public class CaseDepart extends CaseAbstract {
	
	final double FullMoney = 400, HalfMoney = 200; 
			double Solde;
	CaseAbstract firstCase;
	   String firstCaseName = "CaseDepart";

	public CaseDepart(String firstCaseName) {
		super(firstCaseName);
		// TODO Auto-generated constructor stub
	}
	

	public double getFullMoney() {
		return FullMoney;
	}

	public double getHalfMoney() {
		return HalfMoney;
	}

	public double passerSurFirstCase() {
		return HalfMoney;
	}

	@Override
	public void arretSurCase(Player j) {
		j.crediter(400);
		}
	

	@Override
	public void passerSurCase(Player j) {
		j.crediter(200);
	}

}
