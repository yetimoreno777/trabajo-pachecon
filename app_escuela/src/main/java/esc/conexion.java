package esc;
import java.sql.*;

public class conexion{
    String url="jdbc:mysql://localhost:3306/bd_escuela";
    String user="root"; 
    String password="";
    public void cargarDriver() throws Exception{
        try{
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("driver cargdo");
        }
        catch (Exception obj){
            throw obj;
        }
    }
    
    public Connection getConnection() throws SQLException{
        Connection cn;
        try {
            cn=DriverManager.getConnection(url,user,password);
            return cn;
        }
        catch (SQLException obje){
            throw obje;
        }
    }
}