package cristopher.marrasquin.joc3d;

import java.util.Random;

public class EventJoc implements Runnable {
  private ElementJoc element;
  private EntornJoc entorn;
  private Integer segonsEnPantalla;
  
  public EventJoc(ElementJoc element, EntornJoc entorn, Integer segonsEnPantalla) {
      this.element = element;
      this.entorn = entorn;
      this.segonsEnPantalla = segonsEnPantalla;
  }

  @Override
  public void run() {
      aparicions();
  }

  private void aparicions() {
      int segonsActuals = 0;
      Random random = new Random();

      while (segonsEnPantalla == null || segonsActuals < segonsEnPantalla) {
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              System.err.println(e.getMessage());
          }

          int x = getPosicio(0, entorn.getAmpleMaximPantalla(), random);
          int y = getPosicio(0, entorn.getAlturaMaximPantalla(), random);
          int z = getPosicio(0, entorn.getMidaProfunditatPantalla(), random);
          
          element.setPosicio(x, y, z);
          
          if (segonsEnPantalla != null) {
              segonsActuals++;
          }
          
          System.out.println("Event: " + element.getNom() + " aparició: " + segonsActuals + "  x:" + x + "  y:" + y + "  z:" + z);
      }
  }

  private int getPosicio(int min, int max, Random random) {
      return random.nextInt((max - min) + 1) + min;
  }
}
