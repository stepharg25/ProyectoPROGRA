package controlador;

import java.util.ArrayList;
import modelo.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import vista.LibroForm;

public final class ControladorLibro {

    private LibroForm vista; // Se crea la vista
    private ConsultaLibros modelo; // se crea el model

    //Constructor
    public ControladorLibro(LibroForm vista) {
        this.vista = vista;
        this.modelo = new ConsultaLibros();

        //Agregar los listeners para cada botón de la interfaz
        vista.btnRegistrarLibro.addActionListener(e -> registrarLibro());
        vista.btnBuscarLibro.addActionListener(e -> buscarLibro());
        vista.btnEliminarLibro.addActionListener(e -> eliminarLibro());
        vista.btnEditarLibro.addActionListener(e -> editarLibro());

        cargarTabla();
    }

    //Método para editar un libro
    public void editarLibro() {
        String codigo = LibroForm.txtCodigo.getText().trim();
        String titulo = LibroForm.txtTitulo.getText().trim();
        String autor = LibroForm.txtAutor.getText().trim();
        String categoria = LibroForm.txtCategoria.getText().trim();

        if (codigo.isEmpty() || titulo.isEmpty() || autor.isEmpty() || categoria.isEmpty()) {
            vista.mostrarMensaje("Todos los campos son obligatorios para editar.");
            return;
        }

        Libro libro = new Libro();
        libro.setCodigo(codigo);
        libro.setTitulo(titulo);
        libro.setAutor(autor);
        libro.setCategoria(categoria);
        libro.setDisponible(true);

        if (modelo.actualizarPorCodigo(libro)) {
            vista.mostrarMensaje("Libro actualizado correctamente.");
            vista.limpiarCampos();
            cargarTabla();
        } else {
            vista.mostrarMensaje("Error al actualizar el libro.");
        }
    }

    //Eliminar un libro por código
    public void eliminarLibro() {
        String codigo = LibroForm.txtCodigo.getText().trim();

        if (codigo.isEmpty()) {
            vista.mostrarMensaje("Ingrese el código del libro a eliminar.");
            return;
        }

        if (modelo.eliminarPorCodigo(codigo)) {
            vista.mostrarMensaje("Libro eliminado correctamente.");
            vista.limpiarCampos();
            cargarTabla();
        } else {
            vista.mostrarMensaje("No se encontró un libro con ese código.");
        }
    }

    /*Busca un libro dependiendo del campo que se llene
    si se llena el autor con nombre "Daniel, y se le da al botón de buscar,
    la busqueda se hace por autor, ya que ese fue el campo que se rellenó*/
    public void buscarLibro() {
        String codigo = LibroForm.txtCodigo.getText().trim();
        String titulo = LibroForm.txtTitulo.getText().trim();
        String autor = LibroForm.txtAutor.getText().trim();
        String categoria = LibroForm.txtCategoria.getText().trim();

        List<Libro> lista = new ArrayList<>();

        if (!codigo.isEmpty()) {
            lista = modelo.buscarPorCodigo(codigo);
            vista.limpiarCampos();
        } else if (!titulo.isEmpty()) {
            lista = modelo.buscarPorTitulo(titulo);
            vista.limpiarCampos();
        } else if (!autor.isEmpty()) {
            lista = modelo.buscarPorAutor(autor);
            vista.limpiarCampos();
        } else if (!categoria.isEmpty()) {
            lista = modelo.buscarPorCategoria(categoria);
            vista.limpiarCampos();
        } else {
            vista.mostrarMensaje("Por favor, escriba un dato para buscar.");
            return;
        }

        if (lista.isEmpty()) {
            vista.mostrarMensaje("No se encontraron libros.");
        }

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Título");
        modeloTabla.addColumn("Autor");
        modeloTabla.addColumn("Categoría");
        modeloTabla.addColumn("Disponible");

        for (Libro l : lista) {
            modeloTabla.addRow(new Object[]{
                l.getCodigo(),
                l.getTitulo(),
                l.getAutor(),
                l.getCategoria(),
                l.isDisponible() ? "Sí" : "No"
            });
        }

        LibroForm.tablaLibros.setModel(modeloTabla);
    }

    //Método para registrar un libro nuevo
    public void registrarLibro() {
        String codigo = LibroForm.txtCodigo.getText();
        String titulo = LibroForm.txtTitulo.getText();
        String autor = LibroForm.txtAutor.getText();
        String categoria = LibroForm.txtCategoria.getText();

        if (codigo.isEmpty() || titulo.isEmpty() || autor.isEmpty() || categoria.isEmpty()) {
            vista.mostrarMensaje("Todos los campos son obligatorios.");
            return;
        }

        if (modelo.existeCodigo(codigo)) {
            LibroForm.mostrarMensaje("El código ingresado ya existe.");
            LibroForm.txtCodigo.setText("");
            return;
        }

        Libro l = new Libro();
        l.setCodigo(codigo);
        l.setTitulo(titulo);
        l.setAutor(autor);
        l.setCategoria(categoria);
        l.setDisponible(true);

        if (modelo.registrar(l)) {
            vista.mostrarMensaje("Libro registrado.");
            vista.limpiarCampos();
            cargarTabla();
        } else {
            vista.mostrarMensaje("Error al registrar libro.");
        }
    }

    //Método para estar cargando la tabla y que se vean los detalles en UI
    public void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Código");
        modeloTabla.addColumn("Título");
        modeloTabla.addColumn("Autor");
        modeloTabla.addColumn("Categoría");
        modeloTabla.addColumn("Disponible");

        List<Libro> lista = modelo.obtenerTodos();
        for (Libro l : lista) {
            modeloTabla.addRow(new Object[]{
                l.getCodigo(),
                l.getTitulo(),
                l.getAutor(),
                l.getCategoria(),
                l.isDisponible() ? "Sí" : "No"
            });
        }

        vista.tablaLibros.setModel(modeloTabla);
    }
}
