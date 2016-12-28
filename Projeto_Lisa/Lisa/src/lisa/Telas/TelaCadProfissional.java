package lisa.Telas;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.dao.ProfissionalDao;
import lisa.Modelo.beans.Profissional;

public class TelaCadProfissional extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_id_profissionalCad = new javax.swing.JLabel();
        jt_nomeProfissionalCad = new javax.swing.JTextField();
        lbn_nome_profissionalCad = new javax.swing.JLabel();
        lbn_sobrenome_profissionalCad = new javax.swing.JLabel();
        jt_sobrenomeProfissionalCad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbn_foto_profissionalCad = new javax.swing.JLabel();
        lbn_titulo_profissional = new javax.swing.JLabel();
        lb_camposObrigatorioProfissional = new javax.swing.JLabel();
        btn_cancelarCadProfissional = new javax.swing.JButton();
        btn_cadastrarProfissional = new javax.swing.JButton();
        jt_idProfissionalCad = new javax.swing.JFormattedTextField();

        setIconifiable(true);
        setTitle("Cadastro de profissional");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_id_profissionalCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_id_profissionalCad.setText("ID*");
        getContentPane().add(lb_id_profissionalCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jt_nomeProfissionalCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_nomeProfissionalCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nomeProfissionalCadActionPerformed(evt);
            }
        });
        getContentPane().add(jt_nomeProfissionalCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, -1));

        lbn_nome_profissionalCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_nome_profissionalCad.setText("Nome*");
        getContentPane().add(lbn_nome_profissionalCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        lbn_sobrenome_profissionalCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_sobrenome_profissionalCad.setText("Sobrenome*");
        getContentPane().add(lbn_sobrenome_profissionalCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jt_sobrenomeProfissionalCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        getContentPane().add(jt_sobrenomeProfissionalCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 200, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 450, 10));

        lbn_foto_profissionalCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/empregado_img.png"))); // NOI18N
        getContentPane().add(lbn_foto_profissionalCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbn_titulo_profissional.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbn_titulo_profissional.setText("Cadastro de profissional");
        getContentPane().add(lbn_titulo_profissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        lb_camposObrigatorioProfissional.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        lb_camposObrigatorioProfissional.setText("* campos obrigatórios");
        getContentPane().add(lb_camposObrigatorioProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        btn_cancelarCadProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarCadProfissional.setText("Cancelar");
        btn_cancelarCadProfissional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarCadProfissional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarCadProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCadProfissionalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelarCadProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 90, 80));

        btn_cadastrarProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_cadastrarProfissional.setText("Cadastrar");
        btn_cadastrarProfissional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cadastrarProfissional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cadastrarProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarProfissionalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrarProfissional, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 90, 80));

        jt_idProfissionalCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jt_idProfissionalCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 25));

        setBounds(200, 10, 481, 384);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_nomeProfissionalCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nomeProfissionalCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nomeProfissionalCadActionPerformed

    private void btn_cancelarCadProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCadProfissionalActionPerformed
        // Cancelar cadastro de usuário
        this.dispose();
    }//GEN-LAST:event_btn_cancelarCadProfissionalActionPerformed

    private void btn_cadastrarProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarProfissionalActionPerformed
        // Cadastrar Usuário
        this.cadastrarProfissional();
    }//GEN-LAST:event_btn_cadastrarProfissionalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarProfissional;
    private javax.swing.JButton btn_cancelarCadProfissional;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField jt_idProfissionalCad;
    private javax.swing.JTextField jt_nomeProfissionalCad;
    private javax.swing.JTextField jt_sobrenomeProfissionalCad;
    private javax.swing.JLabel lb_camposObrigatorioProfissional;
    private javax.swing.JLabel lb_id_profissionalCad;
    private javax.swing.JLabel lbn_foto_profissionalCad;
    private javax.swing.JLabel lbn_nome_profissionalCad;
    private javax.swing.JLabel lbn_sobrenome_profissionalCad;
    private javax.swing.JLabel lbn_titulo_profissional;
    // End of variables declaration//GEN-END:variables

    public TelaCadProfissional() {
        initComponents();
    }

    public void cadastrarProfissional() {

        Profissional profissional = new Profissional();
        profissional.setId(this.jt_idProfissionalCad.getText());
        profissional.setNome(this.jt_nomeProfissionalCad.getText());
        profissional.setSobrenome(this.jt_sobrenomeProfissionalCad.getText());

        if (profissional.verificarCamposProfissional() == false) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        } else {

            ProfissionalDao profissionalDao = new ProfissionalDao();
            boolean verificarSeCadastrouProfissional = profissionalDao.cadastrarProfissional(profissional);

            if (verificarSeCadastrouProfissional) {

                JOptionPane.showMessageDialog(null, "Profissional cadastrado com sucesso!");
                limparCampos();

            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar este profissional!");
            }

        }
    }

    private void limparCampos() {
        jt_idProfissionalCad.setText(null);
        jt_nomeProfissionalCad.setText(null);
        jt_sobrenomeProfissionalCad.setText(null);
    }

}
