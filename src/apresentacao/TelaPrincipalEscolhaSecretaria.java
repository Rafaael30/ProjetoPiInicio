/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import main.Main;

/**
 *
 * @author kevin.guimaraes
 */
public class TelaPrincipalEscolhaSecretaria extends javax.swing.JFrame {

    Main oMain;     
    
    /**
     * Creates new form TelaCadastroCurso
     */
    
     public TelaPrincipalEscolhaSecretaria(Main oMain) {
        initComponents();
        this.oMain = oMain; 
    }
     
    public TelaPrincipalEscolhaSecretaria() {
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
        jButton1_Voltar = new javax.swing.JButton();
        jButton1_CadastrarCurso = new javax.swing.JButton();
        jButton2_CadastrarDisciplina = new javax.swing.JButton();
        jButton1_CadastrarAluno = new javax.swing.JButton();
        jButton1_AbrirTurma = new javax.swing.JButton();
        jButton1_MatricularAluno = new javax.swing.JButton();
        jButton1_EmitirNotas = new javax.swing.JButton();
        jButton1_EmitirHistoricoEscolar = new javax.swing.JButton();
        jButton1_EmitirFrequencia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(701, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1_Voltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1_Voltar.setText("Voltar");
        jButton1_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_VoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_Voltar);
        jButton1_Voltar.setBounds(580, 570, 100, 23);

        jButton1_CadastrarCurso.setBackground(new java.awt.Color(0, 0, 255));
        jButton1_CadastrarCurso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1_CadastrarCurso.setText("Cadastrar Curso");
        jButton1_CadastrarCurso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_CadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CadastrarCursoActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_CadastrarCurso);
        jButton1_CadastrarCurso.setBounds(90, 60, 180, 80);

        jButton2_CadastrarDisciplina.setBackground(new java.awt.Color(0, 0, 255));
        jButton2_CadastrarDisciplina.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2_CadastrarDisciplina.setText("Cadastrar Disciplina");
        jButton2_CadastrarDisciplina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2_CadastrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_CadastrarDisciplinaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_CadastrarDisciplina);
        jButton2_CadastrarDisciplina.setBounds(340, 60, 190, 80);

        jButton1_CadastrarAluno.setBackground(new java.awt.Color(0, 0, 255));
        jButton1_CadastrarAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1_CadastrarAluno.setText("Cadastrar Aluno");
        jButton1_CadastrarAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_CadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_CadastrarAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_CadastrarAluno);
        jButton1_CadastrarAluno.setBounds(90, 200, 180, 70);

        jButton1_AbrirTurma.setBackground(new java.awt.Color(0, 0, 255));
        jButton1_AbrirTurma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1_AbrirTurma.setText("Abrir Turma");
        jButton1_AbrirTurma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_AbrirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_AbrirTurmaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_AbrirTurma);
        jButton1_AbrirTurma.setBounds(340, 200, 190, 70);

        jButton1_MatricularAluno.setBackground(new java.awt.Color(0, 0, 255));
        jButton1_MatricularAluno.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1_MatricularAluno.setText("Matricular Aluno");
        jButton1_MatricularAluno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_MatricularAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_MatricularAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_MatricularAluno);
        jButton1_MatricularAluno.setBounds(90, 310, 180, 70);

        jButton1_EmitirNotas.setBackground(new java.awt.Color(0, 0, 255));
        jButton1_EmitirNotas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1_EmitirNotas.setText("Emitir Notas");
        jButton1_EmitirNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_EmitirNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EmitirNotasActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_EmitirNotas);
        jButton1_EmitirNotas.setBounds(340, 410, 190, 70);

        jButton1_EmitirHistoricoEscolar.setBackground(new java.awt.Color(0, 0, 255));
        jButton1_EmitirHistoricoEscolar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1_EmitirHistoricoEscolar.setText("Emitir Historico Escolar");
        jButton1_EmitirHistoricoEscolar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_EmitirHistoricoEscolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EmitirHistoricoEscolarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_EmitirHistoricoEscolar);
        jButton1_EmitirHistoricoEscolar.setBounds(90, 410, 180, 70);

        jButton1_EmitirFrequencia.setBackground(new java.awt.Color(0, 0, 255));
        jButton1_EmitirFrequencia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1_EmitirFrequencia.setText("Emitir Frequencia");
        jButton1_EmitirFrequencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1_EmitirFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EmitirFrequenciaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_EmitirFrequencia);
        jButton1_EmitirFrequencia.setBounds(340, 310, 190, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/graduation-hat-and-diploma-2.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 0, 620, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_CadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CadastrarCursoActionPerformed
        // TODO add your handling code here:
        TelaCadastrarCursoSecretaria Tcad = new TelaCadastrarCursoSecretaria(oMain);
        Tcad.show();
        
    }//GEN-LAST:event_jButton1_CadastrarCursoActionPerformed

    private void jButton1_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_VoltarActionPerformed
        // TODO add your handling code here:
        
          this.dispose();
          
    }//GEN-LAST:event_jButton1_VoltarActionPerformed

    private void jButton2_CadastrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_CadastrarDisciplinaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2_CadastrarDisciplinaActionPerformed

    private void jButton1_CadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_CadastrarAlunoActionPerformed
        // TODO add your handling code here:
        CadastrarAlunosSecretaria Tcad = new CadastrarAlunosSecretaria(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton1_CadastrarAlunoActionPerformed

    private void jButton1_AbrirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_AbrirTurmaActionPerformed
        CadastrarDisciplinaSecretaria Tcad = new CadastrarDisciplinaSecretaria(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton1_AbrirTurmaActionPerformed

    private void jButton1_MatricularAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_MatricularAlunoActionPerformed
        // TODO add your handling code here:
        MatricularAlunoSecretaria Tcad = new MatricularAlunoSecretaria(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton1_MatricularAlunoActionPerformed

    private void jButton1_EmitirFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EmitirFrequenciaActionPerformed
        // TODO add your handling code here:
        EmitirDiarioFrequenciaSecretaria Tcad = new EmitirDiarioFrequenciaSecretaria(oMain);
        Tcad.show();
        
    }//GEN-LAST:event_jButton1_EmitirFrequenciaActionPerformed

    private void jButton1_EmitirHistoricoEscolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EmitirHistoricoEscolarActionPerformed
        // TODO add your handling code here:
        
         
        EmitirHistoricoEscolarSecretaria Tcad = new EmitirHistoricoEscolarSecretaria(oMain);
        Tcad.show();
    }//GEN-LAST:event_jButton1_EmitirHistoricoEscolarActionPerformed

    private void jButton1_EmitirNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EmitirNotasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1_EmitirNotasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalEscolhaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalEscolhaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalEscolhaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalEscolhaSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalEscolhaSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_AbrirTurma;
    private javax.swing.JButton jButton1_CadastrarAluno;
    private javax.swing.JButton jButton1_CadastrarCurso;
    private javax.swing.JButton jButton1_EmitirFrequencia;
    private javax.swing.JButton jButton1_EmitirHistoricoEscolar;
    private javax.swing.JButton jButton1_EmitirNotas;
    private javax.swing.JButton jButton1_MatricularAluno;
    private javax.swing.JButton jButton1_Voltar;
    private javax.swing.JButton jButton2_CadastrarDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
