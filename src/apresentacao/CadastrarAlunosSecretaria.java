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
public class CadastrarAlunosSecretaria extends javax.swing.JFrame {

    private Main  oMain ; 
    
    /**
     * Creates new form TelaCadastrarCursoSecretaria
     */
    public CadastrarAlunosSecretaria(Main oMain) {
        initComponents();
        this.oMain = oMain; 
    }
    public CadastrarAlunosSecretaria() {
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

        buttonGroup1_StatusAluno = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_Matricula = new javax.swing.JLabel();
        jTextField1_CPF = new javax.swing.JTextField();
        jLabel2_Nome = new javax.swing.JLabel();
        jTextField2_Nome = new javax.swing.JTextField();
        jLabel3_Telefone = new javax.swing.JLabel();
        jTextField1_Telefone = new javax.swing.JTextField();
        jButton1_Salvar = new javax.swing.JButton();
        jComboBox1_Cursos = new javax.swing.JComboBox<>();
        jLabel4_CursoAprovado = new javax.swing.JLabel();
        jLabel5_Endereço = new javax.swing.JLabel();
        jTextField1_Endereço = new javax.swing.JTextField();
        jLabel1_Cidade = new javax.swing.JLabel();
        jTextField1_Cidade = new javax.swing.JTextField();
        jLabel1_UF = new javax.swing.JLabel();
        jTextField1_UF = new javax.swing.JTextField();
        jLabel1_ID = new javax.swing.JLabel();
        jTextField1_ID = new javax.swing.JTextField();
        jLabel1_Status = new javax.swing.JLabel();
        jRadioButton1_Matriculado = new javax.swing.JRadioButton();
        jRadioButton2_Trancado = new javax.swing.JRadioButton();
        jRadioButton3_Formado = new javax.swing.JRadioButton();
        jRadioButton4_Evadido = new javax.swing.JRadioButton();
        jButton1_Alterar = new javax.swing.JButton();
        jLabel1_Matricula1 = new javax.swing.JLabel();
        jTextField1_Matricula1 = new javax.swing.JTextField();
        jLabel1_Matricula2 = new javax.swing.JLabel();
        jTextField1_RG = new javax.swing.JTextField();
        jLabel1_Fundo = new javax.swing.JLabel();
        jButton1_Sair = new javax.swing.JButton();
        jLabel1_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(701, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1_Matricula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Matricula.setText("Matricula:");

        jLabel2_Nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2_Nome.setText("Nome: ");

        jLabel3_Telefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3_Telefone.setText("Telefone:  ");

        jButton1_Salvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Salvar.setText("Salvar");
        jButton1_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SalvarActionPerformed(evt);
            }
        });

        jComboBox1_Cursos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox1_Cursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4_CursoAprovado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4_CursoAprovado.setText("Curso Aprovado:  ");

        jLabel5_Endereço.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5_Endereço.setText("Endereço: ");

        jLabel1_Cidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Cidade.setText("Cidade: ");

        jLabel1_UF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_UF.setText("UF: ");

        jLabel1_ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_ID.setText("ID:");

        jLabel1_Status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Status.setText("Status: ");

        buttonGroup1_StatusAluno.add(jRadioButton1_Matriculado);
        jRadioButton1_Matriculado.setText("Matriculado");

        buttonGroup1_StatusAluno.add(jRadioButton2_Trancado);
        jRadioButton2_Trancado.setText("Trancado");

        buttonGroup1_StatusAluno.add(jRadioButton3_Formado);
        jRadioButton3_Formado.setText("Formado");

        buttonGroup1_StatusAluno.add(jRadioButton4_Evadido);
        jRadioButton4_Evadido.setText("Evadido");

        jButton1_Alterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Alterar.setText("Alterar");

        jLabel1_Matricula1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Matricula1.setText("CPF:");

        jLabel1_Matricula2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Matricula2.setText("RG:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1_Matricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1_Matricula2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1_Matricula1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2_Nome)
                        .addGap(28, 28, 28)
                        .addComponent(jTextField2_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3_Telefone)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField1_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5_Endereço)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1_Endereço, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1_Cidade)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1_UF)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4_CursoAprovado, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jButton1_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jButton1_Salvar, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addComponent(jComboBox1_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton2_Trancado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3_Formado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4_Evadido))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1_Status)
                                .addGap(0, 0, 0)
                                .addComponent(jRadioButton1_Matriculado)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField1_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1_Matriculado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_Status)
                            .addComponent(jLabel1_ID))))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3_Formado, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2_Trancado, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4_Evadido, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1_Matricula1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_Matricula)
                            .addComponent(jLabel1_Matricula2))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1_Matricula1))
                    .addComponent(jTextField1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2_Nome))
                    .addComponent(jTextField2_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3_Telefone))
                    .addComponent(jTextField1_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5_Endereço))
                    .addComponent(jTextField1_Endereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1_Cidade)
                            .addComponent(jLabel1_UF))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4_CursoAprovado)
                .addGap(11, 11, 11)
                .addComponent(jComboBox1_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Alterar)
                    .addComponent(jButton1_Salvar))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(205, 91, 300, 390);

        jLabel1_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/graduation-hat-and-diploma-2.png"))); // NOI18N
        jPanel1.add(jLabel1_Fundo);
        jLabel1_Fundo.setBounds(70, 0, 620, 550);

        jButton1_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Sair.setText("Sair");
        jButton1_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SairActionPerformed(evt);
            }
        });

        jLabel1_Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1_Titulo.setText("Cadastro de Aluno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(533, 533, 533)
                        .addComponent(jButton1_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jButton1_Sair))
            .addComponent(jLabel1_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1_SairActionPerformed

    private void jButton1_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SalvarActionPerformed
        // TODO add your handling code here: salvar
        
        
        
        
        
    }//GEN-LAST:event_jButton1_SalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAlunosSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunosSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunosSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAlunosSecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAlunosSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1_StatusAluno;
    private javax.swing.JButton jButton1_Alterar;
    private javax.swing.JButton jButton1_Sair;
    private javax.swing.JButton jButton1_Salvar;
    private javax.swing.JComboBox<String> jComboBox1_Cursos;
    private javax.swing.JLabel jLabel1_Cidade;
    private javax.swing.JLabel jLabel1_Fundo;
    private javax.swing.JLabel jLabel1_ID;
    private javax.swing.JLabel jLabel1_Matricula;
    private javax.swing.JLabel jLabel1_Matricula1;
    private javax.swing.JLabel jLabel1_Matricula2;
    private javax.swing.JLabel jLabel1_Status;
    private javax.swing.JLabel jLabel1_Titulo;
    private javax.swing.JLabel jLabel1_UF;
    private javax.swing.JLabel jLabel2_Nome;
    private javax.swing.JLabel jLabel3_Telefone;
    private javax.swing.JLabel jLabel4_CursoAprovado;
    private javax.swing.JLabel jLabel5_Endereço;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1_Matriculado;
    private javax.swing.JRadioButton jRadioButton2_Trancado;
    private javax.swing.JRadioButton jRadioButton3_Formado;
    private javax.swing.JRadioButton jRadioButton4_Evadido;
    private javax.swing.JTextField jTextField1_CPF;
    private javax.swing.JTextField jTextField1_Cidade;
    private javax.swing.JTextField jTextField1_Endereço;
    private javax.swing.JTextField jTextField1_ID;
    private javax.swing.JTextField jTextField1_Matricula1;
    private javax.swing.JTextField jTextField1_RG;
    private javax.swing.JTextField jTextField1_Telefone;
    private javax.swing.JTextField jTextField1_UF;
    private javax.swing.JTextField jTextField2_Nome;
    // End of variables declaration//GEN-END:variables
}
