package Clases;

public class Multa {

    private int id;
    private int usuarioId;
    private double monto;
    private boolean pagada;

    public Multa(int id, int usuarioId, double monto, boolean pagada) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.monto = monto;
        this.pagada = pagada;
    }

    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}
