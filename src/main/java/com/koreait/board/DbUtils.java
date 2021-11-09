package com.koreait.board;

import java.sql.*;

public class DbUtils {
    public static Connection getCon() throws Exception {
        final String URL = "jdbc:mysql://localhost:3308/test";
        final String USERNAME = "root";
        final String PASSWORD = "koreait";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connection Success! 접속성공");
        return con;
    }

    public static void close(Connection con, PreparedStatement ps) {
        close(con, ps, null);
    }
    public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
        if(rs != null) {
            try { rs.close(); }
            catch (Exception e) { e.printStackTrace(); }
        }
        if(ps != null) {
            try { ps.close(); }
            catch (Exception e) { e.printStackTrace(); }
        }
        if(con != null) {
            try { con.close(); }
            catch (Exception e) { e.printStackTrace(); }
        }
    }
}
