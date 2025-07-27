package controlador;

import modelo.ConsultasUsuario;
import modelo.Usuario;
import vista.LoginForm;

public class ControladorLogin {

    private LoginForm vista;
    private ConsultasUsuario modeloUsuario;

    public ControladorLogin(LoginForm vista) {
        this.vista = vista;
        this.modeloUsuario = new ConsultasUsuario();

        LoginForm.btnLogin.addActionListener(e -> login());
        LoginForm.btnParaRegistrar.addActionListener(e -> abrirRegistro());

    }

    //Se abre la ventana de registro, para que se pueda registrar un nuevo usuario
    public void abrirRegistro() {
        vista.RegisterForm formRegistro = new vista.RegisterForm();
        new controlador.ControladorRegistro(formRegistro);
        formRegistro.setVisible(true);
    }

    /*Acá se hace el login, si el usuario y contraseña no están en la base 
    de datos, va a tirar el mensaje de error no encontrado*/
    public void login() {
        String usuario = LoginForm.txtUsuario.getText(); 
        String contrasena = LoginForm.txtContrasena.getText();

        Usuario u = new Usuario();
        u.setNombre(usuario);

        if (modeloUsuario.buscar(u)) {
            if (u.getPassword().equals(contrasena)) {
                vista.mostrarMensaje("Bienvenido " + u.getNombre() + "/" + u.getRol());

            } else {
                vista.mostrarMensaje("Contraseña incorrecta");
            }
        } else {
            vista.mostrarMensaje("Usuario no encontrado");
        }
    }
}
