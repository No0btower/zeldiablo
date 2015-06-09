package personnage;

import jeu.MonJeu;
import moteurJeu.Commande;

public class Ghost extends Monstre {
	
	public Ghost(MonJeu j) {
		super((int)Math.random()*15+ZONE_INTERDITE_X,((int)Math.random()*15+ZONE_INTERDITE_Y),2,1,30,j);
	}

	@Override
	public void seDeplacer(Commande c) {
		if (this.etreMort() == false){
			if (c.gauche){
				if (this.posX-1>ZONE_INTERDITE_X||this.posY>ZONE_INTERDITE_Y){
				posX--;
				if (this.posX<0){
					posX=0;
				}
				}
			}
			if (c.droite ){
				this.posX++;
				if(this.posX>Personnage.LIMIT_X){
					this.posX=LIMIT_X;
				}
			}
			if (c.haut){
				if (this.posY>ZONE_INTERDITE_Y || this.posX>ZONE_INTERDITE_X){
				this.posY--;
				if(this.posY<0){
					this.posY=0;
				}
				}
			}
			if (c.bas){
				this.posY++;
				if(this.posY>Personnage.LIMIT_Y){
					this.posY=LIMIT_Y;
				}
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
