package jagof;

/**
 * Die Klasse <code>Jagof</code> fügt das Interface hinzu und hält die Konstanten für das GameofLife und 
 * initialisert dieses mit den Konstanten.
 * @param gridsize Dimensionsgröße des quadratischen Spielfeldes
 * @param propcellalive Lebenswahrscheinlichkeit einer Zelle zu Spielbeginn
 */
public class Jagof {

    private final static int gridsize = 32;
    private final static float propcellalive = 0.5f;
/**
 * erzeugt das Interface (?)
 */
    public Grid grid;

/**
 * Der Konstruktor <code>Jagof()</code> instanziert ein Objekt der Klasse <code>Grid</code> mit den Attributen 
 * <code>gridsize</code> und <code>propcellalive</code>. (?)
 */
    public Jagof() {

	grid = new Grid(gridsize, propcellalive);
	
    }

    
}
