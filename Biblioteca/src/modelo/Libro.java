package modelo;

public class Libro {

    private int id;
    private String codigo;
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String autor, String categoria, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
