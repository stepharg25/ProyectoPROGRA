package Clases;

import java.util.Date;

class Reserva {
    private int id;
    private Libro libro;
    private Estudiante estudiante;
    private Date fechaReserva;

    public Reserva() {
    }

    public Reserva(int id, Libro libro, Estudiante estudiante, Date fechaReserva) {
        this.id = id;
        this.libro = libro;
        this.estudiante = estudiante;
        this.fechaReserva = fechaReserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    
    
}
