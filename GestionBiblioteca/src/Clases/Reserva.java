package Clases;

import java.util.Date;

public class Reserva {

    private int id;
    private int usuarioId;
    private int libroId;
    private Date fechaReserva;

    public Reserva(int id, int usuarioId, int libroId, Date fechaReserva) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.fechaReserva = fechaReserva;
    }

    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getLibroId() {
        return libroId;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }
}
