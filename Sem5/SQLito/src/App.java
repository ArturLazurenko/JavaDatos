import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {

        String url = "jdbc:mysql://altaria.proxy.rlwy.net:52682/DEVLivery";
        String user = "root";
        String password = "TVKEkqyrONEOALPdQOGaSBJYgsrXxqhu";

        System.out.println("Conectando a la base de datos...");

        try (
            Connection conexion = DriverManager.getConnection(url, user, password);
            Statement statement = conexion.createStatement()
        ) {
            System.out.println("Conexión exitosa a la base de datos\n");

            String query = "SELECT * FROM CLIENTES";

            try (ResultSet resultSet = statement.executeQuery(query)) {

                String linea =
                    "+---------------+----------------------+----------------------+----------------------+";

                System.out.println(linea);
                System.out.printf(
                    "| %-13s | %-20s | %-20s | %-20s |%n",
                    "CURP",
                    "Nombre",
                    "Apellido paterno",
                    "Apellido materno"
                
                );
                System.out.println(linea);

                while (resultSet.next()) {
                    int idMatricula = resultSet.getInt("CURP");
                    String nombre = resultSet.getString("nombre");
                    String apPaterno = resultSet.getString("apellido_paterno");
                    String apMaterno = resultSet.getString("apellido_materno");
                    

                    System.out.printf(
                        "| %-13d | %-20s | %-20s | %-20s |%n",
                        idMatricula,
                        nombre,
                        apPaterno,
                        apMaterno
                        
                    );
                }

                System.out.println(linea);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar la base de datos:");
            e.printStackTrace();
        }
    }
}