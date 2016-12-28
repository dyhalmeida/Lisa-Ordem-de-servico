package lisa.Telas;

import javax.swing.JOptionPane;
import lisa.Modelo.dao.BairroDao;
import lisa.Modelo.beans.Bairro;

public class TelaCadBairro extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_fotoBairroCad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbn_titulo_bairroCad = new javax.swing.JLabel();
        lb_id_bairroCad = new javax.swing.JLabel();
        lbn_bairroCad = new javax.swing.JLabel();
        jt_nome_bairroCad = new javax.swing.JTextField();
        lb_camposObrigatorioBairro = new javax.swing.JLabel();
        btn_cancelarCadBairro = new javax.swing.JButton();
        btn_cadastrarBairro = new javax.swing.JButton();
        jt_idBairroCad = new javax.swing.JFormattedTextField();

        setIconifiable(true);
        setTitle("Cadastro de bairro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_fotoBairroCad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/bairro_img.png"))); // NOI18N
        getContentPane().add(lb_fotoBairroCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 11, 96, 70));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, 374, 10));

        lbn_titulo_bairroCad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbn_titulo_bairroCad.setText("Cadastro de bairro");
        getContentPane().add(lbn_titulo_bairroCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        lb_id_bairroCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_id_bairroCad.setText("ID*");
        getContentPane().add(lb_id_bairroCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        lbn_bairroCad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbn_bairroCad.setText("Bairro*");
        getContentPane().add(lbn_bairroCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jt_nome_bairroCad.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        getContentPane().add(jt_nome_bairroCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 200, 25));

        lb_camposObrigatorioBairro.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        lb_camposObrigatorioBairro.setText("* campos obrigatórios");
        getContentPane().add(lb_camposObrigatorioBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        btn_cancelarCadBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        btn_cancelarCadBairro.setText("Cancelar");
        btn_cancelarCadBairro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cancelarCadBairro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cancelarCadBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarCadBairroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancelarCadBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 90, 80));

        btn_cadastrarBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        btn_cadastrarBairro.setText("Cadastrar");
        btn_cadastrarBairro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cadastrarBairro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cadastrarBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarBairroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cadastrarBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 90, 80));

        jt_idBairroCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        getContentPane().add(jt_idBairroCad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 50, 25));

        setBounds(180, 20, 410, 314);
    }// </editor-fold>//GEN-END:initComponents

    //Botões do Jframe
    
    private void btn_cancelarCadBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarCadBairroActionPerformed
        // Cancelar cadastro de usuário
        this.dispose();
    }//GEN-LAST:event_btn_cancelarCadBairroActionPerformed

    private void btn_cadastrarBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarBairroActionPerformed
        // Cadastrar Bairro
        this.cadastrarBairro();

    }//GEN-LAST:event_btn_cadastrarBairroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrarBairro;
    private javax.swing.JButton btn_cancelarCadBairro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField jt_idBairroCad;
    private javax.swing.JTextField jt_nome_bairroCad;
    private javax.swing.JLabel lb_camposObrigatorioBairro;
    private javax.swing.JLabel lb_fotoBairroCad;
    private javax.swing.JLabel lb_id_bairroCad;
    private javax.swing.JLabel lbn_bairroCad;
    private javax.swing.JLabel lbn_titulo_bairroCad;
    // End of variables declaration//GEN-END:variables

    public TelaCadBairro() {
        initComponents();
    }

    /**
     * Método p/ cadastrar bairro com dados selecionado da Interface Gráfica
     */
    public void cadastrarBairro() {

        Bairro bairro = new Bairro();
        bairro.setId(jt_idBairroCad.getText());
        bairro.setBairro(jt_nome_bairroCad.getText());

        if (bairro.verificarCamposBairro() == false) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {

            BairroDao bairroDao = new BairroDao();
            boolean verificarCadastroBairro = bairroDao.cadastrarBairro(bairro);

            if (verificarCadastroBairro) {
                JOptionPane.showMessageDialog(null, "Bairro cadastrado com sucesso!");
                limparCampos();

            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível cadastrar este bairro!");
            }
        }
    }

    private void limparCampos() {
        jt_idBairroCad.setText(null);
        jt_nome_bairroCad.setText(null);
    }

}
