/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import main.Main;

/**
 *
 * @author Roberto
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    Main oMain ;
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
         oMain = new Main();
    
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

        jPanel1 = new javax.swing.JPanel();
        jButton1_Secretaria1 = new javax.swing.JButton();
        jButton2_RH1 = new javax.swing.JButton();
        jButton4_Aluno1 = new javax.swing.JButton();
        jButton3_Professor1 = new javax.swing.JButton();
        jButton5_Coordenador1 = new javax.swing.JButton();
        jLabel1_Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1_Secretaria1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1_Secretaria1.setText("Secretária");
        jButton1_Secretaria1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_Secretaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Secretaria1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_Secretaria1);
        jButton1_Secretaria1.setBounds(110, 90, 145, 84);

        jButton2_RH1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2_RH1.setText("RH");
        jButton2_RH1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2_RH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_RH1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_RH1);
        jButton2_RH1.setBounds(420, 90, 160, 84);

        jButton4_Aluno1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4_Aluno1.setText("Aluno");
        jButton4_Aluno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4_Aluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4_Aluno1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4_Aluno1);
        jButton4_Aluno1.setBounds(110, 220, 145, 84);

        jButton3_Professor1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3_Professor1.setText("Professor");
        jButton3_Professor1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3_Professor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_Professor1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3_Professor1);
        jButton3_Professor1.setBounds(420, 220, 160, 84);

        jButton5_Coordenador1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5_Coordenador1.setText("Coordenador");
        jButton5_Coordenador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5_Coordenador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_Coordenador1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5_Coordenador1);
        jButton5_Coordenador1.setBounds(270, 360, 160, 84);

        jLabel1_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/graduation-hat-and-diploma-2.png"))); // NOI18N
        jPanel1.add(jLabel1_Fundo);
        jLabel1_Fundo.setBounds(70, 0, 620, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_Secretaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Secretaria1ActionPerformed
        // TODO add your handling code here:
        TelaPrincipalEscolhaSecretaria Tcad = new TelaPrincipalEscolhaSecretaria(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton1_Secretaria1ActionPerformed

    private void jButton2_RH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_RH1ActionPerformed
        // TODO add your handling code here:

        TelaRH Tcad = new TelaRH(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton2_RH1ActionPerformed

    private void jButton4_Aluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4_Aluno1ActionPerformed
        // TODO add your handling code here:
        ConsultarAvaliaçãoAluno Tcad = new ConsultarAvaliaçãoAluno(oMain);
        Tcad.show();

    }//GEN-LAST:event_jButton4_Aluno1ActionPerformed

    private void jButton3_Professor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_Professor1ActionPerformed
        // TODO add your handling code here:]
        TelaProfessor Tcad = new TelaProfessor(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton3_Professor1ActionPerformed

    private void jButton5_Coordenador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_Coordenador1ActionPerformed
        // TODO add your handling code here:
        TelaCoordenador Tcad = new TelaCoordenador(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton5_Coordenador1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Secretaria1;
    private javax.swing.JButton jButton2_RH1;
    private javax.swing.JButton jButton3_Professor1;
    private javax.swing.JButton jButton4_Aluno1;
    private javax.swing.JButton jButton5_Coordenador1;
    private javax.swing.JLabel jLabel1_Fundo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
