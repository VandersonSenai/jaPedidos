package japedidos.clientes;

import japedidos.AccessController;
import japedidos.bd.BD;
import java.awt.Color;

/**
 *
 * @author f.oliveira
 */
public class JFrame_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form cliente
     */
    public JFrame_Cliente() {
        if (BD.isAccessible()) {
            AccessController.verificarLogin();
        } else {
            System.exit(0);
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLblLupa = new javax.swing.JLabel();
        jTxtFpesquisa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLbl_Produto = new javax.swing.JLabel();
        jLbl_Relatorio = new javax.swing.JLabel();
        jLbl_pedido = new javax.swing.JLabel();
        jLbl_Cliente = new javax.swing.JLabel();
        jtb_linhaBranca = new javax.swing.JToolBar();
        jLbl_Filtro = new javax.swing.JLabel();
        jTxtFnomeFiltra = new javax.swing.JTextField();
        jLbl_LogoPaleta = new javax.swing.JLabel();
        jLbl_Imagem = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setMinimumSize(new java.awt.Dimension(1024, 576));
        setPreferredSize(new java.awt.Dimension(1024, 576));
        setResizable(false);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_lupa.png"))); // NOI18N
        jPanel1.add(jLblLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        jTxtFpesquisa.setOpaque(false);
        jTxtFpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFpesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(jTxtFpesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 430, 40));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 470, 40));

        jScrollPane2.setOpaque(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00001", "manuel da silva ne gonzales", "+55 27 999295178"},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME DO CLIENTE", "TELEFONE"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable2.getColumnModel().getColumn(1).setMinWidth(400);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 720, 400));

        jLbl_Produto.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_Produto.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_Produto.setText("PRODUTOS");
        jLbl_Produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbl_ProdutoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbl_ProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbl_ProdutoMouseExited(evt);
            }
        });
        jPanel2.add(jLbl_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 20));

        jLbl_Relatorio.setBackground(new java.awt.Color(0, 0, 0));
        jLbl_Relatorio.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_Relatorio.setText("RELATÓRIOS");
        jLbl_Relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbl_RelatorioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbl_RelatorioMouseExited(evt);
            }
        });
        jPanel2.add(jLbl_Relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 20));

        jLbl_pedido.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_pedido.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_pedido.setText("PEDIDOS");
        jLbl_pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbl_pedidoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbl_pedidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbl_pedidoMouseExited(evt);
            }
        });
        jPanel2.add(jLbl_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 20));

        jLbl_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_Cliente.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_Cliente.setText("CLIENTES");
        jPanel2.add(jLbl_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));

        jtb_linhaBranca.setBackground(new java.awt.Color(255, 255, 255));
        jtb_linhaBranca.setBorder(null);
        jtb_linhaBranca.setForeground(new java.awt.Color(255, 255, 255));
        jtb_linhaBranca.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jtb_linhaBranca.setBorderPainted(false);
        jPanel2.add(jtb_linhaBranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 224, 90, 4));

        jLbl_Filtro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLbl_Filtro.setText("FILTRO:");
        jPanel2.add(jLbl_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 100, 40));

        jTxtFnomeFiltra.setText("NOME ");
        jPanel2.add(jTxtFnomeFiltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 130, 40));

        jLbl_LogoPaleta.setBackground(new java.awt.Color(0, 102, 255));
        jLbl_LogoPaleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/painel_comandos_esquerda_05x.png"))); // NOI18N
        jPanel2.add(jLbl_LogoPaleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 250, 510));

        jLbl_Imagem.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background_clientes.png"))); // NOI18N
        jPanel2.add(jLbl_Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFpesquisaActionPerformed

    private void jLbl_ProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_ProdutoMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        japedidos.produto.JFrame_ListaProdutos frame = new japedidos.produto.JFrame_ListaProdutos();
        int x = this.getX() + this.getWidth() / 2 - frame.getWidth() / 2;
        int y = this.getY() + this.getHeight()/ 2 - frame.getHeight() / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLbl_ProdutoMouseClicked

    private void jLbl_pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_pedidoMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        japedidos.pedidos.JFrame_GerenciamentoPedidos frame = new japedidos.pedidos.JFrame_GerenciamentoPedidos();
        int x = this.getX() + this.getWidth() / 2 - frame.getWidth() / 2;
        int y = this.getY() + this.getHeight()/ 2 - frame.getHeight() / 2;
        frame.setLocation(x, y);
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLbl_pedidoMouseClicked

    private void jLbl_ProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_ProdutoMouseEntered
        // TODO add your handling code here:
        jLbl_Produto.setForeground(new Color(187,187,187));
        
    }//GEN-LAST:event_jLbl_ProdutoMouseEntered

    private void jLbl_ProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_ProdutoMouseExited
        // TODO add your handling code here:
        jLbl_Produto.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLbl_ProdutoMouseExited

    private void jLbl_pedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_pedidoMouseEntered
        // TODO add your handling code here:
        jLbl_pedido.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_jLbl_pedidoMouseEntered

    private void jLbl_pedidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_pedidoMouseExited
        // TODO add your handling code here:
        jLbl_pedido.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLbl_pedidoMouseExited

    private void jLbl_RelatorioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_RelatorioMouseEntered
        // TODO add your handling code here:
        jLbl_Relatorio.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_jLbl_RelatorioMouseEntered

    private void jLbl_RelatorioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbl_RelatorioMouseExited
        // TODO add your handling code here:
        jLbl_Relatorio.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jLbl_RelatorioMouseExited

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
            java.util.logging.Logger.getLogger(JFrame_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblLupa;
    private javax.swing.JLabel jLbl_Cliente;
    private javax.swing.JLabel jLbl_Filtro;
    private javax.swing.JLabel jLbl_Imagem;
    private javax.swing.JLabel jLbl_LogoPaleta;
    private javax.swing.JLabel jLbl_Produto;
    private javax.swing.JLabel jLbl_Relatorio;
    private javax.swing.JLabel jLbl_pedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTxtFnomeFiltra;
    private javax.swing.JTextField jTxtFpesquisa;
    private javax.swing.JToolBar jtb_linhaBranca;
    // End of variables declaration//GEN-END:variables
}
