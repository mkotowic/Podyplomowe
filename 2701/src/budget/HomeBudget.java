package budget;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class HomeBudget {

    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "mkotowic";
    private static final String DB_PASS = "Morrowind44";
    private static final String DB_NAME = "mkotowic";

    private static final String INSERT_ENTRY_SQL = "INSERT INTO budget.BudgetEntries(EntryName, Amount) VALUES (?,?);";


    public static void main(String[] args) {

        BudgetEntry be = new BudgetEntry();
        be.setEntryName(args[0]);
        be.setAmount(new BigDecimal(args[1]));



        HomeBudget hb = new HomeBudget();

        try (Connection con = hb.connect(DB_USER, DB_PASS, DB_NAME);
             Statement stmt = con.createStatement())
        {
            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1,be.getEntryName());
            ps.setBigDecimal(2,be.getAmount());
            ps.execute();


        } catch (SQLException e) {
            System.out.println("Wystąpił błąd bazy danych: " + e.getMessage());

            e.printStackTrace();
        }

    }

    public Connection connect (String username, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        ds.setUser(username);
        ds.setPassword(password);
        ds.setDatabaseName(dbName);
        return ds.getConnection();

    }

}