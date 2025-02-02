package test;

import static org.junit.Assert.*;
import personnage.Heros;
import Objet.Talisman;
import jeu.MonJeu;

public class TestTalisman {
	
	/**
	 * Test qui v�rifie le constructeur de Talisman
	 */
	@org.junit.Test
	public void test_Constructeur_Talisman(){
		Talisman t = new Talisman(14,9);
		assertEquals("le talisman doit etre en position x = 14",14,t.getPosX());
		assertEquals("le talisman doit etre en position y = 9", 9, t.getPosY());
	}
	/**
	 * Test qui v�rifie les effets du talisman
	 */
	@org.junit.Test
	public void test_Effet_Talisman(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		Talisman t = new Talisman(14,9);
		t.appliquerEffet(h);
		assertEquals("Le heros doit avoir 300pdv", 300, h.getVie());
		assertEquals("Le heros doit avoir 10 d'attaque", 10, h.getAttaque());
		assertEquals("Le heros doit avoir 1 de portee", 1, h.getPortee());
	}
	/**
	 * test qui v�rifie que les effets du talisman s'applique bien m�me apr�s avoir subit des d�gats
	 */
	@org.junit.Test
	public void test_Effet_Talisman_apres_Attaque(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		h.subirDegat(50);
		Talisman t = new Talisman(14,9);
		t.appliquerEffet(h);
		assertEquals("Le heros doit avoir 200pdv", 200, h.getVie());
		assertEquals("Le heros doit avoir 10 d'attaque", 10, h.getAttaque());
		assertEquals("Le heros doit avoir 1 de portee", 1, h.getPortee());
	}

}
