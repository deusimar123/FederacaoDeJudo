/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.DAO;
import controle.Delete;
import javax.swing.JOptionPane;

/**
 *
 * @author oziel
 */
public class InformacoesAcademia extends javax.swing.JFrame {
    private int id;
    /**
     * Creates new form InformaçõesAluno
     */
    public InformacoesAcademia() {
        initComponents();
        campoBairro.setEditable(false);
        campoCEP.setEditable(false);
        campoCidade.setEditable(false);
        campoEstado.setEditable(false);
        campoNome.setEditable(false);
        campoNumero.setEditable(false);
        campoRua.setEditable(false);
        salvar.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoEstado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoCEP = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("#####-###");
            campoCEP = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel4 = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 15)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 15)); // NOI18N
        jLabel2.setText("Estado");

        jLabel3.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 15)); // NOI18N
        jLabel3.setText("CEP");

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 15)); // NOI18N
        jLabel4.setText("Cidade");

        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 15)); // NOI18N
        jLabel5.setText("Bairro");

        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 15)); // NOI18N
        jLabel6.setText("Rua");

        jLabel7.setFont(new java.awt.Font("Bitstream Vera Sans Mono", 1, 15)); // NOI18N
        jLabel7.setText("Número");

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/error.png"))); // NOI18N
        delete.setText("Excluir");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/left-arrow.png"))); // NOI18N
        sair.setText("Voltar");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/edit.png"))); // NOI18N
        alterar.setText("Editar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/floppy-icon.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)
                        .addComponent(campoNome)
                        .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(campoEstado)
                        .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(campoNumero)
                    .addComponent(campoBairro)
                    .addComponent(jLabel3)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addGap(18, 18, 18)
                .addComponent(salvar)
                .addGap(18, 18, 18)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(alterar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete)
                    .addComponent(sair)
                    .addComponent(salvar)
                    .addComponent(alterar))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        if (JOptionPane.showConfirmDialog(null,"Deseja Realmente Excluir Esta Academia?")==JOptionPane.OK_OPTION){
            if(new Delete().deleteAcademia(getId()))
                JOptionPane.showMessageDialog(null, "Operação Realizada Com Sucesso!");
            else
                JOptionPane.showMessageDialog(null, "Erro na Operação!");
        }else{
            JOptionPane.showMessageDialog(null, "Operação Cancelada!");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        dispose();
        TelaInicial b = new TelaInicial();
        b.setTitle("Tela Inicial");
        b.setVisible(true);
        b.setLocationRelativeTo(null);
        b.setSize(1059, 608);
    }//GEN-LAST:event_sairActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        salvar.setEnabled(true);
        campoBairro.setEditable(true);
        campoCEP.setEditable(true);
        campoCidade.setEditable(true);
        campoEstado.setEditable(true);
        campoNome.setEditable(true);
        campoNumero.setEditable(true);
        campoRua.setEditable(true);

    }//GEN-LAST:event_alterarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed

        
    }//GEN-LAST:event_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(InformacoesAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesAcademia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InformacoesAcademia ia = new InformacoesAcademia();
                ia.setTitle("Academia");
                ia.setVisible(true);
                ia.setLocationRelativeTo(null);
                ia.setSize(1072, 658);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterar;
    public javax.swing.JTextField campoBairro;
    public javax.swing.JTextField campoCEP;
    public javax.swing.JTextField campoCidade;
    public javax.swing.JTextField campoEstado;
    public javax.swing.JTextField campoNome;
    public javax.swing.JTextField campoNumero;
    public javax.swing.JTextField campoRua;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
