package lisa.Telas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import lisa.Modelo.beans.Profissional;
import lisa.Modelo.dao.ProfissionalDao;

public class JanelaOSprofissional extends javax.swing.JDialog {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        JTF_campoPesquisaProfissionalOS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_tabelaPesquisaProfissionalOS = new javax.swing.JTable();
        BTN_OKPesquisaProfissionalOS = new javax.swing.JButton();
        BTN_cancelarPesquisaProfissionalOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa de profissional");
        setModal(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Profissional", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/pesquisar25_img.png"))); // NOI18N

        JTF_campoPesquisaProfissionalOS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EventoPesquisarProfissional(evt);
            }
        });

        JT_tabelaPesquisaProfissionalOS.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        JT_tabelaPesquisaProfissionalOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "NOME", "SOBRENOME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JT_tabelaPesquisaProfissionalOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventoCliqueNaTabela(evt);
            }
        });
        jScrollPane1.setViewportView(JT_tabelaPesquisaProfissionalOS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JTF_campoPesquisaProfissionalOS, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(JTF_campoPesquisaProfissionalOS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BTN_OKPesquisaProfissionalOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/ok_img.png"))); // NOI18N
        BTN_OKPesquisaProfissionalOS.setText("OK");
        BTN_OKPesquisaProfissionalOS.setEnabled(false);
        BTN_OKPesquisaProfissionalOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_OKPesquisaProfissionalOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_OKPesquisaProfissionalOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventoGetProfissional(evt);
            }
        });

        BTN_cancelarPesquisaProfissionalOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lisa/Imagens/cancel_img.png"))); // NOI18N
        BTN_cancelarPesquisaProfissionalOS.setText("Cancelar");
        BTN_cancelarPesquisaProfissionalOS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BTN_cancelarPesquisaProfissionalOS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BTN_cancelarPesquisaProfissionalOS.addActionListener(new java.awt.event.ActionListener() {
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
                    .addComponent(BTN_OKPesquisaProfissionalOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(BTN_cancelarPesquisaProfissionalOS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_OKPesquisaProfissionalOS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_cancelarPesquisaProfissionalOS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(616, 379));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eventoGetProfissional(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventoGetProfissional
        // Evento p/ pegar profissional
        getProfissionalTabela();
        dispose();
        setFechouJanela(true);


    }//GEN-LAST:event_eventoGetProfissional

    private void EventoPesquisarProfissional(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EventoPesquisarProfissional
        // Evento p/ pesquisar profissional
        String nomeProfissional = JTF_campoPesquisaProfissionalOS.getText();
        
        //Pesquisando profissional no banco de dados através do seu nome
        profissionalDao.pesquisarProfissionalFiltro(nomeProfissional, "JanelaOSprofissional");
    }//GEN-LAST:event_EventoPesquisarProfissional

    private void EventoCliqueNaTabela(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventoCliqueNaTabela
        try {
            //Com clique na linha da tabela, o botão ok é ativado
            BTN_OKPesquisaProfissionalOS.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "É necessário fazer a pesquisa do profissional!");
            BTN_OKPesquisaProfissionalOS.setEnabled(false);
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
            java.util.logging.Logger.getLogger(JanelaOSprofissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaOSprofissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaOSprofissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaOSprofissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaOSprofissional dialog = new JanelaOSprofissional(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton BTN_OKPesquisaProfissionalOS;
    private javax.swing.JButton BTN_cancelarPesquisaProfissionalOS;
    private javax.swing.JTextField JTF_campoPesquisaProfissionalOS;
    public static javax.swing.JTable JT_tabelaPesquisaProfissionalOS;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    Profissional profissional;
    ProfissionalDao profissionalDao;
    boolean fechouJanela;

    private void setIcon() {
        this.setIconImage(new ImageIcon(getClass().getResource("/lisa/Imagens/icon_logo.png")).getImage());
    }

    private void getProfissionalTabela() {
        
        //A linha seleciona a linha da tabela
        int setar = JT_tabelaPesquisaProfissionalOS.getSelectedRow();
        try {
            //Preenchendo objeto profissional com dados da tabela
            profissional.setId(JT_tabelaPesquisaProfissionalOS.getModel().getValueAt(setar, 0).toString());
            profissional.setNome(JT_tabelaPesquisaProfissionalOS.getModel().getValueAt(setar, 1).toString());
            profissional.setSobrenome(JT_tabelaPesquisaProfissionalOS.getModel().getValueAt(setar, 2).toString());
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

    public JanelaOSprofissional(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIcon();
        profissional = new Profissional();
        profissionalDao = new ProfissionalDao();
    }

    public Profissional getProfissional() {
        return profissional;
    }

}
