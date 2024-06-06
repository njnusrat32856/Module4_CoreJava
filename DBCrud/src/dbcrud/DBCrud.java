package dbcrud;

import entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DbUtil;

public class DBCrud {

    static PreparedStatement ps;
    static ResultSet rs;
    static DbUtil db = new DbUtil();

    public static void main(String[] args) {

        Student student = new Student();

        List<Student> studentList = getById(5);
        
        student.setName("Noor E Jannat");
        student.setEmail("noorejannat@gmail.com");
        student.setAddress("Australia");
        student.setCell(studentList.get(0).getCell());
        student.setId(studentList.get(0).getId());
        
//        saveData();  
        editData(student);
        showData();
    }

    public static void saveData() {

        String insertSql = "insert into students(name, email, address, cell) "
                + "values(?,?,?,?)";

        try {
            ps = db.getConnect().prepareStatement(insertSql);

            ps.setString(1, "Rezvi");
            ps.setString(2, "rezvi@gmail.com");
            ps.setString(3, "Azimpur, Dhaka");
            ps.setString(4, "756692300");

            ps.executeUpdate();
            ps.close();
            db.getConnect().close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showData() {

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

                System.out.println("Id is " + id + " Name: " + name + " Email: " + email
                        + " Address: " + address + " Cell: " + cell);

            }

            ps.close();
            rs.close();

            db.getConnect().close();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void editData(Student stu) {

        String sql = "update students set name=?, email=?, address=?, cell=? where id=?";

        try {
            ps = db.getConnect().prepareStatement(sql);

            ps.setString(1, stu.getName());
            ps.setString(2, stu.getEmail());
            ps.setString(3, stu.getAddress());
            ps.setString(4, stu.getCell());
            ps.setInt(5, stu.getId());

            ps.executeUpdate();

            ps.close();
            db.getConnect().close();
            System.out.println("Edit Successful");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Student> getById(int id) {

        List<Student> studentList = new ArrayList<>();

        String sql = "select * from students where id=?";

        try {
            ps = db.getConnect().prepareStatement(sql);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            while (rs.next()) {
                Student s = new Student(
                        
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("cell")
                        
                );

                studentList.add(s);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        return studentList;
    }
}
