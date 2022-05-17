package com.jdbc;

import java.sql.*;

public class ConnectionDataBase {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
        String name = "root";
        String pass = "susanoo@93fire";
        String query = "select * from info;";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next()){
            System.out.println(rs.getInt(1) + " -> " + rs.getString("sName"));
        }

        st.close();
        con.close();
    }
}
