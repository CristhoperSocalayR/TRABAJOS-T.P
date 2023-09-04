package sistemas.empleadosDAL;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class conexion {
    private String strConexionDB = "jdbc:sqlite:C:/Users/PC-Ramirez/Desktop/ParaJava/db/sistema.s3db";
    private Connection conn = null;
    
    public conexion() {
        try {
            conn = DriverManager.getConnection(strConexionDB);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }

    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        
        try {
            PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        }
    }
    
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            
           PreparedStatement pstm = conn.prepareStatement(strSentenciaSQL);
           ResultSet respuesta = pstm.executeQuery();
           return respuesta; 
           
        } catch (SQLException e) {
            System.out.println(e);
            return null;        
        }  
    }    
}

