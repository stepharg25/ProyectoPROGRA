package gestionbiblioteca;
public class E_Reservar extends javax.swing.JFrame {
    public E_Reservar() {
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
        CMBcategorias = new javax.swing.JComboBox<>();
        CMBtitulo = new javax.swing.JComboBox<>();
        CMBautor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        LISTA = new javax.swing.JList<>();
        CHKdisponibles = new javax.swing.JCheckBox();
        BTNreservar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        lblLogo.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("GESTIONAR RESERVAS");

        CMBcategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIAS", "BASE" }));

        CMBtitulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TITULO", "BASE" }));

        CMBautor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUTOR", "BASE" }));

        LISTA.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(LISTA);

        CHKdisponibles.setBackground(new java.awt.Color(204, 153, 255));
        CHKdisponibles.setSelected(true);
        CHKdisponibles.setText("DISPONIBLES");
        CHKdisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHKdisponiblesActionPerformed(evt);
            }
        });

        BTNreservar.setBackground(new java.awt.Color(153, 255, 153));
        BTNreservar.setText("RESERVAR");
        BTNreservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNreservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CMBcategorias, 0, 226, Short.MAX_VALUE)
                            .addComponent(CMBtitulo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CMBautor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CHKdisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(BTNreservar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(CMBcategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(CMBtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(CMBautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CHKdisponibles))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(BTNreservar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
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

    private void CHKdisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHKdisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CHKdisponiblesActionPerformed

    private void BTNreservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNreservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNreservarActionPerformed

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                E_Reservar frame = new E_Reservar();
                frame.setTitle("Gestion Biblioteca");
                frame.setLocationRelativeTo(null); // Centra la ventana
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNreservar;
    private javax.swing.JCheckBox CHKdisponibles;
    private javax.swing.JComboBox<String> CMBautor;
    private javax.swing.JComboBox<String> CMBcategorias;
    private javax.swing.JComboBox<String> CMBtitulo;
    private javax.swing.JList<String> LISTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogo;
    // End of variables declaration//GEN-END:variables
}
