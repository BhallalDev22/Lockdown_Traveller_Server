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
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    static ServerSocket soc,soc2,soc3,soc4;
    static DataOutputStream dout,dout2,dout3,dout4;
    static DataInputStream din,din2,din3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
       th1.start();
        th2.start();
        th3.start();
        th4.start();
        //System.out.println("done");
    }
    static Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc=new ServerSocket(5000);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s=soc.accept();
                        System.out.println("done1");
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
        static Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc2=new ServerSocket(9020);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s1=soc2.accept();
                        handle2(s1);
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
        static Thread th3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc3=new ServerSocket(9030);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s2=soc3.accept();
                        handle3(s2);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
            }
        });
        static Thread th4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc4=new ServerSocket(9040);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s3=soc4.accept();
                        System.out.println("done1");
                        handle4(s3);
                    } catch (IOException ex) {
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
        //System.out.println("done2");
         
         //System.out.println("done2");
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        String s2;
        System.out.println("done2");
        s2=din.readUTF();
        System.out.println("done2");
        System.out.println(s2);
        stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from users where username='"+s2+"'");
        if(!rs.isBeforeFirst()){
           dout.writeUTF("-1");
        }
        else {
            
            dout.writeUTF("1234");
        }
        conn.close();
    }
    public static void handle2(Socket s) throws IOException, ClassNotFoundException, SQLException{
        din2=new DataInputStream(s.getInputStream());
        dout2=new DataOutputStream(s.getOutputStream());
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        String s2;
        s2=din2.readUTF();
        stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from users where username='"+s2+"'");
        if(!rs.isBeforeFirst()){
           dout2.writeUTF("-1");
        }
        else {
            //System.out.println(rs.getInt(0));
            dout2.writeUTF("1234");
        }
        conn.close();
    }
    public static void handle3(Socket soc3) throws IOException, SQLException{
        din3=new DataInputStream(soc3.getInputStream());
        dout3=new DataOutputStream(soc3.getOutputStream());
        System.out.println("done");
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        String st;
        st=din3.readUTF();
        System.out.println(st);
        stmt=conn.createStatement();
        int rs=stmt.executeUpdate(st);
        conn.close();
    }
    public static void handle4(Socket s1) throws IOException, SQLException{
        dout4=new DataOutputStream(s1.getOutputStream());
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        stmt=conn.createStatement();
        System.out.println("done1");
        ResultSet rs=stmt.executeQuery("select * from stations");
        System.out.println("done1");
        while(rs.next()){
            dout4.writeUTF(rs.getString("sname")+"-"+rs.getString("scode"));
        }
        dout4.writeUTF("-1");
        System.out.println("done1");
        conn.close();
    }
}
