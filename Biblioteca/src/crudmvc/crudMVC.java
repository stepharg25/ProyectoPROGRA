package crudMVC;

import controlador.ControladorLibro;
import java.sql.*;
import vista.LoginForm;
import controlador.ControladorLogin;
import modelo.ConexionBD;
import vista.LibroForm;

public class crudMVC {

    public static void main(String[] args) {
        //LoginForm login = new LoginForm();
        //new ControladorLogin(login);

        LibroForm form = new LibroForm();
        new ControladorLibro(form);
        form.setVisible(true);

    }

    //Método prueba para estar probando conexión
    public static void probarConexionBD() {
        ConexionBD conexion = new ConexionBD();
        Connection con = conexion.getConexion();

        if (con != null) {
            System.out.println("Conexion exitosa a la base de datos desde Main.");
        } else {
            System.out.println("No se pudo conectar a la base de datos desde Main.");
        }
    }
}
