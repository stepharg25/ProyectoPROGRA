package Clases;

import java.util.ArrayList;

public class Libro {
    private int id;
    private Autor autor;
    private Categoria categoria;
    private boolean disponible;
    private ArrayList<Reserva> reservasPendientes;

    public Libro() {
    }

    public Libro(int id, Autor autor, Categoria categoria, boolean disponible, ArrayList<Reserva> reservasPendientes) {
        this.id = id;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = disponible;
        this.reservasPendientes = reservasPendientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public ArrayList<Reserva> getReservasPendientes() {
        return reservasPendientes;
    }

    public void setReservasPendientes(ArrayList<Reserva> reservasPendientes) {
        this.reservasPendientes = reservasPendientes;
    }
    
    
    
}
