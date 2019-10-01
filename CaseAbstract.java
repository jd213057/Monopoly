package fr.gtm.JeuMonopoly;

public abstract class CaseAbstract {
String CaseName, CaseColor;
CaseAbstract  firstCase, positionPion, nextCase;




public CaseAbstract getFirstCase() {
	return firstCase;
}

public void setFirstCase(CaseAbstract firstCase) {
	this.firstCase = firstCase;
}

public CaseAbstract getNextCase() {
	return this.nextCase;
}

public void NextCase() {
	this.nextCase=nextCase.getNextCase();
}

public void setNextCase(CaseAbstract nextCase) {
	this.nextCase = nextCase;
}

public String getCaseName() {
	return CaseName;
}

public void setCaseName(String caseName) {
	CaseName = caseName;
}

public String getCaseColor() {
	return CaseColor;
}

public void setCaseColor(String caseColor) {
	CaseColor = caseColor;
}

public CaseAbstract(String caseName) {
	   
   }
public abstract void arretSurCase(Player j) throws MontantIllegalException;
	

public abstract void passerSurCase(Player j)throws MontantIllegalException;

}
