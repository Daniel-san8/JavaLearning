package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " +"VALUES "
                    + "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Daniel San");
            st.setString(2, "daniel@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("17/04/2003").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);

            int rowsAffected = st.executeUpdate();

            if(rowsAffected != 0) {
                ResultSet rs = st.getGeneratedKeys();

                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("ID: " + id);
                }
            } else {
                System.out.println("No rows affected");
            }
        } catch (Exception e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}