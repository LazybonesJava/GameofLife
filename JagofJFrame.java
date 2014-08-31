/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JagofJFrame.java
 *
 * Created on 14.01.2014, 21:31:16
 */
package jagof;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * stellt die grafische Benutzeroberfläche (GUI), Nutzereingaben und das Spielfeld grafisch dar
 *
 * @author Markus Gebhardt
 */
public class JagofJFrame extends javax.swing.JFrame //ActionListener um das grid in Zeitschritten zu "evolieren"
        implements ActionListener {

    private Jagof jagof;
    Timer timer;
    int delay = 1000;   //Anzeigedauer eines Evolutionsschritts
    int[] survivecount = new int[9];    //speichern die Nutzereingaben, welche Zellen überleben
    int[] borncount = new int[9];   //speichern die Nutzereingaben, welche Zellen sterben

    /**
     * Creates new form JagofJFrame
     */
    public JagofJFrame() {
        initComponents();
        jagof = new Jagof();
        timer = new Timer(delay, this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        surviveBox0 = new javax.swing.JCheckBox();
        surviveBox1 = new javax.swing.JCheckBox();
        surviveBox2 = new javax.swing.JCheckBox();
        surviveBox3 = new javax.swing.JCheckBox();
        surviveBox4 = new javax.swing.JCheckBox();
        surviveBox5 = new javax.swing.JCheckBox();
        surviveBox6 = new javax.swing.JCheckBox();
        surviveBox7 = new javax.swing.JCheckBox();
        surviveBox8 = new javax.swing.JCheckBox();
        birthBox0 = new javax.swing.JCheckBox();
        birthBox1 = new javax.swing.JCheckBox();
        birthBox2 = new javax.swing.JCheckBox();
        birthBox3 = new javax.swing.JCheckBox();
        birthBox4 = new javax.swing.JCheckBox();
        birthBox5 = new javax.swing.JCheckBox();
        birthBox6 = new javax.swing.JCheckBox();
        birthBox7 = new javax.swing.JCheckBox();
        birthBox8 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        surviveBox0.setText("0 Nachbarn");

        surviveBox1.setText("1 Nachbar");
        surviveBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surviveBox1ActionPerformed(evt);
            }
        });

        surviveBox2.setSelected(true);
        surviveBox2.setText("2 Nachbarn");

        surviveBox3.setSelected(true);
        surviveBox3.setText("3 Nachbarn");

        surviveBox4.setText("4 Nachbarn");
        surviveBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surviveBox4ActionPerformed(evt);
            }
        });

        surviveBox5.setText("5 Nachbarn");

        surviveBox6.setText("6 Nachbarn");

        surviveBox7.setText("7 Nachbarn");

        surviveBox8.setText("8 Nachbarn");

        birthBox0.setText("0 Nachbarn");

        birthBox1.setText("1 Nachbar");

        birthBox2.setText("2 Nachbarn");

        birthBox3.setSelected(true);
        birthBox3.setText("3 Nachbarn");

        birthBox4.setText("4 Nachbarn");
        birthBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthBox4ActionPerformed(evt);
            }
        });

        birthBox5.setText("5 Nachbarn");

        birthBox6.setText("6 Nachbarn");

        birthBox7.setText("7 Nachbarn");

        birthBox8.setText("8 Nachbarn");

        jLabel1.setText("Überleben");

        jLabel2.setText("Gebären");

        jButton1.setText("Neues Spiel");
        jButton1.setActionCommand("Start");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setLabel("Start/Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(32);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(32);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(surviveBox1)
                            .addComponent(surviveBox2)
                            .addComponent(surviveBox3)
                            .addComponent(surviveBox4)
                            .addComponent(surviveBox5)
                            .addComponent(surviveBox6)
                            .addComponent(surviveBox7)
                            .addComponent(surviveBox8)
                            .addComponent(surviveBox0))
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthBox1)
                            .addComponent(birthBox2)
                            .addComponent(birthBox3)
                            .addComponent(birthBox4)
                            .addComponent(birthBox5)
                            .addComponent(birthBox6)
                            .addComponent(birthBox7)
                            .addComponent(birthBox8)
                            .addComponent(birthBox0))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(surviveBox0)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(surviveBox8))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(birthBox0)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(birthBox8))))
                .addContainerGap(586, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void surviveBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surviveBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surviveBox4ActionPerformed

    private void birthBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthBox4ActionPerformed

    private void surviveBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surviveBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surviveBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        survivecount[0] = surviveBox0.isSelected() ? 1 : 0;
        survivecount[1] = surviveBox1.isSelected() ? 1 : 0;
        survivecount[2] = surviveBox2.isSelected() ? 1 : 0;
        survivecount[3] = surviveBox3.isSelected() ? 1 : 0;
        survivecount[4] = surviveBox4.isSelected() ? 1 : 0;
        survivecount[5] = surviveBox5.isSelected() ? 1 : 0;
        survivecount[6] = surviveBox6.isSelected() ? 1 : 0;
        survivecount[7] = surviveBox7.isSelected() ? 1 : 0;
        survivecount[8] = surviveBox8.isSelected() ? 1 : 0;

        borncount[0] = birthBox0.isSelected() ? 1 : 0;
        borncount[1] = birthBox1.isSelected() ? 1 : 0;//den Status der Nutzereingaben auslesen
        borncount[2] = birthBox2.isSelected() ? 1 : 0;
        borncount[3] = birthBox3.isSelected() ? 1 : 0;
        borncount[4] = birthBox4.isSelected() ? 1 : 0;
        borncount[5] = birthBox5.isSelected() ? 1 : 0;
        borncount[6] = birthBox6.isSelected() ? 1 : 0;
        borncount[7] = birthBox7.isSelected() ? 1 : 0;
        borncount[8] = birthBox8.isSelected() ? 1 : 0;
        
        jTextArea1.setText(null);
        jagof.grid.fillgrid();
        jagof.grid.printgrid(jTextArea1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if ( timer.isRunning() ) 
        { 
            timer.stop(); 
        }
        else
        {
            timer.start(); 
        }  //damit das Pausieren in einer Multithreadumgebung möglich ist, werden die Simulationen über Timer gestartet
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JagofJFrame().setVisible(true);

            }
        });
    }

    public void actionPerformed(ActionEvent e) { //Der Timer führt diese Methode solange aus, bis der Befehl timer.stop() ausgeführt wird.

        jagof.grid.printgrid(jTextArea1);
        jagof.grid.evolvegrid(survivecount, borncount);



    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox birthBox0;
    private javax.swing.JCheckBox birthBox1;
    private javax.swing.JCheckBox birthBox2;
    private javax.swing.JCheckBox birthBox3;
    private javax.swing.JCheckBox birthBox4;
    private javax.swing.JCheckBox birthBox5;
    private javax.swing.JCheckBox birthBox6;
    private javax.swing.JCheckBox birthBox7;
    private javax.swing.JCheckBox birthBox8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox surviveBox0;
    private javax.swing.JCheckBox surviveBox1;
    private javax.swing.JCheckBox surviveBox2;
    private javax.swing.JCheckBox surviveBox3;
    private javax.swing.JCheckBox surviveBox4;
    private javax.swing.JCheckBox surviveBox5;
    private javax.swing.JCheckBox surviveBox6;
    private javax.swing.JCheckBox surviveBox7;
    private javax.swing.JCheckBox surviveBox8;
    // End of variables declaration//GEN-END:variables
}
