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
            //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public Server() throws SQLException{
       
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
    }
    

    static ServerSocket soc,soc2,soc3,soc4,soc5,soc6;
    static DataOutputStream dout,dout2,dout3,dout4,dout5,dout6;
    static DataInputStream din,din2,din3,din5,din6;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
       th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        //System.out.println("done");
    }
    static Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc=new ServerSocket(9000);
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
        static Thread th5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc5=new ServerSocket(9050);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s5=soc5.accept();
                        System.out.println("done1");
                        handle5(s5);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th6 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc6=new ServerSocket(9060);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s6=soc6.accept();
                        System.out.println("done1");
                        handle6(s6);
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
<<<<<<< HEAD
        
       Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
=======
        //System.out.println("done2");
         
         //System.out.println("done2");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup?zeroDateTimeBehavior=convertToNull","root","");
>>>>>>> b92afc1a4c646dca40c749ffc46aebe964a667fb
        Statement stmt;
        String s2;
        System.out.println("done2");
        s2=din.readUTF();
        
        System.out.println("done2");
        System.out.println(s2);
        stmt=conn.createStatement();
<<<<<<< HEAD
        ResultSet rs=stmt.executeQuery("select * from users where username='"+s2+"'");
        System.out.println(s2);
        //System.out.println(rs.getString("ammount"));
        if(!rs.isBeforeFirst()){
           dout.writeUTF("-1");
        }
        else {
            System.out.println("start...");
            while(rs.next()){
            dout.writeUTF(rs.getString("ammount"));
            dout.writeUTF(rs.getString(2));
            //dout.writeUTF(rs.getString(4));
            //dout.writeUTF(rs.getString(3));
            }System.out.println("end....");
        }
        System.out.println(s2);
        conn.close();
=======
        ResultSet rs=stmt.executeQuery("select * from users where username='"+s2+"' ");
//       while(rs.next())
//       {
//            System.out.println(rs.getString("password"));
//       }
       rs.next();
       dout.writeUTF(rs.getString("password"));
       dout.flush(); 
//   System.out.println(rs.getString("password"));
//       dout.writeUTF(rs.getString("password"));
//        dout.flush();
//        if(!rs.isBeforeFirst()){
//           dout.writeUTF("-1");
//           dout.flush();
//            System.out.println("-1 returned by server");
//        }
//        else {
//            
//            dout.writeUTF(rs.getString("password"));
//            dout.flush();
//            System.out.println("password returned");
//        }
       // conn.close();
>>>>>>> b92afc1a4c646dca40c749ffc46aebe964a667fb
    }
    public static void handle2(Socket s) throws IOException, ClassNotFoundException, SQLException{
        din2=new DataInputStream(s.getInputStream());
        dout2=new DataOutputStream(s.getOutputStream());
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup?zeroDateTimeBehavior=convertToNull","root","");
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
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup?zeroDateTimeBehavior=convertToNull","root","");
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
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_signup?zeroDateTimeBehavior=convertToNull","root","");
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
    public static void handle5(Socket s5) throws IOException, SQLException{
        dout5=new DataOutputStream(s5.getOutputStream());
        din5=new DataInputStream(s5.getInputStream());
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        System.out.println("done1");
        Statement stmt;
        String us=din5.readUTF();
        System.out.println(us);
        stmt=conn.createStatement();
        System.out.println("done1");
        ResultSet rs=stmt.executeQuery("select * from users where username = '"+us+"'");
        System.out.println("done1");
        while(rs.next()){
            System.out.println("done1");
            dout5.writeUTF(rs.getString(2));
            System.out.println(rs.getString(2));
            dout5.writeUTF(rs.getString(3));
            System.out.println(rs.getString(3));
            dout5.writeUTF(rs.getString(4));
            System.out.println(rs.getString(4));
        }
        conn.close();
    }
    public static void handle6(Socket s6) throws IOException, SQLException{
        dout6=new DataOutputStream(s6.getOutputStream());
        din6=new DataInputStream(s6.getInputStream());
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        String sql=din6.readUTF();
        Statement stmt;
        stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            dout6.writeUTF(rs.getString(1));
            dout6.writeUTF(rs.getString(2));
            dout6.writeUTF(rs.getString(13));
            dout6.writeUTF(rs.getString(14));
            dout6.writeUTF(rs.getString(15));
        }
        dout6.writeUTF("-1");
        conn.close();
    }
}
