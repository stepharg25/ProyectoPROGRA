package gestionbiblioteca;
public class main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Inicio frame = new Inicio();
                frame.setTitle("Gestion Biblioteca");
                frame.setLocationRelativeTo(null); // Centra la ventana
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
    
}
