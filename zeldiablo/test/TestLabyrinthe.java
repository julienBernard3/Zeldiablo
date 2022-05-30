
import gameLaby.laby.Labyrinthe;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestLabyrinthe {
  @Test
  public void methodes() {
    // Initialisation

    // Methode a teste

    // Verification
  }

  @Test
  public void constructeur() {

  }


  @Test
  public void caseDisponible() {

  }

  @Test
  public void deplacerCaisse() throws IOException {
    // Initialisation
    Labyrinthe laby = new Labyrinthe("labySimple/labySokoban.txt");

    //Verification de la position de la caisse
    assertTrue(laby.getCaisse(17,10));

    //Deplacement de la caisse avec la methode
    laby.deplacerCaisse(17,10,Labyrinthe.HAUT);

    //Verification de la position de la caisse
    assertTrue(laby.getCaisse(17,9));

  }


  @Test
  public void deplacerPersoEtCaisse() {

  }

}