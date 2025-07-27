package modelo;

import java.sql.*;

public class ConsultasUsuario extends ConexionBD {

    public boolean registrar(Usuario u) {
        String sql = "INSERT INTO usuarios(nombre,email,password,rol) VALUES(?,?,?,?)";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getRol());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println("registrar: " + e.getMessage());
            return false;
        }
    }

    public boolean modificar(Usuario u) {
        String sql = "UPDATE usuarios SET nombre=?, email=?, password=?, rol=? WHERE id=?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getRol());
            ps.setInt(5, u.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println("modificar: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(Usuario u) {
        String sql = "DELETE FROM usuarios WHERE id=?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, u.getId());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean buscar(Usuario u) {
        String sql = "SELECT * FROM usuarios WHERE nombre=?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getNombre());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    u.setId(rs.getInt("id"));
                    u.setEmail(rs.getString("email"));
                    u.setPassword(rs.getString("password"));
                    u.setRol(rs.getString("rol"));
                    return true;
                }
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
