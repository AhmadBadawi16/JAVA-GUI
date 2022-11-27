/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.GraphicsEnvironment;
import javax.swing.JPanel;

/**
 *
 * @author Asus
 */
public class PilihGambarButtonFullScreen extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButtonFullScreen
     */
    public PilihGambarButtonFullScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        streetwareBT = new javax.swing.JButton();
        classyBT = new javax.swing.JButton();
        gorpcoreBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        streetwareLB = new javax.swing.JLabel();
        classyLB = new javax.swing.JLabel();
        gorpcoreLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        streetwareBT.setText("STREETWARE");
        streetwareBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetwareBTActionPerformed(evt);
            }
        });
        buttonPanel.add(streetwareBT);

        classyBT.setText("CLASSY");
        classyBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classyBTActionPerformed(evt);
            }
        });
        buttonPanel.add(classyBT);

        gorpcoreBT.setText("GORPCORE");
        gorpcoreBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gorpcoreBTActionPerformed(evt);
            }
        });
        buttonPanel.add(gorpcoreBT);

        exitBT.setText("EXIT");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });
        buttonPanel.add(exitBT);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        streetwareLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        streetwareLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Pictures\\streetware - Copy.JPG")); // NOI18N
        imagePanel.add(streetwareLB, "0");

        classyLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classyLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Pictures\\classy - Copy.jpg")); // NOI18N
        imagePanel.add(classyLB, "1");

        gorpcoreLB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gorpcoreLB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\OneDrive\\Pictures\\gorpcore - Copy.jpg")); // NOI18N
        imagePanel.add(gorpcoreLB, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void streetwareBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetwareBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
         cl.show(imagePanel,"0");
    }//GEN-LAST:event_streetwareBTActionPerformed

    private void classyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classyBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
         cl.show(imagePanel,"1");
    }//GEN-LAST:event_classyBTActionPerformed

    private void gorpcoreBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gorpcoreBTActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) (imagePanel.getLayout());
         cl.show(imagePanel,"2");
    }//GEN-LAST:event_gorpcoreBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButtonFullScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               PilihGambarButtonFullScreen fullFrame =  new PilihGambarButtonFullScreen();
               
                java.awt.GraphicsDevice device = 
                       GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
               device.setFullScreenWindow(fullFrame);
               
               fullFrame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton classyBT;
    private javax.swing.JLabel classyLB;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton gorpcoreBT;
    private javax.swing.JLabel gorpcoreLB;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton streetwareBT;
    private javax.swing.JLabel streetwareLB;
    // End of variables declaration//GEN-END:variables

}