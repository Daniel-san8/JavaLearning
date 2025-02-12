package application;


import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("UPDATE seller "
            + "SET BaseSalary = BaseSalary + ? "
            + "WHERE "
            + "(DepartmentId = ?)");

            ps.setDouble(1, 200.0);
            ps.setInt(2, 2);
            int rowsAffected = ps.executeUpdate();

            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException err) {
            err.printStackTrace();
        } finally {
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}