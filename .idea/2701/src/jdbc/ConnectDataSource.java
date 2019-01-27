package jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataSource {
    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("mkotowic");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);
        ds.setDatabaseName("AdventureWorks");
        ds.setPassword("Morrowind44");

        String sql = "SELECT * FROM Person.Contact";

        try (Connection con = ds.getConnection(); Statement stmt = con.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            String MiddleName;
            int id;
            while (rs.next()) {
                if ((MiddleName = rs.getString("MiddleName")) != null) {
                    id = rs.getInt("ContactID");
                    System.out.println(id + " " + MiddleName);
                }
            }

        } catch (SQLException e) {
            System.out.println("Problemy z bazą danych!" + e.getMessage());
        }

    }
}
