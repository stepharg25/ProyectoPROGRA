package Clases;

import java.util.ArrayList;

public class Estudiante extends Usuario {

    ArrayList<Prestamo> historialPrestamos;
    ArrayList<Multa> multas;

    public Estudiante(ArrayList<Prestamo> historialPrestamos, ArrayList<Multa> multas, int id, String nombre, String coreo, String contrasena, String rol) {
        super(id, nombre, coreo, contrasena, rol);
        this.historialPrestamos = historialPrestamos;
        this.multas = multas;
    }

    public ArrayList<Prestamo> getHistorialPrestamos() {
        return historialPrestamos;
    }

    public void setHistorialPrestamos(ArrayList<Prestamo> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    public ArrayList<Multa> getMultas() {
        return multas;
    }

    public void setMultas(ArrayList<Multa> multas) {
        this.multas = multas;
    }
    
    

}
