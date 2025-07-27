package controlador;

import modelo.*;
import vista.*;

public class ControladorRegistro {

    private RegisterForm vistaRegistro;
    private ConsultasUsuario modeloUsuario;

    public ControladorRegistro(RegisterForm vista) {
        this.vistaRegistro = vista;
        this.modeloUsuario = new ConsultasUsuario();

        RegisterForm.btnRegistrar.addActionListener(e -> registrarUsuario());
    }

    private void registrarUsuario() {
        String nombre = RegisterForm.txtUsuario.getText();
        String email = RegisterForm.txtEmail.getText();
        String contrasena = RegisterForm.txtContrasena.getText();
        String rol = "Estudiante";

        if (nombre.isEmpty() || email.isEmpty() || contrasena.isEmpty()) {
            vistaRegistro.mostrarMensaje("Por favor, complete todos los campos.");
            return;
        }

        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setEmail(email);
        u.setPassword(contrasena);
        u.setRol(rol);

        if (modeloUsuario.registrar(u)) {
            vistaRegistro.mostrarMensaje("Usuario registrado con éxito.");
            vistaRegistro.dispose();
        } else {
            vistaRegistro.mostrarMensaje("Error al registrar usuario.");
        }
    }
}
