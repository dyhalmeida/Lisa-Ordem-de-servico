package lisa.Telas;

import javax.swing.JOptionPane;
import lisa.Modelo.beans.Cliente;
import lisa.Modelo.beans.MetodosComuns;
import lisa.Modelo.beans.OrdemServico;
import lisa.Modelo.beans.Profissional;
import lisa.Modelo.dao.ClienteDao;
import lisa.Modelo.dao.OrdemServicoDao;
import lisa.Modelo.dao.ProfissionalDao;
import lisa.Relatorio.dao.Relatorio;

public class TelaPesquisaOS extends javax.swing.JInternalFrame implements MetodosComuns {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LB_AtendentePesquisaOS = new javax.swing.JLabel();
        LB_equipamentoPesquisaOS = new javax.swing.JLabel();
        LB_profissionalPesquisaOS = new javax.swing.JLabel();
        LB_dataEntradaPesquisaOS = new javax.swing.JLabel();
        LB_defeitoPesquisaOS = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTF_defeitoPesquisaOs = new javax.swing.JTextArea();
        LB_situacaoPesquisaOS = new javax.swing.JLabel();
        JCB_situacaoPesquisaOs = new javax.swing.JComboBox<>();
        LB_valorPesquisaOS = new javax.swing.JLabel();
        JTF_valorPesquisaOs = new javax.swing.JFormattedTextField();
        JTF_dataEntregaPesquisaOs = new javax.swing.JFormattedTextField();
        LB_dataEntregaPesquisaOS = new javax.swing.JLabel();
        JTF_profissionalPesquisaOs = new javax.swing.JTextField();
        LB_idPesquisaOS = new javax.swing.JLabel();
        JTF_idPesquisaOs = new javax.swing.JFormattedTextField();
        LB_servicoPesquisaOS = new javax.swing.JLabel();
        JTF_servicoPesquisaOs = new javax.swing.JTextField();
        JTF_equipamentoPesquisaOs = new javax.swing.JTextField();
        LB_clientePesquisaOS = new javax.swing.JLabel();
        JTF_clientePesquisaOs = new javax.swing.JTextField();
        JP_painel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_tabelaPesquisaOS = new javax.swing.JTable();
        LB_iconPesquisaOS = new javax.swing.JLabel();
        JTF_campoPesquisaOS = new javax.swing.JFormattedTextField();
        LB_cpfCliente = new javax.swing.JLabel();
        BTN_editarPesquisaOS = new javax.swing.JButton();
        BTN_deletarPesquisaOS = new javax.swing.JButton();
        BTN_imprimirOS = new javax.swing.JButton();
        BTN_cancelarPesquisaOS = new javax.swing.JButton();
        BTN_preencherClientePesquisaOS = new javax.swing.JButton();
        BTN_preencherAtendentePesquisaOS = new javax.swing.JButton();
        JTF_dataEntradaPesquisaOs = new javax.swing.JFormattedTextField();
        JTF_atendentePesquisaOs = new javax.swing.JTextField();
        BTN_atualizarPesquisaOS = new javax.swing.JButton();

