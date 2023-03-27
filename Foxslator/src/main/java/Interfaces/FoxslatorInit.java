/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

/**
 *
 * @author henry
 */
public class FoxslatorInit extends javax.swing.JFrame {

    /**
     * Creates new form FoxslatorInit
     */
    public FoxslatorInit() throws IOException {
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

        tituloPrincipal = new javax.swing.JLabel();
        logoInf = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        ufrgs = new javax.swing.JLabel();
        iniciarButton = new javax.swing.JButton();
        comoUsarButton = new javax.swing.JButton();
        creditosButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Foxslator1.0");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(850, 500));
        setResizable(false);

        tituloPrincipal.setFont(new java.awt.Font("Lucida Console", 1, 55)); // NOI18N
        tituloPrincipal.setLabelFor(tituloPrincipal);
        tituloPrincipal.setText("Foxslator ");
        tituloPrincipal.setToolTipText("");
        tituloPrincipal.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tituloPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        URL ufrgsUrl = getClass().getResource("/ufrgs.png");
        //System.out.println(getClass().getResource("/ufrgs.png"));
        if (ufrgsUrl != null) {
            // Criar um ImageIcon a partir da URL do arquivo de imagem
            ImageIcon iconUfrgs = new ImageIcon(ufrgsUrl);

            // Definir o ícone do botão
            ufrgs.setIcon(iconUfrgs);
        }

        URL infUrl = getClass().getResource("/logoinf2.png");
        //System.out.println(getClass().getResource("/logoinf2.png"));
        if (infUrl != null) {
            // Criar um ImageIcon a partir da URL do arquivo de imagem
            ImageIcon iconInf = new ImageIcon(infUrl);

            // Definir o ícone do botão
            logoInf.setIcon(iconInf);
        }


        subtitulo.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        subtitulo.setText("Conversor texto-música");

        iniciarButton.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N

        URL iniciarUrl = getClass().getResource("/icons8-fox-48.png");
        //System.out.println(getClass().getResource("/icons8-fox-48.png"));
        if (iniciarUrl != null) {
            // Criar um ImageIcon a partir da URL do arquivo de imagem
            ImageIcon iconIniciar = new ImageIcon(iniciarUrl);

            // Definir o ícone do botão
            iniciarButton.setIcon(iconIniciar);
        }

        iniciarButton.setText(" Iniciar");
        iniciarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarButton.setIconTextGap(15);
        iniciarButton.setMaximumSize(new java.awt.Dimension(60, 23));
        iniciarButton.setPreferredSize(new java.awt.Dimension(60, 23));
        iniciarButton.setFocusable(false);
        iniciarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarButtonActionPerformed(evt);
            }
        });

        comoUsarButton.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        comoUsarButton.setIcon(new javax.swing.ImageIcon("src/resources/icons8-question-mark-48.png")); // NOI18N

        URL comoUsarUrl = getClass().getResource("/icons8-question-mark-48.png");
        //System.out.println(getClass().getResource("/icons8-question-mark-48.png"));
        if (comoUsarUrl != null) {
            // Criar um ImageIcon a partir da URL do arquivo de imagem
            ImageIcon iconComoUsar = new ImageIcon(comoUsarUrl);

            // Definir o ícone do botão
            comoUsarButton.setIcon(iconComoUsar);
        }
        
        comoUsarButton.setText("  Como Usar?");
        comoUsarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comoUsarButton.setIconTextGap(0);
        comoUsarButton.setFocusable(false);
        comoUsarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comoUsarButtonActionPerformed(evt);
            }
        });

        creditosButton.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18

        URL creditosUrl = getClass().getResource("/icons8-members-48.png");
        //System.out.println(getClass().getResource("/icons8-members-48.png"));
        if (creditosUrl != null) {
            // Criar um ImageIcon a partir da URL do arquivo de imagem
            ImageIcon iconCreditos = new ImageIcon(creditosUrl);

            // Definir o ícone do botão
            creditosButton.setIcon(iconCreditos);
        }

        creditosButton.setText("Créditos");
        creditosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditosButton.setIconTextGap(10);
        creditosButton.setFocusable(false);
        creditosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(tituloPrincipal))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ufrgs)
                                .addGap(230, 230, 230)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(creditosButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(iniciarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comoUsarButton))
                                    .addComponent(subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 283, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoInf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ufrgs))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtitulo)
                        .addGap(30, 30, 30)
                        .addComponent(iniciarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comoUsarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(logoInf)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarButtonActionPerformed
        this.setVisible(false);
        new InputTela().setVisible(true);
    }//GEN-LAST:event_iniciarButtonActionPerformed

    private void comoUsarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comoUsarButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ComoUsarTela().setVisible(true);
    }//GEN-LAST:event_comoUsarButtonActionPerformed

    private void creditosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new CreditosTela().setVisible(true);
    }//GEN-LAST:event_creditosButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   // public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoxslatorInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoxslatorInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoxslatorInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoxslatorInit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
                //new FoxslatorInit().setVisible(true);
            //}
       // });
    //}*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton comoUsarButton;
    private javax.swing.JButton creditosButton;
    private javax.swing.JButton iniciarButton;
    private javax.swing.JLabel logoInf;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JLabel tituloPrincipal;
    private javax.swing.JLabel ufrgs;
    // End of variables declaration//GEN-END:variables
}
