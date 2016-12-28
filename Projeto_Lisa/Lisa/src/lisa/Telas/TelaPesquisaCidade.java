package lisa.Telas;

/**
 * @Importação bibliotecas.
 */
import javax.swing.JOptionPane;
import lisa.Modelo.beans.Cidade;
import lisa.Modelo.beans.MetodosComuns;
import lisa.Modelo.dao.CidadeDao;

/**
 * @Classe TelaPesquisaCidade Esta classe é uma interface gráfica com o usuário
 * que implementa métodos da Interface MetodosComuns
 * @author dyhalmeida
 */
public class TelaPesquisaCidade extends javax.swing.JInternalFrame implements MetodosComuns {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_CidadePesquisa = new javax.swing.JTable();
        jt_PesquisaCidade_pesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jt_idCidadePesquida = new javax.swing.JFormattedTextField();
        lbn_nome_cidadePesquisa = new javax.swing.JLabel();
        jt_nomeCidadePesquisa = new javax.swing.JTextField();
        lbn_estado_cidadePesquisa = new javax.swing.JLabel();
        jt_estadoCidadePesquisa = new javax.swing.JTextField();
        lb_id_cidadePesquisa = new javax.swing.JLabel();
        btn_cancelarPesquisaCidade = new javax.swing.JButton();
        btn_editarPesquisaCidade = new javax.swing.JButton();
        btn_deletarPesquisaCidade = new javax.swing.JButton();
        btn_atualizarPesquisaCidade = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Psquisa de Cidade");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jTable_CidadePesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jTable_CidadePesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "CIDADE", "ESTADO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_CidadePesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_CidadePesquisaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_CidadePesquisa);

        jt_PesquisaCidade_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_PesquisaCidade_pesquisaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jt_PesquisaCidade_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_PesquisaCidade_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Cidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jt_idCidadePesquida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jt_idCidadePesquida.setEnabled(false);

        lbn_nome_cidadePesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_nome_cidadePesquisa.setText("Cidade*");

        jt_nomeCidadePesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_nomeCidadePesquisa.setEnabled(false);

        lbn_estado_cidadePesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_estado_cidadePesquisa.setText("Estado*");

        jt_estadoCidadePesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_estadoCidadePesquisa.setEnabled(false);

        lb_id_cidadePesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_id_cidadePesquisa.setText("ID*");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lb_id_cidadePesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jt_idCidadePesquida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_nomeCidadePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbn_nome_cidadePesquisa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbn_estado_cidadePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_estadoCidadePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_idCidadePesquida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_id_cidadePesquisa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbn_estado_cidadePesquisa)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbn_nome_cidadePesquisa)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_nomeCidadePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_estadoCidadePesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        btn_cancelarPesquisaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarPesquisaCidade.setText("Cancelar");
        btn_cancelarPesquisaCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarPesquisaCidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarPesquisaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarPesquisaCidadeActionPerformed(evt);
            }
        });

        btn_editarPesquisaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/editar_img.png"))); // NOI18N
        btn_editarPesquisaCidade.setText("Editar");
        btn_editarPesquisaCidade.setEnabled(false);
        btn_editarPesquisaCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editarPesquisaCidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editarPesquisaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarPesquisaCidadeActionPerformed(evt);
            }
        });

        btn_deletarPesquisaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/delete_img.png"))); // NOI18N
        btn_deletarPesquisaCidade.setText("Deletar");
        btn_deletarPesquisaCidade.setEnabled(false);
        btn_deletarPesquisaCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_deletarPesquisaCidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_deletarPesquisaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarPesquisaCidadeActionPerformed(evt);
            }
        });

        btn_atualizarPesquisaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_atualizarPesquisaCidade.setText("Atualizar");
        btn_atualizarPesquisaCidade.setEnabled(false);
        btn_atualizarPesquisaCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_atualizarPesquisaCidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_atualizarPesquisaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarPesquisaCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_atualizarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletarPesquisaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setBounds(200, 30, 512, 500);
    }// </editor-fold>//GEN-END:initComponents

    //Método clique na linha da tabela
    private void jTable_CidadePesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_CidadePesquisaMouseClicked
        // Action de clique numa linha da tabela
        try {
            preencherFormulario();
            jt_PesquisaCidade_pesquisa.setEnabled(false);
            btn_editarPesquisaCidade.setEnabled(true);
            btn_deletarPesquisaCidade.setEnabled(true);
            btn_atualizarPesquisaCidade.setEnabled(false);
            jt_nomeCidadePesquisa.setEnabled(false);
            jt_estadoCidadePesquisa.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa da cidade!");
        }
    }//GEN-LAST:event_jTable_CidadePesquisaMouseClicked

    private void btn_editarPesquisaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarPesquisaCidadeActionPerformed
        // Action para editar cidade
        jt_PesquisaCidade_pesquisa.setEnabled(false);
        btn_editarPesquisaCidade.setEnabled(false);
        btn_deletarPesquisaCidade.setEnabled(false);
        jt_nomeCidadePesquisa.setEnabled(true);
        jt_estadoCidadePesquisa.setEnabled(true);
        btn_atualizarPesquisaCidade.setEnabled(true);
    }//GEN-LAST:event_btn_editarPesquisaCidadeActionPerformed

    private void btn_atualizarPesquisaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarPesquisaCidadeActionPerformed
        // Action para atualizar cidade
        btn_atualizarPesquisaCidade.setEnabled(false);
        jt_nomeCidadePesquisa.setEnabled(false);
        jt_estadoCidadePesquisa.setEnabled(false);
        jt_PesquisaCidade_pesquisa.setEnabled(true);
        updateCidade();
    }//GEN-LAST:event_btn_atualizarPesquisaCidadeActionPerformed

    private void btn_deletarPesquisaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarPesquisaCidadeActionPerformed
        // Action para deletar uma cidade
        btn_deletarPesquisaCidade.setEnabled(false);
        btn_editarPesquisaCidade.setEnabled(false);
        jt_PesquisaCidade_pesquisa.setEnabled(true);

        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que desejar deletar " + jt_nomeCidadePesquisa.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (opc == JOptionPane.YES_OPTION) {
            deleteCidade(jt_idCidadePesquida.getText());
        }
    }//GEN-LAST:event_btn_deletarPesquisaCidadeActionPerformed

    private void btn_cancelarPesquisaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarPesquisaCidadeActionPerformed
        // Action para fechar janela de pesquisa de cidade
        dispose();
    }//GEN-LAST:event_btn_cancelarPesquisaCidadeActionPerformed

    //Método para pesquisar por letra digitada
    private void jt_PesquisaCidade_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_PesquisaCidade_pesquisaKeyReleased
        // Action para pesquisar cidade ao digitar
        pesquisarCidade(jt_PesquisaCidade_pesquisa.getText());
    }//GEN-LAST:event_jt_PesquisaCidade_pesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizarPesquisaCidade;
    private javax.swing.JButton btn_cancelarPesquisaCidade;
    private javax.swing.JButton btn_deletarPesquisaCidade;
    private javax.swing.JButton btn_editarPesquisaCidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable_CidadePesquisa;
    private javax.swing.JTextField jt_PesquisaCidade_pesquisa;
    private javax.swing.JTextField jt_estadoCidadePesquisa;
    private javax.swing.JFormattedTextField jt_idCidadePesquida;
    private javax.swing.JTextField jt_nomeCidadePesquisa;
    private javax.swing.JLabel lb_id_cidadePesquisa;
    private javax.swing.JLabel lbn_estado_cidadePesquisa;
    private javax.swing.JLabel lbn_nome_cidadePesquisa;
    // End of variables declaration//GEN-END:variables

    CidadeDao cidadeDao = new CidadeDao();

    /**
     * @Construtor TelaPesquisaCidade
     */
    public TelaPesquisaCidade() {
        initComponents();
    }

    /**
     * @Método @PesquisarCidade Este método é responsável por passar as
     * informações necessárias para a pesquisa de uma cidade no banco de dados.
     * @param nomeCidade é um objeto do tipo String
     */
    private void pesquisarCidade(String nomeCidade) {
        Cidade cidade = new Cidade();
        cidade.setNome(nomeCidade);

        cidadeDao.pesquisarCidadeFiltro(cidade);
    }

    /**
     * @Método @DeleteCidade Esté método é responsável por passar as informações
     * necessárias para a exclusão de uma cidade no banco de dados.
     * @param idCidade é um objeto do tipo String.
     */
    private void deleteCidade(String idCidade) {
        Cidade cidade = new Cidade();
        cidade.setId(idCidade);

        if (cidadeDao.deletarCidade(cidade) == false) {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar esta cidade!");
        } else {
            JOptionPane.showMessageDialog(null, "Cidade deletada com sucesso!");
            limparFormulario();
        }

    }

    /**
     * @Método @UpdateCidade Este método tem a função de passar todas a
     * informações de um objeto cidade para a atualização do mesmo no banco de
     * dados.
     */
    private void updateCidade() {
        Cidade cidade = new Cidade();
        cidade.setId(jt_idCidadePesquida.getText());
        cidade.setNome(jt_nomeCidadePesquisa.getText());
        cidade.setEstado(jt_estadoCidadePesquisa.getText());

        if (cidade.verificarCamposCidade()) {
            if (cidadeDao.atualizarCidade(cidade)) {
                JOptionPane.showMessageDialog(null, "Cidade atualizada com sucesso!");
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar esta cidade!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
    }

    @Override
    public void preencherFormulario() {
        int setar = jTable_CidadePesquisa.getSelectedRow();
        jt_idCidadePesquida.setText(jTable_CidadePesquisa.getModel().getValueAt(setar, 0).toString());
        jt_nomeCidadePesquisa.setText(jTable_CidadePesquisa.getModel().getValueAt(setar, 1).toString());
        jt_estadoCidadePesquisa.setText(jTable_CidadePesquisa.getModel().getValueAt(setar, 2).toString());
    }

    @Override
    public void limparFormulario() {
        jt_idCidadePesquida.setText(null);
        jt_nomeCidadePesquisa.setText(null);
        jt_estadoCidadePesquisa.setText(null);
        jt_PesquisaCidade_pesquisa.setText(null);
    }
}
