package lisa.Telas;

import javax.swing.JOptionPane;
import lisa.Modelo.dao.UsuarioDao;
import lisa.Modelo.beans.Usuario;

public class TelaCadUsuario extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt_nomeUsuario = new javax.swing.JTextField();
        jt_loginUsuario = new javax.swing.JTextField();
        jt_sobrenomeUsuario = new javax.swing.JTextField();
        jt_senhaUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_camposObrigatorioUsuario = new javax.swing.JLabel();
        btn_cancelarCad = new javax.swing.JButton();
        btn_cadastrarUsu = new javax.swing.JButton();
        jt_idUsuario = new javax.swing.JFormattedTextField();

        setIconifiable(true);
        setTitle("Cadastro de usuário");
        setPreferredSize(new java.awt.Dimension(920, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de usuário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nome*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Sobrenome*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Login*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Senha*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jt_nomeUsuario.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        getContentPane().add(jt_nomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, -1));

        jt_loginUsuario.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        getContentPane().add(jt_loginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, -1));

        jt_sobrenomeUsuario.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        getContentPane().add(jt_sobrenomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 200, -1));

        jt_senhaUsuario.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        getContentPane().add(jt_senhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 200, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/usuario_add_img.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 450, 10));

        lb_camposObrigatorioUsuario.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        lb_camposObrigatorioUsuario.setText("* campos obrigatórios");
        getContentPane().add(lb_camposObrigatorioUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        btn_cancelarCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarCad.setText("Cancelar");
        btn_cancelarCad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarCad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCadActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelarCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 90, 80));

        btn_cadastrarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_cadastrarUsu.setText("Cadastrar");
        btn_cadastrarUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cadastrarUsu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cadastrarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarUsuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 90, 80));

        jt_idUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jt_idUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 50, 30));

        setBounds(10, 10, 482, 435);
    }// </editor-fold>//GEN-END:initComponents

    //Métodos dos botões da interface
    
    private void btn_cancelarCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCadActionPerformed
        // Cancelar cadastro de usuário
        this.dispose();
    }//GEN-LAST:event_btn_cancelarCadActionPerformed

    private void btn_cadastrarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarUsuActionPerformed
        // Cadastrar Usuário
        this.cadastrarUsuario();
    }//GEN-LAST:event_btn_cadastrarUsuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarUsu;
    private javax.swing.JButton btn_cancelarCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField jt_idUsuario;
    private javax.swing.JTextField jt_loginUsuario;
    private javax.swing.JTextField jt_nomeUsuario;
    private javax.swing.JTextField jt_senhaUsuario;
    private javax.swing.JTextField jt_sobrenomeUsuario;
    private javax.swing.JLabel lb_camposObrigatorioUsuario;
    // End of variables declaration//GEN-END:variables

    public TelaCadUsuario() {

        initComponents();
    }

    private void cadastrarUsuario() {
        
        Usuario usuario = new Usuario();
        
        usuario.setId(this.jt_idUsuario.getText());
        usuario.setNome(this.jt_nomeUsuario.getText());
        usuario.setSobrenome(this.jt_sobrenomeUsuario.getText());
        usuario.setLogin(this.jt_loginUsuario.getText());
        usuario.setSenha(this.jt_senhaUsuario.getText());

        if (usuario.verificarCamposUsuario() == false) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
        } else {

            //Passar objeto para cadastro
            UsuarioDao cadUsuario = new UsuarioDao();
            boolean verificarSeCadastrou = cadUsuario.cadastrarUsuario(usuario);

            if (verificarSeCadastrou) {
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                limparCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar este usuário!");
            }

        }

    }

    private void limparCampos() {
        jt_idUsuario.setText(null);
        jt_nomeUsuario.setText(null);
        jt_sobrenomeUsuario.setText(null);
        jt_loginUsuario.setText(null);
        jt_senhaUsuario.setText(null);
    }

}
