package japedidos.clientes;

/**
 *
 * @author f.oliveira
 */
public class JFrame_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form cliente
     */
    public JFrame_Cliente() {
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
        jLbl_Produto = new javax.swing.JLabel();
        jLbl_Relatorio = new javax.swing.JLabel();
        jLbl_pedido = new javax.swing.JLabel();
        jLbl_Cliente = new javax.swing.JLabel();
        jLbl_Filtro = new javax.swing.JLabel();
        jLbl_novo = new javax.swing.JLabel();
        jLblLupa = new javax.swing.JLabel();
        jTxtFpesquisa = new javax.swing.JTextField();
        jTxtFnomeFiltra = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbl_Produto.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_Produto.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_Produto.setText("PRODUTOS");
        getContentPane().add(jLbl_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 100, 20));

        jLbl_Relatorio.setBackground(new java.awt.Color(0, 0, 0));
        jLbl_Relatorio.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_Relatorio.setText("RELATÓRIOS");
        getContentPane().add(jLbl_Relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 20));

        jLbl_pedido.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_pedido.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_pedido.setText("PEDIDOS");
        getContentPane().add(jLbl_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 20));

        jLbl_Cliente.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_Cliente.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLbl_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        jLbl_Cliente.setText("CLIENTES");
        getContentPane().add(jLbl_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));

        jLbl_Filtro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLbl_Filtro.setText("FILTRO:");
        getContentPane().add(jLbl_Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 90, 40));

        jLbl_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/btn_novo_padrao.png"))); // NOI18N
        getContentPane().add(jLbl_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 90, 40));

        jLblLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/icon_lupa.png"))); // NOI18N
        getContentPane().add(jLblLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 30, 40));

        jTxtFpesquisa.setText("           Pesquisar.......");
        jTxtFpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFpesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtFpesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 300, 40));

        jTxtFnomeFiltra.setText("NOME ");
        getContentPane().add(jTxtFnomeFiltra, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, 80, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME DO CLIENTE", "TELEFONE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Byte.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 730, 370));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, -1));

        jLbl_LogoPaleta.setBackground(new java.awt.Color(0, 102, 255));
        jLbl_LogoPaleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/painel_comandos_esquerda_05x.png"))); // NOI18N
        getContentPane().add(jLbl_LogoPaleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 250, 510));

        jLbl_Imagem.setBackground(new java.awt.Color(255, 255, 255));
        jLbl_Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/background_clientes.png"))); // NOI18N
        getContentPane().add(jLbl_Imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFpesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFpesquisaActionPerformed

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
    private javax.swing.JLabel jLbl_novo;
    private javax.swing.JLabel jLbl_pedido;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTxtFnomeFiltra;
    private javax.swing.JTextField jTxtFpesquisa;
    // End of variables declaration//GEN-END:variables
}
