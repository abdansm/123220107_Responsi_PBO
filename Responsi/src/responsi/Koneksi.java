/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ABDAN SM
 */
public class Koneksi {
     static String DB_URL = "jdbc:mysql://localhost:3306/perpustakaan";
     static String USER = "root";
     static String PASS = "";
      public static Connection Koneksi(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(DB_URL,USER,PASS);
            
            return koneksi;
        } catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    
    }

}
