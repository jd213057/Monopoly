package fr.gtm.JeuMonopoly;

public class CaseTaxeLuxe extends CaseAbstract {
	
 final	double Money = 100;
        

	public double getMoney() {
		return Money;
	}

	public CaseTaxeLuxe(String caseName) {
		super(caseName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arretSurCase(Player j) throws MontantIllegalException {
		j.debiter(Money);
		
	}

	@Override
	public void passerSurCase(Player j) {}

}
