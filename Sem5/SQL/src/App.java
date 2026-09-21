import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/paquetes2";
        String user = "root";
        String password = "admin";
        System.out.println("Conectando a la base de datos...");
        try(Connection conexion = DriverManager.getConnection(url,user,password)) {
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos");
                Statement statement = conexion.createStatement();
                String query = "SELECT * FROM CLIENTE";
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String curp_cliente = resultSet.getString("curp_cliente");
                    String nombre = resultSet.getString("nombre");
                    String apellidos = resultSet.getString("apellido_paterno") + " " + resultSet.getString("apellido_materno");
                    System.out.println("CURP: " + curp_cliente + ", Nombre: " + nombre + ", Apellidos: " + apellidos);
                }
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos");
            e.printStackTrace();
        }
    }
}
