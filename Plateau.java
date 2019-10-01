package fr.gtm.JeuMonopoly;

import java.util.ArrayList;
import java.util.List;

public class Plateau {
	CaseAbstract [] plateau = new CaseAbstract[40];
	CaseDepart firstCase;
	
	public Plateau() {
		buildCases();
	}
	
	public void buildCases() {
		for (int i=0; i<=plateau.length-1; i++) {
			if (i==0) plateau[0] = new CaseDepart("CASE DEPART");
			if (i==4) plateau[4] = new CaseImpots("CASE IMPOTS");
			if (i==39) plateau[0] = new CaseTaxeLuxe("CASE TAXELUXE");
			if (i>=1 && i<4) plateau[i] = new Rue("Case Rue"+i);
			if (i>=4 && i<=20) plateau[i] = new Compagnie("Case Compagnie"+i);
			if (i>20 && i<=39) plateau[i] = new Gare("Case Gare" +i);
			plateau[i] = new DefaultCase("Case "+i);
		}
		
		for (int i=0; i<=38; i++) {
			
			plateau[i].setNextCase(plateau[i+1]);
		}
		plateau[39].setNextCase(plateau[0]);
	}
		
	public CaseAbstract returnToStart() {
		return plateau[0];
	}
		
	
	
	

}
