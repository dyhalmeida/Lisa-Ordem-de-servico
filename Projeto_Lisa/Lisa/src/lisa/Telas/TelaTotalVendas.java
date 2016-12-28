package lisa.Telas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lisa.Modelo.dao.OrdemServicoDao;
import lisa.Relatorio.dao.Relatorio;

public class TelaTotalVendas extends javax.swing.JDialog {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_vendas = new javax.swing.JPanel();
        JTF_dataEntradaPesquisaVendas = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        LB_totalVendas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LB_tituloTotalVendas = new javax.swing.JLabel();
        BTN_imprimirTotalVendas = new javax.swing.JButton();
        BTN_cancelarTotalVendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Total de Vendas");
        setResizable(false);

        JP_vendas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        try {
            JTF_dataEntradaPesquisaVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoPesquisarValorTotal(evt);
            }
        });

        LB_totalVendas.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LB_totalVendas.setText("0.0");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/Money_img.png"))); // NOI18N

        LB_tituloTotalVendas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LB_tituloTotalVendas.setText("Total R$:");

        javax.swing.GroupLayout JP_vendasLayout = new javax.swing.GroupLayout(JP_vendas);
        JP_vendas.setLayout(JP_vendasLayout);
        JP_vendasLayout.setHorizontalGroup(
            JP_vendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_vendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_vendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_vendasLayout.createSequentialGroup()
                        .addComponent(JTF_dataEntradaPesquisaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(JP_vendasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(JP_vendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LB_tituloTotalVendas)
                            .addComponent(LB_totalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        JP_vendasLayout.setVerticalGroup(
            JP_vendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_vendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JP_vendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTF_dataEntradaPesquisaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(JP_vendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_vendasLayout.createSequentialGroup()
                        .addComponent(LB_tituloTotalVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LB_totalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        BTN_imprimirTotalVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        BTN_imprimirTotalVendas.setText("Imprimir");
        BTN_imprimirTotalVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_imprimirTotalVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_imprimirTotalVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirTotalVendas(evt);
            }
        });

        BTN_cancelarTotalVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        BTN_cancelarTotalVendas.setText("Cancelar");
        BTN_cancelarTotalVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_cancelarTotalVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_cancelarTotalVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoFecharTotalvendas(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JP_vendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTN_imprimirTotalVendas)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_cancelarTotalVendas)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(JP_vendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_imprimirTotalVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN_cancelarTotalVendas, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(416, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EventoPesquisarValorTotal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoPesquisarValorTotal
        // Evento p/ pesquisar valor total OS
        double valorTotal = osDao.pesquisarValorTotalOS(JTF_dataEntradaPesquisaVendas.getText());
        LB_totalVendas.setText(String.valueOf(valorTotal));
    }//GEN-LAST:event_EventoPesquisarValorTotal

    private void EventoFecharTotalvendas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoFecharTotalvendas
        // Evento p/ fechar janela total vendas
        dispose();
        LB_totalVendas.setText("0.0");
        JTF_dataEntradaPesquisaVendas.setText(null);
    }//GEN-LAST:event_EventoFecharTotalvendas

    private void imprimirTotalVendas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirTotalVendas
        // Gerando impressão de total vendas
        int opc = JOptionPane.showConfirmDialog(null,"Deseja imprimir o total de vendas para esta data?","Atenção",JOptionPane.YES_NO_OPTION);
        if(opc == JOptionPane.YES_OPTION){
            Relatorio rel = new Relatorio();
            rel.relatorioTotalVendas(JTF_dataEntradaPesquisaVendas.getText());
        }
    }//GEN-LAST:event_imprimirTotalVendas

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
            java.util.logging.Logger.getLogger(TelaTotalVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTotalVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTotalVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTotalVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaTotalVendas dialog = new TelaTotalVendas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BTN_cancelarTotalVendas;
    private javax.swing.JButton BTN_imprimirTotalVendas;
    private javax.swing.JPanel JP_vendas;
    private javax.swing.JFormattedTextField JTF_dataEntradaPesquisaVendas;
    private javax.swing.JLabel LB_tituloTotalVendas;
    private javax.swing.JLabel LB_totalVendas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
   
    OrdemServicoDao osDao;
    
    public TelaTotalVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        setIcon();
        osDao = new OrdemServicoDao();
    }
    
     private void setIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/lisa/Imagens/icon_logo.png")).getImage());
    }
}
