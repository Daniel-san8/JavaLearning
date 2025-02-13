package application;


import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement ps = null;

        try {
            conn = DB.getConnection();
            conn.setAutoCommit(false);
            ps = conn.createStatement();

            int rows1 = ps.executeUpdate("UPDATE seller SET BaseSalary = 3000 WHERE DepartmentId = 1");

            int x = 2;
            if(x < 2) {
//                conn.rollback();
                throw new SQLException("Fake Error");
            }
            int rows2 = ps.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println(rows1);
            System.out.println(rows2);
        } catch (SQLException err) {
            try {
                conn.rollback();
                throw new DbException(err.getMessage());

            } catch (SQLException e) {
                throw new DbException("Erro na transação, erro: " + e.getMessage());
            }

        } finally {
            DB.closeConnection();
            DB.closeStatement(ps);
        }
    }
}