/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import main.Main;

/**
 *
 * @author Kevin
 */
public class TelaCoordenador extends javax.swing.JFrame {
       private Main  oMain ; 
    
    /**
     * Creates new form TelaCadastrarCursoSecretaria
     */
    public TelaCoordenador(Main oMain) {
        initComponents();
        this.oMain = oMain; 
    }
    /**
     * Creates new form TelaCoordenador
     */
    public TelaCoordenador() {
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

        jPanel1_PainelMaior = new javax.swing.JPanel();
        jPanel1_PainelMenor = new javax.swing.JPanel();
        jLabel1_Professor = new javax.swing.JLabel();
        jComboBox1_NomeProfessor = new javax.swing.JComboBox<>();
        jLabel1_Turma = new javax.swing.JLabel();
        jComboBox1_Turmas = new javax.swing.JComboBox<>();
        jButton1_Salvar = new javax.swing.JButton();
        jButton1_Alterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1_Disciplinas = new javax.swing.JComboBox<>();
        jLabel1_Titulo = new javax.swing.JLabel();
        jButton2_Sair = new javax.swing.JButton();
        jLabel1_Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(701, 550));

        jPanel1_PainelMaior.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_PainelMaior.setLayout(null);

        jPanel1_PainelMenor.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1_PainelMenor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1_Professor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Professor.setText("Professor:");

        jComboBox1_NomeProfessor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1_NomeProfessor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1_Turma.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Turma.setText("Turma:");

        jComboBox1_Turmas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1_Turmas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1_Salvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Salvar.setText("Salvar");

        jButton1_Alterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Alterar.setText("Alterar");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Disciplina: ");

        jComboBox1_Disciplinas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1_Disciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1_PainelMenorLayout = new javax.swing.GroupLayout(jPanel1_PainelMenor);
        jPanel1_PainelMenor.setLayout(jPanel1_PainelMenorLayout);
        jPanel1_PainelMenorLayout.setHorizontalGroup(
            jPanel1_PainelMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_PainelMenorLayout.createSequentialGroup()
                .addGroup(jPanel1_PainelMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1_Disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1_PainelMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_PainelMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1_PainelMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1_PainelMenorLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1_Professor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1_PainelMenorLayout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addComponent(jComboBox1_NomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1_PainelMenorLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1_Turma, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jComboBox1_Turmas, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1_PainelMenorLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton1_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1_PainelMenorLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1_PainelMenorLayout.setVerticalGroup(
            jPanel1_PainelMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_PainelMenorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1_Professor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1_NomeProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1_Turma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1_Turmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1_Disciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1_PainelMenorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Salvar)
                    .addComponent(jButton1_Alterar))
                .addGap(30, 30, 30))
        );

        jPanel1_PainelMaior.add(jPanel1_PainelMenor);
        jPanel1_PainelMenor.setBounds(190, 100, 280, 320);

        jLabel1_Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1_Titulo.setText("Alocação de Professor");
        jPanel1_PainelMaior.add(jLabel1_Titulo);
        jLabel1_Titulo.setBounds(200, 0, 280, 30);

        jButton2_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2_Sair.setText("Sair");
        jButton2_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_SairActionPerformed(evt);
            }
        });
        jPanel1_PainelMaior.add(jButton2_Sair);
        jButton2_Sair.setBounds(550, 490, 100, 25);

        jLabel1_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/graduation-hat-and-diploma-2.png"))); // NOI18N
        jPanel1_PainelMaior.add(jLabel1_Fundo);
        jLabel1_Fundo.setBounds(70, 0, 620, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_PainelMaior, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_PainelMaior, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2_SairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCoordenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCoordenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Alterar;
    private javax.swing.JButton jButton1_Salvar;
    private javax.swing.JButton jButton2_Sair;
    private javax.swing.JComboBox<String> jComboBox1_Disciplinas;
    private javax.swing.JComboBox<String> jComboBox1_NomeProfessor;
    private javax.swing.JComboBox<String> jComboBox1_Turmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_Fundo;
    private javax.swing.JLabel jLabel1_Professor;
    private javax.swing.JLabel jLabel1_Titulo;
    private javax.swing.JLabel jLabel1_Turma;
    private javax.swing.JPanel jPanel1_PainelMaior;
    private javax.swing.JPanel jPanel1_PainelMenor;
    // End of variables declaration//GEN-END:variables
}
