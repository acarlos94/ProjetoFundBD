/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.beans.Aluno;
import model.beans.Pessoa;
import model.dao.AlunoDao;
import model.dao.PessoaDao;

/**
 *
 * @author Antonio
 */
public class TelaAlunos extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlunos
     */
    public TelaAlunos() {
        initComponents();
        lerTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCrudAluno = new javax.swing.JPanel();
        jLabelCodigoAluno = new javax.swing.JLabel();
        jTextFieldCodAluno = new javax.swing.JTextField();
        jLabelNumAluno = new javax.swing.JLabel();
        jTextFieldNumAluno = new javax.swing.JTextField();
        jLabelNomeAluno = new javax.swing.JLabel();
        jLabelCursoAluno = new javax.swing.JLabel();
        jTextFieldNomeAluno = new javax.swing.JTextField();
        jTextFieldCursoAluno = new javax.swing.JTextField();
        jButtonSalvarAluno = new javax.swing.JButton();
        jButtonAtualizarAluno = new javax.swing.JButton();
        jButtonExcluirAluno = new javax.swing.JButton();
        jPanelTabelaAluno = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaAlunos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos");
        setResizable(false);

        jLabelCodigoAluno.setText("Código:");

        jLabelNumAluno.setText("Número:");

        jLabelNomeAluno.setText("Nome:");

        jLabelCursoAluno.setText("Curso:");

        jButtonSalvarAluno.setText("Salvar");
        jButtonSalvarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarAlunoActionPerformed(evt);
            }
        });

        jButtonAtualizarAluno.setText("Atualizar");
        jButtonAtualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarAlunoActionPerformed(evt);
            }
        });

        jButtonExcluirAluno.setText("Excluir");
        jButtonExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCrudAlunoLayout = new javax.swing.GroupLayout(jPanelCrudAluno);
        jPanelCrudAluno.setLayout(jPanelCrudAlunoLayout);
        jPanelCrudAlunoLayout.setHorizontalGroup(
            jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrudAlunoLayout.createSequentialGroup()
                .addGroup(jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCrudAlunoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabelCodigoAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCodAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNomeAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCrudAlunoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabelNumAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNumAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCursoAluno)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCrudAlunoLayout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jButtonSalvarAluno)
                        .addGap(7, 7, 7)
                        .addComponent(jButtonAtualizarAluno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluirAluno)))
                .addGap(43, 43, 43))
        );
        jPanelCrudAlunoLayout.setVerticalGroup(
            jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCrudAlunoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCrudAlunoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigoAluno)
                            .addComponent(jLabelNomeAluno))))
                .addGap(18, 18, 18)
                .addGroup(jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNumAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCrudAlunoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumAluno)
                            .addComponent(jLabelCursoAluno))))
                .addGap(21, 21, 21)
                .addGroup(jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvarAluno)
                    .addGroup(jPanelCrudAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAtualizarAluno)
                        .addComponent(jButtonExcluirAluno)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTableTabelaAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Número", "Curso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTabelaAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaAlunos);

        javax.swing.GroupLayout jPanelTabelaAlunoLayout = new javax.swing.GroupLayout(jPanelTabelaAluno);
        jPanelTabelaAluno.setLayout(jPanelTabelaAlunoLayout);
        jPanelTabelaAlunoLayout.setHorizontalGroup(
            jPanelTabelaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanelTabelaAlunoLayout.setVerticalGroup(
            jPanelTabelaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTabelaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCrudAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCrudAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabelaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarAlunoActionPerformed
        // TODO add your handling code here:
        
        Pessoa pessoa = new Pessoa();
        PessoaDao pesDao = new PessoaDao();
        Aluno aluno = new Aluno();
        AlunoDao aluDao = new AlunoDao();
        
        pessoa.setCodPessoa(Integer.parseInt(jTextFieldCodAluno.getText()));
        pessoa.setNomePessoa(jTextFieldNomeAluno.getText());      
        pesDao.create(pessoa);
        
        aluno.setCodPessoa(pessoa.getCodPessoa());
        aluno.setNumAluno(Integer.parseInt(jTextFieldNumAluno.getText()));
        aluno.setNomeCurso(jTextFieldCursoAluno.getText());
        aluDao.create(aluno);
        
        lerTabela();
        
        
        
//        DefaultTableModel dtmAlunos = (DefaultTableModel)jTableTabelaAlunos.getModel();
//        Object[] dados = {jTextFieldCodAluno.getText(),jTextFieldNomeAluno.getText(),
//                          jTextFieldNumAluno.getText(), jTextFieldCursoAluno.getText()};
//        dtmAlunos.addRow(dados);
        
     
    }//GEN-LAST:event_jButtonSalvarAlunoActionPerformed

    public void lerTabela(){
        DefaultTableModel modelo = (DefaultTableModel) jTableTabelaAlunos.getModel();
        modelo.setNumRows(0);
        AlunoDao adao = new AlunoDao();
       
     
        for (ArrayList a: adao.read2()){
            modelo.addRow(new Object[]{
            a.get(0),
            a.get(1),
            a.get(2),
            a.get(3)
            
        });
    }
    }
    
    private void jButtonExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirAlunoActionPerformed
        // TODO add your handling code here:
//        if (jTableTabelaAlunos.getSelectedRow() != -1){
//            DefaultTableModel dtmAlunos = (DefaultTableModel)jTableTabelaAlunos.getModel();
//            dtmAlunos.removeRow(jTableTabelaAlunos.getSelectedRow());           
//        }else{
//            JOptionPane.showMessageDialog(null, "Selecione um aluno");
//        }
        
         if (jTableTabelaAlunos.getSelectedRow() != -1){
           
            Pessoa pessoa = new Pessoa();
            PessoaDao pesDao = new PessoaDao();
            Aluno aluno = new Aluno();
            AlunoDao aluDao = new AlunoDao();

            pessoa.setCodPessoa(Integer.parseInt(jTextFieldCodAluno.getText()));
            pesDao.delete(pessoa);

            aluno.setCodPessoa(Integer.parseInt(jTextFieldCodAluno.getText()));
            aluDao.delete(aluno);
            
            lerTabela();
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um aluno");
        }
        
        
        lerTabela();
        
        
        
    }//GEN-LAST:event_jButtonExcluirAlunoActionPerformed

    private void jTableTabelaAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaAlunosMouseClicked
        // TODO add your handling code here:
        if (jTableTabelaAlunos.getSelectedRow() != -1){
            jTextFieldCodAluno.setText(jTableTabelaAlunos.getValueAt(jTableTabelaAlunos.getSelectedRow(), 0).toString());
            jTextFieldNomeAluno.setText(jTableTabelaAlunos.getValueAt(jTableTabelaAlunos.getSelectedRow(), 1).toString());
            jTextFieldNumAluno.setText(jTableTabelaAlunos.getValueAt(jTableTabelaAlunos.getSelectedRow(), 2).toString());
            jTextFieldCursoAluno.setText(jTableTabelaAlunos.getValueAt(jTableTabelaAlunos.getSelectedRow(), 3).toString());
            
        }
        
    }//GEN-LAST:event_jTableTabelaAlunosMouseClicked

    private void jButtonAtualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarAlunoActionPerformed
        // TODO add your handling code here:
        if (jTableTabelaAlunos.getSelectedRow() != -1){
            jTableTabelaAlunos.setValueAt(jTextFieldCodAluno.getText(), jTableTabelaAlunos.getSelectedRow(), 0);
            jTableTabelaAlunos.setValueAt(jTextFieldNomeAluno.getText(), jTableTabelaAlunos.getSelectedRow(), 1);
            jTableTabelaAlunos.setValueAt(jTextFieldNumAluno.getText(), jTableTabelaAlunos.getSelectedRow(), 2);
            jTableTabelaAlunos.setValueAt(jTextFieldCursoAluno.getText(), jTableTabelaAlunos.getSelectedRow(), 3);
        }
        
    }//GEN-LAST:event_jButtonAtualizarAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlunos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlunos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarAluno;
    private javax.swing.JButton jButtonExcluirAluno;
    private javax.swing.JButton jButtonSalvarAluno;
    private javax.swing.JLabel jLabelCodigoAluno;
    private javax.swing.JLabel jLabelCursoAluno;
    private javax.swing.JLabel jLabelNomeAluno;
    private javax.swing.JLabel jLabelNumAluno;
    private javax.swing.JPanel jPanelCrudAluno;
    private javax.swing.JPanel jPanelTabelaAluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaAlunos;
    private javax.swing.JTextField jTextFieldCodAluno;
    private javax.swing.JTextField jTextFieldCursoAluno;
    private javax.swing.JTextField jTextFieldNomeAluno;
    private javax.swing.JTextField jTextFieldNumAluno;
    // End of variables declaration//GEN-END:variables
}
