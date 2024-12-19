package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String url = "jdbc:postgresql://localhost:5432/UserDataBase";
    private static final String user = "postgres";
    private static final String password = "qwe123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    } // реализуйте настройку соеденения с БД
}
