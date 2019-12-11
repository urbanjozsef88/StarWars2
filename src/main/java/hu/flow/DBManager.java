package hu.flow;
import java.sql.*;
public class DBManager {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/starwarsproject?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String USER = "newuser";
    static final String PASS = "Faszombele444!";
    private Connection conn = null;
    private Statement stmt = null;
    private static DBManager instance;
    private DBManager() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }
    private void connect() throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }
    private void close() throws SQLException {
        if(conn != null) {
            conn.close();
        }
    }
    public static DBManager getInstance() throws ClassNotFoundException {
        if(instance == null) {
            instance = new DBManager();
        }
        return instance;
    }
    public void executeSQL(String sql) {
        try {
            connect();
            stmt = conn.createStatement();
            stmt.execute(sql);

            stmt.close();
            close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

