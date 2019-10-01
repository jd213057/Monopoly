package fr.gtm.JeuMonopoly;

import java.util.ArrayList;
import java.util.List;



public class Monopoly {
	
	List<Player> players = new ArrayList<>();
	Plateau plateau = new Plateau();
	Des [] dices = new Des[2];
	//List<Pion> pions =new ArrayList<>();
	Pion [] pions = new Pion[players.size()];
	Player vainqueur, perdant;
	
	public Monopoly() {
		dices [0] = new Des();
		dices [1] = new Des();
		Plateau plateau = new Plateau();
	}
	
	
	public void addPlayer(Player player1, Pion pion) {
		if (players.size()<8) {
		pion.setPlayerPion(player1);
		player1.setPionJoueur(pion);
		players.add(player1);
		pion.setPositonPion(plateau.returnToStart());
		} else if ((players.size()>=8)) {
			System.out.println("Nombre de joueur max atteint.");
		}
	}
	public void play() {
		for (int nbTour=1; nbTour<=10; nbTour++) {
			for (Player j : players) {
				try {
					int result= j.lancerDeDes(dices[0], dices[1]);
					System.out.println("Le joueur\t"+j.playerName+" obtient\t"+result+".");
				} catch (MontantIllegalException e) {
					System.out.println(String.format("Le joueur %s a triché !!!", j.getPlayerName()));
				}
			}
		}
	}
	
	
	public Player getWinner() {
		return vainqueur;
	}
     

}
