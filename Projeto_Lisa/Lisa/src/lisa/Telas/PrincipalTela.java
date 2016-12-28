package lisa.Telas;

/**
 * @importação bibliotecas
 */
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PrincipalTela extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPrincipal = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        BTN_cadastrarCliente = new javax.swing.JButton();
        BTN_cadastrarOrdemDeServico = new javax.swing.JButton();
        BTN_pesquisarCliente = new javax.swing.JButton();
        BTN_pesquisarOrdemDeServico = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        LB_usuarioLogado = new javax.swing.JLabel();
        LB_dataDoSistema = new javax.swing.JLabel();
        lb_data = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        MENU_menuPrincipal = new javax.swing.JMenuBar();
        JMenu_opcao = new javax.swing.JMenu();
        JMenu_subMenuSobre = new javax.swing.JMenuItem();
        JMenu_subMenuTrocaUsuario = new javax.swing.JMenuItem();
        JMenu_subMenuSair = new javax.swing.JMenuItem();
        JMenu_cadastro = new javax.swing.JMenu();
        JMenu_subMenuCadastrarUsuario = new javax.swing.JMenuItem();
        JMenu_subMenuCadastrarProfissional = new javax.swing.JMenuItem();
        JMenu_subMenuCadastrarCliente = new javax.swing.JMenuItem();
        JMenu_subMenuCadastrarBairro = new javax.swing.JMenuItem();
        JMenu_subMenuCadastrarCidade = new javax.swing.JMenuItem();
        JMenu_subMenuCadastrarOrdemServico = new javax.swing.JMenuItem();
        JMenu_pesquisa = new javax.swing.JMenu();
        JMenu_subMenuPesquisarUsuario = new javax.swing.JMenuItem();
        JMenu_subMenuPesquisarProfissional = new javax.swing.JMenuItem();
        JMenu_subMenuPesquisarCliente = new javax.swing.JMenuItem();
        JMenu_subMenuPesquisarBairro = new javax.swing.JMenuItem();
        JMenu_subMenuPesquisarCidade = new javax.swing.JMenuItem();
        JMenu_subMenuPesquisarOrdemServico = new javax.swing.JMenuItem();
        JMenu_relatorio = new javax.swing.JMenu();
        JMenu_subMenuTotalVendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lisa OS - Sistema de Ordem de Serviços");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                EventoGerarDataHoje(evt);
            }
        });

        desktopPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        desktopPrincipal.setForeground(new java.awt.Color(204, 204, 204));
        desktopPrincipal.setPreferredSize(new java.awt.Dimension(934, 534));

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 934, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        BTN_cadastrarCliente.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        BTN_cadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cliente_img.png"))); // NOI18N
        BTN_cadastrarCliente.setText("Cadastrar Cliente");
        BTN_cadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cadastrarCliente.setFocusPainted(false);
        BTN_cadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_cadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_cadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarClienteBotão(evt);
            }
        });

        BTN_cadastrarOrdemDeServico.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        BTN_cadastrarOrdemDeServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cadastrar_os.png"))); // NOI18N
        BTN_cadastrarOrdemDeServico.setText("Gerar OS");
        BTN_cadastrarOrdemDeServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_cadastrarOrdemDeServico.setFocusPainted(false);
        BTN_cadastrarOrdemDeServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_cadastrarOrdemDeServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_cadastrarOrdemDeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarOrdemDeServicoBotão(evt);
            }
        });

        BTN_pesquisarCliente.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        BTN_pesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar_cliente.png"))); // NOI18N
        BTN_pesquisarCliente.setText("Pesquisar Cliente");
        BTN_pesquisarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_pesquisarCliente.setFocusPainted(false);
        BTN_pesquisarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_pesquisarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_pesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarClienteBotao(evt);
            }
        });

        BTN_pesquisarOrdemDeServico.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        BTN_pesquisarOrdemDeServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar_os.png"))); // NOI18N
        BTN_pesquisarOrdemDeServico.setText("Pesquisar OS");
        BTN_pesquisarOrdemDeServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_pesquisarOrdemDeServico.setFocusPainted(false);
        BTN_pesquisarOrdemDeServico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_pesquisarOrdemDeServico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_pesquisarOrdemDeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarOSBotao(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_cadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_pesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_pesquisarOrdemDeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_cadastrarOrdemDeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BTN_cadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_pesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_cadastrarOrdemDeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_pesquisarOrdemDeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Usuário logado:");

        LB_usuarioLogado.setText("usuário_logado_sistema");

        LB_dataDoSistema.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        LB_dataDoSistema.setText("Contato: dyhalmeida@gmail.com");

        lb_data.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_data.setText("Data:");

        MENU_menuPrincipal.setBorder(null);
        MENU_menuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MENU_menuPrincipal.setPreferredSize(new java.awt.Dimension(224, 25));

        JMenu_opcao.setText("Opção");
        JMenu_opcao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_opcao.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        JMenu_subMenuSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuSobre.setText("Sobre");
        JMenu_subMenuSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoSobre(evt);
            }
        });
        JMenu_opcao.add(JMenu_subMenuSobre);

        JMenu_subMenuTrocaUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuTrocaUsuario.setText("Trocar Usuário");
        JMenu_subMenuTrocaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoTrocarUsuario(evt);
            }
        });
        JMenu_opcao.add(JMenu_subMenuTrocaUsuario);

        JMenu_subMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuSair.setText("Sair");
        JMenu_subMenuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoSairDoSistema(evt);
            }
        });
        JMenu_opcao.add(JMenu_subMenuSair);

        MENU_menuPrincipal.add(JMenu_opcao);

        JMenu_cadastro.setText("Cadastro");
        JMenu_cadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_cadastro.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        JMenu_subMenuCadastrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuCadastrarUsuario.setText("Cadastrar Usuário");
        JMenu_subMenuCadastrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarUsuario(evt);
            }
        });
        JMenu_cadastro.add(JMenu_subMenuCadastrarUsuario);

        JMenu_subMenuCadastrarProfissional.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuCadastrarProfissional.setText("Cadastrar Profissional");
        JMenu_subMenuCadastrarProfissional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuCadastrarProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarProfissional(evt);
            }
        });
        JMenu_cadastro.add(JMenu_subMenuCadastrarProfissional);

        JMenu_subMenuCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuCadastrarCliente.setText("Cadastrar Cliente");
        JMenu_subMenuCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarCliente(evt);
            }
        });
        JMenu_cadastro.add(JMenu_subMenuCadastrarCliente);

        JMenu_subMenuCadastrarBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuCadastrarBairro.setText("Cadastrar Bairro");
        JMenu_subMenuCadastrarBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuCadastrarBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarBairro(evt);
            }
        });
        JMenu_cadastro.add(JMenu_subMenuCadastrarBairro);

        JMenu_subMenuCadastrarCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuCadastrarCidade.setText("Cadastrar Cidade");
        JMenu_subMenuCadastrarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarCidade(evt);
            }
        });
        JMenu_cadastro.add(JMenu_subMenuCadastrarCidade);

        JMenu_subMenuCadastrarOrdemServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        JMenu_subMenuCadastrarOrdemServico.setText("Cadastrar Ordem de Serviço");
        JMenu_subMenuCadastrarOrdemServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuCadastrarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoCadastrarOrdemDeServico(evt);
            }
        });
        JMenu_cadastro.add(JMenu_subMenuCadastrarOrdemServico);

        MENU_menuPrincipal.add(JMenu_cadastro);

        JMenu_pesquisa.setText("Pesquisa");
        JMenu_pesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_pesquisa.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        JMenu_subMenuPesquisarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMenu_subMenuPesquisarUsuario.setText("Pesquisar Usuário");
        JMenu_subMenuPesquisarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarUsuario(evt);
            }
        });
        JMenu_pesquisa.add(JMenu_subMenuPesquisarUsuario);

        JMenu_subMenuPesquisarProfissional.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMenu_subMenuPesquisarProfissional.setText("Pesquisar Profissional");
        JMenu_subMenuPesquisarProfissional.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuPesquisarProfissional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarProfissional(evt);
            }
        });
        JMenu_pesquisa.add(JMenu_subMenuPesquisarProfissional);

        JMenu_subMenuPesquisarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMenu_subMenuPesquisarCliente.setText("Pesquisar Cliente");
        JMenu_subMenuPesquisarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarCliente(evt);
            }
        });
        JMenu_pesquisa.add(JMenu_subMenuPesquisarCliente);

        JMenu_subMenuPesquisarBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMenu_subMenuPesquisarBairro.setText("Pesquisar Bairro");
        JMenu_subMenuPesquisarBairro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuPesquisarBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarBairro(evt);
            }
        });
        JMenu_pesquisa.add(JMenu_subMenuPesquisarBairro);

        JMenu_subMenuPesquisarCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMenu_subMenuPesquisarCidade.setText("Pesquisar Cidade");
        JMenu_subMenuPesquisarCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuPesquisarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarCidade(evt);
            }
        });
        JMenu_pesquisa.add(JMenu_subMenuPesquisarCidade);

        JMenu_subMenuPesquisarOrdemServico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        JMenu_subMenuPesquisarOrdemServico.setText("Pesquisar Ordem de Serviço");
        JMenu_subMenuPesquisarOrdemServico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMenu_subMenuPesquisarOrdemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarOrdemDeServico(evt);
            }
        });
        JMenu_pesquisa.add(JMenu_subMenuPesquisarOrdemServico);

        MENU_menuPrincipal.add(JMenu_pesquisa);

        JMenu_relatorio.setText("Relatório");
        JMenu_relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JMenu_relatorio.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        JMenu_subMenuTotalVendas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        JMenu_subMenuTotalVendas.setText("Total Vendas");
        JMenu_subMenuTotalVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoTotalVendas(evt);
            }
        });
        JMenu_relatorio.add(JMenu_subMenuTotalVendas);

        MENU_menuPrincipal.add(JMenu_relatorio);

        setJMenuBar(MENU_menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desktopPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LB_usuarioLogado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_data)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LB_dataDoSistema)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(desktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LB_usuarioLogado)
                    .addComponent(LB_dataDoSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_data))
                .addGap(6, 6, 6))
        );

        setSize(new java.awt.Dimension(1116, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EventoSairDoSistema(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoSairDoSistema
        // Sair do sistema

        int opc = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (opc == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_EventoSairDoSistema

    private void EventoSobre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoSobre
        // Chamando janela sobre
        TelaSobre sobre = new TelaSobre(null, true);
        sobre.setVisible(true);

    }//GEN-LAST:event_EventoSobre

    private void EventoGerarDataHoje(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_EventoGerarDataHoje
        // Mostrar data de hoje no sistema

        Date data = new Date();
        DateFormat formatarData = DateFormat.getDateInstance(DateFormat.LONG);
        String dataAtual = formatarData.format(data.getTime());
        this.LB_dataDoSistema.setText(dataAtual);
    }//GEN-LAST:event_EventoGerarDataHoje

    private void EventoCadastrarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarUsuario
        // Chamando tela de cadastro de usuário
        TelaCadUsuario telaCadUsuario = new TelaCadUsuario();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (telaCadUsuario.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (telaCadUsuario.getHeight() / 2));

        telaCadUsuario.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        this.desktopPrincipal.add(telaCadUsuario);
        telaCadUsuario.setVisible(true);
    }//GEN-LAST:event_EventoCadastrarUsuario

    private void EventoCadastrarProfissional(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarProfissional
        // Chamando tela de cadastro de profissional
        TelaCadProfissional telaCadProfissional = new TelaCadProfissional();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (telaCadProfissional.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (telaCadProfissional.getHeight() / 2));

        telaCadProfissional.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        this.desktopPrincipal.add(telaCadProfissional);
        telaCadProfissional.setVisible(true);
    }//GEN-LAST:event_EventoCadastrarProfissional

    private void EventoCadastrarBairro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarBairro
        // Chamando tela de cadastro de bairro
        TelaCadBairro telaCadBairro = new TelaCadBairro();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (telaCadBairro.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (telaCadBairro.getHeight() / 2));

        telaCadBairro.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        this.desktopPrincipal.add(telaCadBairro);
        telaCadBairro.setVisible(true);
    }//GEN-LAST:event_EventoCadastrarBairro

    private void EventoCadastrarCidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarCidade
        // Chamando tela de cadastro de cidade
        TelaCadCidade telaCadCidade = new TelaCadCidade();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (telaCadCidade.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (telaCadCidade.getHeight() / 2));

        telaCadCidade.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(telaCadCidade);
        telaCadCidade.setVisible(true);
    }//GEN-LAST:event_EventoCadastrarCidade

    private void EventoCadastrarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarCliente
        // Chamando tela de cadastro de cliente
        TelaCadCliente telaCadCliente = new TelaCadCliente();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (telaCadCliente.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (telaCadCliente.getHeight() / 2));

        telaCadCliente.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(telaCadCliente);
        telaCadCliente.setVisible(true);
    }//GEN-LAST:event_EventoCadastrarCliente

    private void EventoCadastrarClienteBotão(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarClienteBotão
        // Chamando evento de tela do ciente
        EventoCadastrarCliente(evt);
    }//GEN-LAST:event_EventoCadastrarClienteBotão

    private void EventoCadastrarOrdemDeServicoBotão(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarOrdemDeServicoBotão
        EventoCadastrarOrdemDeServico(evt);
    }//GEN-LAST:event_EventoCadastrarOrdemDeServicoBotão

    private void EventoPesquisarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarUsuario
        TelaPesquisarUsuario tUusuario = new TelaPesquisarUsuario();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (tUusuario.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (tUusuario.getHeight() / 2));

        tUusuario.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(tUusuario);
        tUusuario.setVisible(true);
    }//GEN-LAST:event_EventoPesquisarUsuario

    private void EventoPesquisarProfissional(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarProfissional
        TelaPesquisaProfissional tpProfissional = new TelaPesquisaProfissional();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (tpProfissional.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (tpProfissional.getHeight() / 2));

        tpProfissional.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(tpProfissional);
        tpProfissional.setVisible(true);
    }//GEN-LAST:event_EventoPesquisarProfissional

    private void EventoTrocarUsuario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoTrocarUsuario
        this.dispose();
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_EventoTrocarUsuario

    private void EventoPesquisarBairro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarBairro
        // Chamando tela pesquisa de bairro
        TelaPesquisaBairro tpBairro = new TelaPesquisaBairro();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (tpBairro.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (tpBairro.getHeight() / 2));

        tpBairro.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(tpBairro);
        tpBairro.setVisible(true);
    }//GEN-LAST:event_EventoPesquisarBairro

    private void EventoCadastrarOrdemDeServico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoCadastrarOrdemDeServico
        // Action para abrir janela de cadastro de OS
        TelaCadOs telaOs = new TelaCadOs(LB_usuarioLogado.getText());

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (telaOs.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (telaOs.getHeight() / 2));

        telaOs.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(telaOs);
        telaOs.setVisible(true);
    }//GEN-LAST:event_EventoCadastrarOrdemDeServico

    private void EventoPesquisarCidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarCidade
        // Action para abrir janela de pesquisa de cidade
        TelaPesquisaCidade tpCidade = new TelaPesquisaCidade();

        setDistanciaHorizontal((desktopPrincipal.getWidth() / 2) - (tpCidade.getWidth() / 2));
        setDistanciaVertical((desktopPrincipal.getHeight() / 2) - (tpCidade.getHeight() / 2));

        tpCidade.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(tpCidade);
        tpCidade.setVisible(true);
    }//GEN-LAST:event_EventoPesquisarCidade

    private void EventoPesquisarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarCliente
        // Action para abrir tela de pesquisa de cliente
        TelaPesquisaCliente tpCliente = new TelaPesquisaCliente();
        //As duas linhas abaixo seta a posição da JInternalframe no DesktopPane
        setDistanciaHorizontal(((desktopPrincipal.getWidth() / 2) - (tpCliente.getWidth() / 2)));
        setDistanciaVertical(((desktopPrincipal.getHeight() / 2) - (tpCliente.getHeight() / 2)));

        tpCliente.setLocation(getDistanciaHorizontal(), getDistanciaVertical());

        desktopPrincipal.add(tpCliente);
        tpCliente.setVisible(true);
    }//GEN-LAST:event_EventoPesquisarCliente

    private void EventoPesquisarOrdemDeServico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarOrdemDeServico
        EventoPesquisarOSBotao(evt);

    }//GEN-LAST:event_EventoPesquisarOrdemDeServico

    private void EventoPesquisarClienteBotao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarClienteBotao
        EventoPesquisarCliente(evt);
    }//GEN-LAST:event_EventoPesquisarClienteBotao

    private void EventoPesquisarOSBotao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarOSBotao
       //Action para abrir tela de pesquisa de ordem de serviço
       TelaPesquisaOS tpOS = new TelaPesquisaOS();
       
        //As duas linhas abaixo seta a posição da JInternalframe no DesktopPane
        setDistanciaHorizontal(((desktopPrincipal.getWidth() / 2) - (tpOS.getWidth() / 2)));
        setDistanciaVertical(((desktopPrincipal.getHeight() / 2) - (tpOS.getHeight() / 2)));

        tpOS.setLocation(getDistanciaHorizontal(), getDistanciaVertical());
        
         desktopPrincipal.add(tpOS);
        tpOS.setVisible(true);     
    }//GEN-LAST:event_EventoPesquisarOSBotao

    private void EventoTotalVendas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoTotalVendas
        // Evento abrir janela total vendas
        telaTotalVendas.setVisible(true);
    }//GEN-LAST:event_EventoTotalVendas

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_cadastrarCliente;
    private javax.swing.JButton BTN_cadastrarOrdemDeServico;
    private javax.swing.JButton BTN_pesquisarCliente;
    private javax.swing.JButton BTN_pesquisarOrdemDeServico;
    private javax.swing.JMenu JMenu_cadastro;
    private javax.swing.JMenu JMenu_opcao;
    private javax.swing.JMenu JMenu_pesquisa;
    private javax.swing.JMenu JMenu_relatorio;
    private javax.swing.JMenuItem JMenu_subMenuCadastrarBairro;
    private javax.swing.JMenuItem JMenu_subMenuCadastrarCidade;
    private javax.swing.JMenuItem JMenu_subMenuCadastrarCliente;
    private javax.swing.JMenuItem JMenu_subMenuCadastrarOrdemServico;
    private javax.swing.JMenuItem JMenu_subMenuCadastrarProfissional;
    private javax.swing.JMenuItem JMenu_subMenuCadastrarUsuario;
    private javax.swing.JMenuItem JMenu_subMenuPesquisarBairro;
    private javax.swing.JMenuItem JMenu_subMenuPesquisarCidade;
    private javax.swing.JMenuItem JMenu_subMenuPesquisarCliente;
    private javax.swing.JMenuItem JMenu_subMenuPesquisarOrdemServico;
    private javax.swing.JMenuItem JMenu_subMenuPesquisarProfissional;
    private javax.swing.JMenuItem JMenu_subMenuPesquisarUsuario;
    private javax.swing.JMenuItem JMenu_subMenuSair;
    private javax.swing.JMenuItem JMenu_subMenuSobre;
    private javax.swing.JMenuItem JMenu_subMenuTotalVendas;
    private javax.swing.JMenuItem JMenu_subMenuTrocaUsuario;
    private javax.swing.JLabel LB_dataDoSistema;
    private javax.swing.JLabel LB_usuarioLogado;
    private javax.swing.JMenuBar MENU_menuPrincipal;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_data;
    // End of variables declaration//GEN-END:variables

    private int distanciaHorizontal;
    private int distanciaVertical;
    TelaTotalVendas telaTotalVendas;

    public int getDistanciaHorizontal() {
        return distanciaHorizontal;
    }

    public void setDistanciaHorizontal(int distanciaHorizontal) {
        this.distanciaHorizontal = distanciaHorizontal;
    }

    public int getDistanciaVertical() {
        return distanciaVertical;
    }

    public void setDistanciaVertical(int distanciaVertical) {
        this.distanciaVertical = distanciaVertical;
    }

    public PrincipalTela() {
        initComponents();
//        setarIcon();
        telaTotalVendas = new TelaTotalVendas(null, false);
    }

    public void setLb_usuarioLogado(String usuarioLogado) {
        this.LB_usuarioLogado.setText(usuarioLogado);
    }

    private void setarIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/lisa/Imagens/icon_logo.png")).getImage());
    }
}
