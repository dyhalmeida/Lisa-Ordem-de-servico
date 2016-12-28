package lisa.Telas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lisa.Modelo.dao.LoginSistemaDao;
import lisa.Modelo.beans.UsuarioLogin;

public class TelaLogin extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbn_logotipo = new javax.swing.JLabel();
        jt_login_usuario = new javax.swing.JTextField();
        jt_senha_usuario = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        lb_loginUsuario = new javax.swing.JLabel();
        lb_senhaUsuario = new javax.swing.JLabel();
        lbn_lis = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Lisa OS");
        setResizable(false);

        lbn_logotipo.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        lbn_logotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/logo_img.png"))); // NOI18N

        jt_login_usuario.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jt_login_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jt_senha_usuario.setFont(new java.awt.Font("Times New Roman", 2, 20)); // NOI18N
        jt_senha_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        lb_loginUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_loginUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/login_img.png"))); // NOI18N
        lb_loginUsuario.setText("Login");

        lb_senhaUsuario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_senhaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/senha_img.png"))); // NOI18N
        lb_senhaUsuario.setText("Senha");

        lbn_lis.setFont(new java.awt.Font("Times New Roman", 2, 100)); // NOI18N
        lbn_lis.setForeground(new java.awt.Color(204, 0, 51));
        lbn_lis.setText("LIS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lbn_lis)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lbn_logotipo))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_senhaUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jt_senha_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lb_loginUsuario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jt_login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbn_logotipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbn_lis, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_loginUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt_senha_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_senhaUsuario))
                .addGap(12, 12, 12)
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(371, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Evento para logar no sistema
    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        // Chamada do método logarSistema();
        this.logarSistema();
    }//GEN-LAST:event_btn_entrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entrar;
    private javax.swing.JTextField jt_login_usuario;
    private javax.swing.JPasswordField jt_senha_usuario;
    private javax.swing.JLabel lb_loginUsuario;
    private javax.swing.JLabel lb_senhaUsuario;
    private javax.swing.JLabel lbn_lis;
    private javax.swing.JLabel lbn_logotipo;
    // End of variables declaration//GEN-END:variables
    
    //Variavel p/ armazenar nome do usuário logado
    private String usuarioLogado;

    /**
     * Construtor da classe - TelaLogin() - Inicializa os componetes de tela. -
     * Modifica o icon de janela para logo do sistema. - Conecta ao banco de
     * dados do sistema.
     */
    public TelaLogin() {
        initComponents();

         //A linha abaixo altera o icone padrão da janela
        //setarIcon();
      
    }

    /**
     * Método verificarUsuarioNoBanco()
     *
     * @return 0 : Campos sem preencher.
     * @return 1 : Login e senha existir
     * @return 2 : Login e/ou senha inválido(s).
     */
    private int verificarUsuarioNoBanco() {

        //As duas linhas abaixo pega o texto da janela pelos getText() de cada componete
        //e armazena nos atributos do usuLogin.
        UsuarioLogin usuLogin = new UsuarioLogin();
        usuLogin.setLogin(this.jt_login_usuario.getText());
        String senha = new String(this.jt_senha_usuario.getPassword());
        usuLogin.setSenha(senha);

        // Condição para testar se campos estão vazios
        // retorna 0 se estiver vázios
        if (usuLogin.verificarCamposUsuarioLogin() == false) {
            return 0;
        } else {

            // Se os campos não estiverem vázios, é criado objeto LoginSistema
            // Os campos preenchidos são passados pelos
            // objeto loginSistema.
            LoginSistemaDao loginSistema = new LoginSistemaDao();

            //O getLogin_Senha, retorna true se usuário existir ou false se não existir
            boolean verificarLogin = loginSistema.getLoginSenha(usuLogin);

            if (verificarLogin) {
                // Atribui à variavel usuarioLogado o valor retornado pelo método
                this.usuarioLogado = loginSistema.getUsuarioLogado();
                return 1;
            } else {
                return 2;
            }
        }

    }

    private void logarSistema() {
        switch (this.verificarUsuarioNoBanco()) {
            case 0:
                JOptionPane.showMessageDialog(null, "Preencha os campos usuário e senha!");
                break;
            case 1:

                // Chama Tela Principal
                PrincipalTela telaP = new PrincipalTela();

                // Seta qual usuário está logado na telaPrincipal
                telaP.setLb_usuarioLogado(this.usuarioLogado);

                //Fecha TelaLogin
                this.dispose();

                //Mostra telaPrincipal
                telaP.setVisible(true);

                //System.out.println("Entrou no sistema");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s).");
                break;
        }
    }
    
    private void setarIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/lisa/imagens/icon_logo.png")).getImage());
    }
}
