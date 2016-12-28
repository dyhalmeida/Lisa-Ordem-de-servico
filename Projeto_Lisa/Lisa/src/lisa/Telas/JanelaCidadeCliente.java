package lisa.Telas;

/**
 * @importação bibliotecas
 */
import javax.swing.ImageIcon;
import lisa.Modelo.beans.Cidade;
import lisa.Modelo.dao.CidadeDao;

public class JanelaCidadeCliente extends javax.swing.JDialog {

    
    //Métodos Getters e Setters
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public boolean isFechouJanela() {
        return fechouJanela;
    }

    public void setFechouJanela(boolean fechouJanela) {
        this.fechouJanela = fechouJanela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_okJanelaCidade = new javax.swing.JButton();
        btn_cancelarJanelaCidade = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jc_janelaCidade = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Cidade");

        btn_okJanelaCidade.setText("OK");
        btn_okJanelaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okJanelaCidadeActionPerformed(evt);
            }
        });

        btn_cancelarJanelaCidade.setText("Cancelar");
        btn_cancelarJanelaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarJanelaCidadeActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel.setText("Cidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cancelarJanelaCidade)
                        .addGap(18, 18, 18)
                        .addComponent(btn_okJanelaCidade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc_janelaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(jc_janelaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_okJanelaCidade)
                    .addComponent(btn_cancelarJanelaCidade))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(263, 137));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okJanelaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okJanelaCidadeActionPerformed
        //Setando objeto cidade com item selecionado do JcomboBox
        setCidade((Cidade) jc_janelaCidade.getSelectedItem());
        dispose();
        setFechouJanela(true);
    }//GEN-LAST:event_btn_okJanelaCidadeActionPerformed

    private void btn_cancelarJanelaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarJanelaCidadeActionPerformed
        // Action para fechar janela bairro
        dispose();
    }//GEN-LAST:event_btn_cancelarJanelaCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaCidadeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCidadeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCidadeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCidadeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaCidadeCliente dialog = new JanelaCidadeCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelarJanelaCidade;
    private javax.swing.JButton btn_okJanelaCidade;
    private javax.swing.JLabel jLabel;
    private javax.swing.JComboBox<Object> jc_janelaCidade;
    // End of variables declaration//GEN-END:variables

    CidadeDao cidadeDao = new CidadeDao();
    private Cidade cidade;
    private boolean fechouJanela;

    public JanelaCidadeCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        setarIcon();
        
        //Pesquisando lista de objetos cidades no banco de dados
        for (Cidade cidade : cidadeDao.pesquisarCidade()) {
            jc_janelaCidade.addItem(cidade);
        }
    }

    private void setarIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/lisa/Imagens/icon_logo.png")).getImage());
    }
}
