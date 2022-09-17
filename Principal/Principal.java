/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Principal;

import Util.ConexionBD;
import java.sql.*;


public class Principal {
    public static void main(String arg[]){
        MostrarDatos();
    }
    public static void MostrarDatos(){
        Connection cn=null;
        PreparedStatement pt=null;
        ResultSet rs=null;
        try{
            cn=ConexionBD.getConexionBD();
            pt=cn.prepareStatement("select * from persona");
            rs=pt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+"  "+rs.getString(2));
            }
            pt.close();
            rs.close();
            cn.close();
            
            
        }catch(Exception e){
            
        }
    }
}
