package VIEW;

public class frmMenuVIEW extends javax.swing.JFrame {

    public frmMenuVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        lblLogoWhime = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuProdutos = new javax.swing.JMenu();
        mnItemCadastrarProduto = new javax.swing.JMenuItem();
        mnuItemConsultarProduto = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        mnuItemCadastrarCliente = new javax.swing.JMenuItem();
        mnuItemConsultarCliente = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        mnuItemConsultarRelatorios = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(166, 166, 166));

        btnInicio.setBackground(new java.awt.Color(0, 153, 153));
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setText("INICIO");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(0, 153, 153));
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.setText("VENDAS");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnProdutos.setBackground(new java.awt.Color(0, 153, 153));
        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.setText("PRODUTOS");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(0, 153, 153));
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnRelatorios.setBackground(new java.awt.Color(0, 153, 153));
        btnRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorios.setText("RELAT??RIOS");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        lblLogoWhime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/images/whimeLogo (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogoWhime, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoWhime, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jMenuProdutos.setText("Produtos");

        mnItemCadastrarProduto.setText("Cadastrar produto");
        mnItemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(mnItemCadastrarProduto);

        mnuItemConsultarProduto.setText("Consultar produto");
        mnuItemConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemConsultarProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(mnuItemConsultarProduto);

        jMenuBar1.add(jMenuProdutos);

        jMenuClientes.setText("Clientes");

        mnuItemCadastrarCliente.setText("Cadastrar cliente");
        mnuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(mnuItemCadastrarCliente);

        mnuItemConsultarCliente.setText("Consultar cliente");
        mnuItemConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemConsultarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(mnuItemConsultarCliente);

        jMenuBar1.add(jMenuClientes);

        jMenuRelatorios.setText("Relat??rios");

        mnuItemConsultarRelatorios.setText("Consultar relat??rios");
        mnuItemConsultarRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemConsultarRelatoriosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(mnuItemConsultarRelatorios);

        jMenuBar1.add(jMenuRelatorios);

        jMenuAjuda.setText("Ajuda");
        jMenuBar1.add(jMenuAjuda);

        jMenuSobre.setText("Sobre");
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed

        frmTelaRelatoriosVIEW objTelaRelatoriosview = new frmTelaRelatoriosVIEW();
        objTelaRelatoriosview.setVisible(true);
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed

        frmConsultarProdutoVIEW telaConsultaProduto = new frmConsultarProdutoVIEW();
        telaConsultaProduto.setVisible(true);

    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        frmConsultarClienteVIEW telaConsultaCliente = new frmConsultarClienteVIEW();
        telaConsultaCliente.setVisible(true);

    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed

        frmTelaVendasVIEW objTelaVendasview = new frmTelaVendasVIEW();
        objTelaVendasview.setVisible(true);

    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed

    }//GEN-LAST:event_btnInicioActionPerformed

    private void mnuItemConsultarRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemConsultarRelatoriosActionPerformed
        frmTelaRelatoriosVIEW objTelaRelatoriosview = new frmTelaRelatoriosVIEW();
        objTelaRelatoriosview.setVisible(true);
    }//GEN-LAST:event_mnuItemConsultarRelatoriosActionPerformed

    private void mnuItemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemConsultarClienteActionPerformed
        frmConsultarClienteVIEW telaConsultaCliente = new frmConsultarClienteVIEW();
        telaConsultaCliente.setVisible(true);
    }//GEN-LAST:event_mnuItemConsultarClienteActionPerformed

    private void mnuItemConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemConsultarProdutoActionPerformed
        frmConsultarProdutoVIEW telaConsultaProduto = new frmConsultarProdutoVIEW();
        telaConsultaProduto.setVisible(true);
    }//GEN-LAST:event_mnuItemConsultarProdutoActionPerformed

    private void mnItemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCadastrarProdutoActionPerformed
        frmCadastrarProdutoVIEW telaCadastrarProduto = new frmCadastrarProdutoVIEW();
        telaCadastrarProduto.setVisible(true);
    }//GEN-LAST:event_mnItemCadastrarProdutoActionPerformed

    private void mnuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemCadastrarClienteActionPerformed
        frmCadastrarClienteVIEW telaCadastrarCliente = new frmCadastrarClienteVIEW();
        telaCadastrarCliente.setVisible(true);
    }//GEN-LAST:event_mnuItemCadastrarClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnVendas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogoWhime;
    private javax.swing.JMenuItem mnItemCadastrarProduto;
    private javax.swing.JMenuItem mnuItemCadastrarCliente;
    private javax.swing.JMenuItem mnuItemConsultarCliente;
    private javax.swing.JMenuItem mnuItemConsultarProduto;
    private javax.swing.JMenuItem mnuItemConsultarRelatorios;
    // End of variables declaration//GEN-END:variables
}
