package lisa.Telas;

/**
 * @Importação bibliotecas
 */
import javax.swing.JOptionPane;
import lisa.Modelo.beans.Bairro;
import lisa.Modelo.beans.Cidade;
import lisa.Modelo.beans.Cliente;
import lisa.Modelo.beans.MetodosComuns;
import lisa.Modelo.dao.BairroDao;
import lisa.Modelo.dao.CidadeDao;
import lisa.Modelo.dao.ClienteDao;

public class TelaPesquisaCliente extends javax.swing.JInternalFrame implements MetodosComuns {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_tabelaCliente = new javax.swing.JTable();
        JTF_campoPesquisaCliente = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        lb_idCliente = new javax.swing.JLabel();
        jp_contatoCadCliente = new javax.swing.JPanel();
        lb_telefoneCliente = new javax.swing.JLabel();
        JTF_campoTelefonePesquisaCliente = new javax.swing.JFormattedTextField();
        lb_emailCliente = new javax.swing.JLabel();
        JTF_campoEmailPesquisaCliente = new javax.swing.JTextField();
        JTF_campoIDPesquisaCliente = new javax.swing.JFormattedTextField();
        lb_nomeCliente = new javax.swing.JLabel();
        JTF_campoNomePesquisaCliente = new javax.swing.JTextField();
        lb_sobrenomeCliente = new javax.swing.JLabel();
        JTF_campoSobrenomePesquisaCliente = new javax.swing.JTextField();
        lb_nascimentoCliente = new javax.swing.JLabel();
        JTF_campoNascimentoPesquisaCliente = new javax.swing.JFormattedTextField();
        lb_rgCliente = new javax.swing.JLabel();
        JTF_campoRGPesquisaCliente = new javax.swing.JFormattedTextField();
        lb_cpfCliente = new javax.swing.JLabel();
        JTF_campoCPFPesquisaCliente = new javax.swing.JFormattedTextField();
        lb_enderecoCliente = new javax.swing.JLabel();
        JTF_campoEnderecoPesquisaCliente = new javax.swing.JTextField();
        JTF_campoNumeroPesquisaCliente = new javax.swing.JFormattedTextField();
        lb_numeroCliente = new javax.swing.JLabel();
        lb_bairroCliente = new javax.swing.JLabel();
        lb_cidadeCliente = new javax.swing.JLabel();
        BTN_editarPesquisaCliente = new javax.swing.JButton();
        BTN_deletarPesquisaCliente = new javax.swing.JButton();
        BTN_atualizarPesquisaCliente = new javax.swing.JButton();
        BTN_cancelarPesquisaCliente = new javax.swing.JButton();
        JTF_campoBairoPesquisaCliente = new javax.swing.JTextField();
        JTF_campoCidadePesquisaCliente = new javax.swing.JTextField();
        BTN_preencherBairroPesquisaCliente = new javax.swing.JButton();
        BTN_preencherCidadePesquisaCliente = new javax.swing.JButton();

