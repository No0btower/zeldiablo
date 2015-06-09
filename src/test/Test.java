package test;

import static org.junit.Assert.*;
import jeu.MonJeu;
import jeu.Mur;
import moteurJeu.Commande;
import personnage.Ghost;
import personnage.Heros;
import personnage.Orcs;

public class Test {
	
	@org.junit.Test
	public void test_Mur_Constructeur(){
		Mur m = new Mur (0,0);
		assertEquals("Le mur doit se trouver en x = 0",0,m.getPosX());
		assertEquals("Le mur doit se trouver en y = 0",0,m.getPosY());
	}
	@org.junit.Test
	public void test_Case_Occupee_Constructeur(){
		MonJeu j = new MonJeu();
		boolean res = j.caseOccuper(1,1);
		assertEquals("la case doit �tre occup�e", true, res);
	}
	@org.junit.Test
	public void test_Fin_Jeu_Perdu(){
		MonJeu j = new MonJeu();
		j.getPj().subirDegat(100);  
		assertEquals("le jeu doit etre fini", true, j.etreFini());
	}
	@org.junit.Test
	public void test_Fin_Jeu_Gagne(){
		MonJeu j = new MonJeu();
		j.getPj().setPosX(14);
		j.getPj().setPosY(9);
		j.getPj().avoirPrisTalisman();
		j.getPj().setPosX(1);
		j.getPj().setPosY(1);
		assertEquals("le jeu doit etre fini", true, j.etreFini());
	}
}