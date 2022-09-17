/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Util;
import java.sql.*;

public class ConexionBD {
    public static Connection getConexionBD(){
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/ajax","root","");
            System.out.println("Se conectó !!!");   
        }catch(Exception e){
            System.out.println("No se conectó !!!");
        }
        return cn;
    }
    public static void main(String arg[]){
        getConexionBD();
    }
}
