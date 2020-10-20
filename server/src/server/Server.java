/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ajendrasaxena
 */
public class Server {
    
    static ServerSocket soc;
    static DataOutputStream dout;
    static DataInputStream din;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       th1.start();
        
    }
    static Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc=new ServerSocket(9010);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s=soc.accept();
                        handle(s);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

    public static void handle(Socket s1) throws IOException, ClassNotFoundException, SQLException{
        din=new DataInputStream(s1.getInputStream());
        dout=new DataOutputStream(s1.getOutputStream());
         Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        String s2;
        s2=din.readUTF();
        System.out.println(s2);
        stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from users where username='"+s2+"'");
        if(!rs.isBeforeFirst()){
           dout.writeUTF("-1");
        }
        else {
            //System.out.println(rs.getInt(0)+"");
            dout.writeUTF("1234");
        }
        conn.close();
    }
}
