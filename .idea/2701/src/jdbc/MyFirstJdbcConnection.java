package jdbc;

import java.sql.*;

public class MyFirstJdbcConnection {
    public static void main(String[] args) throws SQLException {


        String connectionURL =
                "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=mkotowic;password=Morrowind44";

        Connection con = DriverManager.getConnection(connectionURL);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM Person.Contact");

        while (rs.next()) {
            System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
        }
        rs.close();
        stmt.close();
        con.close();
        //zanykamy w odwrotnej kolejnosci do tworzenia
    }
}
