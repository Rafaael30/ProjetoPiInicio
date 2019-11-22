/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import Model.Curso;
import Model.Main;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class TelaRH extends javax.swing.JFrame {
    
       private Main  oMain ; 
    
    /**
     * Creates new form TelaCadastrarCursoSecretaria
     */
    public TelaRH(Main oMain) throws SQLException {
        initComponents();
        this.oMain = oMain; 
        this.oMain = oMain;
        List<Curso> cursos ;
        cursos = this.oMain.ListaCurso();
        int i =0;
        jComboBox1_Cursos.removeAllItems();
        while (i < cursos.size()){
         
         jComboBox1_Cursos.addItem(cursos.get(i).getDescricao());
            
        i++;
        }
        
    }
    
    /**
     * Creates new form TelaRH
     */
    public TelaRH() {
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
        jLabel2_Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1_Nome = new javax.swing.JLabel();
        jLabel2_Endereco = new javax.swing.JLabel();
        jLabel3_Telefone = new javax.swing.JLabel();
        jLabel4_TitulacaoMaxima = new javax.swing.JLabel();
        jTextField2_Nome = new javax.swing.JTextField();
        jTextField1_Endereço = new javax.swing.JTextField();
        jTextField1_Telefone = new javax.swing.JTextField();
        jTextField4_TitulacaoMaxima = new javax.swing.JTextField();
        jButton1_Salvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6_Cidade = new javax.swing.JLabel();
        jTextField1_Cidade = new javax.swing.JTextField();
        jLabel6_UF = new javax.swing.JLabel();
        jTextField1_UF = new javax.swing.JTextField();
        jComboBox1_Cursos = new javax.swing.JComboBox<>();
        jButton2_Alterar = new javax.swing.JButton();
        jLabel1_ID = new javax.swing.JLabel();
        jTextField1_ID = new javax.swing.JTextField();
        jLabel1_Status = new javax.swing.JLabel();
        jRadioButton1_Ativo = new javax.swing.JRadioButton();
        jRadioButton2_Inativo = new javax.swing.JRadioButton();
        jTextField1_CPF = new javax.swing.JTextField();
        jTextField1_RG = new javax.swing.JTextField();
        jLabel1_Nome1 = new javax.swing.JLabel();
        jLabel1_Nome2 = new javax.swing.JLabel();
        jButton2_Sair = new javax.swing.JButton();
        jLabel1_Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(701, 550));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2_Titulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2_Titulo.setText("Cadastro de Professor");
        jPanel1.add(jLabel2_Titulo);
        jLabel2_Titulo.setBounds(190, 0, 320, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1_Nome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1_Nome.setText("Nome: ");

        jLabel2_Endereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2_Endereco.setText("Endereço: ");

        jLabel3_Telefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3_Telefone.setText("Telefone: ");

        jLabel4_TitulacaoMaxima.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4_TitulacaoMaxima.setText("Titulação Maxima: ");

        jTextField1_Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_TelefoneActionPerformed(evt);
            }
        });

        jButton1_Salvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1_Salvar.setText("Salvar");
        jButton1_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SalvarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Cursos:");

        jLabel6_Cidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6_Cidade.setText("Cidade: ");

        jLabel6_UF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6_UF.setText("UF: ");

        jComboBox1_Cursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2_Alterar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2_Alterar.setText("Alterar");
        jButton2_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_AlterarActionPerformed(evt);
            }
        });

        jLabel1_ID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_ID.setText("ID:");

        jLabel1_Status.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1_Status.setText("Status:  ");

        buttonGroup1.add(jRadioButton1_Ativo);
        jRadioButton1_Ativo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton1_Ativo.setText("Ativo");

        buttonGroup1.add(jRadioButton2_Inativo);
        jRadioButton2_Inativo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButton2_Inativo.setText("Inativo");

        jLabel1_Nome1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1_Nome1.setText("CPF: ");

        jLabel1_Nome2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1_Nome2.setText("RG:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1_Status)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1_ID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jRadioButton1_Ativo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2_Inativo)
                                .addGap(164, 164, 164))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1_Nome)
                                    .addComponent(jLabel1_Nome1)
                                    .addComponent(jLabel1_Nome2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jTextField1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(44, 44, 44))
                                        .addComponent(jTextField2_Nome, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField1_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2_Endereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1_Endereço, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField1_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6_UF)))
                                .addGap(21, 21, 21)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4_TitulacaoMaxima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4_TitulacaoMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1_Cursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3_Telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6_Cidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1_ID)
                    .addComponent(jTextField1_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1_Ativo)
                    .addComponent(jRadioButton2_Inativo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Nome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_Nome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1_Endereço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_Endereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6_Cidade)
                    .addComponent(jTextField1_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6_UF)
                    .addComponent(jTextField1_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3_Telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4_TitulacaoMaxima)
                    .addComponent(jTextField4_TitulacaoMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1_Cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2_Alterar)
                    .addComponent(jButton1_Salvar))
                .addGap(40, 40, 40))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 90, 320, 350);

        jButton2_Sair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2_Sair.setText("Sair");
        jButton2_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_SairActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2_Sair);
        jButton2_Sair.setBounds(540, 480, 110, 25);

        jLabel1_Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/graduation-hat-and-diploma-2.png"))); // NOI18N
        jPanel1.add(jLabel1_Fundo);
        jLabel1_Fundo.setBounds(70, 0, 620, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2_SairActionPerformed

    private void jButton1_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SalvarActionPerformed
        // TODO add your handling code here: salvar
        
         try {
         int id = 0;//Integer.parseInt(jTextField1_ID.getText());
         Boolean ativo = true ;
         String cpf = jTextField1_CPF.getText();
         String rg = jTextField1_RG.getText();     
         String nome = jTextField2_Nome.getText();     
         String telefone = jTextField1_Telefone.getText();    
         String endereco = jTextField1_Endereço.getText();
         String cidade = jTextField1_Cidade.getText();
         String uf = jTextField1_UF.getText();
         Curso curso = oMain.BuscarCurso(jComboBox1_Cursos.getItemAt(jComboBox1_Cursos.getSelectedIndex()));
         String titulacao = jTextField4_TitulacaoMaxima.getText();
         
        if(jRadioButton1_Ativo.isSelected()){
            ativo = true ;
        }
        else if(jRadioButton2_Inativo.isSelected()){
            ativo = false;
        }
         
       oMain.SalvarProfessor(nome, cpf, rg, telefone, endereco, cidade, ativo, curso.getDescricao(), id, uf, titulacao);
       
       JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        // Salvar asdasdasd
    }//GEN-LAST:event_jButton1_SalvarActionPerformed

    private void jTextField1_TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_TelefoneActionPerformed

    private void jButton2_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_AlterarActionPerformed
        // TODO add your handling code here:
        
        // alterar
    }//GEN-LAST:event_jButton2_AlterarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1_Salvar;
    private javax.swing.JButton jButton2_Alterar;
    private javax.swing.JButton jButton2_Sair;
    private javax.swing.JComboBox<String> jComboBox1_Cursos;
    private javax.swing.JLabel jLabel1_Fundo;
    private javax.swing.JLabel jLabel1_ID;
    private javax.swing.JLabel jLabel1_Nome;
    private javax.swing.JLabel jLabel1_Nome1;
    private javax.swing.JLabel jLabel1_Nome2;
    private javax.swing.JLabel jLabel1_Status;
    private javax.swing.JLabel jLabel2_Endereco;
    private javax.swing.JLabel jLabel2_Titulo;
    private javax.swing.JLabel jLabel3_Telefone;
    private javax.swing.JLabel jLabel4_TitulacaoMaxima;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6_Cidade;
    private javax.swing.JLabel jLabel6_UF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1_Ativo;
    private javax.swing.JRadioButton jRadioButton2_Inativo;
    private javax.swing.JTextField jTextField1_CPF;
    private javax.swing.JTextField jTextField1_Cidade;
    private javax.swing.JTextField jTextField1_Endereço;
    private javax.swing.JTextField jTextField1_ID;
    private javax.swing.JTextField jTextField1_RG;
    private javax.swing.JTextField jTextField1_Telefone;
    private javax.swing.JTextField jTextField1_UF;
    private javax.swing.JTextField jTextField2_Nome;
    private javax.swing.JTextField jTextField4_TitulacaoMaxima;
    // End of variables declaration//GEN-END:variables
}
