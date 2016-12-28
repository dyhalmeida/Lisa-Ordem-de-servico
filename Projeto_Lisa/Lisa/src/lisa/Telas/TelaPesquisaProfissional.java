package lisa.Telas;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import lisa.Modelo.beans.MetodosComuns;
import lisa.Modelo.beans.Profissional;
import lisa.Modelo.dao.ProfissionalDao;
import net.proteanit.sql.DbUtils;

public class TelaPesquisaProfissional extends javax.swing.JInternalFrame implements MetodosComuns {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lbIdProfissionalPesquisa = new javax.swing.JLabel();
        jt_IdProfissional_pesquisa = new javax.swing.JFormattedTextField();
        lbNomeProfissionalPesquisa = new javax.swing.JLabel();
        jt_NomeProfissional_pesquisa = new javax.swing.JTextField();
        lbSobrenomeProfissionalPesquisa = new javax.swing.JLabel();
        jt_SobrenomeProfissional_pesquisa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jt_PesquisaProfissional_pesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePesquisarProfissional = new javax.swing.JTable();
        btn_cancelarPesquisaProfissional = new javax.swing.JButton();
        btn_atualizarPesquisaProfissional = new javax.swing.JButton();
        btn_editarPesquisaProfissional = new javax.swing.JButton();
        btn_deletarPesquisaProfissional = new javax.swing.JButton();

        setIconifiable(true);
        setTitle("Tela Pesquisa de Profissional");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do profissional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        lbIdProfissionalPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbIdProfissionalPesquisa.setText("ID*");

        jt_IdProfissional_pesquisa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jt_IdProfissional_pesquisa.setEnabled(false);

        lbNomeProfissionalPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNomeProfissionalPesquisa.setText("Nome*");

        jt_NomeProfissional_pesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_NomeProfissional_pesquisa.setEnabled(false);

        lbSobrenomeProfissionalPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbSobrenomeProfissionalPesquisa.setText("Sobrenome*");

