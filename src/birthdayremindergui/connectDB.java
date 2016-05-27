/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdayremindergui;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author dam nosrep
 */
public class connectDB {
    
    Connection conn=null;
    public static Connection ConnectrDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn =DriverManager.getConnection("jdbc:mysql://localhost/birthdaydb","root","");
           return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
            
        }
    }
}
