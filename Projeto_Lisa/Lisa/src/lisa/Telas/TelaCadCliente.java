package lisa.Telas;

import javax.swing.JOptionPane;
import lisa.Modelo.beans.Bairro;
import lisa.Modelo.beans.Cidade;
import lisa.Modelo.beans.Cliente;
import lisa.Modelo.dao.BairroDao;
import lisa.Modelo.dao.CidadeDao;
import lisa.Modelo.dao.ClienteDao;

public class TelaCadCliente extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_iconClienteCad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbn_titulo_cadCliente = new javax.swing.JLabel();
        lb_camposObrigatorioCliente = new javax.swing.JLabel();
        lb_id_clienteCad = new javax.swing.JLabel();
        jt_idClienteCad = new javax.swing.JFormattedTextField();
        lbn_nome_clienteCad = new javax.swing.JLabel();
        jt_nomeClienteCad = new javax.swing.JTextField();
        lbn_sobrenome_clienteCad = new javax.swing.JLabel();
        jt_sobrenomeClienteCad = new javax.swing.JTextField();
        lbn_nascimento_clienteCad = new javax.swing.JLabel();
        jt_anoNascimento_clienteCad = new javax.swing.JFormattedTextField();
        lbn_rg_clienteCad = new javax.swing.JLabel();
        jt_rg_clienteCad = new javax.swing.JFormattedTextField();
        lbn_cpf_clienteCad = new javax.swing.JLabel();
        jt_cpf_clienteCad = new javax.swing.JFormattedTextField();
        lbn_logradouro_clienteCad = new javax.swing.JLabel();
        btn_cancelarCadCliente = new javax.swing.JButton();
        btn_cadastrarCadCliente = new javax.swing.JButton();
        jt_logradouroClienteCad = new javax.swing.JTextField();
        jt_numeroClienteCad = new javax.swing.JFormattedTextField();
        lb_numero_clienteCad = new javax.swing.JLabel();
        lbn_bairro_clienteCad = new javax.swing.JLabel();
        jc_bairro_clienteCad = new javax.swing.JComboBox<>();
        lbn_bairro_clienteCad1 = new javax.swing.JLabel();
        jc_cidade_clienteCad = new javax.swing.JComboBox<>();
        jp_contatoCadCliente = new javax.swing.JPanel();
        lbn_telefone_clienteCad = new javax.swing.JLabel();
        jt_telefone_clienteCad = new javax.swing.JFormattedTextField();
        lbn_telefone_clienteCad1 = new javax.swing.JLabel();
        jt_emailClienteCad = new javax.swing.JTextField();

        setIconifiable(true);
        setTitle("Cadastro de cliente");

        lb_iconClienteCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cliente_img2.png"))); // NOI18N

        lbn_titulo_cadCliente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbn_titulo_cadCliente.setText("Cadastro de cliente");

        lb_camposObrigatorioCliente.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        lb_camposObrigatorioCliente.setText("* campos obrigatórios");

        lb_id_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_id_clienteCad.setText("ID*");

        jt_idClienteCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbn_nome_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_nome_clienteCad.setText("Nome*");

        jt_nomeClienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        lbn_sobrenome_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_sobrenome_clienteCad.setText("Sobrenome*");

        jt_sobrenomeClienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        lbn_nascimento_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_nascimento_clienteCad.setText("Ano Nascimento*");

        jt_anoNascimento_clienteCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lbn_rg_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_rg_clienteCad.setText("RG*");

        try {
            jt_rg_clienteCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbn_cpf_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_cpf_clienteCad.setText("CPF*");

        try {
            jt_cpf_clienteCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbn_logradouro_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_logradouro_clienteCad.setText("Endereço*");

        btn_cancelarCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarCadCliente.setText("Cancelar");
        btn_cancelarCadCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarCadCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCadClienteActionPerformed(evt);
            }
        });

        btn_cadastrarCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_cadastrarCadCliente.setText("Cadastrar");
        btn_cadastrarCadCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cadastrarCadCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cadastrarCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarCadClienteActionPerformed(evt);
            }
        });

        jt_logradouroClienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        jt_numeroClienteCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        lb_numero_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_numero_clienteCad.setText("Número*");

        lbn_bairro_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_bairro_clienteCad.setText("Bairro*");

        lbn_bairro_clienteCad1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_bairro_clienteCad1.setText("Cidade*");

        jp_contatoCadCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        lbn_telefone_clienteCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_telefone_clienteCad.setText("Telefone");

        try {
            jt_telefone_clienteCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbn_telefone_clienteCad1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_telefone_clienteCad1.setText("Email");

        jt_emailClienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        javax.swing.GroupLayout jp_contatoCadClienteLayout = new javax.swing.GroupLayout(jp_contatoCadCliente);
        jp_contatoCadCliente.setLayout(jp_contatoCadClienteLayout);
        jp_contatoCadClienteLayout.setHorizontalGroup(
            jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contatoCadClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbn_telefone_clienteCad)
                    .addComponent(jt_telefone_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbn_telefone_clienteCad1)
                    .addComponent(jt_emailClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jp_contatoCadClienteLayout.setVerticalGroup(
            jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_contatoCadClienteLayout.createSequentialGroup()
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbn_telefone_clienteCad)
                    .addComponent(lbn_telefone_clienteCad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_contatoCadClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jt_telefone_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_emailClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_iconClienteCad)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbn_titulo_cadCliente)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_camposObrigatorioCliente)
                                .addGap(147, 147, 147))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_id_clienteCad)
                                    .addComponent(jt_idClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbn_nome_clienteCad)
                                            .addComponent(jt_nomeClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jt_sobrenomeClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbn_sobrenome_clienteCad))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbn_nascimento_clienteCad)
                                            .addComponent(jt_anoNascimento_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbn_rg_clienteCad)
                                            .addComponent(jt_rg_clienteCad, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(jt_numeroClienteCad))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jt_cpf_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lbn_cpf_clienteCad))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbn_logradouro_clienteCad)
                                                    .addComponent(jt_logradouroClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbn_bairro_clienteCad)
                                                    .addComponent(jc_bairro_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbn_bairro_clienteCad1)
                                                    .addComponent(jc_cidade_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btn_cancelarCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_cadastrarCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jp_contatoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_numero_clienteCad)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbn_titulo_cadCliente))
                    .addComponent(lb_iconClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_camposObrigatorioCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lb_id_clienteCad)
                .addGap(3, 3, 3)
                .addComponent(jt_idClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbn_nome_clienteCad)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbn_sobrenome_clienteCad)
                                .addComponent(lbn_nascimento_clienteCad)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_nomeClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_sobrenomeClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_anoNascimento_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jp_contatoCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbn_rg_clienteCad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbn_cpf_clienteCad)
                                .addComponent(lbn_logradouro_clienteCad)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_rg_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_cpf_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_logradouroClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(lb_numero_clienteCad)
                        .addGap(2, 2, 2)
                        .addComponent(jt_numeroClienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbn_bairro_clienteCad1)
                            .addComponent(lbn_bairro_clienteCad))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jc_bairro_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jc_cidade_clienteCad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelarCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cadastrarCadCliente))
                .addGap(138, 138, 138))
        );

        setBounds(250, 0, 565, 541);
    }// </editor-fold>//GEN-END:initComponents

    //Botões da Janela
    
    private void btn_cancelarCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCadClienteActionPerformed
        // Fechar janela cadastro de cliente
        this.dispose();
    }//GEN-LAST:event_btn_cancelarCadClienteActionPerformed

    private void btn_cadastrarCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarCadClienteActionPerformed
        // Chamando método cadastrar cliente
        try {
            cadastrarCliente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bairro e/ou Cidade sem cadastro!");
            this.dispose();
        }

    }//GEN-LAST:event_btn_cadastrarCadClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarCadCliente;
    private javax.swing.JButton btn_cancelarCadCliente;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<Object> jc_bairro_clienteCad;
    private javax.swing.JComboBox<Object> jc_cidade_clienteCad;
    private javax.swing.JPanel jp_contatoCadCliente;
    private javax.swing.JFormattedTextField jt_anoNascimento_clienteCad;
    private javax.swing.JFormattedTextField jt_cpf_clienteCad;
    private javax.swing.JTextField jt_emailClienteCad;
    private javax.swing.JFormattedTextField jt_idClienteCad;
    private javax.swing.JTextField jt_logradouroClienteCad;
    private javax.swing.JTextField jt_nomeClienteCad;
    private javax.swing.JFormattedTextField jt_numeroClienteCad;
    private javax.swing.JFormattedTextField jt_rg_clienteCad;
    private javax.swing.JTextField jt_sobrenomeClienteCad;
    private javax.swing.JFormattedTextField jt_telefone_clienteCad;
    private javax.swing.JLabel lb_camposObrigatorioCliente;
    private javax.swing.JLabel lb_iconClienteCad;
    private javax.swing.JLabel lb_id_clienteCad;
    private javax.swing.JLabel lb_numero_clienteCad;
    private javax.swing.JLabel lbn_bairro_clienteCad;
    private javax.swing.JLabel lbn_bairro_clienteCad1;
    private javax.swing.JLabel lbn_cpf_clienteCad;
    private javax.swing.JLabel lbn_logradouro_clienteCad;
    private javax.swing.JLabel lbn_nascimento_clienteCad;
    private javax.swing.JLabel lbn_nome_clienteCad;
    private javax.swing.JLabel lbn_rg_clienteCad;
    private javax.swing.JLabel lbn_sobrenome_clienteCad;
    private javax.swing.JLabel lbn_telefone_clienteCad;
    private javax.swing.JLabel lbn_telefone_clienteCad1;
    private javax.swing.JLabel lbn_titulo_cadCliente;
    // End of variables declaration//GEN-END:variables

    //Construtor
    public TelaCadCliente() {
        initComponents();

        //As linhas abaixo altera fonte dos campos formatados para tamanho 14, Times New Roman e Itálico
        jt_anoNascimento_clienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14));
        jt_cpf_clienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14));
        jt_rg_clienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14));
        jt_telefone_clienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14));
        jt_emailClienteCad.setFont(new java.awt.Font("Times New Roman", 2, 14));

        //Criando objeto bairro e cidade p/ manipulação do banco de dados
        BairroDao bairroDao = new BairroDao();
        CidadeDao cidadeDao = new CidadeDao();

        //Percorrendo registro de bairro no banco e retornando lista de bairros
        for (Bairro bairro : bairroDao.pesquisarBairro()) {
            jc_bairro_clienteCad.addItem(bairro);
        }

        //Percorrendo registro de cidade no banco e retornando lista de cidades
        for (Cidade cidade : cidadeDao.pesquisarCidade()) {
            jc_cidade_clienteCad.addItem(cidade);
        }

    }

    /**
     * Método p/ cadastrar cliente
     */
    public void cadastrarCliente() {

        //Criando objeto cliente para armazenar informções dos campos da interface
        Cliente cliente = new Cliente();

        cliente.setId(jt_idClienteCad.getText());
        //System.out.println("Id cliente: " + cliente.getId());
        cliente.setNome(jt_nomeClienteCad.getText());
        //System.out.println("Nome cliente: " + cliente.getNome());
        cliente.setSobrenome(jt_sobrenomeClienteCad.getText());
        //System.out.println("Sobrenome cliente: " + cliente.getSobrenome());
        cliente.setNascimento(jt_anoNascimento_clienteCad.getText());
        //System.out.println("Nascimento cliente: " + cliente.getNascimento());
        cliente.setTelefone(jt_telefone_clienteCad.getText());
        //System.out.println("Telefone cliente: " + cliente.getTelefone());
        cliente.setEmail(jt_emailClienteCad.getText());
        //System.out.println("Email cliente: " + cliente.getEmail());
        cliente.setRg(jt_rg_clienteCad.getText());
        //System.out.println("Rg cliente: " + cliente.getRg());
        cliente.setCpf(jt_cpf_clienteCad.getText());
        //System.out.println("Cpf cliente: " + cliente.getCpf());
        cliente.setLogradouro(jt_logradouroClienteCad.getText());
        //System.out.println("Logradouro cliente: " + cliente.getLogradouro());
        cliente.setNumero(jt_numeroClienteCad.getText());
        //System.out.println("Numero cliente: " + cliente.getNumero());

        try {
            //Objetos bairro e cidade recebendo itens selecionado do JcomboBox através de CAST
            Bairro b = (Bairro) jc_bairro_clienteCad.getSelectedItem();
            Cidade c = (Cidade) jc_cidade_clienteCad.getSelectedItem();

            // Teste de print
            //System.out.println(jc_bairro_clienteCad.getSelectedItem());
            //System.out.println(c.getId());
            cliente.setBairro(b.getId());
            //System.out.println("Bairro cliente: " + cliente.getBairro());
            cliente.setCidade(c.getId());
            //System.out.println("Cidade cliente: " + cliente.getCidade());

            if (cliente.verificarCamposCliente() == false) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            } else {
                
                //Objeto clienteDao p/ manipulação do banco de dados
                ClienteDao clienteDao = new ClienteDao();
                boolean verificarCadastroCliente = clienteDao.cadastrarCliente(cliente);
                //JOptionPane.showMessageDialog(null, verificarSecadastrou);

                if (verificarCadastroCliente) {
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    limparCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível cadastrar este cliente!");
                }
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Bairro e/ou Cidade sem cadastro!");
            this.dispose();
        }

//      COMO ESTAVA ANTES E DANDO ERRO DE EXCEÇÃO
//        if(cliente.verificarCamposCliente() == false){
//            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
//           // System.out.println(cliente.verificarCamposCliente());
//        }else{
//            
//            ClienteDao clienteDao = new ClienteDao();
//            boolean verificarSecadastrou = clienteDao.cadastrarCliente(cliente);
//            
//            if(verificarSecadastrou){
//                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
//                limparCampos();
//            }else{
//                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar este cliente!");
//            }
//            
//        }
    }

    /**
     * Método p/ limpar campos da interface
     */
    private void limparCampos() {
        jt_idClienteCad.setText(null);
        jt_nomeClienteCad.setText(null);
        jt_sobrenomeClienteCad.setText(null);
        jt_anoNascimento_clienteCad.setText(null);
        jt_telefone_clienteCad.setText(null);
        jt_emailClienteCad.setText(null);
        jt_rg_clienteCad.setText(null);
        jt_cpf_clienteCad.setText(null);
        jt_logradouroClienteCad.setText(null);
        jt_numeroClienteCad.setText(null);
        jc_bairro_clienteCad.setSelectedItem("Selecione");
        jc_cidade_clienteCad.setSelectedItem("Selecione");
    }

}
