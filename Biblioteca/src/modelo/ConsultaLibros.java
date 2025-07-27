package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConsultaLibros extends ConexionBD {

    public boolean registrar(Libro libro) {
        ConsultasAutores consultaAutores = new ConsultasAutores();
        ConsultaCategorias consultaCategorias = new ConsultaCategorias();

        try {
            // Registrar autor si no existe
            if (!consultaAutores.existeAutor(libro.getAutor())) {
                Autor autor = new Autor();
                autor.setNombre(libro.getAutor());
                consultaAutores.registrar(autor);
            }

            // Registrar categoría si no existe
            if (!consultaCategorias.existeCategoria(libro.getCategoria())) {
                Categoria categoria = new Categoria();
                categoria.setNombre(libro.getCategoria());
                consultaCategorias.registrar(categoria);
            }

            // Insertar libro
            String sql = "INSERT INTO libros(codigo, titulo, autor, categoria, disponible) VALUES(?,?,?,?,?)";

            try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, libro.getCodigo());
                ps.setString(2, libro.getTitulo());
                ps.setString(3, libro.getAutor());
                ps.setString(4, libro.getCategoria());
                ps.setBoolean(5, libro.isDisponible());

                ps.execute();
                return true;

            }

        } catch (SQLException e) {
            System.err.println("registrar libro: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizarPorCodigo(Libro libro) {
        String sql = "UPDATE libros SET titulo=?, autor=?, categoria=?, disponible=? WHERE codigo=?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, libro.getTitulo());
            ps.setString(2, libro.getAutor());
            ps.setString(3, libro.getCategoria());
            ps.setBoolean(4, libro.isDisponible());
            ps.setString(5, libro.getCodigo());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.err.println("actualizarPorCodigo: " + e.getMessage());
            return false;
        }
    }

    public boolean existeCodigo(String codigo) {
        String sql = "SELECT id FROM libros WHERE codigo = ?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException e) {
            System.err.println("existeCodigo: " + e.getMessage());
            return false;
        }
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> lista = new ArrayList<>();

        if (autor.isEmpty()) {
            return lista;
        }

        String sql = "SELECT * FROM libros WHERE autor LIKE ?";

        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + autor + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libro l = new Libro();
                l.setId(rs.getInt("id"));
                l.setCodigo(rs.getString("codigo"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setCategoria(rs.getString("categoria"));
                l.setDisponible(rs.getBoolean("disponible"));
                lista.add(l);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public List<Libro> buscarPorCodigo(String codigo) {
        List<Libro> lista = new ArrayList<>();

        if (codigo.isEmpty()) {
            return lista;
        }

        String sql = "SELECT * FROM libros WHERE codigo LIKE ?";

        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + codigo + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libro l = new Libro();
                l.setId(rs.getInt("id"));
                l.setCodigo(rs.getString("codigo"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setCategoria(rs.getString("categoria"));
                l.setDisponible(rs.getBoolean("disponible"));
                lista.add(l);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> lista = new ArrayList<>();

        if (titulo.isEmpty()) {
            return lista;
        }

        String sql = "SELECT * FROM libros WHERE titulo LIKE ?";

        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + titulo + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libro l = new Libro();
                l.setId(rs.getInt("id"));
                l.setCodigo(rs.getString("codigo"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setCategoria(rs.getString("categoria"));
                l.setDisponible(rs.getBoolean("disponible"));
                lista.add(l);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public List<Libro> buscarPorCategoria(String categoria) {
        List<Libro> lista = new ArrayList<>();

        if (categoria.isEmpty()) {
            return lista;
        }

        String sql = "SELECT * FROM libros WHERE categoria LIKE ?";

        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + categoria + "%");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libro l = new Libro();
                l.setId(rs.getInt("id"));
                l.setCodigo(rs.getString("codigo"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setCategoria(rs.getString("categoria"));
                l.setDisponible(rs.getBoolean("disponible"));
                lista.add(l);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public boolean eliminarPorCodigo(String codigo) {
        String sql = "DELETE FROM libros WHERE codigo = ?";
        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, codigo);
            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public List<Libro> obtenerTodos() {
        List<Libro> lista = new ArrayList<>();
        String sql = "SELECT * FROM libros";

        try (Connection con = getConexion(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Libro libro = new Libro();
                libro.setId(rs.getInt("id"));
                libro.setCodigo(rs.getString("codigo"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setCategoria(rs.getString("categoria"));
                libro.setDisponible(rs.getBoolean("disponible"));
                lista.add(libro);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

}
