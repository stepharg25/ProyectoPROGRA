package modelo;

import java.sql.*;

public class ConsultaCategorias extends ConexionBD {

    public boolean registrar(Categoria categoria) {
        String sql = "INSERT INTO categorias(nombre) VALUES(?)";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, categoria.getNombre());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    /*Método que verifica si una categoría ya existe, así no se vuelve a crear*/
    public boolean existeCategoria(String nombre) {
        String sql = "SELECT id FROM categorias WHERE nombre = ?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, nombre);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
