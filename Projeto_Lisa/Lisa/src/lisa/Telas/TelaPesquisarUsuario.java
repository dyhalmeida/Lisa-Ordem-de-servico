package lisa.Telas;

import javax.swing.JOptionPane;
import lisa.Modelo.beans.MetodosComuns;
import lisa.Modelo.beans.Usuario;
import lisa.Modelo.dao.UsuarioDao;

public class TelaPesquisarUsuario extends javax.swing.JInternalFrame implements MetodosComuns {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jt_PesquisaUsuario_pesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisarUsuario = new javax.swing.JTable();
        btn_cancelarPesquisaUsuario = new javax.swing.JButton();
        btn_atualizarPesquisaUsuario = new javax.swing.JButton();
        btn_editarPesquisaUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbIdUsuarioPesquisa = new javax.swing.JLabel();
        jt_idUsuario_pesquisa = new javax.swing.JFormattedTextField();
        lbNomeUsuarioPesquisa = new javax.swing.JLabel();
        jt_nomeUsuario_pesquisa = new javax.swing.JTextField();
        lbSobrenomeUsuarioPesquisa = new javax.swing.JLabel();
        jt_sobrenomeUsuario_pesquisa = new javax.swing.JTextField();
        lbLoginUsuarioPesquisa = new javax.swing.JLabel();
        jt_loginUsuario_pesquisa = new javax.swing.JTextField();
        lbSenhaUsuarioPesquisa = new javax.swing.JLabel();
        jt_senhaUsuario_pesquisa = new javax.swing.JTextField();
        btn_deletarPesquisaUsuario = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Pesquisar Usuário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jt_PesquisaUsuario_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_PesquisaUsuario_pesquisaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisaCliente_img.png"))); // NOI18N

        jTablePesquisarUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "SOBRENOME", "LOGIN", "Senha"
            }
        ));
        jTablePesquisarUsuario.setEnabled(false);
        jTablePesquisarUsuario.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTablePesquisarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisarUsuarioMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePesquisarUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jt_PesquisaUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_PesquisaUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cancelarPesquisaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarPesquisaUsuario.setText("Cancelar");
        btn_cancelarPesquisaUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarPesquisaUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoCancelar_btnCancelarPesquisaUsuario(evt);
            }
        });

        btn_atualizarPesquisaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_atualizarPesquisaUsuario.setText("Atualizar");
        btn_atualizarPesquisaUsuario.setEnabled(false);
        btn_atualizarPesquisaUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_atualizarPesquisaUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_atualizarPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoAtualizar_btnAtualizarPesquisaUsuario(evt);
            }
        });

        btn_editarPesquisaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/editar_img.png"))); // NOI18N
        btn_editarPesquisaUsuario.setText("Editar");
        btn_editarPesquisaUsuario.setEnabled(false);
        btn_editarPesquisaUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editarPesquisaUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editarPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoEditar_btnEditarPesquisaUsuario(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        lbIdUsuarioPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbIdUsuarioPesquisa.setText("ID*");

        jt_idUsuario_pesquisa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jt_idUsuario_pesquisa.setEnabled(false);

        lbNomeUsuarioPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNomeUsuarioPesquisa.setText("Nome*");

        jt_nomeUsuario_pesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_nomeUsuario_pesquisa.setEnabled(false);

        lbSobrenomeUsuarioPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSobrenomeUsuarioPesquisa.setText("Sobrenome*");

        jt_sobrenomeUsuario_pesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_sobrenomeUsuario_pesquisa.setEnabled(false);

        lbLoginUsuarioPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbLoginUsuarioPesquisa.setText("Login*");

        jt_loginUsuario_pesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_loginUsuario_pesquisa.setEnabled(false);

        lbSenhaUsuarioPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSenhaUsuarioPesquisa.setText("Senha*");

        jt_senhaUsuario_pesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_senhaUsuario_pesquisa.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIdUsuarioPesquisa)
                            .addComponent(jt_idUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeUsuarioPesquisa)
                            .addComponent(jt_nomeUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSobrenomeUsuarioPesquisa)
                            .addComponent(jt_sobrenomeUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_loginUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLoginUsuarioPesquisa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSenhaUsuarioPesquisa)
                            .addComponent(jt_senhaUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbIdUsuarioPesquisa)
                        .addGap(3, 3, 3)
                        .addComponent(jt_idUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbNomeUsuarioPesquisa)
                        .addGap(3, 3, 3)
                        .addComponent(jt_nomeUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbSobrenomeUsuarioPesquisa)
                        .addGap(3, 3, 3)
                        .addComponent(jt_sobrenomeUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLoginUsuarioPesquisa)
                    .addComponent(lbSenhaUsuarioPesquisa))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_loginUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_senhaUsuario_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_deletarPesquisaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/delete_img.png"))); // NOI18N
        btn_deletarPesquisaUsuario.setText("Deletar");
        btn_deletarPesquisaUsuario.setEnabled(false);
        btn_deletarPesquisaUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_deletarPesquisaUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_deletarPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarPesquisaUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btn_cancelarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_deletarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_atualizarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletarPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        setBounds(60, 30, 550, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_PesquisaUsuario_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_PesquisaUsuario_pesquisaKeyReleased
        // TODO add your handling code here:
        String textoPesquisa = jt_PesquisaUsuario_pesquisa.getText();
        //System.out.println(textoPesquisa);
        jTablePesquisarUsuario.setEnabled(true);
        uDao.pesquisarUsuarioFiltro(textoPesquisa);

    }//GEN-LAST:event_jt_PesquisaUsuario_pesquisaKeyReleased

    private void jTablePesquisarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarUsuarioMouseClicked
        // Action para preencher tabela com linha selecionada

        try {
            preencherFormulario();

            jt_nomeUsuario_pesquisa.setEnabled(false);
            jt_sobrenomeUsuario_pesquisa.setEnabled(false);
            jt_loginUsuario_pesquisa.setEnabled(false);
            jt_senhaUsuario_pesquisa.setEnabled(false);

            btn_editarPesquisaUsuario.setEnabled(true);
            btn_deletarPesquisaUsuario.setEnabled(true);
            btn_atualizarPesquisaUsuario.setEnabled(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa de usuário!");
        }
    }//GEN-LAST:event_jTablePesquisarUsuarioMouseClicked

    private void AcaoEditar_btnEditarPesquisaUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoEditar_btnEditarPesquisaUsuario
        // Action para botão editar Usuário
        btn_deletarPesquisaUsuario.setEnabled(false);
        btn_editarPesquisaUsuario.setEnabled(false);
        btn_atualizarPesquisaUsuario.setEnabled(true);
        jt_PesquisaUsuario_pesquisa.setEnabled(false);
        jt_nomeUsuario_pesquisa.setEnabled(true);
        jt_sobrenomeUsuario_pesquisa.setEnabled(true);
        jt_loginUsuario_pesquisa.setEnabled(true);
        jt_senhaUsuario_pesquisa.setEnabled(true);
    }//GEN-LAST:event_AcaoEditar_btnEditarPesquisaUsuario

    private void AcaoCancelar_btnCancelarPesquisaUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoCancelar_btnCancelarPesquisaUsuario
        // TODO add your handling code here:
        jt_PesquisaUsuario_pesquisa.setEnabled(true);
        jTablePesquisarUsuario.setEnabled(true);

        limparFormulario();
        this.dispose();
    }//GEN-LAST:event_AcaoCancelar_btnCancelarPesquisaUsuario

    private void AcaoAtualizar_btnAtualizarPesquisaUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoAtualizar_btnAtualizarPesquisaUsuario
        // TODO add your handling code here:
        updateUsuario();
        btn_atualizarPesquisaUsuario.setEnabled(false);
        jt_PesquisaUsuario_pesquisa.setEnabled(true);

        jt_nomeUsuario_pesquisa.setEnabled(false);
        jt_sobrenomeUsuario_pesquisa.setEnabled(false);
        jt_loginUsuario_pesquisa.setEnabled(false);
        jt_senhaUsuario_pesquisa.setEnabled(false);

    }//GEN-LAST:event_AcaoAtualizar_btnAtualizarPesquisaUsuario

    private void btn_deletarPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarPesquisaUsuarioActionPerformed
        // TODO add your handling code here:
        btn_editarPesquisaUsuario.setEnabled(false);
        btn_deletarPesquisaUsuario.setEnabled(false);
        jt_PesquisaUsuario_pesquisa.setEnabled(true);

        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que desejar deletar " + jt_nomeUsuario_pesquisa.getText() + " " + jt_sobrenomeUsuario_pesquisa.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (opc == JOptionPane.YES_OPTION) {
            deleteUsuario(jt_idUsuario_pesquisa.getText());
            limparFormulario();
        }
    }//GEN-LAST:event_btn_deletarPesquisaUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizarPesquisaUsuario;
    private javax.swing.JButton btn_cancelarPesquisaUsuario;
    private javax.swing.JButton btn_deletarPesquisaUsuario;
    private javax.swing.JButton btn_editarPesquisaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTablePesquisarUsuario;
    private javax.swing.JTextField jt_PesquisaUsuario_pesquisa;
    private javax.swing.JFormattedTextField jt_idUsuario_pesquisa;
    private javax.swing.JTextField jt_loginUsuario_pesquisa;
    private javax.swing.JTextField jt_nomeUsuario_pesquisa;
    private javax.swing.JTextField jt_senhaUsuario_pesquisa;
    private javax.swing.JTextField jt_sobrenomeUsuario_pesquisa;
    private javax.swing.JLabel lbIdUsuarioPesquisa;
    private javax.swing.JLabel lbLoginUsuarioPesquisa;
    private javax.swing.JLabel lbNomeUsuarioPesquisa;
    private javax.swing.JLabel lbSenhaUsuarioPesquisa;
    private javax.swing.JLabel lbSobrenomeUsuarioPesquisa;
    // End of variables declaration//GEN-END:variables

    UsuarioDao uDao = new UsuarioDao();

    public TelaPesquisarUsuario() {
        initComponents();
    }

    private void updateUsuario() {

        Usuario usuario = new Usuario();
        usuario.setId(jt_idUsuario_pesquisa.getText());
        usuario.setNome(jt_nomeUsuario_pesquisa.getText());
        usuario.setSobrenome(jt_sobrenomeUsuario_pesquisa.getText());
        usuario.setLogin(jt_loginUsuario_pesquisa.getText());
        usuario.setSenha(jt_senhaUsuario_pesquisa.getText());

        if (usuario.verificarCamposUsuario()) {
            if (uDao.atualizarUsuario(usuario)) {
                JOptionPane.showMessageDialog(null, "Dados do usuário alterado com sucesso!");
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível alterar os dados!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }

    private void deleteUsuario(String idUsuario) {

        Usuario usuario = new Usuario();
        usuario.setId(idUsuario);

        if (uDao.deletarUsuario(usuario) == false) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este usuário!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
            limparFormulario();
        }

    }

    @Override
    public void preencherFormulario() {
        int setar = jTablePesquisarUsuario.getSelectedRow();
        jt_idUsuario_pesquisa.setText(jTablePesquisarUsuario.getModel().getValueAt(setar, 0).toString());
        jt_nomeUsuario_pesquisa.setText(jTablePesquisarUsuario.getModel().getValueAt(setar, 1).toString());
        jt_sobrenomeUsuario_pesquisa.setText(jTablePesquisarUsuario.getModel().getValueAt(setar, 2).toString());
        jt_loginUsuario_pesquisa.setText(jTablePesquisarUsuario.getModel().getValueAt(setar, 3).toString());
        jt_senhaUsuario_pesquisa.setText(jTablePesquisarUsuario.getModel().getValueAt(setar, 4).toString());
    }

    @Override
    public void limparFormulario() {
        jt_PesquisaUsuario_pesquisa.setText(null);
        jt_idUsuario_pesquisa.setText(null);
        jt_nomeUsuario_pesquisa.setText(null);
        jt_sobrenomeUsuario_pesquisa.setText(null);
        jt_loginUsuario_pesquisa.setText(null);
        jt_senhaUsuario_pesquisa.setText(null);
    }

}
