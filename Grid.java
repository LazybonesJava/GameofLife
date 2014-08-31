/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jagof;

import javax.swing.JTextArea;

/**
 *
 * @author Markus Gebhardt
 */
public class Grid {

    private int gridsize;   
    private float propcellalive;
    private boolean[][] gridarray;
    private int stepcounter;
    
    /**
     * 
     * @return 
     */
    
    public int getCounter()
    {
        return stepcounter;
    }
    /**
     * Konstruktor(?)
     * @param gridsize Dimensionsgröße des quadratischen Spielfeldes
     * @param propcellalive Lebenswahrscheinlichkeit einer Zelle zu Spielbeginn
     */
    
    public Grid(int gridsize, float propcellalive ) {   
	this.gridsize=gridsize;
	this.propcellalive=propcellalive;
	gridarray = new boolean[gridsize][gridsize]; //Erzeugen eines zweidimensionalen quadratischen Feldes
    }
/**
 * Es wird zunächst ein leeres Array erzeugt, dessen Zellen der Wert Null zugewiesen wird.
 * Der Schrittzaehler wird ebenfalls auf Null gesetzt.
 * Anschliessend wird das Array mit einer zufälligen Anfangsgeneration lebender Zellen gefüllt.
 * Lebenden Zellen wird der Wert 1 zugewiesen.
 */   
    void fillgrid() { 
	stepcounter = 0;
        for(int i = 0; i<gridsize;++i) {
	    for(int j = 0; j<gridsize;++j) {
		    gridarray[i][j]=false;
	    }
	}

	for(int i = 1; i<gridsize-1;++i) {
	    for(int j = 1; j<gridsize-1;++j) {
		if(Math.random()<=propcellalive) 		
		    gridarray[i][j]=true;
	    }
	}
    }
    /**
     * 
     * @param output 
     */
    void printgrid(JTextArea output) 
    {// Ausgabe im Textfeld
        for(int i = 1; i<gridsize-1;++i) 
        {
	    for(int j = 1; j<gridsize-1;++j) 
            {
		if(gridarray[i][j]==true) 
                {
		    output.append((char)88+"");
                }		
                else
                {		   
                    output.append(" ");
                }
	    }
            output.append("\n");
	}
        output.append( "------------Step: " + stepcounter + "-------------\n" );
    }

    /**
     * 
     * @param i
     * @param j
     * @return 
     */
    int countcellalive(int i, int j) {//zählt die lebenden Zellen in der Umgebung von i,j
	int cellcounter = 0;

	if (gridarray[i - 1][j] == true)
            cellcounter++;
        if (gridarray[i + 1][j] == true)
            cellcounter++;
        if (gridarray[i][j - 1] == true)
            cellcounter++;
        if (gridarray[i][j + 1] == true)
            cellcounter++;
        if (gridarray[i - 1][j - 1] == true)
            cellcounter++;
        if (gridarray[i + 1][j + 1] == true)
            cellcounter++;
        if (gridarray[i + 1][j - 1] == true)
            cellcounter++;
        if (gridarray[i - 1][j + 1] == true)
            cellcounter++;

	return cellcounter;
    }
    /**
     * Die Methode <code>evolvegrid</code> erzeugt durch Iteration entsprechend der Überlebensregeln und 
     * Geburtsregeln ein neues Array <code>newgridarray</code>,.
     * 
     * @param survivecount enthält die Mengen lebender Nachbarzellen, bei denen 
     * das Überleben der untersuchten Zelle möglich ist.
     * @param borncount enthält die Mengen lebender Nachbarzellen, bei denen 
     * die Geburt der untersuchten Zelle möglich ist.
     */
    void evolvegrid(int[] survivecount, int[] borncount) {
        stepcounter++;
	 boolean[][] newgridarray = new boolean[gridsize][gridsize]; //neues grid als speicher für den nächsten iterationsschritt

	 for(int i = 0; i<gridsize;++i) {//neues grid wird sterilisiert
	     for(int j = 0; j<gridsize;++j) {
		 newgridarray[i][j]=false;
	     }
	 }
	 for(int i = 1; i<gridsize-1;++i) {// es wird durch jede zelle von gridarray iteriert
	     for(int j = 1; j<gridsize-1;++j) {
		 int alivecells = countcellalive(i,j);
		 if(gridarray[i][j]==true){//wenn zelle lebt
		    if(survivecount[alivecells]!=0) {
			newgridarray[i][j]=true;
		    }
		 }
		 else {//wenn zelle tot
		    if(borncount[alivecells]!=0) {
			newgridarray[i][j]=true;
		    }
		 }
	     }
	 }
	 gridarray = newgridarray;    //verweis auf das neues gridarray um sich das kopieren zu sparen
    }
}
