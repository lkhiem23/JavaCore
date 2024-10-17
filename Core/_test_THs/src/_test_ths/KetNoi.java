/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _test_ths;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class KetNoi {
    public static Connection KNCSDL() throws ClassNotFoundException, SQLException{
        String path = "jdbc:mysql://localhost:3306/qlhv";
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection cn = DriverManager.getConnection(path, "root", "");
        return cn;
    
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException, SQLException {
        Connection kn = KNCSDL();
        if(kn==null){
            System.out.println("Ket Noi that bai");
        }else{
            System.out.println("OK");
        }
    }
        
}