        setIconifiable(true);
        setLayer(1);

        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        JT_tabelaCliente.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JT_tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "SOBRENOME", "NASCIMENTO", "CPF", "RG", "TELEFONE", "EMAIL", "ENDEREÇO", "Nº", "BAIRRO", "CIDADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JT_tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventoCliqueNaTabela(evt);
            }
        });
        jScrollPane2.setViewportView(JT_tabelaCliente);

        JTF_campoPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EventoGetTextoPesquisa(evt);
            }
        });

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(JTF_campoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTF_campoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lb_idCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_idCliente.setText("ID*");

        jp_contatoCadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        lb_telefoneCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_telefoneCliente.setText("Telefone");

        try {
            JTF_campoTelefonePesquisaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTF_campoTelefonePesquisaCliente.setEnabled(false);

        lb_emailCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_emailCliente.setText("Email");

        JTF_campoEmailPesquisaCliente.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JTF_campoEmailPesquisaCliente.setEnabled(false);

        javax.swing.GroupLayout jp_contatoCadClienteLayout = new javax.swing.GroupLayout(jp_contatoCadCliente);
        jp_contatoCadCliente.setLayout(jp_contatoCadClienteLayout);
        jp_contatoCadClienteLayout.setHorizontalGroup(
            jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contatoCadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_telefoneCliente)
                    .addComponent(JTF_campoTelefonePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_emailCliente)
                    .addComponent(JTF_campoEmailPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jp_contatoCadClienteLayout.setVerticalGroup(
            jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contatoCadClienteLayout.createSequentialGroup()
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_telefoneCliente)
                    .addComponent(lb_emailCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_campoTelefonePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_campoEmailPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        JTF_campoIDPesquisaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        JTF_campoIDPesquisaCliente.setEnabled(false);

        lb_nomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nomeCliente.setText("Nome*");

        JTF_campoNomePesquisaCliente.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JTF_campoNomePesquisaCliente.setEnabled(false);

        lb_sobrenomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_sobrenomeCliente.setText("Sobrenome*");

        JTF_campoSobrenomePesquisaCliente.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JTF_campoSobrenomePesquisaCliente.setEnabled(false);

        lb_nascimentoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nascimentoCliente.setText("Ano Nascimento*");

        JTF_campoNascimentoPesquisaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        JTF_campoNascimentoPesquisaCliente.setEnabled(false);

        lb_rgCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_rgCliente.setText("RG*");

        try {
            JTF_campoRGPesquisaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTF_campoRGPesquisaCliente.setEnabled(false);

        lb_cpfCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_cpfCliente.setText("CPF*");

        try {
            JTF_campoCPFPesquisaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        JTF_campoCPFPesquisaCliente.setEnabled(false);

        lb_enderecoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_enderecoCliente.setText("Endereço*");

        JTF_campoEnderecoPesquisaCliente.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JTF_campoEnderecoPesquisaCliente.setEnabled(false);

        JTF_campoNumeroPesquisaCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        JTF_campoNumeroPesquisaCliente.setEnabled(false);

        lb_numeroCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_numeroCliente.setText("Número*");

        lb_bairroCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_bairroCliente.setText("Bairro*");

        lb_cidadeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_cidadeCliente.setText("Cidade*");

        BTN_editarPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/editar_img.png"))); // NOI18N
        BTN_editarPesquisaCliente.setText("Editar");
        BTN_editarPesquisaCliente.setEnabled(false);
        BTN_editarPesquisaCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_editarPesquisaCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_editarPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoEditarPesquisaCliente(evt);
            }
        });

        BTN_deletarPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/delete_img.png"))); // NOI18N
        BTN_deletarPesquisaCliente.setText("Deletar");
        BTN_deletarPesquisaCliente.setEnabled(false);
        BTN_deletarPesquisaCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_deletarPesquisaCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_deletarPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoDeletarCliente(evt);
            }
        });

        BTN_atualizarPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        BTN_atualizarPesquisaCliente.setText("Atualizar");
        BTN_atualizarPesquisaCliente.setEnabled(false);
        BTN_atualizarPesquisaCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_atualizarPesquisaCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_atualizarPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoAtualizarCliente(evt);
            }
        });

        BTN_cancelarPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        BTN_cancelarPesquisaCliente.setText("Cancelar");
        BTN_cancelarPesquisaCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_cancelarPesquisaCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_cancelarPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCancelarPesquisaCliente(evt);
            }
        });

        JTF_campoBairoPesquisaCliente.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JTF_campoBairoPesquisaCliente.setEnabled(false);

        JTF_campoCidadePesquisaCliente.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        JTF_campoCidadePesquisaCliente.setEnabled(false);

        BTN_preencherBairroPesquisaCliente.setText("jButton1");
        BTN_preencherBairroPesquisaCliente.setEnabled(false);
        BTN_preencherBairroPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPreencherBairroCliente(evt);
            }
        });

        BTN_preencherCidadePesquisaCliente.setText("jButton1");
        BTN_preencherCidadePesquisaCliente.setEnabled(false);
        BTN_preencherCidadePesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPreencherCidadeCliente(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_rgCliente)
                                .addGap(90, 90, 90)
                                .addComponent(lb_cpfCliente)
                                .addGap(98, 98, 98)
                                .addComponent(lb_enderecoCliente))
                            .addComponent(jp_contatoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(JTF_campoRGPesquisaCliente)
                                        .addComponent(JTF_campoNumeroPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lb_numeroCliente))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_bairroCliente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(JTF_campoBairoPesquisaCliente, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTF_campoCPFPesquisaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTF_campoEnderecoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BTN_preencherBairroPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lb_cidadeCliente)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(JTF_campoCidadePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(BTN_preencherCidadePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTN_editarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_deletarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BTN_atualizarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(BTN_cancelarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_idCliente)
                            .addComponent(JTF_campoIDPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nomeCliente)
                                    .addComponent(JTF_campoNomePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTF_campoSobrenomePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_sobrenomeCliente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lb_nascimentoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JTF_campoNascimentoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_idCliente)
                .addGap(3, 3, 3)
                .addComponent(JTF_campoIDPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_nomeCliente)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_sobrenomeCliente)
                        .addComponent(lb_nascimentoCliente)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTF_campoNomePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_campoSobrenomePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_campoNascimentoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_contatoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_rgCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lb_cpfCliente)
                                .addComponent(lb_enderecoCliente)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_campoRGPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_campoCPFPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_campoEnderecoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_cidadeCliente)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_numeroCliente)
                                    .addComponent(lb_bairroCliente))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTF_campoNumeroPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_campoBairoPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTF_campoCidadePesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_preencherBairroPesquisaCliente)
                                    .addComponent(BTN_preencherCidadePesquisaCliente)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_editarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_deletarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_atualizarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_cancelarPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );

        setBounds(0, 0, 835, 555);
    }// </editor-fold>//GEN-END:initComponents

    //Método para pesquisar cliente pelo nome
    private void EventoGetTextoPesquisa(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventoGetTextoPesquisa
        // Chamando método de pesquisa
        pesquisarCliente(JTF_campoPesquisaCliente.getText());
    }//GEN-LAST:event_EventoGetTextoPesquisa

    private void EventoCancelarPesquisaCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCancelarPesquisaCliente
        // Fechar telat pesquisa de cliente
        dispose();
    }//GEN-LAST:event_EventoCancelarPesquisaCliente

    //Clique na linha da tabela
    private void EventoCliqueNaTabela(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventoCliqueNaTabela
        // Action para preencher formulário
        try {
            preencherFormulario();
            JTF_campoNomePesquisaCliente.setEnabled(false);
            JTF_campoSobrenomePesquisaCliente.setEnabled(false);
            JTF_campoNascimentoPesquisaCliente.setEnabled(false);
            JTF_campoTelefonePesquisaCliente.setEnabled(false);
            JTF_campoEmailPesquisaCliente.setEnabled(false);
            JTF_campoRGPesquisaCliente.setEnabled(false);
            JTF_campoCPFPesquisaCliente.setEnabled(false);
            JTF_campoNumeroPesquisaCliente.setEnabled(false);
            BTN_preencherBairroPesquisaCliente.setEnabled(false);
            BTN_preencherCidadePesquisaCliente.setEnabled(false);
            BTN_editarPesquisaCliente.setEnabled(true);
            BTN_deletarPesquisaCliente.setEnabled(true);
            BTN_atualizarPesquisaCliente.setEnabled(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa do cliente!");
        }
    }//GEN-LAST:event_EventoCliqueNaTabela

    //Método para pegar objeto bairro de outra janela
    private void EventoPreencherBairroCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPreencherBairroCliente
        // Action para chamar janela de seleção de bairro
        
        //Janela Visivel
        janelaBairroCliente.setVisible(true);
        
        if (janelaBairroCliente.isFechouJanela()) {
            bairro = janelaBairroCliente.getBairro();
            if (!bairro.getBairro().equalsIgnoreCase(JTF_campoBairoPesquisaCliente.getText())) {
                JTF_campoBairoPesquisaCliente.setText(bairro.getBairro());
            }
        }
    }//GEN-LAST:event_EventoPreencherBairroCliente

    private void EventoEditarPesquisaCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoEditarPesquisaCliente
        // Action para editar formulário
        BTN_deletarPesquisaCliente.setEnabled(false);
        BTN_editarPesquisaCliente.setEnabled(false);
        BTN_atualizarPesquisaCliente.setEnabled(true);
        JTF_campoPesquisaCliente.setEnabled(false);
        JTF_campoNomePesquisaCliente.setEnabled(true);
        JTF_campoSobrenomePesquisaCliente.setEnabled(true);
        JTF_campoNascimentoPesquisaCliente.setEnabled(true);
        JTF_campoTelefonePesquisaCliente.setEnabled(true);
        JTF_campoEmailPesquisaCliente.setEnabled(true);
        JTF_campoRGPesquisaCliente.setEnabled(true);
        JTF_campoCPFPesquisaCliente.setEnabled(true);
        JTF_campoNumeroPesquisaCliente.setEnabled(true);
        JTF_campoEnderecoPesquisaCliente.setEnabled(true);
        BTN_preencherBairroPesquisaCliente.setEnabled(true);
        BTN_preencherCidadePesquisaCliente.setEnabled(true);
    }//GEN-LAST:event_EventoEditarPesquisaCliente

    private void EventoAtualizarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoAtualizarCliente
        // Action p/ atualizar cadastro

        BTN_atualizarPesquisaCliente.setEnabled(false);
        JTF_campoPesquisaCliente.setEnabled(true);
        JTF_campoEnderecoPesquisaCliente.setEnabled(false);
        JTF_campoNomePesquisaCliente.setEnabled(false);
        JTF_campoSobrenomePesquisaCliente.setEnabled(false);
        JTF_campoNascimentoPesquisaCliente.setEnabled(false);
        JTF_campoTelefonePesquisaCliente.setEnabled(false);
        JTF_campoEmailPesquisaCliente.setEnabled(false);
        JTF_campoRGPesquisaCliente.setEnabled(false);
        JTF_campoCPFPesquisaCliente.setEnabled(false);
        JTF_campoNumeroPesquisaCliente.setEnabled(false);
        BTN_preencherBairroPesquisaCliente.setEnabled(false);
        BTN_preencherCidadePesquisaCliente.setEnabled(false);
        updateCliente();
    }//GEN-LAST:event_EventoAtualizarCliente

    private void EventoDeletarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoDeletarCliente
        // Action para deletar registro de cliente
        BTN_editarPesquisaCliente.setEnabled(false);
        BTN_deletarPesquisaCliente.setEnabled(false);
        JTF_campoPesquisaCliente.setEnabled(true);

        Cliente clienteDelete = new Cliente();
        clienteDelete.setId(JTF_campoIDPesquisaCliente.getText());

        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar " + JTF_campoNomePesquisaCliente.getText() + " " + JTF_campoSobrenomePesquisaCliente.getText() + " ?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (opc == JOptionPane.YES_OPTION) {
            deleteCliente(clienteDelete);
        }
    }//GEN-LAST:event_EventoDeletarCliente

    //Método para pegar objeto cidade de outra janela
    private void EventoPreencherCidadeCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPreencherCidadeCliente
        // Action p/ preencher campo cidade
        
        //Janela Cidade Visivel
        janelaCidadeCliente.setVisible(true);

        if (janelaCidadeCliente.isFechouJanela()) {
            cidade = janelaCidadeCliente.getCidade();
            if (!cidade.getNome().equalsIgnoreCase(JTF_campoCidadePesquisaCliente.getText())) {
                JTF_campoCidadePesquisaCliente.setText(cidade.getNome());
            }
        }

    }//GEN-LAST:event_EventoPreencherCidadeCliente


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_atualizarPesquisaCliente;
    private javax.swing.JButton BTN_cancelarPesquisaCliente;
    private javax.swing.JButton BTN_deletarPesquisaCliente;
    private javax.swing.JButton BTN_editarPesquisaCliente;
    private javax.swing.JButton BTN_preencherBairroPesquisaCliente;
    private javax.swing.JButton BTN_preencherCidadePesquisaCliente;
    private javax.swing.JTextField JTF_campoBairoPesquisaCliente;
    private javax.swing.JFormattedTextField JTF_campoCPFPesquisaCliente;
    private javax.swing.JTextField JTF_campoCidadePesquisaCliente;
    private javax.swing.JTextField JTF_campoEmailPesquisaCliente;
    private javax.swing.JTextField JTF_campoEnderecoPesquisaCliente;
    private javax.swing.JFormattedTextField JTF_campoIDPesquisaCliente;
    private javax.swing.JFormattedTextField JTF_campoNascimentoPesquisaCliente;
    private javax.swing.JTextField JTF_campoNomePesquisaCliente;
    private javax.swing.JFormattedTextField JTF_campoNumeroPesquisaCliente;
    private javax.swing.JTextField JTF_campoPesquisaCliente;
    private javax.swing.JFormattedTextField JTF_campoRGPesquisaCliente;
    private javax.swing.JTextField JTF_campoSobrenomePesquisaCliente;
    private javax.swing.JFormattedTextField JTF_campoTelefonePesquisaCliente;
    public static javax.swing.JTable JT_tabelaCliente;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp_contatoCadCliente;
    private javax.swing.JLabel lb_bairroCliente;
    private javax.swing.JLabel lb_cidadeCliente;
    private javax.swing.JLabel lb_cpfCliente;
    private javax.swing.JLabel lb_emailCliente;
    private javax.swing.JLabel lb_enderecoCliente;
    private javax.swing.JLabel lb_idCliente;
    private javax.swing.JLabel lb_nascimentoCliente;
    private javax.swing.JLabel lb_nomeCliente;
    private javax.swing.JLabel lb_numeroCliente;
    private javax.swing.JLabel lb_rgCliente;
    private javax.swing.JLabel lb_sobrenomeCliente;
    private javax.swing.JLabel lb_telefoneCliente;
    // End of variables declaration//GEN-END:variables

    ClienteDao clienteDao = new ClienteDao();

    Bairro bairro = new Bairro();
    BairroDao bairroDao = new BairroDao();

    CidadeDao cidadeDao = new CidadeDao();
    Cidade cidade = new Cidade();

    JanelaBairroCliente janelaBairroCliente;
    JanelaCidadeCliente janelaCidadeCliente;

    /**
     * @Construtor
     */
    public TelaPesquisaCliente() {
        initComponents();
        
        //Instanciando janela bairro e janela cidade com modal true
        janelaBairroCliente = new JanelaBairroCliente(null, true);
        janelaCidadeCliente = new JanelaCidadeCliente(null, true);
    }

    private void pesquisarCliente(String nomeCliente) {
        clienteDao.pesquisarClienteFiltro(nomeCliente, "TelaPesquisaCliente");
    }

    private void deleteCliente(Cliente cliente) {

        if (clienteDao.deleteCliente(cliente)) {
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!");
            limparFormulario();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possivel deletar " + JTF_campoNomePesquisaCliente.getText() + " " + JTF_campoSobrenomePesquisaCliente.getText() + ". "
                    + "\nCliente vinculado a uma ou mais ordem de serviços!");
        }

    }

    private void updateCliente() {

        Cliente clienteAtualizado = new Cliente();

        clienteAtualizado.setId(JTF_campoIDPesquisaCliente.getText());
        clienteAtualizado.setNome(JTF_campoNomePesquisaCliente.getText());
        clienteAtualizado.setSobrenome(JTF_campoSobrenomePesquisaCliente.getText());
        clienteAtualizado.setNascimento(JTF_campoNascimentoPesquisaCliente.getText());
        clienteAtualizado.setTelefone(JTF_campoTelefonePesquisaCliente.getText());
        clienteAtualizado.setEmail(JTF_campoEmailPesquisaCliente.getText());
        clienteAtualizado.setRg(JTF_campoRGPesquisaCliente.getText());
        clienteAtualizado.setCpf(JTF_campoCPFPesquisaCliente.getText());
        clienteAtualizado.setLogradouro(JTF_campoEnderecoPesquisaCliente.getText());
        clienteAtualizado.setNumero(JTF_campoNumeroPesquisaCliente.getText());
        clienteAtualizado.setBairro(bairro.getId());
        clienteAtualizado.setCidade(cidade.getId());

        if (clienteAtualizado.verificarCamposCliente()) {

            if (clienteDao.atualizarCliente(clienteAtualizado)) {
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível atualizar " + JTF_campoNomePesquisaCliente.getText() + " " + JTF_campoSobrenomePesquisaCliente.getText() + " !");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
        }
    }

    @Override
    public void preencherFormulario() {

            String mascaraTelefone = ("(  )      -    ");
            
            int setar = JT_tabelaCliente.getSelectedRow();

            JTF_campoIDPesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 0).toString());
            JTF_campoNomePesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 1).toString());
            JTF_campoSobrenomePesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 2).toString());
            JTF_campoNascimentoPesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 3).toString());

            if(JT_tabelaCliente.getModel().getValueAt(setar, 6).toString().equalsIgnoreCase(mascaraTelefone)){
                JTF_campoTelefonePesquisaCliente.setText(null);
            }else{
                 JTF_campoTelefonePesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 6).toString());
            }
    
            try {
                //Quando este campo da JTable se encontra vazio, gera um NullPointer, por isso coloquei uma try catch
                JTF_campoEmailPesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 7).toString());

            } catch (Exception e) {
                JTF_campoEmailPesquisaCliente.setText(null);
            }

            JTF_campoRGPesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 5).toString());
            JTF_campoCPFPesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 4).toString());
            JTF_campoEnderecoPesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 8).toString());
            JTF_campoNumeroPesquisaCliente.setText(JT_tabelaCliente.getModel().getValueAt(setar, 9).toString());

            String nomeBairro = JT_tabelaCliente.getModel().getValueAt(setar, 10).toString();

            String nomeCidade = JT_tabelaCliente.getModel().getValueAt(setar, 11).toString();

            bairro = bairroDao.pesquisarBairro(nomeBairro);
            if (!bairro.getBairro().equalsIgnoreCase(JTF_campoBairoPesquisaCliente.getText())) {
                JTF_campoBairoPesquisaCliente.setText(bairro.getBairro());
            }

            cidade = cidadeDao.pesquisarCidade(nomeCidade);
            if (!cidade.getNome().equalsIgnoreCase(JTF_campoCidadePesquisaCliente.getText())) {
                JTF_campoCidadePesquisaCliente.setText(cidade.getNome());
            }
        
    }

    @Override
    public void limparFormulario() {
        JTF_campoPesquisaCliente.setText(null);
        JTF_campoNomePesquisaCliente.setText(null);
        JTF_campoSobrenomePesquisaCliente.setText(null);
        JTF_campoNascimentoPesquisaCliente.setText(null);
        JTF_campoTelefonePesquisaCliente.setText(null);
        JTF_campoEmailPesquisaCliente.setText(null);
        JTF_campoRGPesquisaCliente.setText(null);
        JTF_campoCPFPesquisaCliente.setText(null);
        JTF_campoEnderecoPesquisaCliente.setText(null);
        JTF_campoNumeroPesquisaCliente.setText(null);
        JTF_campoBairoPesquisaCliente.setText(null);
        JTF_campoCidadePesquisaCliente.setText(null);
    }

}
