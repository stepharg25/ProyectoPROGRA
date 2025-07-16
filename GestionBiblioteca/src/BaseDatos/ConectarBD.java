
package BaseDatos;


import java.sql.*;


/**
 *
 * @author geral
 */
public class ConectarBD {
    
    
    private Connection conexion = null;
    private String servidor = "localhost: 3307"; //Cambiar de puerto, si lo necesitan
    private String dataBase = "bsd_lm_biblioteca";
    private String usuario = "root";
    private String password = ""; //Cambiar de password, si lo necesitan
    private String url = "";
    
    
    public ConectarBD(String servidor, String dataBase, String usuario, String password){
    
        try{
        
            this.servidor = servidor;
            this.dataBase = dataBase;
            this.usuario = usuario;
            this.password = password;
            
            Class.forName("com.mysql.Driver"); //Driver para Java
            url = "jdbc:mysql://" + servidor + "/" + dataBase + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url, usuario, password);
            //Fin solo eso es para conectar la base datos           
            
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(ClassNotFoundException e){
        
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    //Abrir conexion
    public ConectarBD(){
    
        try{
            Class.forName("com.mysql.Driver"); //Driver para Java 
            url = "jdbc:mysql://" + servidor + "/" + dataBase + "?autoReconnect=true&useSSL=false";
            conexion = DriverManager.getConnection(url, usuario, password);
            //Fin solo eso es para conectar la base datos           
            
            
        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(ClassNotFoundException e){
        
            System.out.println("Error: " + e.getMessage());        
        }
    }
    
    //Se usa para ejecutar sentencias con parámetros
    ////PreparedStatement ps = con.crearPreparedStatement("SELECT * FROM Articulo WHERE descripcion LIKE ?")
    public PreparedStatement crearPreparedStatement(String sql) throws SQLException{
    
        return conexion.prepareStatement(sql);
    }

    // Se usa para ejecutar sentencias directas sin parámetros:
    
     /*
    Statement st = con.crearStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM Articulo");

    */
    public Statement crearStatement() throws SQLException{
        return conexion.createStatement();
    }
  
    //Cerrar conexion
    public Connection cerrarConexion(){
    
        try{
        
            conexion.close();
            System.out.println("Conexion Cerrada...");
        }catch(SQLException e){
        
            System.out.println("Error al cerrar la conexion ⚠️ : " + e.getMessage());
        }
        conexion = null;
        return conexion;
    }    
}//Fin
