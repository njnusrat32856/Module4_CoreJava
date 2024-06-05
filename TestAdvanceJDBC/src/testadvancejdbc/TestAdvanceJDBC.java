package testadvancejdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class TestAdvanceJDBC {

    static PreparedStatement ps;
    static ResultSet rs;

    public static void main(String[] args) {
        
        DbUtil db = new DbUtil();

        String insertSql = "insert into students(name, email, address, cell) "
                + "values(?,?,?,?)";

        try {
            ps = db.getConnect().prepareStatement(insertSql);

            ps.setString(1, "Eva");
            ps.setString(2, "eva@gmail.com");
            ps.setString(3, "Gulshan, Dhaka");
            ps.setString(4, "756692300");

            ps.executeUpdate();
            ps.close();
            db.getConnect().close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestAdvanceJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

        String selectSql = "select * from students";

        try {
            ps = db.getConnect().prepareStatement(selectSql);

            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String cell = rs.getString("cell");
                
                System.out.println("Id is " + id + " Name: " + name + " Email: " + email +
                        " Address: " + address + " Cell: " + cell);
                         
            }
            
            ps.close();
            rs.close();
            
            db.getConnect().close();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TestAdvanceJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
