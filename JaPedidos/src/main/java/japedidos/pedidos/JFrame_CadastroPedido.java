/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package japedidos.pedidos;

/**
 *
 * @author t.baiense
 */
public class JFrame_CadastroPedido extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPedido
     */
    public JFrame_CadastroPedido() {
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

        jPanel1 = new javax.swing.JPanel();
        jpnl_sideMenu = new javax.swing.JPanel();
        jlbl_clientes = new javax.swing.JLabel();
        jlbl_produtos = new javax.swing.JLabel();
        jlbl_pedidos = new javax.swing.JLabel();
        jlbl_relatorios = new javax.swing.JLabel();
        jpnl_img_etiqueta = new javax.swing.JLabel();
        jpnl_background = new javax.swing.JLabel();
        jlbl_telefone = new javax.swing.JLabel();
        jlbl_telefone1 = new javax.swing.JLabel();
        jlbl_telefone2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jlbl_telefone3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jlbl_telefone4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jlbl_telefone5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jlbl_telefone6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jlbl_telefone7 = new javax.swing.JLabel();
        jlbl_telefone8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jlbl_telefone9 = new javax.swing.JLabel();
        jlbl_telefone10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jlbl_telefone11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jlbl_telefone12 = new javax.swing.JLabel();
        jlbl_telefone13 = new javax.swing.JLabel();
        jlbl_telefone15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jlbl_telefone14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_lista_produtos = new javax.swing.JTable();
        jpnl_background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1024, 576));
        jPanel1.setMinimumSize(new java.awt.Dimension(1024, 576));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 576));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnl_sideMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnl_sideMenu.setMaximumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setMinimumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setPreferredSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_clientes.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_clientes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_clientes.setText("CLIENTES");
        jpnl_sideMenu.add(jlbl_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jlbl_produtos.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_produtos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_produtos.setForeground(new java.awt.Color(204, 204, 204));
        jlbl_produtos.setText("PRODUTOS");
        jlbl_produtos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlbl_produtosFocusGained(evt);
            }
        });
        jpnl_sideMenu.add(jlbl_produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jlbl_pedidos.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_pedidos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_pedidos.setText("PEDIDOS");
        jpnl_sideMenu.add(jlbl_pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jlbl_relatorios.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_relatorios.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_relatorios.setText("RELATÓRIOS");
        jpnl_sideMenu.add(jlbl_relatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jpnl_img_etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/painel_comandos_esquerda_05x.png"))); // NOI18N
        jpnl_img_etiqueta.setText("jLabel2");
        jpnl_img_etiqueta.setMaximumSize(new java.awt.Dimension(250, 576));
        jpnl_img_etiqueta.setMinimumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.add(jpnl_img_etiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, -1));

        jpnl_background.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpnl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/background_pedidos.png"))); // NOI18N
        jpnl_background.setToolTipText("");
        jpnl_background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpnl_background.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jpnl_sideMenu.add(jpnl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jpnl_sideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 576));

        jlbl_telefone.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone.setText("TELEFONE");
        jPanel1.add(jlbl_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jlbl_telefone1.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone1.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone1.setText("RUA");
        jPanel1.add(jlbl_telefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jlbl_telefone2.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone2.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone2.setText("DATA ENTREGA");
        jPanel1.add(jlbl_telefone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 140, 30));

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 210, -1));

        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 120, -1));

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 130, -1));

        jlbl_telefone3.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone3.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone3.setText("NOME");
        jPanel1.add(jlbl_telefone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 130, -1));

        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 300, -1));

        jlbl_telefone4.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone4.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone4.setText("BAIRRO");
        jPanel1.add(jlbl_telefone4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 140, -1));

        jlbl_telefone5.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone5.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone5.setText("CIDADE");
        jPanel1.add(jlbl_telefone5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 210, -1));

        jlbl_telefone6.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone6.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone6.setText("UF");
        jPanel1.add(jlbl_telefone6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        jTextField8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 90, -1));

        jlbl_telefone7.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone7.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone7.setText("TIPO DA ENTREGA");
        jPanel1.add(jlbl_telefone7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 60, -1, 30));

        jlbl_telefone8.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone8.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone8.setText("DESTINATÁRIO");
        jPanel1.add(jlbl_telefone8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 160, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOLINHA DE QUEIJO", "COXINHA DE FRANGO", "KIBE DE CARNE", "RISSOLE DE", "MINI CHURROS" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 190, -1));

        jButton1.setText("Incluir");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jButton2.setText("Pedidos em aberto");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        jButton3.setText("Histórico de pedidos");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Envio", "Retirada no local" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 160, -1));

        jlbl_telefone9.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone9.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone9.setText("HORA ENTREGA");
        jPanel1.add(jlbl_telefone9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, 30));

        jlbl_telefone10.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone10.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone10.setText("PRODUTO");
        jPanel1.add(jlbl_telefone10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, 30));

        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 160, 140, -1));

        jlbl_telefone11.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone11.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone11.setText("QUANT.");
        jPanel1.add(jlbl_telefone11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 80, 30));

        jTextField10.setText("UND");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 70, -1));

        jButton5.setText("Criar pedido");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 210, -1));

        jButton4.setText("Incluir pedido");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jlbl_telefone12.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone12.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone12.setText("ESTADO INICIAL");
        jPanel1.add(jlbl_telefone12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 150, 30));

        jlbl_telefone13.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone13.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone13.setText("VALOR DA ENTREGA:");
        jPanel1.add(jlbl_telefone13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 190, 30));

        jlbl_telefone15.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone15.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone15.setText("DESCONTO APLICADO:");
        jPanel1.add(jlbl_telefone15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 200, 30));

        jTextField11.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 500, 120, -1));

        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 120, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em aberto", "Aguardando pagamento", "Pago", "Em preparo/separação", "Aguardando envio/retirada", "Saiu para entrega", "Concluído", "Cancelado" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 160, -1));
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/Frame 79 (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, -1, -1));

        jlbl_telefone14.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefone14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefone14.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefone14.setText("VALOR TOTAL:");
        jPanel1.add(jlbl_telefone14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, 130, 30));

        jTextField12.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, 120, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 260, 60));

        jtbl_lista_produtos.setBackground(new java.awt.Color(153, 204, 255));
        jtbl_lista_produtos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtbl_lista_produtos.setForeground(new java.awt.Color(255, 255, 255));
        jtbl_lista_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "BOLINHA DE QUEIJO", "ALIMENTO", "UND",  new Double(0.75)},
                { new Integer(2), "COXINHA DE FRANGO", "ALIMENTO", "UND",  new Double(0.75)},
                { new Integer(3), "KIBE DE CARNE", "ALIMENTO", "UND",  new Double(0.65)},
                { new Integer(4), "RISSOLE DE PIZZA", "ALIMENTO", "UND",  new Double(0.65)},
                { new Integer(5), "RISSOLE DE CAMARÃO", "ALIMENTO", "UND",  new Double(0.75)},
                { new Integer(6), "MINI CHURROS", "ALIMENTO", "UND",  new Double(0.55)},
                { new Integer(7), "ENROLADO DE SALSICHA ", "ALIMENTO", "UND",  new Double(0.55)}
            },
            new String [] {
                "Cód.", "Descrição", "Categoria", "Unid.", "Valor(R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbl_lista_produtos.setMinimumSize(new java.awt.Dimension(20, 160));
        jtbl_lista_produtos.setPreferredSize(new java.awt.Dimension(655, 204));
        jScrollPane1.setViewportView(jtbl_lista_produtos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 440, 170));

        jpnl_background1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpnl_background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/background_pedidos.png"))); // NOI18N
        jpnl_background1.setToolTipText("");
        jpnl_background1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpnl_background1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jpnl_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 455, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbl_produtosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlbl_produtosFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jlbl_produtosFocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_CadastroPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel jlbl_clientes;
    private javax.swing.JLabel jlbl_pedidos;
    private javax.swing.JLabel jlbl_produtos;
    private javax.swing.JLabel jlbl_relatorios;
    private javax.swing.JLabel jlbl_telefone;
    private javax.swing.JLabel jlbl_telefone1;
    private javax.swing.JLabel jlbl_telefone10;
    private javax.swing.JLabel jlbl_telefone11;
    private javax.swing.JLabel jlbl_telefone12;
    private javax.swing.JLabel jlbl_telefone13;
    private javax.swing.JLabel jlbl_telefone14;
    private javax.swing.JLabel jlbl_telefone15;
    private javax.swing.JLabel jlbl_telefone2;
    private javax.swing.JLabel jlbl_telefone3;
    private javax.swing.JLabel jlbl_telefone4;
    private javax.swing.JLabel jlbl_telefone5;
    private javax.swing.JLabel jlbl_telefone6;
    private javax.swing.JLabel jlbl_telefone7;
    private javax.swing.JLabel jlbl_telefone8;
    private javax.swing.JLabel jlbl_telefone9;
    private javax.swing.JLabel jpnl_background;
    private javax.swing.JLabel jpnl_background1;
    private javax.swing.JLabel jpnl_img_etiqueta;
    private javax.swing.JPanel jpnl_sideMenu;
    private javax.swing.JTable jtbl_lista_produtos;
    // End of variables declaration//GEN-END:variables
}