        setTitle("Pesquisa de Ordem de Serviços");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LB_AtendentePesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_AtendentePesquisaOS.setText("Atendente*");
        getContentPane().add(LB_AtendentePesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        LB_equipamentoPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_equipamentoPesquisaOS.setText("Equipamento*");
        getContentPane().add(LB_equipamentoPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        LB_profissionalPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_profissionalPesquisaOS.setText("Profissional");
        getContentPane().add(LB_profissionalPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 80, -1));

        LB_dataEntradaPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_dataEntradaPesquisaOS.setText("Data de entrada*");
        getContentPane().add(LB_dataEntradaPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        LB_defeitoPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_defeitoPesquisaOS.setText("Defeito/Observação");
        getContentPane().add(LB_defeitoPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        JTF_defeitoPesquisaOs.setColumns(20);
        JTF_defeitoPesquisaOs.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JTF_defeitoPesquisaOs.setLineWrap(true);
        JTF_defeitoPesquisaOs.setRows(5);
        JTF_defeitoPesquisaOs.setEnabled(false);
        jScrollPane1.setViewportView(JTF_defeitoPesquisaOs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 470, -1));

        LB_situacaoPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_situacaoPesquisaOS.setText("Situação OS");
        getContentPane().add(LB_situacaoPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        JCB_situacaoPesquisaOs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Entregue", "Orçamento Reprovado", "Aguardando Peças", "Abandonado", "Na Bancada", "Retornou" }));
        JCB_situacaoPesquisaOs.setEnabled(false);
        getContentPane().add(JCB_situacaoPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 210, 27));

        LB_valorPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_valorPesquisaOS.setText("Valor");
        getContentPane().add(LB_valorPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        JTF_valorPesquisaOs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        JTF_valorPesquisaOs.setText("0,0");
        JTF_valorPesquisaOs.setEnabled(false);
        getContentPane().add(JTF_valorPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 100, 25));

        try {
            JTF_dataEntregaPesquisaOs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTF_dataEntregaPesquisaOs.setEnabled(false);
        getContentPane().add(JTF_dataEntregaPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 111, 25));

        LB_dataEntregaPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_dataEntregaPesquisaOS.setText("Data de entrega");
        getContentPane().add(LB_dataEntregaPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        JTF_profissionalPesquisaOs.setEnabled(false);
        getContentPane().add(JTF_profissionalPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 170, 25));

        LB_idPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_idPesquisaOS.setText("Nº OS*");
        getContentPane().add(LB_idPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        JTF_idPesquisaOs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        JTF_idPesquisaOs.setEnabled(false);
        getContentPane().add(JTF_idPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 50, 25));

        LB_servicoPesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_servicoPesquisaOS.setText("Serviço");
        getContentPane().add(LB_servicoPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        JTF_servicoPesquisaOs.setEnabled(false);
        getContentPane().add(JTF_servicoPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 220, 25));

        JTF_equipamentoPesquisaOs.setEnabled(false);
        getContentPane().add(JTF_equipamentoPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 244, 25));

        LB_clientePesquisaOS.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LB_clientePesquisaOS.setText("Cliente*");
        getContentPane().add(LB_clientePesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        JTF_clientePesquisaOs.setEnabled(false);
        getContentPane().add(JTF_clientePesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 150, 25));

        JP_painel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa de Ordem de Serviços", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        JT_tabelaPesquisaOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "OS", "ATENDENTE", "PROFISSIONAL", "CLIENTE", "CPF", "EQUIPAMENTO", "SERVIÇO", "VALOR", "ENTRADA", "ENTREGA", "SITUAÇÃO", "DEFEITO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JT_tabelaPesquisaOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventoCliqueNaTabela(evt);
            }
        });
        jScrollPane2.setViewportView(JT_tabelaPesquisaOS);

        LB_iconPesquisaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N

        try {
            JTF_campoPesquisaOS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTF_campoPesquisaOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EventoPesquisarOS(evt);
            }
        });

        LB_cpfCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LB_cpfCliente.setText("CPF Cliente");

        javax.swing.GroupLayout JP_painelLayout = new javax.swing.GroupLayout(JP_painel);
        JP_painel.setLayout(JP_painelLayout);
        JP_painelLayout.setHorizontalGroup(
            JP_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                    .addGroup(JP_painelLayout.createSequentialGroup()
                        .addComponent(LB_cpfCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTF_campoPesquisaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LB_iconPesquisaOS)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JP_painelLayout.setVerticalGroup(
            JP_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LB_iconPesquisaOS)
                    .addGroup(JP_painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTF_campoPesquisaOS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LB_cpfCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        getContentPane().add(JP_painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 840, 170));

        BTN_editarPesquisaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/editar_img.png"))); // NOI18N
        BTN_editarPesquisaOS.setText("Editar");
        BTN_editarPesquisaOS.setEnabled(false);
        BTN_editarPesquisaOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_editarPesquisaOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_editarPesquisaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoEditarOS(evt);
            }
        });
        getContentPane().add(BTN_editarPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        BTN_deletarPesquisaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/delete_img.png"))); // NOI18N
        BTN_deletarPesquisaOS.setText("Deletar");
        BTN_deletarPesquisaOS.setEnabled(false);
        BTN_deletarPesquisaOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_deletarPesquisaOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_deletarPesquisaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoDeletarOS(evt);
            }
        });
        getContentPane().add(BTN_deletarPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        BTN_imprimirOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/print_img.png"))); // NOI18N
        BTN_imprimirOS.setText("Imprimir OS");
        BTN_imprimirOS.setEnabled(false);
        BTN_imprimirOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_imprimirOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_imprimirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirOS(evt);
            }
        });
        getContentPane().add(BTN_imprimirOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        BTN_cancelarPesquisaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        BTN_cancelarPesquisaOS.setText("Cancelar");
        BTN_cancelarPesquisaOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_cancelarPesquisaOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_cancelarPesquisaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoFecharPesquisarOS(evt);
            }
        });
        getContentPane().add(BTN_cancelarPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        BTN_preencherClientePesquisaOS.setText("...");
        BTN_preencherClientePesquisaOS.setEnabled(false);
        BTN_preencherClientePesquisaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoGetCliente(evt);
            }
        });
        getContentPane().add(BTN_preencherClientePesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 30, -1));

        BTN_preencherAtendentePesquisaOS.setText("...");
        BTN_preencherAtendentePesquisaOS.setEnabled(false);
        BTN_preencherAtendentePesquisaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoGetProfissional(evt);
            }
        });
        getContentPane().add(BTN_preencherAtendentePesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 30, -1));

        try {
            JTF_dataEntradaPesquisaOs.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTF_dataEntradaPesquisaOs.setEnabled(false);
        getContentPane().add(JTF_dataEntradaPesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 111, 25));

        JTF_atendentePesquisaOs.setEnabled(false);
        getContentPane().add(JTF_atendentePesquisaOs, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 140, 25));

        BTN_atualizarPesquisaOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        BTN_atualizarPesquisaOS.setText("Atualizar");
        BTN_atualizarPesquisaOS.setEnabled(false);
        BTN_atualizarPesquisaOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_atualizarPesquisaOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_atualizarPesquisaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_atualizarPesquisaOSEventoAtualizarOS(evt);
            }
        });
        getContentPane().add(BTN_atualizarPesquisaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, -1));

        setBounds(0, 0, 884, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void EventoPesquisarOS(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventoPesquisarOS
        // Action p/pesquisar ordem de serviço
        pesquisarOrdemDeServico(JTF_campoPesquisaOS.getText());
    }//GEN-LAST:event_EventoPesquisarOS

    private void EventoFecharPesquisarOS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoFecharPesquisarOS
        // Action p/ fechar janela de pesquisa OS
        dispose();
    }//GEN-LAST:event_EventoFecharPesquisarOS

    //Método clique na linha da tabela
    private void EventoCliqueNaTabela(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventoCliqueNaTabela
        // Action p/ pegar informações da tabela e preencher formulário
        try {
            preencherFormulario();
            logicaCliqueTable(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa da Ordem de serviço");
        }
    }//GEN-LAST:event_EventoCliqueNaTabela

    private void EventoEditarOS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoEditarOS
        // Action p/ editar formulário
        logicaBtnEditar(true);
    }//GEN-LAST:event_EventoEditarOS

    private void EventoDeletarOS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoDeletarOS
        // Action p/ deletar uma OS
        logicaBtnDeletar(true);
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar a OS Nº: " + JTF_idPesquisaOs.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            deletarOs(JTF_idPesquisaOs.getText());
        }
    }//GEN-LAST:event_EventoDeletarOS
    //Método p/ pegar um profissional selecionado em outra janela
    private void eventoGetProfissional(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoGetProfissional
        // Evento p/ pegar id do profissional
        //Janela profissional visivel
        jProfissional.setVisible(true);
        if (jProfissional.isFechouJanela()) {
            profissional = jProfissional.getProfissional();
            if (!profissional.getNome().equalsIgnoreCase(JTF_profissionalPesquisaOs.getText())) {
                JTF_profissionalPesquisaOs.setText(profissional.getNome() + " " + profissional.getSobrenome());
            }
        }
    }//GEN-LAST:event_eventoGetProfissional
    
    //Método p/ pegar um cliente selecionado em outra janela.
    private void EventoGetCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoGetCliente
        // Evento p/ pegar id do cliente
        
        //Janela cliente visivel
        jCliente.setVisible(true);
        if (jCliente.isFechouJanela()) {
            cliente = jCliente.getCliente();
            if (!cliente.getNome().equalsIgnoreCase(JTF_clientePesquisaOs.getText())) {
                JTF_clientePesquisaOs.setText(cliente.getNome() + " " + cliente.getSobrenome());
            }
        }
    }//GEN-LAST:event_EventoGetCliente

    private void BTN_atualizarPesquisaOSEventoAtualizarOS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_atualizarPesquisaOSEventoAtualizarOS
        // Action p/ atualizar OS
        logicaBtnAtualizar(true);
        int opc = JOptionPane.showConfirmDialog(null, "Confirma a atualização dessa OS?", "Atenção", JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            atualizarOs();
        }
    }//GEN-LAST:event_BTN_atualizarPesquisaOSEventoAtualizarOS

    private void imprimirOS(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirOS
        // imprimir rel da OS
        int opc = JOptionPane.showConfirmDialog(null,"Deseja imprimir o relátorio dessa OS?", "Atenção",JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            Relatorio rel = new Relatorio();
            rel.relatorioOS(JTF_idPesquisaOs.getText());
        }
    }//GEN-LAST:event_imprimirOS

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_atualizarPesquisaOS;
    private javax.swing.JButton BTN_cancelarPesquisaOS;
    private javax.swing.JButton BTN_deletarPesquisaOS;
    private javax.swing.JButton BTN_editarPesquisaOS;
    private javax.swing.JButton BTN_imprimirOS;
    private javax.swing.JButton BTN_preencherAtendentePesquisaOS;
    private javax.swing.JButton BTN_preencherClientePesquisaOS;
    private javax.swing.JComboBox<String> JCB_situacaoPesquisaOs;
    private javax.swing.JPanel JP_painel;
    private javax.swing.JTextField JTF_atendentePesquisaOs;
    private javax.swing.JFormattedTextField JTF_campoPesquisaOS;
    private javax.swing.JTextField JTF_clientePesquisaOs;
    private javax.swing.JFormattedTextField JTF_dataEntradaPesquisaOs;
    private javax.swing.JFormattedTextField JTF_dataEntregaPesquisaOs;
    private javax.swing.JTextArea JTF_defeitoPesquisaOs;
    private javax.swing.JTextField JTF_equipamentoPesquisaOs;
    private javax.swing.JFormattedTextField JTF_idPesquisaOs;
    private javax.swing.JTextField JTF_profissionalPesquisaOs;
    private javax.swing.JTextField JTF_servicoPesquisaOs;
    private javax.swing.JFormattedTextField JTF_valorPesquisaOs;
    public static javax.swing.JTable JT_tabelaPesquisaOS;
    private javax.swing.JLabel LB_AtendentePesquisaOS;
    private javax.swing.JLabel LB_clientePesquisaOS;
    private javax.swing.JLabel LB_cpfCliente;
    private javax.swing.JLabel LB_dataEntradaPesquisaOS;
    private javax.swing.JLabel LB_dataEntregaPesquisaOS;
    private javax.swing.JLabel LB_defeitoPesquisaOS;
    private javax.swing.JLabel LB_equipamentoPesquisaOS;
    private javax.swing.JLabel LB_iconPesquisaOS;
    private javax.swing.JLabel LB_idPesquisaOS;
    private javax.swing.JLabel LB_profissionalPesquisaOS;
    private javax.swing.JLabel LB_servicoPesquisaOS;
    private javax.swing.JLabel LB_situacaoPesquisaOS;
    private javax.swing.JLabel LB_valorPesquisaOS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    ProfissionalDao profissionalDao = new ProfissionalDao();
    Profissional profissional = new Profissional();

    Cliente cliente = new Cliente();
    ClienteDao clienteDao = new ClienteDao();

    OrdemServicoDao oSDao = new OrdemServicoDao();
    OrdemServico OS = new OrdemServico();

    JanelaOSprofissional jProfissional;
    JanelaOScliente jCliente;

    public TelaPesquisaOS() {
        initComponents();
        //Objeto de janela com modal true
        jCliente = new JanelaOScliente(null, true);
        jProfissional = new JanelaOSprofissional(null, true);
    }

    private void pesquisarOrdemDeServico(String cpf) {
        oSDao.pesquisarOrdemDeServicoFiltro(cpf);
    }

    @Override
    public void preencherFormulario() {

        String mascaraDataEntrega = ("  /  /    ");
        int setar = JT_tabelaPesquisaOS.getSelectedRow();

        JTF_idPesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 0).toString());
        JTF_atendentePesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 1).toString());

        // Pesquisa no banco o profissional pelo seu nome e retorna um objeto dele 
        String nomeProfissional = JT_tabelaPesquisaOS.getModel().getValueAt(setar, 2).toString();
        profissional = profissionalDao.pesquisarProfissional(nomeProfissional);
        if (!profissional.getNome().equalsIgnoreCase(JTF_profissionalPesquisaOs.getText())) {
            JTF_profissionalPesquisaOs.setText(profissional.getNome() + " " + profissional.getSobrenome());
        }

        String cpfCliente = JT_tabelaPesquisaOS.getModel().getValueAt(setar, 4).toString();
        cliente = clienteDao.pesquisarCliente(cpfCliente);

        if (!cliente.getNome().equalsIgnoreCase(JTF_clientePesquisaOs.getText())) {
            JTF_clientePesquisaOs.setText(cliente.getNome() + " " + cliente.getSobrenome());
        }

        JTF_equipamentoPesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 5).toString());

        try {
            JTF_servicoPesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 6).toString());
        } catch (Exception e) {
            JTF_servicoPesquisaOs.setText(null);
        }

        JTF_valorPesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 7).toString());

        JTF_dataEntradaPesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 8).toString());

        if (JT_tabelaPesquisaOS.getModel().getValueAt(setar, 9).toString().equalsIgnoreCase(mascaraDataEntrega)) {
            JTF_dataEntregaPesquisaOs.setText(null);
        } else {
            JTF_dataEntregaPesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 9).toString());
        }

        JCB_situacaoPesquisaOs.setSelectedItem(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 10).toString());

        try {
            JTF_defeitoPesquisaOs.setText(JT_tabelaPesquisaOS.getModel().getValueAt(setar, 11).toString());
        } catch (Exception e) {
            JTF_defeitoPesquisaOs.setText(null);
        }
    }

    @Override
    public void limparFormulario() {
        JTF_campoPesquisaOS.setText(null);
        JTF_idPesquisaOs.setText(null);
        JTF_atendentePesquisaOs.setText(null);
        JTF_profissionalPesquisaOs.setText(null);
        JTF_clientePesquisaOs.setText(null);
        JTF_equipamentoPesquisaOs.setText(null);
        JTF_servicoPesquisaOs.setText(null);
        JTF_valorPesquisaOs.setText(null);
        JTF_dataEntradaPesquisaOs.setText(null);
        JTF_dataEntregaPesquisaOs.setText(null);
        JCB_situacaoPesquisaOs.setSelectedItem(null);
        JTF_defeitoPesquisaOs.setText(null);
    }

    private void logicaBtnEditar(boolean logico) {

        BTN_deletarPesquisaOS.setEnabled(!logico);
        BTN_editarPesquisaOS.setEnabled(!logico);
        BTN_imprimirOS.setEnabled(logico);
        BTN_preencherAtendentePesquisaOS.setEnabled(logico);
        BTN_preencherClientePesquisaOS.setEnabled(logico);
        BTN_imprimirOS.setEnabled(!logico);
        BTN_atualizarPesquisaOS.setEnabled(logico);
        JTF_campoPesquisaOS.setEnabled(!logico);
        JTF_idPesquisaOs.setEnabled(logico);
        JTF_equipamentoPesquisaOs.setEnabled(logico);
        JTF_servicoPesquisaOs.setEnabled(logico);
        JTF_valorPesquisaOs.setEnabled(logico);
        JTF_dataEntradaPesquisaOs.setEnabled(logico);
        JTF_dataEntregaPesquisaOs.setEnabled(logico);
        JCB_situacaoPesquisaOs.setEnabled(logico);
        JTF_defeitoPesquisaOs.setEnabled(logico);
    }

    private void logicaBtnDeletar(boolean logico) {

        BTN_editarPesquisaOS.setEnabled(!logico);
        BTN_deletarPesquisaOS.setEnabled(!logico);
        JTF_campoPesquisaOS.setEnabled(logico);
    }

    private void logicaBtnAtualizar(boolean logico) {
        BTN_atualizarPesquisaOS.setEnabled(!logico);
        BTN_imprimirOS.setEnabled(!logico);
        BTN_preencherAtendentePesquisaOS.setEnabled(!logico);
        BTN_preencherClientePesquisaOS.setEnabled(!logico);
        JTF_campoPesquisaOS.setEnabled(logico);
        JTF_idPesquisaOs.setEnabled(!logico);
        JTF_equipamentoPesquisaOs.setEnabled(!logico);
        JTF_servicoPesquisaOs.setEnabled(!logico);
        JTF_valorPesquisaOs.setEnabled(!logico);
        JTF_dataEntradaPesquisaOs.setEnabled(!logico);
        JTF_dataEntregaPesquisaOs.setEnabled(!logico);
        JCB_situacaoPesquisaOs.setEnabled(!logico);
        JTF_defeitoPesquisaOs.setEnabled(!logico);
    }

    private void logicaCliqueTable(boolean logico) {

        BTN_editarPesquisaOS.setEnabled(logico);
        BTN_deletarPesquisaOS.setEnabled(logico);
        BTN_imprimirOS.setEnabled(!logico);
        BTN_preencherAtendentePesquisaOS.setEnabled(!logico);
        BTN_preencherClientePesquisaOS.setEnabled(!logico);
        BTN_imprimirOS.setEnabled(logico);

        JTF_campoPesquisaOS.setEnabled(logico);
        JTF_idPesquisaOs.setEnabled(!logico);
        JTF_equipamentoPesquisaOs.setEnabled(!logico);
        JTF_servicoPesquisaOs.setEnabled(!logico);
        JTF_valorPesquisaOs.setEnabled(!logico);
        JTF_dataEntradaPesquisaOs.setEnabled(!logico);
        JTF_dataEntregaPesquisaOs.setEnabled(!logico);
        JCB_situacaoPesquisaOs.setEnabled(!logico);
        JTF_defeitoPesquisaOs.setEnabled(!logico);

    }

    private void deletarOs(String idOS) {
        if (oSDao.deleteOS(idOS)) {
            JOptionPane.showMessageDialog(null, "Ordem de serviço deletada com sucesso!");
            limparFormulario();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível deletar a ordem de serviço Nº: " + JTF_idPesquisaOs.getText());
        }
    }

    private void atualizarOs() {
        OS.setId(JTF_idPesquisaOs.getText());
        OS.setUsuario(JTF_atendentePesquisaOs.getText());
        OS.setProfissional(profissional.getId());
        OS.setCliente(cliente.getId());
        OS.setEquipamento(JTF_equipamentoPesquisaOs.getText());
        OS.setServico(JTF_servicoPesquisaOs.getText());
        OS.setValor(JTF_valorPesquisaOs.getText());
        OS.setDataEntrada(JTF_dataEntradaPesquisaOs.getText());
        OS.setDataSaida(JTF_dataEntregaPesquisaOs.getText());
        OS.setSituacao((String) JCB_situacaoPesquisaOs.getSelectedItem());
        OS.setDefeito(JTF_defeitoPesquisaOs.getText());

        if (OS.verificarCamposOs()) {
            if (oSDao.updateOS(OS)) {
                JOptionPane.showMessageDialog(null, "Ordem de servico Nº: " + JTF_idPesquisaOs.getText() + " atualizada com sucesso!");
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(null, "Nao foi possível atualizar a ordem de serviço!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
    }
}
