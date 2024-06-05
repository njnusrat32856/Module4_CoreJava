
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbUtil {
    
    private Connection connect = null;
    private String url = "jdbc:mysql://localhost:3306/dbcrud";
    private String user = "root";
    private String password = "1234";
    private String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection getConnect() throws ClassNotFoundException{
    
        Class.forName(driver);
        
        try {
            connect = DriverManager.getConnection(url,user, password);
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }
}
