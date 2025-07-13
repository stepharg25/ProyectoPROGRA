package gestionbiblioteca;
public class Registro extends javax.swing.JFrame {
    public Registro() {
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
        lblTITULO = new javax.swing.JLabel();
        TXTusuario = new javax.swing.JTextField();
        TXTcontrasena = new javax.swing.JTextField();
        BTNregistro = new javax.swing.JButton();
        CMBroles = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        lblLogo.setText("jLabel1");

        lblTITULO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTITULO.setText("REGISTRARSE EN EL SISTEMA");

        TXTusuario.setText("USUARIO");

        TXTcontrasena.setText("CONTRASEÑA");

        BTNregistro.setText("REGISTRARSE");
        BTNregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNregistroActionPerformed(evt);
            }
        });

        CMBroles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Admin" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BTNregistro)
                    .addComponent(lblTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TXTcontrasena, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(CMBroles, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTITULO))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(TXTusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TXTcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(CMBroles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(BTNregistro)
                .addContainerGap(135, Short.MAX_VALUE))
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

    private void BTNregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNregistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNregistroActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro frame = new Registro();
                frame.setTitle("Gestion Biblioteca");
                frame.setLocationRelativeTo(null); // Centra la ventana
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNregistro;
    private javax.swing.JComboBox<String> CMBroles;
    private javax.swing.JTextField TXTcontrasena;
    private javax.swing.JTextField TXTusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTITULO;
    // End of variables declaration//GEN-END:variables
}
