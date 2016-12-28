/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisa.Telas;

import javax.swing.ImageIcon;
import lisa.Modelo.beans.Bairro;
import lisa.Modelo.dao.BairroDao;

/**
 *
 * @author Marcação-Hospital
 */
public class JanelaBairroCliente extends javax.swing.JDialog {

    
    //Métodos getters e setters
    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
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

        btn_okJanelaBairro = new javax.swing.JButton();
        btn_cancelarJanelaBairro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jc_janelaBairro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Bairro");

        btn_okJanelaBairro.setText("OK");
        btn_okJanelaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okJanelaBairroActionPerformed(evt);
            }
        });

        btn_cancelarJanelaBairro.setText("Cancelar");
        btn_cancelarJanelaBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarJanelaBairroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Bairro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cancelarJanelaBairro)
                        .addGap(18, 18, 18)
                        .addComponent(btn_okJanelaBairro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jc_janelaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jc_janelaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_okJanelaBairro)
                    .addComponent(btn_cancelarJanelaBairro))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(263, 137));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okJanelaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okJanelaBairroActionPerformed
        //Setando o Objeto bairro com o item selecionado do JcomboBox
        setBairro((Bairro) jc_janelaBairro.getSelectedItem());
        dispose();
        setFechouJanela(true);
    }//GEN-LAST:event_btn_okJanelaBairroActionPerformed

    private void btn_cancelarJanelaBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarJanelaBairroActionPerformed
        // Action para fechar janela bairro
        dispose();
    }//GEN-LAST:event_btn_cancelarJanelaBairroActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JanelaBairroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaBairroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaBairroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaBairroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaBairroCliente dialog = new JanelaBairroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_cancelarJanelaBairro;
    private javax.swing.JButton btn_okJanelaBairro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<Object> jc_janelaBairro;
    // End of variables declaration//GEN-END:variables

    BairroDao bairroDao = new BairroDao();
    private Bairro bairro;
    private boolean fechouJanela;

    public JanelaBairroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        setarIcon();
       
        //Pesquisando uma lista de bairro do banco de dados
        for (Bairro bairro : bairroDao.pesquisarBairro()) {
            //Adicionando os bairro como item do JcomboBox
            jc_janelaBairro.addItem(bairro);
        }
    }
    
    private void setarIcon(){
         this.setIconImage(new ImageIcon(getClass().getResource("/lisa/Imagens/icon_logo.png")).getImage());
    }
}
