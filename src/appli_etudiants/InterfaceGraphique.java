/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import javax.swing.JOptionPane;

/**
 *
 * @author nc
 */
public class InterfaceGraphique extends javax.swing.JFrame {
    /**
     * attribut qui indique si l'etudiant est connecté ou non
     */
    private boolean connecte;
    private Etudiants infoEtudiant;
    
    /**
     * interface graphique
     */
    private Connexion fenConnexion;
    private Deconnexion fenDeconnexion;

    /**
     * constructeur : Creates new form InterfaceGraphique
     * 
     */
    public InterfaceGraphique() {
        initComponents();
        //par defaut, la connexion est inactive
        this.connecte=false;
        //element du menu de deconnexion grisé
        this.majConnexion();
        //centrage
        this.setLocationRelativeTo(null);
        //titre 
        this.setTitle("Gestion des étudiants du bts sio");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        nomMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        connexionMenuItem = new javax.swing.JMenuItem();
        deconnexionMenuItem = new javax.swing.JMenuItem();
        SortieMenuItem = new javax.swing.JMenuItem();
        gestionMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        aideMenu = new javax.swing.JMenu();
        aproposMenuItem = new javax.swing.JMenuItem();
        nomjMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBorder(new javax.swing.border.MatteBorder(null));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Accueil");

        connexionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        connexionMenuItem.setMnemonic('o');
        connexionMenuItem.setText("Connexion");
        connexionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(connexionMenuItem);

        deconnexionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deconnexionMenuItem.setMnemonic('s');
        deconnexionMenuItem.setText("Déconnexion");
        deconnexionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(deconnexionMenuItem);

        SortieMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SortieMenuItem.setMnemonic('x');
        SortieMenuItem.setText("Sortie");
        SortieMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortieMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(SortieMenuItem);

        nomMenuBar.add(fileMenu);

        gestionMenu1.setText("Gestion");

        jMenuItem2.setText("Modifier ses informations");
        gestionMenu1.add(jMenuItem2);

        jMenuItem3.setText("Ajouter un utilisateur");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        gestionMenu1.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        gestionMenu1.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        gestionMenu1.add(jMenuItem5);

        nomMenuBar.add(gestionMenu1);

        aideMenu.setMnemonic('h');
        aideMenu.setText("Aide");

        aproposMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aproposMenuItem.setMnemonic('c');
        aproposMenuItem.setText("A propos");
        aideMenu.add(aproposMenuItem);

        nomMenuBar.add(aideMenu);
        nomMenuBar.add(nomjMenu);

        setJMenuBar(nomMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortieMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortieMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SortieMenuItemActionPerformed

    private void connexionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connexionMenuItemActionPerformed
        // TODO add your handling code here:
       
        /**
         * création de la fenetre de connexion et attachement de cette dernière à l'interface
         * maj de connecte en retour
        */
        this.fenConnexion=new Connexion(this, true);
        this.fenConnexion.setVisible(true);
        
        
        //JOptionPane.showMessageDialog(this, "cc");
    }//GEN-LAST:event_connexionMenuItemActionPerformed

    private void deconnexionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionMenuItemActionPerformed
        // TODO add your handling code here:
        fenDeconnexion=new Deconnexion(this, true);
        this.fenDeconnexion.setVisible(true);
    }//GEN-LAST:event_deconnexionMenuItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    public void connecte(String leNom, String leRole){
        //maj de l'etat de la connexion
        this.connecte=true;
        //ajout du nom dans la fenetre
        this.nomjMenu.setText("Connecté en tant que : "+leNom);
        this.fileMenu.setText(leRole);
        this.nomjMenu.setEnabled(false);
        
        
    }
    public void deconnecte(){
        this.connecte=false;
        this.nomjMenu.setText(null);
    }
    public void majConnexion(){
        deconnexionMenuItem.setEnabled(this.connecte);
        connexionMenuItem.setEnabled(!this.connecte);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGraphique().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SortieMenuItem;
    private javax.swing.JMenu aideMenu;
    private javax.swing.JMenuItem aproposMenuItem;
    private javax.swing.JMenuItem connexionMenuItem;
    private javax.swing.JMenuItem deconnexionMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu gestionMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuBar nomMenuBar;
    private javax.swing.JMenu nomjMenu;
    // End of variables declaration//GEN-END:variables
}
