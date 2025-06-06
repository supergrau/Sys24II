package future.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConnectUse {
    public static void main(String[] args) {
        String connUrl = "jdbc:sqlserver://mssql:1433;"
                            + "databaseName=TestDB;"
                            + "encrypt=false;"
                            + "trustServerCertificate=true;"
                            + "user=sa;"
                            + "password=Kennwort00;";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(connUrl);
            System.out.println("Connection established");

            // SQL-Query as String:
            String sql = "SELECT * FROM myvalues";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Print resultSet on screen
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " - " +
                                   resultSet.getString("value1") + " - " +
                                   resultSet.getString("value2"));
            }


            conn.close();
        }

        catch (Exception e) {
            System.out.println("Connection refused");
            System.out.println(e.getMessage());
        }
    }
}
