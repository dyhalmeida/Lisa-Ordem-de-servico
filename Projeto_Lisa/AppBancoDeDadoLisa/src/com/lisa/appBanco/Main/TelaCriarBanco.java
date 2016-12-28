package com.lisa.appBanco.Main;

import com.lisa.appBanco.NewBanco;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class TelaCriarBanco extends javax.swing.JFrame {

    
    public TelaCriarBanco() {
        initComponents();
        // A linha abaixo altera o icone padrão da janela
        this.setIconImage(new ImageIcon(getClass().getResource("/com/lisa/appBanco/Imagens/icon_logo.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jp_senhaSGBD = new javax.swing.JPasswordField();
        lb_titleSenhaSGBD = new javax.swing.JLabel();
        btn_criarBaseDeDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lisa Os - Criação da Base de Dados");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/lisa/appBanco/Imagens/logo_lisa_img.png"))); // NOI18N

        jp_senhaSGBD.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N

        lb_titleSenhaSGBD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lb_titleSenhaSGBD.setText("Senha do SGBD");

        btn_criarBaseDeDados.setText("Criar base de dados");
        btn_criarBaseDeDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarBaseDeDados(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_titleSenhaSGBD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_senhaSGBD)
                            .addComponent(btn_criarBaseDeDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_titleSenhaSGBD)
                    .addComponent(jp_senhaSGBD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btn_criarBaseDeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(516, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void criarBaseDeDados(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarBaseDeDados

        NewBanco banco = new NewBanco(new String(jp_senhaSGBD.getPassword()));
        
        if(banco.createTableUsuario()){
            JOptionPane.showMessageDialog(null, "Tabela Usuario criada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível criar tabela cliente!");
        }
        
        if(banco.createTableProfissional()){
            JOptionPane.showMessageDialog(null, "Tabela profissional criada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível criar tabela profissional!");
        }
        
        if(banco.createTableBairro()){
             JOptionPane.showMessageDialog(null, "Tabela bairro criada com sucesso!");
        }else{
             JOptionPane.showMessageDialog(null, "Não foi possível criar tabela bairro!");
        }
        
        if(banco.createTableCidade()){
            JOptionPane.showMessageDialog(null, "Tabela cidade criada com sucesso!");
        }else{
             JOptionPane.showMessageDialog(null, "Não foi possível criar tabela cidade!");
        }
        
        if(banco.createTableCliente()){
            JOptionPane.showMessageDialog(null, "Tabela cliente criada com sucesso!");
        }else{
             JOptionPane.showMessageDialog(null, "Não foi possível criar tabela cliente!");
        }
        
        if(banco.createTableOs()){
            JOptionPane.showMessageDialog(null, "Tabela ordem de serviço criada com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível criar tabela ordem de serviço!");
        }
       
        banco.createView();
        
        btn_criarBaseDeDados.setEnabled(false);
    }//GEN-LAST:event_criarBaseDeDados

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
            java.util.logging.Logger.getLogger(TelaCriarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCriarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCriarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCriarBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCriarBanco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_criarBaseDeDados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jp_senhaSGBD;
    private javax.swing.JLabel lb_titleSenhaSGBD;
    // End of variables declaration//GEN-END:variables
}
