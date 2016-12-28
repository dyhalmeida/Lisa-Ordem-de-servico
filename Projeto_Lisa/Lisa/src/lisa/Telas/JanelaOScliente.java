package lisa.Telas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lisa.Modelo.beans.Cliente;
//import lisa.Modelo.beans.Profissional;
import lisa.Modelo.dao.ClienteDao;
//import lisa.Modelo.dao.ProfissionalDao;

public class JanelaOScliente extends javax.swing.JDialog {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        JTF_campoPesquisaClienteOS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tabelaPesquisaClienteOS = new javax.swing.JTable();
        BTN_OKPesquisaClienteOS = new javax.swing.JButton();
        BTN_cancelarPesquisaClienteOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de cliente");
        setModal(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N

        JTF_campoPesquisaClienteOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EventoPesquisarCliente(evt);
            }
        });

        JT_tabelaPesquisaClienteOS.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        JT_tabelaPesquisaClienteOS.setModel(new javax.swing.table.DefaultTableModel(
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
        JT_tabelaPesquisaClienteOS.setSelectionBackground(new java.awt.Color(0, 0, 0));
        JT_tabelaPesquisaClienteOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventoCliqueNaTabela(evt);
            }
        });
        jScrollPane1.setViewportView(JT_tabelaPesquisaClienteOS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 848, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTF_campoPesquisaClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTF_campoPesquisaClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BTN_OKPesquisaClienteOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        BTN_OKPesquisaClienteOS.setText("OK");
        BTN_OKPesquisaClienteOS.setEnabled(false);
        BTN_OKPesquisaClienteOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_OKPesquisaClienteOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_OKPesquisaClienteOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoGetCliente(evt);
            }
        });

        BTN_cancelarPesquisaClienteOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        BTN_cancelarPesquisaClienteOS.setText("Cancelar");
        BTN_cancelarPesquisaClienteOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_cancelarPesquisaClienteOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_cancelarPesquisaClienteOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventoFecharJanela(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_OKPesquisaClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(BTN_cancelarPesquisaClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_OKPesquisaClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_cancelarPesquisaClienteOS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(916, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventoGetCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoGetCliente
        // Evento p/ pegar um objeto cliente cadastrado
        getClienteTabela();
        dispose();
        setFechouJanela(true);


    }//GEN-LAST:event_eventoGetCliente

    private void EventoPesquisarCliente(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventoPesquisarCliente
        // Evento p/ pesquisar profissional
        String nomeCliente = JTF_campoPesquisaClienteOS.getText();
        //Pesquisando cliente pelo nome
        clienteDao.pesquisarClienteFiltro(nomeCliente, "JanelaOScliente");
    }//GEN-LAST:event_EventoPesquisarCliente

    private void EventoCliqueNaTabela(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventoCliqueNaTabela
        try {
            //Botão pesquisa ativa
            BTN_OKPesquisaClienteOS.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa do cliente!");
            BTN_OKPesquisaClienteOS.setEnabled(false);
        }
    }//GEN-LAST:event_EventoCliqueNaTabela

    private void EventoFecharJanela(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventoFecharJanela
        // Evento p/ fechar janela
        dispose();
    }//GEN-LAST:event_EventoFecharJanela

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
            java.util.logging.Logger.getLogger(JanelaOScliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaOScliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaOScliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaOScliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaOScliente dialog = new JanelaOScliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BTN_OKPesquisaClienteOS;
    private javax.swing.JButton BTN_cancelarPesquisaClienteOS;
    private javax.swing.JTextField JTF_campoPesquisaClienteOS;
    public static javax.swing.JTable JT_tabelaPesquisaClienteOS;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    Cliente cliente;
    ClienteDao clienteDao;
    boolean fechouJanela;

    private void setIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/lisa/Imagens/icon_logo.png")).getImage());
    }
    
    /**
     * Método para pegar um cliente selecionado na tabela
     */
    private void getClienteTabela() {
        //A linha abaixo pega a linha selecionada na tabela
        int setar = JT_tabelaPesquisaClienteOS.getSelectedRow();
        try {
           //Setando um objeto cliente com dados selecionados da tabela
           cliente.setId(JT_tabelaPesquisaClienteOS.getModel().getValueAt(setar, 0).toString());
           cliente.setNome(JT_tabelaPesquisaClienteOS.getModel().getValueAt(setar, 1).toString());
           cliente.setSobrenome(JT_tabelaPesquisaClienteOS.getModel().getValueAt(setar, 2).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isFechouJanela() {
        return fechouJanela;
    }

    public void setFechouJanela(boolean fechouJanela) {
        this.fechouJanela = fechouJanela;
    }

    //Construtor
    public JanelaOScliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
//        setIcon();
        cliente = new Cliente();
        clienteDao = new ClienteDao();
    }

    public Cliente getCliente() {
        return cliente;
    }

}
