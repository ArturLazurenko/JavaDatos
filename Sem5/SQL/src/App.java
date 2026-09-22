import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://127.0.0.1:3306/new_schema3";
        String user = "root";
        String password = "admin";
        System.out.println("Conectando a la base de datos...");
        try(Connection conexion = DriverManager.getConnection(url,user,password)) {
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos");
                Statement statement = conexion.createStatement();
                String query = "SELECT * FROM alumnos";
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String ID_matricula = resultSet.getString("ID_matricula");
                    String nombre = resultSet.getString("nombre");
                    String ap_paterno = resultSet.getString("ap_paterno");
                    String ap_materno = resultSet.getString("ap_materno");
                    float nota = resultSet.getInt("nota");
                    String email = resultSet.getString("email");

                    System.out.println(ID_matricula+" "+ nombre+" "+ap_paterno+" "+ap_materno+" "+nota+" "+email);
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