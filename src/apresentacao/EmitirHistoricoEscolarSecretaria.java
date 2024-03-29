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
public class EmitirHistoricoEscolarSecretaria extends javax.swing.JFrame {

    private Main  oMain ; 
    
    /**
     * Creates new form TelaCadastrarCursoSecretaria
     */
    public EmitirHistoricoEscolarSecretaria(Main oMain) {
        initComponents();
        this.oMain = oMain; 
    }
    public EmitirHistoricoEscolarSecretaria() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_ID = new javax.swing.JLabel();
        jLabel2_Curso = new javax.swing.JLabel();
        jComboBox1_Cursos = new javax.swing.JComboBox<>();
        jLabel3_Disciplina = new javax.swing.JLabel();
        jComboBox1_Disciplinas = new javax.swing.JComboBox<>();
        jLabel4_NF = new javax.swing.JLabel();
        jLabel5_Frequencia = new javax.swing.JLabel();
        jLabel6_Status = new javax.swing.JLabel();
        jRadioButton1_Ativo = new javax.swing.JRadioButton();
        jRadioButton2_Trancado = new javax.swing.JRadioButton();
        jRadioButton3_Formado = new javax.swing.JRadioButton();
        jRadioButton4_Evadido = new javax.swing.JRadioButton();
        jButton1_Emissao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_NotaFinal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2_Frequencia = new javax.swing.JTextArea();
        jButton1_Pesquisar = new javax.swing.JButton();
        jTextField1_IdAluno = new javax.swing.JFormattedTextField();
        jLabel1_Titulo = new javax.swing.JLabel();
        jButton1_Sair = new javax.swing.JButton();
        jLabel1_Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(701, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(701, 550));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1_ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_ID.setText("ID Aluno:");
        jPanel2.add(jLabel1_ID);
        jLabel1_ID.setBounds(11, 13, 61, 17);

        jLabel2_Curso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2_Curso.setText("Curso: ");
        jPanel2.add(jLabel2_Curso);
        jLabel2_Curso.setBounds(11, 50, 46, 17);

        jComboBox1_Cursos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1_Cursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1_Cursos);
        jComboBox1_Cursos.setBounds(39, 73, 212, 21);

        jLabel3_Disciplina.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3_Disciplina.setText("Disciplina: ");
        jPanel2.add(jLabel3_Disciplina);
        jLabel3_Disciplina.setBounds(11, 159, 68, 17);

        jComboBox1_Disciplinas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1_Disciplinas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1_Disciplinas);
        jComboBox1_Disciplinas.setBounds(39, 187, 212, 21);

        jLabel4_NF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4_NF.setText("Nota Final: ");
        jPanel2.add(jLabel4_NF);
        jLabel4_NF.setBounds(10, 250, 72, 17);

        jLabel5_Frequencia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5_Frequencia.setText("Frequência: ");
        jPanel2.add(jLabel5_Frequencia);
        jLabel5_Frequencia.setBounds(10, 330, 80, 17);

        jLabel6_Status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6_Status.setText("Status: ");
        jPanel2.add(jLabel6_Status);
        jLabel6_Status.setBounds(11, 111, 48, 17);

        buttonGroup1.add(jRadioButton1_Ativo);
        jRadioButton1_Ativo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jRadioButton1_Ativo.setText("Ativo");
        jPanel2.add(jRadioButton1_Ativo);
        jRadioButton1_Ativo.setBounds(65, 111, 51, 14);

        buttonGroup1.add(jRadioButton2_Trancado);
        jRadioButton2_Trancado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jRadioButton2_Trancado.setText("Trancado");
        jPanel2.add(jRadioButton2_Trancado);
        jRadioButton2_Trancado.setBounds(120, 108, 71, 20);

        buttonGroup1.add(jRadioButton3_Formado);
        jRadioButton3_Formado.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jRadioButton3_Formado.setText("Formado");
        jPanel2.add(jRadioButton3_Formado);
        jRadioButton3_Formado.setBounds(191, 108, 67, 20);

        buttonGroup1.add(jRadioButton4_Evadido);
        jRadioButton4_Evadido.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jRadioButton4_Evadido.setText("Evadido");
        jPanel2.add(jRadioButton4_Evadido);
        jRadioButton4_Evadido.setBounds(50, 130, 80, 22);

        jButton1_Emissao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Emissao.setText("Emissao");
        jPanel2.add(jButton1_Emissao);
        jButton1_Emissao.setBounds(120, 210, 130, 20);

        jTextArea1_NotaFinal.setColumns(20);
        jTextArea1_NotaFinal.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_NotaFinal);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(120, 240, 166, 80);

        jTextArea2_Frequencia.setColumns(20);
        jTextArea2_Frequencia.setRows(5);
        jScrollPane2.setViewportView(jTextArea2_Frequencia);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(120, 330, 166, 70);

        jButton1_Pesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Pesquisar.setText("Pesquisar");
        jPanel2.add(jButton1_Pesquisar);
        jButton1_Pesquisar.setBounds(160, 30, 100, 25);

        try {
            jTextField1_IdAluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(jTextField1_IdAluno);
        jTextField1_IdAluno.setBounds(80, 10, 70, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(190, 90, 290, 410);

        jLabel1_Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1_Titulo.setText("Emissão de Histórico Escolar");
        jPanel1.add(jLabel1_Titulo);
        jLabel1_Titulo.setBounds(160, 0, 370, 30);

        jButton1_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Sair.setText("Sair");
        jButton1_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SairActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1_Sair);
        jButton1_Sair.setBounds(550, 500, 100, 25);

        jLabel1_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/graduation-hat-and-diploma-2.png"))); // NOI18N
        jPanel1.add(jLabel1_Fundo);
        jLabel1_Fundo.setBounds(74, 0, 620, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1_SairActionPerformed

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
            java.util.logging.Logger.getLogger(EmitirHistoricoEscolarSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmitirHistoricoEscolarSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmitirHistoricoEscolarSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmitirHistoricoEscolarSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmitirHistoricoEscolarSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1_Emissao;
    private javax.swing.JButton jButton1_Pesquisar;
    private javax.swing.JButton jButton1_Sair;
    private javax.swing.JComboBox<String> jComboBox1_Cursos;
    private javax.swing.JComboBox<String> jComboBox1_Disciplinas;
    private javax.swing.JLabel jLabel1_Fundo;
    private javax.swing.JLabel jLabel1_ID;
    private javax.swing.JLabel jLabel1_Titulo;
    private javax.swing.JLabel jLabel2_Curso;
    private javax.swing.JLabel jLabel3_Disciplina;
    private javax.swing.JLabel jLabel4_NF;
    private javax.swing.JLabel jLabel5_Frequencia;
    private javax.swing.JLabel jLabel6_Status;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1_Ativo;
    private javax.swing.JRadioButton jRadioButton2_Trancado;
    private javax.swing.JRadioButton jRadioButton3_Formado;
    private javax.swing.JRadioButton jRadioButton4_Evadido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1_NotaFinal;
    private javax.swing.JTextArea jTextArea2_Frequencia;
    private javax.swing.JFormattedTextField jTextField1_IdAluno;
    // End of variables declaration//GEN-END:variables
}
