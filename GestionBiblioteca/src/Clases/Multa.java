package Clases;

class Multa {
    private Prestamo prestamo;
    private double monto;
    private boolean pagada;

    public Multa() {
    }

    public Multa(Prestamo prestamo, double monto, boolean pagada) {
        this.prestamo = prestamo;
        this.monto = monto;
        this.pagada = pagada;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
    
    
}
