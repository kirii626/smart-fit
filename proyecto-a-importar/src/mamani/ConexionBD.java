package mamani;

import java.util.List;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/gorditosanonimos?useSSL=false";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "12345678";
    
    public static void main(String[] args) {
        Connection conexion = null;

        try {
            // Cargar el controlador JDBC
            cargarControladorJDBC();

            // Establecer la conexión a la base de datos
            conexion = obtenerConexion();

            // Realizar la consulta y mostrar los resultados
                obtenerRutaImagenReceta(conexion, "Pollo al Curry");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión cuando hayas terminado
            cerrarConexion(conexion);
        }
    }

    private static void cargarControladorJDBC() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }

    private static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

private static void BajaCaloria(Connection conexion) throws SQLException {
    String consulta = "SELECT Nombre " +
                      "FROM Recetas " +
                      "WHERE Calorias_Recetas < 150";

    try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
         ResultSet resultSet = preparedStatement.executeQuery()) {
        // Mostrar los resultados en la consola
        while (resultSet.next()) {
            String nombre = resultSet.getString("Nombre");
            System.out.println(nombre);
        }
    }
}


   private static void MuchasCalorias(Connection conexion) throws SQLException {
    String consulta = "SELECT Nombre " +
                      "FROM Recetas " +
                      "WHERE Calorias_Recetas > 250";

    try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
         ResultSet resultSet = preparedStatement.executeQuery()) {
        // Mostrar los resultados en la consola
        while (resultSet.next()) {
            String nombre = resultSet.getString("Nombre");
            System.out.println(nombre);
        }
    }
}

 private static void MenosGrasas(Connection conexion) throws SQLException {
    String consulta = "SELECT r.Nombre " +
                      "FROM Recetas r " +
                      "JOIN Recetas_Alimentos ra ON r.ID = ra.RecetaID " +
                      "JOIN Alimentos_Basicos ab ON ra.AlimentoID = ab.ID " +
                      "GROUP BY r.ID, r.Nombre, r.Tipo, r.Calorias_Recetas, r.Precio_R " +
                      "HAVING SUM(ab.Grasas * ra.Cantidad) < 4";

    try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
         ResultSet resultSet = preparedStatement.executeQuery()) {
        // Mostrar los resultados en la consola
        while (resultSet.next()) {
            String nombre = resultSet.getString("Nombre");
            System.out.println(nombre);
        }
    }
}

    private static void MasGrasas(Connection conexion) throws SQLException {
    String consulta = "SELECT r.Nombre " +
                      "FROM Recetas r " +
                      "JOIN Recetas_Alimentos ra ON r.ID = ra.RecetaID " +
                      "JOIN Alimentos_Basicos ab ON ra.AlimentoID = ab.ID " +
                      "GROUP BY r.ID, r.Nombre, r.Tipo, r.Calorias_Recetas, r.Precio_R " +
                      "HAVING SUM(ab.Grasas * ra.Cantidad) > 4";

    try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
         ResultSet resultSet = preparedStatement.executeQuery()) {
        // Mostrar los resultados en la consola
        while (resultSet.next()) {
            String nombre = resultSet.getString("Nombre");
            System.out.println(nombre);
        }
    }
    }

   private static void Proteico (Connection conexion) throws SQLException {
        String consulta = "SELECT r.Nombre " +
                          "FROM Recetas r " +
                          "JOIN Recetas_Alimentos ra ON r.ID = ra.RecetaID " +
                          "JOIN Alimentos_Basicos ab ON ra.AlimentoID = ab.ID " +
                          "GROUP BY r.ID, r.Nombre, r.Tipo, r.Calorias_Recetas, r.Precio_R " +
                          "HAVING SUM(ab.Proteina * ra.Cantidad) > 25";

        try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            // Mostrar los resultados en la consola
            while (resultSet.next()) {
                String nombre = resultSet.getString("Nombre");
                System.out.println(nombre);
            }
        }
   }
    public static String[] obtenerAlimentosReceta(Connection conexion, String nombreReceta) throws SQLException {
    String consulta = "SELECT " +
            "CASE " +
            "    WHEN ab.ID IS NOT NULL THEN ab.Nombre " +
            "    WHEN ae.ID IS NOT NULL THEN ae.Nombre " +
            "END AS NombreAlimento " +
            "FROM recetas_alimentos ra " +
            "LEFT JOIN Alimentos_Basicos ab ON ra.AlimentoID = ab.ID " +
            "LEFT JOIN Alimentos_Elaborados ae ON ra.AlimentoID = ae.ID " +
            "WHERE ra.RecetaID = (SELECT ID FROM recetas WHERE recetas.Nombre = ?) LIMIT 3";

    try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
        preparedStatement.setString(1, nombreReceta);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            List<String> nombresAlimentos = new ArrayList<>();

            while (resultSet.next()) {
                String nombre = resultSet.getString("NombreAlimento");
                nombresAlimentos.add(nombre);
            }

            return nombresAlimentos.toArray(new String[0]);
        }
    }
   }
    public static String obtenerRutaImagenReceta(Connection conexion, String nombreReceta) throws SQLException {
        String consulta = "SELECT Imagen_R FROM Recetas WHERE Nombre= ?";
        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, nombreReceta);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("Imagen_R");
                    
                }
            }
        }
        return null; // Devuelve null si no se encuentra la ruta de la imagen
    }

    
