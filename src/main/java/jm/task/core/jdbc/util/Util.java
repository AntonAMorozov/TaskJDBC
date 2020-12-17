package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соединения с БД
    protected String dbUser = "root";
    protected String dbPass = "rss232";
    protected String dbURL = "jdbc:mysql://localhost:3306/jmpptest?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";

    public Connection getdbConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbURL, dbUser, dbPass);
            //System.out.println("Connection OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
