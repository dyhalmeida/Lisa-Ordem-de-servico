package lisa.Telas;

/**
 * @Importação bibliotecas.
 */
import javax.swing.JOptionPane;
import lisa.Modelo.beans.Bairro;
import lisa.Modelo.beans.MetodosComuns;
import lisa.Modelo.dao.BairroDao;

public class TelaPesquisaBairro extends javax.swing.JInternalFrame implements MetodosComuns {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_cancelarPesquisaBairro = new javax.swing.JButton();
        btn_editarPesquisaBairro = new javax.swing.JButton();
        btn_deletarPesquisaBairro = new javax.swing.JButton();
        btn_atualizarPesquisaBairro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_BairroPesquisa = new javax.swing.JTable();
        jt_PesquisaBairro_pesquisa = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jt_nomeBairroPesquisa = new javax.swing.JTextField();
        lbn_bairroPesquisa = new javax.swing.JLabel();
        jt_idBairroPesquisa = new javax.swing.JFormattedTextField();
        lb_id_bairroPesquisa = new javax.swing.JLabel();

        setIconifiable(true);
        setTitle("Pesquisa de Bairro");

        btn_cancelarPesquisaBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarPesquisaBairro.setText("Cancelar");
        btn_cancelarPesquisaBairro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarPesquisaBairro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarPesquisaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarPesquisaBairroActionPerformed(evt);
            }
        });

        btn_editarPesquisaBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/editar_img.png"))); // NOI18N
        btn_editarPesquisaBairro.setText("Editar");
        btn_editarPesquisaBairro.setEnabled(false);
        btn_editarPesquisaBairro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editarPesquisaBairro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editarPesquisaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarPesquisaBairroActionPerformed(evt);
            }
        });

        btn_deletarPesquisaBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/delete_img.png"))); // NOI18N
        btn_deletarPesquisaBairro.setText("Deletar");
        btn_deletarPesquisaBairro.setEnabled(false);
        btn_deletarPesquisaBairro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_deletarPesquisaBairro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_deletarPesquisaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarPesquisaBairroActionPerformed(evt);
            }
        });

        btn_atualizarPesquisaBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_atualizarPesquisaBairro.setText("Atualizar");
        btn_atualizarPesquisaBairro.setEnabled(false);
        btn_atualizarPesquisaBairro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_atualizarPesquisaBairro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_atualizarPesquisaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarPesquisaBairroActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jTable_BairroPesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTable_BairroPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "BAIRRO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_BairroPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BairroPesquisaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_BairroPesquisa);

        jt_PesquisaBairro_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_PesquisaBairro_pesquisaKeyReleased(evt);
            }
        });

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jt_PesquisaBairro_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_PesquisaBairro_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do bairro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jt_nomeBairroPesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_nomeBairroPesquisa.setEnabled(false);

        lbn_bairroPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_bairroPesquisa.setText("Bairro*");

        jt_idBairroPesquisa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jt_idBairroPesquisa.setEnabled(false);

        lb_id_bairroPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_id_bairroPesquisa.setText("ID*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_id_bairroPesquisa)
                .addGap(4, 4, 4)
                .addComponent(jt_idBairroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbn_bairroPesquisa)
                .addGap(9, 9, 9)
                .addComponent(jt_nomeBairroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_id_bairroPesquisa)
                    .addComponent(jt_idBairroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbn_bairroPesquisa)
                    .addComponent(jt_nomeBairroPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_cancelarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_atualizarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletarPesquisaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setBounds(60, 30, 515, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void jt_PesquisaBairro_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_PesquisaBairro_pesquisaKeyReleased
        // Action de pesquisa de bairro
        //Passando nome do bairro por parâmetro para pesquisa-lo
        pesquisarBairro(jt_PesquisaBairro_pesquisa.getText());
    }//GEN-LAST:event_jt_PesquisaBairro_pesquisaKeyReleased

    /**
     * Método p/ clique na linha da tabela.
     */
    private void jTable_BairroPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BairroPesquisaMouseClicked
        // Preencher formulário com clik do mouse
        try {
            //Ao clicar na linha da tabela é preenchido o formulario da interface
            preencherFormulario();

            jt_nomeBairroPesquisa.setEnabled(false);
            btn_editarPesquisaBairro.setEnabled(true);
            btn_deletarPesquisaBairro.setEnabled(true);
            btn_atualizarPesquisaBairro.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa do bairro!");
        }
    }//GEN-LAST:event_jTable_BairroPesquisaMouseClicked

    private void btn_editarPesquisaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarPesquisaBairroActionPerformed
        // Action para editar Bairro

        jt_PesquisaBairro_pesquisa.setEnabled(false);
        btn_editarPesquisaBairro.setEnabled(false);
        btn_deletarPesquisaBairro.setEnabled(false);
        btn_atualizarPesquisaBairro.setEnabled(true);
        jt_nomeBairroPesquisa.setEnabled(true);
    }//GEN-LAST:event_btn_editarPesquisaBairroActionPerformed

    private void btn_atualizarPesquisaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarPesquisaBairroActionPerformed
        // Action Atualizar Bairro

        btn_atualizarPesquisaBairro.setEnabled(false);
        jt_idBairroPesquisa.setEnabled(false);
        jt_nomeBairroPesquisa.setEnabled(false);
        jt_PesquisaBairro_pesquisa.setEnabled(true);
        updateBairro();
    }//GEN-LAST:event_btn_atualizarPesquisaBairroActionPerformed

    /**
     * @Evento para deletar bairro
     * @param evt
     */
    private void btn_deletarPesquisaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarPesquisaBairroActionPerformed
        // Action Deletar Bairro
        btn_deletarPesquisaBairro.setEnabled(false);
        btn_editarPesquisaBairro.setEnabled(false);

        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar " + jt_nomeBairroPesquisa.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (opc == JOptionPane.YES_OPTION) {
            deleteBairro();
            limparFormulario();
        }
    }//GEN-LAST:event_btn_deletarPesquisaBairroActionPerformed

    private void btn_cancelarPesquisaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarPesquisaBairroActionPerformed
        // Action fechar janela Pesquisa de bairro
        this.dispose();
    }//GEN-LAST:event_btn_cancelarPesquisaBairroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizarPesquisaBairro;
    private javax.swing.JButton btn_cancelarPesquisaBairro;
    private javax.swing.JButton btn_deletarPesquisaBairro;
    private javax.swing.JButton btn_editarPesquisaBairro;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_BairroPesquisa;
    private javax.swing.JTextField jt_PesquisaBairro_pesquisa;
    private javax.swing.JFormattedTextField jt_idBairroPesquisa;
    private javax.swing.JTextField jt_nomeBairroPesquisa;
    private javax.swing.JLabel lb_id_bairroPesquisa;
    private javax.swing.JLabel lbn_bairroPesquisa;
    // End of variables declaration//GEN-END:variables

    BairroDao bairroDao = new BairroDao();

    public TelaPesquisaBairro() {
        initComponents();
    }

    private void pesquisarBairro(String bairro) {

        bairroDao.pesquisarBairroFiltro(bairro);
    }

    @Override
    public void preencherFormulario() {
        int setar = jTable_BairroPesquisa.getSelectedRow();
        jt_idBairroPesquisa.setText(jTable_BairroPesquisa.getModel().getValueAt(setar, 0).toString());
        jt_nomeBairroPesquisa.setText(jTable_BairroPesquisa.getModel().getValueAt(setar, 1).toString());
    }

    @Override
    public void limparFormulario() {
        jt_PesquisaBairro_pesquisa.setText(null);
        jt_idBairroPesquisa.setText(null);
        jt_nomeBairroPesquisa.setText(null);
    }

    /**
     * @Método @DeleteBairro Este método tem a função de deletar um bairro.
     */
    private void deleteBairro() {

        Bairro bairro = new Bairro();
        bairro.setId(jt_idBairroPesquisa.getText());

        if (bairroDao.deletarBairro(bairro)) {
            JOptionPane.showMessageDialog(null, "Bairro deletado com sucesso!");
            limparFormulario();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este bairro!");
        }

    }

    /**
     * @Método @UpdateBairro Este método tem a função de atualizar um bairro.
     */
    private void updateBairro() {
        
        Bairro bairro = new Bairro();
        
        bairro.setId(jt_idBairroPesquisa.getText());
        bairro.setBairro(jt_nomeBairroPesquisa.getText());

        if (bairro.verificarCamposBairro()) {
            if (bairroDao.atualizarBairro(bairro)) {
                JOptionPane.showMessageDialog(null, "Bairro atualizado com sucesso!");
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(null, "Nã foi possível atualizar este bairro!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }

    }

}
