package application;


import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = DB.getConnection();
            ps = conn.prepareStatement("DELETE FROM department "
            + "WHERE Id = ?");

            ps.setInt(1, 2);
            int rowsAffected = ps.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException err) {
            throw new DbIntegrityException(err.getMessage());
        } finally {
            DB.closeConnection();
            DB.closeStatement(ps);
        }
    }
}