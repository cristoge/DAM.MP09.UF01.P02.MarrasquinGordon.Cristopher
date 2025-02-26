import cristopher.marrasquin.joc3d.*;

public class App {
	public static void main(String[] args) {
			EntornJoc entorn = new EntornJoc(800, 600, 500);
			
			ElementJoc e01 = new ElementJoc("Meteorit");
			ElementJoc e02 = new ElementJoc("Misil");
			ElementJoc e03 = new ElementJoc("Pantà");
			
			Thread t1 = new Thread(new EventJoc(e01, entorn, 10));
			Thread t2 = new Thread(new EventJoc(e02, entorn, null));
			Thread t3 = new Thread(new EventJoc(e03, entorn, 5));
			
			t1.start();
			t2.start();
			t3.start();
	}
}