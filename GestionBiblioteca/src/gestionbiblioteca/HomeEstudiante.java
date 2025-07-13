package gestionbiblioteca;
public class HomeEstudiante extends javax.swing.JFrame {
    public HomeEstudiante() {
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
        LBLtitulo = new javax.swing.JLabel();
        BTNreservas = new javax.swing.JButton();
        BTNprestamos = new javax.swing.JButton();
        BTNmultas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        lblLogo.setText("jLabel1");

        LBLtitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LBLtitulo.setText("BIENVENIDO ESTIMADO ESTUDIANTE");

        BTNreservas.setBackground(new java.awt.Color(204, 255, 204));
        BTNreservas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNreservas.setText("RESERVAR UN LIBRO");
        BTNreservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNreservasActionPerformed(evt);
            }
        });

        BTNprestamos.setBackground(new java.awt.Color(255, 255, 204));
        BTNprestamos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNprestamos.setText("MIS PRESTAMOS");
        BTNprestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNprestamosActionPerformed(evt);
            }
        });

        BTNmultas.setBackground(new java.awt.Color(255, 204, 204));
        BTNmultas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BTNmultas.setText("MULTAS");
        BTNmultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BTNmultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNprestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNreservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LBLtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(181, 181, 181)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBLtitulo))
                .addGap(4, 4, 4)
                .addComponent(BTNreservas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(BTNprestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BTNmultas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void BTNprestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNprestamosActionPerformed
        E_Historial ventana = new E_Historial();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNprestamosActionPerformed

    private void BTNreservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNreservasActionPerformed
        E_Reservar ventana = new E_Reservar();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNreservasActionPerformed

    private void BTNmultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmultasActionPerformed
        E_Multas ventana = new E_Multas();
        ventana.setLocationRelativeTo(this);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTNmultasActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeEstudiante frame = new HomeEstudiante();
                frame.setTitle("Gestion Biblioteca");
                frame.setLocationRelativeTo(null); // Centra la ventana
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNmultas;
    private javax.swing.JButton BTNprestamos;
    private javax.swing.JButton BTNreservas;
    private javax.swing.JLabel LBLtitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
