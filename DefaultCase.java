package fr.gtm.JeuMonopoly;

public class DefaultCase extends CaseAbstract {
	
	String nameCase, caseColor;
	
	
	public DefaultCase(String caseName) {
		super(caseName);
		   
	   }


	@Override
	public void arretSurCase(Player j) throws MontantIllegalException {	}


	@Override
	public void passerSurCase(Player j) throws MontantIllegalException {}

}
