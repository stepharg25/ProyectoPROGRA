package gestionbiblioteca;
public class HomeAdmin extends javax.swing.JFrame {
    public HomeAdmin() {
        initComponents();
        // Cargar imagen y escalar al tamaño del JLabel
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(getClass().getResource("/img/LOGO.png"));
        int labelWidth = lblLogo.getWidth();
        int labelHeight = lblLogo.getHeight();
        if (labelWidth > 0 && labelHeight > 0) {
            java.awt.Image img = icon.getImage().getScaledInstance(labelWidth, labelHeight, java.awt.Image.SCALE_SMOOTH);
            lblLogo.setIcon(new javax.swing.ImageIcon(img));
        } else {
            // Si el tamaño aún no está definido, usar el tamaño preferido
            java.awt.Image img = icon.getImage().getScaledInstance(74, 61, java.awt.Image.SCALE_SMOOTH);
            lblLogo.setIcon(new javax.swing.ImageIcon(img));
        }
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setText(""); // Quita el texto del label
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BTNlibro = new javax.swing.JButton();
        BTNautor = new javax.swing.JButton();
        BTNcategoria = new javax.swing.JButton();
        BTNusuario = new javax.swing.JButton();
        BTNreportes = new javax.swing.JButton();
        BTNinventario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        lblLogo.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("GESTION GENERAL");

        BTNlibro.setText("REGISTRAR LIBRO");
        BTNlibro.setToolTipText("");
        BTNlibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNlibroActionPerformed(evt);
            }
        });

        BTNautor.setText("REGISTRAR AUTOR");
        BTNautor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNautorActionPerformed(evt);
            }
        });

        BTNcategoria.setText("AÑADIR CATEGORIA");
        BTNcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcategoriaActionPerformed(evt);
            }
        });

        BTNusuario.setText("AÑADIR USUARIO");
        BTNusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNusuarioActionPerformed(evt);
            }
        });

        BTNreportes.setText("REPORTES");
        BTNreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNreportesActionPerformed(evt);
            }
        });

        BTNinventario.setText("INVENTARIO");
        BTNinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNinventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNinventario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTNlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(BTNautor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTNcategoria)))
                .addGap(167, 168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNlibro, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNautor, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(BTNusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNinventario)
                    .addComponent(BTNreportes))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNlibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNlibroActionPerformed
        GestionLibros ventana = new GestionLibros();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNlibroActionPerformed

    private void BTNautorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNautorActionPerformed
        GestionAutores ventana = new GestionAutores();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNautorActionPerformed

    private void BTNcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcategoriaActionPerformed
        GestionCategorias ventana = new GestionCategorias();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNcategoriaActionPerformed

    private void BTNusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNusuarioActionPerformed
        Registro ventana = new Registro();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNusuarioActionPerformed

    private void BTNreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNreportesActionPerformed
        LibrosMas ventana = new LibrosMas();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNreportesActionPerformed

    private void BTNinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNinventarioActionPerformed
        Inventario ventana = new Inventario();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNinventarioActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeAdmin frame = new HomeAdmin();
                frame.setTitle("Gestion Biblioteca");
                frame.setLocationRelativeTo(null); // Centra la ventana
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNautor;
    private javax.swing.JButton BTNcategoria;
    private javax.swing.JButton BTNinventario;
    private javax.swing.JButton BTNlibro;
    private javax.swing.JButton BTNreportes;
    private javax.swing.JButton BTNusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
