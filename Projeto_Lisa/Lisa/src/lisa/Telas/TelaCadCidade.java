package lisa.Telas;

import javax.swing.JOptionPane;
import lisa.Modelo.beans.Bairro;
import lisa.Modelo.beans.Cidade;
import lisa.Modelo.dao.BairroDao;
import lisa.Modelo.dao.CidadeDao;

public class TelaCadCidade extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIconCidade = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbn_titulo_cidadeCad = new javax.swing.JLabel();
        lb_id_cidadeCad = new javax.swing.JLabel();
        jt_idCidadeCad = new javax.swing.JFormattedTextField();
        lbn_nome_cidadeCad = new javax.swing.JLabel();
        jt_nomeCidadeCad = new javax.swing.JTextField();
        lbn_estado_cidadeCad = new javax.swing.JLabel();
        lb_camposObrigatorioCidade = new javax.swing.JLabel();
        btn_cancelarCadCidade = new javax.swing.JButton();
        btn_cadastrarCidade = new javax.swing.JButton();
        jt_estadoCidadeCad = new javax.swing.JTextField();

        setIconifiable(true);
        setTitle("Cadastro de endereço");

        lbIconCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/bairro_img.png"))); // NOI18N

        lbn_titulo_cidadeCad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbn_titulo_cidadeCad.setText("Cadastro de cidades");

        lb_id_cidadeCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_id_cidadeCad.setText("ID*");

        jt_idCidadeCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbn_nome_cidadeCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_nome_cidadeCad.setText("Cidade*");

        jt_nomeCidadeCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        lbn_estado_cidadeCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_estado_cidadeCad.setText("Estado*");

        lb_camposObrigatorioCidade.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        lb_camposObrigatorioCidade.setText("* campos obrigatórios");

        btn_cancelarCadCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarCadCidade.setText("Cancelar");
        btn_cancelarCadCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarCadCidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarCadCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventClose_JanelaCadCliente(evt);
            }
        });

        btn_cadastrarCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_cadastrarCidade.setText("Cadastrar");
        btn_cadastrarCidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cadastrarCidade.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cadastrarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarCidadeActionPerformed(evt);
            }
        });

        jt_estadoCidadeCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_id_cidadeCad)
                                        .addGap(4, 4, 4)
                                        .addComponent(jt_idCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jt_nomeCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbn_nome_cidadeCad)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_cancelarCadCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cadastrarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbn_estado_cidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jt_estadoCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIconCidade)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(lb_camposObrigatorioCidade)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbn_titulo_cidadeCad)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbn_titulo_cidadeCad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_camposObrigatorioCidade)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIconCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_idCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_id_cidadeCad))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbn_nome_cidadeCad)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jt_nomeCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_estadoCidadeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbn_estado_cidadeCad)
                        .addGap(29, 29, 29)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cadastrarCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelarCadCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setBounds(200, 30, 340, 360);
    }// </editor-fold>//GEN-END:initComponents

    //Botões do Jframe
    
    private void eventClose_JanelaCadCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventClose_JanelaCadCliente
        // Fechar janela de cadastro de cidades
        this.dispose();
    }//GEN-LAST:event_eventClose_JanelaCadCliente

    private void btn_cadastrarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarCidadeActionPerformed
        // Chamando método cadastrar cidade
        cadastrarCidade();
    }//GEN-LAST:event_btn_cadastrarCidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarCidade;
    private javax.swing.JButton btn_cancelarCadCidade;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jt_estadoCidadeCad;
    private javax.swing.JFormattedTextField jt_idCidadeCad;
    private javax.swing.JTextField jt_nomeCidadeCad;
    private javax.swing.JLabel lbIconCidade;
    private javax.swing.JLabel lb_camposObrigatorioCidade;
    private javax.swing.JLabel lb_id_cidadeCad;
    private javax.swing.JLabel lbn_estado_cidadeCad;
    private javax.swing.JLabel lbn_nome_cidadeCad;
    private javax.swing.JLabel lbn_titulo_cidadeCad;
    // End of variables declaration//GEN-END:variables

    public TelaCadCidade() {
        initComponents();
    }

    /**
     * Método para cadastrar Cidade
     */
    public void cadastrarCidade() {

        Cidade cidade = new Cidade();
        cidade.setId(jt_idCidadeCad.getText());
        cidade.setNome(jt_nomeCidadeCad.getText());
        cidade.setEstado(jt_estadoCidadeCad.getText());

        if (cidade.verificarCamposCidade() == false) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        } else {

            CidadeDao cidadeDao = new CidadeDao();
                                    //Passando objeto cidade para método de cadastro de cidade no banco de dados.
            boolean verificarCadastroCidade = cidadeDao.cadastrarCidade(cidade);
            
            if (verificarCadastroCidade) {
                JOptionPane.showMessageDialog(null, "Cidade cadastrada com sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar esta cidade");
            }
        }
    }
    
    /**
     * Método p/ limpar campos da Janela
     */
    private void limparCampos() {
        jt_idCidadeCad.setText(null);
        jt_nomeCidadeCad.setText(null);
        jt_estadoCidadeCad.setText(null);
    }

}