        jt_SobrenomeProfissional_pesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_SobrenomeProfissional_pesquisa.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdProfissionalPesquisa)
                    .addComponent(jt_IdProfissional_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNomeProfissionalPesquisa)
                    .addComponent(jt_NomeProfissional_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSobrenomeProfissionalPesquisa)
                    .addComponent(jt_SobrenomeProfissional_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbSobrenomeProfissionalPesquisa)
                        .addGap(3, 3, 3)
                        .addComponent(jt_SobrenomeProfissional_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomeProfissionalPesquisa)
                            .addComponent(lbIdProfissionalPesquisa))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_IdProfissional_pesquisa)
                            .addComponent(jt_NomeProfissional_pesquisa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Profissional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jt_PesquisaProfissional_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AcaoPesquisarProfissional_jt_PesquisaProfissional_pesquisa(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N

        jTablePesquisarProfissional.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "SOBRENOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePesquisarProfissional.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTablePesquisarProfissional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePesquisarProfissionalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTablePesquisarProfissional);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jt_PesquisaProfissional_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 297, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jt_PesquisaProfissional_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cancelarPesquisaProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarPesquisaProfissional.setText("Cancelar");
        btn_cancelarPesquisaProfissional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarPesquisaProfissional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarPesquisaProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarPesquisaProfissionalActionPerformed(evt);
            }
        });

        btn_atualizarPesquisaProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_atualizarPesquisaProfissional.setText("Atualizar");
        btn_atualizarPesquisaProfissional.setEnabled(false);
        btn_atualizarPesquisaProfissional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_atualizarPesquisaProfissional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_atualizarPesquisaProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarPesquisaProfissionalActionPerformed(evt);
            }
        });

        btn_editarPesquisaProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/editar_img.png"))); // NOI18N
        btn_editarPesquisaProfissional.setText("Editar");
        btn_editarPesquisaProfissional.setEnabled(false);
        btn_editarPesquisaProfissional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_editarPesquisaProfissional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_editarPesquisaProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarPesquisaProfissionalActionPerformed(evt);
            }
        });

        btn_deletarPesquisaProfissional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/delete_img.png"))); // NOI18N
        btn_deletarPesquisaProfissional.setText("Deletar");
        btn_deletarPesquisaProfissional.setEnabled(false);
        btn_deletarPesquisaProfissional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_deletarPesquisaProfissional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_deletarPesquisaProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletarPesquisaProfissionalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_cancelarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_atualizarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atualizarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletarPesquisaProfissional, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        setBounds(90, 30, 550, 495);
    }// </editor-fold>//GEN-END:initComponents

    //Método p/ pesquisar profissional pelo nome.
    private void AcaoPesquisarProfissional_jt_PesquisaProfissional_pesquisa(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AcaoPesquisarProfissional_jt_PesquisaProfissional_pesquisa

        String Profissional = jt_PesquisaProfissional_pesquisa.getText();
        pesquisarProfissional(Profissional);
    }//GEN-LAST:event_AcaoPesquisarProfissional_jt_PesquisaProfissional_pesquisa

    //Método p/ preencher campos da interface com a linha selecionada da tabela.
    private void jTablePesquisarProfissionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePesquisarProfissionalMouseClicked

        try {
            preencherFormulario();

            jt_NomeProfissional_pesquisa.setEnabled(false);
            jt_SobrenomeProfissional_pesquisa.setEnabled(false);
            btn_editarPesquisaProfissional.setEnabled(true);
            btn_deletarPesquisaProfissional.setEnabled(true);
            btn_atualizarPesquisaProfissional.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa do profissional!");
        }
    }//GEN-LAST:event_jTablePesquisarProfissionalMouseClicked

    private void btn_editarPesquisaProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarPesquisaProfissionalActionPerformed

        jt_PesquisaProfissional_pesquisa.setEnabled(false);
        btn_editarPesquisaProfissional.setEnabled(false);
        btn_deletarPesquisaProfissional.setEnabled(false);
        btn_atualizarPesquisaProfissional.setEnabled(true);
        jt_NomeProfissional_pesquisa.setEnabled(true);
        jt_SobrenomeProfissional_pesquisa.setEnabled(true);

    }//GEN-LAST:event_btn_editarPesquisaProfissionalActionPerformed

    private void btn_atualizarPesquisaProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarPesquisaProfissionalActionPerformed

        btn_atualizarPesquisaProfissional.setEnabled(false);
        jt_NomeProfissional_pesquisa.setEnabled(false);
        jt_SobrenomeProfissional_pesquisa.setEnabled(false);
        jt_PesquisaProfissional_pesquisa.setEnabled(true);
        updateProfissional();
    }//GEN-LAST:event_btn_atualizarPesquisaProfissionalActionPerformed

    private void btn_deletarPesquisaProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletarPesquisaProfissionalActionPerformed

        btn_deletarPesquisaProfissional.setEnabled(false);
        btn_editarPesquisaProfissional.setEnabled(false);

        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar " + jt_NomeProfissional_pesquisa.getText() + " " + jt_SobrenomeProfissional_pesquisa.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            deleteProfissional();
            limparFormulario();
        }
    }//GEN-LAST:event_btn_deletarPesquisaProfissionalActionPerformed

    private void btn_cancelarPesquisaProfissionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarPesquisaProfissionalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelarPesquisaProfissionalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizarPesquisaProfissional;
    private javax.swing.JButton btn_cancelarPesquisaProfissional;
    private javax.swing.JButton btn_deletarPesquisaProfissional;
    private javax.swing.JButton btn_editarPesquisaProfissional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTablePesquisarProfissional;
    private javax.swing.JFormattedTextField jt_IdProfissional_pesquisa;
    private javax.swing.JTextField jt_NomeProfissional_pesquisa;
    private javax.swing.JTextField jt_PesquisaProfissional_pesquisa;
    private javax.swing.JTextField jt_SobrenomeProfissional_pesquisa;
    private javax.swing.JLabel lbIdProfissionalPesquisa;
    private javax.swing.JLabel lbNomeProfissionalPesquisa;
    private javax.swing.JLabel lbSobrenomeProfissionalPesquisa;
    // End of variables declaration//GEN-END:variables

    private ProfissionalDao profissionalDao = new ProfissionalDao();

    public TelaPesquisaProfissional() {
        initComponents();
    }

    private void pesquisarProfissional(String profissional) {
       profissionalDao.pesquisarProfissionalFiltro(profissional, "TelaPesquisaProfissional");
    }

    private void updateProfissional() {

        Profissional profissional = new Profissional();
        profissional.setId(jt_IdProfissional_pesquisa.getText());
        profissional.setNome(jt_NomeProfissional_pesquisa.getText());
        profissional.setSobrenome(jt_SobrenomeProfissional_pesquisa.getText());

        if (profissional.verificarCamposProfissional()) {
            if (profissionalDao.atualizarProfissional(profissional)) {
                JOptionPane.showMessageDialog(null, "Profissional atualizado com sucesso!");
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar este Profissional!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }

    }

    private void deleteProfissional() {

        String id = jt_IdProfissional_pesquisa.getText();
        if (profissionalDao.deletarProfissional(id)) {
            JOptionPane.showMessageDialog(null, "Profissional deletado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este profissional!");
        }

    }

    @Override
    public void preencherFormulario() {
        int setar = jTablePesquisarProfissional.getSelectedRow();
        jt_IdProfissional_pesquisa.setText(jTablePesquisarProfissional.getModel().getValueAt(setar, 0).toString());
        jt_NomeProfissional_pesquisa.setText(jTablePesquisarProfissional.getModel().getValueAt(setar, 1).toString());
        jt_SobrenomeProfissional_pesquisa.setText(jTablePesquisarProfissional.getModel().getValueAt(setar, 2).toString());
    }

    @Override
    public void limparFormulario() {
        jt_PesquisaProfissional_pesquisa.setText(null);
        jt_IdProfissional_pesquisa.setText(null);
        jt_NomeProfissional_pesquisa.setText(null);
        jt_SobrenomeProfissional_pesquisa.setText(null);
    }

}
