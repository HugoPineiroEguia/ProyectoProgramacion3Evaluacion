package juego;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar;

    public Connection establecerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectoprog", "root", "8904");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto a la base correctamente" + e.toString());
        }

        return conectar;
    }

}
