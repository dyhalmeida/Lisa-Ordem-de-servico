package lisa.Telas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.OrdemServico;
import lisa.Modelo.beans.Profissional;
import lisa.Modelo.beans.Usuario;
import lisa.Modelo.dao.ClienteDao;
import lisa.Modelo.dao.OrdemServicoDao;
import lisa.Modelo.dao.ProfissionalDao;
import lisa.Modelo.dao.UsuarioDao;
import net.proteanit.sql.DbUtils;

public class TelaCadOs extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_atendente_osCad = new javax.swing.JLabel();
        lb_equipamento_osCad = new javax.swing.JLabel();
        jc_profissionalOsCad = new javax.swing.JComboBox<>();
        lb_profissional_osCad = new javax.swing.JLabel();
        jt_dataEntrada_osCad = new javax.swing.JFormattedTextField();
        lb_dataEntrada_osCad = new javax.swing.JLabel();
        lb_defeito_osCad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_defeito_osCad = new javax.swing.JTextArea();
        lb_situacao_osCad = new javax.swing.JLabel();
        jc_situacaoOsCad = new javax.swing.JComboBox<>();
        lb_valor_osCad = new javax.swing.JLabel();
        jt_valorOsCad = new javax.swing.JFormattedTextField();
        jt_dataEntrega_osCad = new javax.swing.JFormattedTextField();
        lb_dataEntrega_osCad = new javax.swing.JLabel();
        btn_cancelarCadOs = new javax.swing.JButton();
        btn_cadastrarCadOs = new javax.swing.JButton();
        lb_iconOs = new javax.swing.JLabel();
        lbn_titulo_cadCliente = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jPanel = new javax.swing.JPanel();
        jt_pesquisaCliente_osCad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lb_idCliente_osCad = new javax.swing.JLabel();
        jt_idClienteOsCad = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_cliente_osCad = new javax.swing.JTable();
        jt_atendenteOsCad = new javax.swing.JTextField();
        lb_id_osCad1 = new javax.swing.JLabel();
        jt_idOsCad = new javax.swing.JFormattedTextField();
        lb_servico_osCad = new javax.swing.JLabel();
        jt_servico_osCad = new javax.swing.JTextField();
        lb_camposObrigatorioOsCad = new javax.swing.JLabel();
        jt_equipamento_osCad = new javax.swing.JTextField();

        setIconifiable(true);
        setTitle("Cadastro de Ordem de Serviço");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_atendente_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_atendente_osCad.setText("Atendente*");
        getContentPane().add(lb_atendente_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lb_equipamento_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_equipamento_osCad.setText("Equipamento*");
        getContentPane().add(lb_equipamento_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jc_profissionalOsCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        getContentPane().add(jc_profissionalOsCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, 25));

        lb_profissional_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_profissional_osCad.setText("Profissional*");
        getContentPane().add(lb_profissional_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        try {
            jt_dataEntrada_osCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jt_dataEntrada_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 341, 111, 25));

        lb_dataEntrada_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_dataEntrada_osCad.setText("Data de entrada*");
        getContentPane().add(lb_dataEntrada_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 318, -1, -1));

        lb_defeito_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_defeito_osCad.setText("Defeito/Observação");
        getContentPane().add(lb_defeito_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 377, -1, -1));

        jt_defeito_osCad.setColumns(20);
        jt_defeito_osCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jt_defeito_osCad.setLineWrap(true);
        jt_defeito_osCad.setRows(5);
        jScrollPane1.setViewportView(jt_defeito_osCad);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 405, 543, -1));

        lb_situacao_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_situacao_osCad.setText("Situação OS");
        getContentPane().add(lb_situacao_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jc_situacaoOsCad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Entregue", "Orçamento Reprovado", "Aguardando Peças", "Abandonado", "Na Bancada", "Retornou" }));
        jc_situacaoOsCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_situacaoOsCadActionPerformed(evt);
            }
        });
        getContentPane().add(jc_situacaoOsCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 341, 180, 25));

        lb_valor_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_valor_osCad.setText("Valor");
        getContentPane().add(lb_valor_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jt_valorOsCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jt_valorOsCad.setText("0,0");
        getContentPane().add(jt_valorOsCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 341, 100, 25));

        try {
            jt_dataEntrega_osCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jt_dataEntrega_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 111, 25));

        lb_dataEntrega_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_dataEntrega_osCad.setText("Data de entrega");
        getContentPane().add(lb_dataEntrega_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        btn_cancelarCadOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarCadOs.setText("Cancelar");
        btn_cancelarCadOs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarCadOs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCadOsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelarCadOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 405, 128, 91));

        btn_cadastrarCadOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_cadastrarCadOs.setText("Cadastrar");
        btn_cadastrarCadOs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cadastrarCadOs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cadastrarCadOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarCadOsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrarCadOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 405, 128, 91));

        lb_iconOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/os_img.png"))); // NOI18N
        getContentPane().add(lb_iconOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 11, -1, -1));

        lbn_titulo_cadCliente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbn_titulo_cadCliente.setText("Cadastro de Ordem de Serviço");
        getContentPane().add(lbn_titulo_cadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 25, -1, -1));
        getContentPane().add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 107, 830, 10));

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jt_pesquisaCliente_osCad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jt_pesquisaCliente_osCadKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisaCliente_img.png"))); // NOI18N

        lb_idCliente_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_idCliente_osCad.setText("ID Cliente*");

        jt_idClienteOsCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jt_idClienteOsCad.setEnabled(false);

        jtable_cliente_osCad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "SOBRENOME", "CPF", "NASC"
            }
        ));
        jtable_cliente_osCad.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jtable_cliente_osCad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtable_cliente_osCadMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtable_cliente_osCad);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(jt_pesquisaCliente_osCad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lb_idCliente_osCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_idClienteOsCad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jt_idClienteOsCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_idCliente_osCad))
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jt_pesquisaCliente_osCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 480, 190));

        jt_atendenteOsCad.setEnabled(false);
        getContentPane().add(jt_atendenteOsCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 25));

        lb_id_osCad1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_id_osCad1.setText("Nº OS*");
        getContentPane().add(lb_id_osCad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 123, -1, -1));

        jt_idOsCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jt_idOsCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 143, 50, 25));

        lb_servico_osCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_servico_osCad.setText("Serviço");
        getContentPane().add(lb_servico_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, -1, -1));
        getContentPane().add(jt_servico_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 220, 25));

        lb_camposObrigatorioOsCad.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        lb_camposObrigatorioOsCad.setText("* campos obrigatórios");
        getContentPane().add(lb_camposObrigatorioOsCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));
        getContentPane().add(jt_equipamento_osCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 340, 25));

        setBounds(0, 0, 884, 555);
    }// </editor-fold>//GEN-END:initComponents

    //Botões da janela Cad OS
    
    private void jt_pesquisaCliente_osCadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_pesquisaCliente_osCadKeyReleased
        // TODO add your handling code here:
        pesquisarCliente();
    }//GEN-LAST:event_jt_pesquisaCliente_osCadKeyReleased

    private void jtable_cliente_osCadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtable_cliente_osCadMouseClicked
        // TODO add your handling code here:
        setarIdCliente();
    }//GEN-LAST:event_jtable_cliente_osCadMouseClicked

    private void btn_cancelarCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCadOsActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarCadOsActionPerformed

    private void btn_cadastrarCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarCadOsActionPerformed
            cadastrarOrdemServico();
    }//GEN-LAST:event_btn_cadastrarCadOsActionPerformed

    private void jc_situacaoOsCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_situacaoOsCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_situacaoOsCadActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarCadOs;
    private javax.swing.JButton btn_cancelarCadOs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JComboBox<Object> jc_profissionalOsCad;
    private javax.swing.JComboBox<String> jc_situacaoOsCad;
    private javax.swing.JTextField jt_atendenteOsCad;
    private javax.swing.JFormattedTextField jt_dataEntrada_osCad;
    private javax.swing.JFormattedTextField jt_dataEntrega_osCad;
    private javax.swing.JTextArea jt_defeito_osCad;
    private javax.swing.JTextField jt_equipamento_osCad;
    private javax.swing.JFormattedTextField jt_idClienteOsCad;
    private javax.swing.JFormattedTextField jt_idOsCad;
    private javax.swing.JTextField jt_pesquisaCliente_osCad;
    private javax.swing.JTextField jt_servico_osCad;
    private javax.swing.JFormattedTextField jt_valorOsCad;
    private javax.swing.JTable jtable_cliente_osCad;
    private javax.swing.JLabel lb_atendente_osCad;
    private javax.swing.JLabel lb_camposObrigatorioOsCad;
    private javax.swing.JLabel lb_dataEntrada_osCad;
    private javax.swing.JLabel lb_dataEntrega_osCad;
    private javax.swing.JLabel lb_defeito_osCad;
    private javax.swing.JLabel lb_equipamento_osCad;
    private javax.swing.JLabel lb_iconOs;
    private javax.swing.JLabel lb_idCliente_osCad;
    private javax.swing.JLabel lb_id_osCad1;
    private javax.swing.JLabel lb_profissional_osCad;
    private javax.swing.JLabel lb_servico_osCad;
    private javax.swing.JLabel lb_situacao_osCad;
    private javax.swing.JLabel lb_valor_osCad;
    private javax.swing.JLabel lbn_titulo_cadCliente;
    // End of variables declaration//GEN-END:variables
    
    //Objeto clienteDao p/ manipulação do banco de dados
    ClienteDao clienteDao = new ClienteDao();

    //Construtor
    public TelaCadOs(String nomeUsuario) {
        initComponents();
        
        //Objeto profissionalDao p/ manipulação do banco de dados
        ProfissionalDao profissionalDao = new ProfissionalDao();

        //Pesquisa de profissional no banco e retornando lista de profissionais
        for (Profissional profissional : profissionalDao.pesquisarListaProfissional()) {
            jc_profissionalOsCad.addItem(profissional);
        }
        
        //Setando campo de atendente com o nome do usuário logado.
        jt_atendenteOsCad.setText(nomeUsuario);
        jc_profissionalOsCad.setSelectedItem(null);

    }

    /**
     * Método para cadastrar OS
     */
    public void cadastrarOrdemServico() {

        try {
            
            //Objeto profissional p/ receber iten do JcomboBox por cast
            Profissional profissional = (Profissional) jc_profissionalOsCad.getSelectedItem();

            OrdemServico oS = new OrdemServico();
            oS.setId(jt_idOsCad.getText());
            oS.setUsuario(jt_atendenteOsCad.getText());
            oS.setCliente(jt_idClienteOsCad.getText());
            
            //A linha abaixo pega o id do objeto profissional e seta no profissional do OS
            oS.setProfissional(profissional.getId());
            oS.setDataEntrada(jt_dataEntrada_osCad.getText());
            oS.setEquipamento(jt_equipamento_osCad.getText());
            oS.setDefeito(jt_defeito_osCad.getText());
            oS.setDataSaida(jt_dataEntrega_osCad.getText());
            oS.setValor(jt_valorOsCad.getText());
            oS.setSituacao(jc_situacaoOsCad.getSelectedItem().toString());
            oS.setServico(jt_servico_osCad.getText());

            if (oS.verificarCamposOs() == false) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {

                OrdemServicoDao osDao = new OrdemServicoDao();
                boolean verificarSeCadastrou = osDao.cadastrarOs(oS);

                if (verificarSeCadastrou) {
                    JOptionPane.showMessageDialog(null, "Ordem de serviço cadastrada com sucesso!");
                    limparFormulario();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar esta OS!");
                }
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Campo profissional sem cadastro!");
                //e.printStackTrace();
        }
    }

    public void pesquisarCliente() {

        Connection conexao = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        String sql = null;

        conexao = BancoDeDados.getConnection();
        sql = "select id_cliente ID, nome_cliente Nome, sobrenome_cliente Sobrenome, cpf_cliente CPF, nascimento_cliente Nascimento from tb_cliente where nome_cliente like ?";
        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, "%" + jt_pesquisaCliente_osCad.getText() + "%");

            rs = pstm.executeQuery();

            jtable_cliente_osCad.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            throw new RuntimeException("Erro pesquisar cliente OS: " + e.getMessage());
        } finally {
            BancoDeDados.fecharConnection(conexao, pstm, rs);
        }
    }

    /**
     * Método p/ setar id do cliente através do cliente selecionado na tabela
     */
    public void setarIdCliente() {
        int setar = jtable_cliente_osCad.getSelectedRow();
        jt_idClienteOsCad.setText(jtable_cliente_osCad.getModel().getValueAt(setar, 0).toString());
    }
    
    private void limparFormulario(){
        jt_idOsCad.setText(null);
        jt_pesquisaCliente_osCad.setText(null);
        jt_idClienteOsCad.setText(null);
        jc_profissionalOsCad.setSelectedItem(null);
        jt_equipamento_osCad.setText(null);
        jc_situacaoOsCad.setSelectedItem(null);
        jt_valorOsCad.setText(null);
        jt_dataEntrada_osCad.setText(null);
        jt_dataEntrega_osCad.setText(null);
        jt_servico_osCad.setText(null);
        jt_defeito_osCad.setText(null);
    }
}
