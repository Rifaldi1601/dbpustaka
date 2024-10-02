package oop.lanjut;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class dbconnect {
    public Connection con=null;
    public static Statement stm;
    public void OpenConnect()
{
   try {
            String url ="jdbc:mysql://localhost/dbpustaka";  //sesuaikan dengan nama database dilatihan kita namanya dbkampus
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal");
        }
} 
}