package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultasAutores extends ConexionBD {

    public boolean registrar(Autor autor) {
        String sql = "INSERT INTO autores(nombre) VALUES(?)";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, autor.getNombre());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println("registrar autor: " + e.getMessage());
            return false;
        }
    }

    public boolean existeAutor(String nombre) {
        String sql = "SELECT id FROM autores WHERE nombre = ?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next(); 
            }
        } catch (SQLException e) {
            System.err.println("existeAutor: " + e.getMessage());
            return false;
        }
    }

    public List<Autor> obtenerTodos() {
        List<Autor> lista = new ArrayList<>();
        String sql = "SELECT * FROM autores";

        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Autor a = new Autor();
                a.setId(rs.getInt("id"));
                a.setNombre(rs.getString("nombre"));
                lista.add(a);
            }

        } catch (SQLException e) {
            System.err.println("obtenerAutores: " + e.getMessage());
        }

        return lista;
    }
}