public static String[] obtenerPlatosDeMenu(Connection conexion, int menuID) throws SQLException {
    String consulta = "SELECT Nombre FROM Recetas WHERE MenuID = ?";
    
    try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta)) {
        preparedStatement.setInt(1, menuID);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            List<String> nombresPlatos = new ArrayList<>();

            while (resultSet.next()) {
                String nombre = resultSet.getString("Nombre");
                nombresPlatos.add(nombre);
            }

            return nombresPlatos.toArray(new String[0]);
        }
    }
}

public static String[] obtenerBajaCaloria(Connection conexion) throws SQLException {
    String consulta = "SELECT Nombre FROM Recetas WHERE Calorias_Recetas < 150";
    return obtenerNombresRecetas(conexion, consulta);
}

public static String[] obtenerMenosGrasas(Connection conexion) throws SQLException {
    String consulta = "SELECT r.Nombre " +
                      "FROM Recetas r " +
                      "JOIN Recetas_Alimentos ra ON r.ID = ra.RecetaID " +
                      "JOIN Alimentos_Basicos ab ON ra.AlimentoID = ab.ID " +
                      "GROUP BY r.ID, r.Nombre, r.Tipo, r.Calorias_Recetas, r.Precio_R " +
                      "HAVING SUM(ab.Grasas * ra.Cantidad) < 4";
    return obtenerNombresRecetas(conexion, consulta);
}

public static String[] obtenerMasGrasas(Connection conexion) throws SQLException {
    String consulta = "SELECT r.Nombre " +
                      "FROM Recetas r " +
                      "JOIN Recetas_Alimentos ra ON r.ID = ra.RecetaID " +
                      "JOIN Alimentos_Basicos ab ON ra.AlimentoID = ab.ID " +
                      "GROUP BY r.ID, r.Nombre, r.Tipo, r.Calorias_Recetas, r.Precio_R " +
                      "HAVING SUM(ab.Grasas * ra.Cantidad) > 4";
    return obtenerNombresRecetas(conexion, consulta);
}

public static String[] obtenerProteico(Connection conexion) throws SQLException {
    String consulta = "SELECT r.Nombre " +
                      "FROM Recetas r " +
                      "JOIN Recetas_Alimentos ra ON r.ID = ra.RecetaID " +
                      "JOIN Alimentos_Basicos ab ON ra.AlimentoID = ab.ID " +
                      "GROUP BY r.ID, r.Nombre, r.Tipo, r.Calorias_Recetas, r.Precio_R " +
                      "HAVING SUM(ab.Proteina * ra.Cantidad) > 25";
    return obtenerNombresRecetas(conexion, consulta);
}

private static String[] obtenerNombresRecetas(Connection conexion, String consulta) throws SQLException {
    List<String> nombresRecetas = new ArrayList<>();

    try (PreparedStatement preparedStatement = conexion.prepareStatement(consulta);
         ResultSet resultSet = preparedStatement.executeQuery()) {
        while (resultSet.next()) {
            String nombre = resultSet.getString("Nombre");
            nombresRecetas.add(nombre);
        }
    }

    return nombresRecetas.toArray(new String[0]);
}
}