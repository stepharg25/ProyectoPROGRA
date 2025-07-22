package Clases;

public class Libro {

    private int id;
    private String titulo;
    private int autorId;
    private int categoriaId;
    private boolean disponible;

    public Libro(int id, String titulo, int autorId, int categoriaId, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autorId = autorId;
        this.categoriaId = categoriaId;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAutorId() {
        return autorId;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
