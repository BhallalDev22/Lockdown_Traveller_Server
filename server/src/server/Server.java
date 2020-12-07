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
    static Connection conn1;
        //Class.forName("com.mysql.jdbc.Driver");
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        static{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn1 = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
                System.out.println("done1");
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public Server() throws SQLException{
       
        
    }
    

    static ServerSocket soc,soc2,soc3,soc4,soc5,soc6,soc7,soc8,soc9,soc10,soc11,soc12,soc13,soc14,soc15,soc16,soc17;
    static DataOutputStream dout,dout2,dout3,dout4,dout5,dout6,dout7,dout8,dout9,dout10,dout11,dout12,dout13,dout14,dout15,dout16,dout17;
    static DataInputStream din,din2,din3,din5,din6,din7,din8,din9,din10,din11,din12,din13,din14,din15,din16,din17;
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
        th7.start();
        th8.start();
        th9.start();
        th10.start();
        th11.start();
        th12.start();
        th13.start();
        th14.start();
        th15.start();
        th16.start();
        th17.start();
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
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th7 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc7=new ServerSocket(9070);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s7=soc7.accept();
                        System.out.println("done7");
                        handle7(s7);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th8 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc8=new ServerSocket(9080);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s8=soc8.accept();
                        System.out.println("done8");
                        handle8(s8);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th9 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc9=new ServerSocket(9090);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s9=soc9.accept();
                        System.out.println("done8");
                        handle9(s9);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });

        static Thread th10 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc10=new ServerSocket(9100);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s10=soc10.accept();
                        System.out.println("done8");
                        handle10(s10);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th11 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc11=new ServerSocket(9110);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s11=soc11.accept();
                        System.out.println("done8");
                        handle11(s11);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th12 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc12=new ServerSocket(9120);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s12=soc12.accept();
                        System.out.println("done12");
                        handle12(s12);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th13 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc13=new ServerSocket(9130);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s13=soc13.accept();
                        System.out.println("done13");
                        handle13(s13);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th14 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc14=new ServerSocket(9140);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s14=soc14.accept();
                        System.out.println("done14");
                        handle14(s14);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th15 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc15=new ServerSocket(9150);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s15=soc15.accept();
                        System.out.println("done15");
                        handle15(s15);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th16 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc16=new ServerSocket(9160);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s16=soc16.accept();
                        System.out.println("done16");
                        handle16(s16);
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        static Thread th17 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    soc17=new ServerSocket(9170);
                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        
                        Socket s17=soc17.accept();
                        System.out.println("done17");
                        handle17(s17);
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

        
       //conn1 = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");

        //System.out.println("done2");
         
         //System.out.println("done2");
        //Connection conn = DriverManager.getConnection("jdbc:mysql:///test","root","root");

        Statement stmt;
        String s2;
        System.out.println("done2");
        s2=din.readUTF();
        
        System.out.println("done2");
        System.out.println(s2);
        stmt=conn1.createStatement();

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
       // conn1.close();

    }
    public static void handle2(Socket s) throws IOException, ClassNotFoundException, SQLException{
        din2=new DataInputStream(s.getInputStream());
        dout2=new DataOutputStream(s.getOutputStream());
        
       // conn1 = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        String s2;
        s2=din2.readUTF();
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery("select * from users where username='"+s2+"'");
        if(!rs.isBeforeFirst()){
           dout2.writeUTF("-1");
        }
        else {
            //System.out.println(rs.getInt(0));
            dout2.writeUTF("1234");
        }
      //  conn1.close();
    }
    public static void handle3(Socket soc3) throws IOException, SQLException{
        din3=new DataInputStream(soc3.getInputStream());
        dout3=new DataOutputStream(soc3.getOutputStream());
        System.out.println("done");
      //  conn1 = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        String st;
        st=din3.readUTF();
        System.out.println(st);
        stmt=conn1.createStatement();
        int rs=stmt.executeUpdate(st);
       // conn1.close();
    }
    public static void handle4(Socket s1) throws IOException, SQLException{
        dout4=new DataOutputStream(s1.getOutputStream());
      // conn1 = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        stmt=conn1.createStatement();
        System.out.println("done1");
        ResultSet rs=stmt.executeQuery("select * from stations");
        System.out.println("done1");
        while(rs.next()){
            dout4.writeUTF(rs.getString("sname")+"-"+rs.getString("scode"));
        }
        dout4.writeUTF("-1");
        System.out.println("done1");
       // conn1.close();
    }
    public static void handle5(Socket s5) throws IOException, SQLException{
        dout5=new DataOutputStream(s5.getOutputStream());
        din5=new DataInputStream(s5.getInputStream());
      //  Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        System.out.println("done1");
        Statement stmt;
        String us=din5.readUTF();
        System.out.println(us);
        stmt=conn1.createStatement();
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
       // conn1.close();
    }
    public static void handle6(Socket s6) throws IOException, SQLException, ClassNotFoundException{
        dout6=new DataOutputStream(s6.getOutputStream());
        din6=new DataInputStream(s6.getInputStream());
        System.out.println("hello");
        
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        String sql=din6.readUTF();
        Statement stmt;
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            dout6.writeUTF(rs.getString(1));
            dout6.writeUTF(rs.getString(2));
            dout6.writeUTF(rs.getString(13));
            dout6.writeUTF(rs.getString(14));
            dout6.writeUTF(rs.getString(15));
            dout6.writeUTF(rs.getString(16));
        }
        dout6.writeUTF("-1");
       // conn1.close();
    }
    public static void handle7(Socket s7) throws IOException, SQLException{
        dout7=new DataOutputStream(s7.getOutputStream());
        din7=new DataInputStream(s7.getInputStream());
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        String sql=din7.readUTF();
        Statement stmt;
        System.out.println(sql);
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        if(!rs.isBeforeFirst()){
            dout7.writeUTF("-1");
        }
        else dout7.writeUTF("1");
       // conn1.close();
    }
    public static void handle8(Socket s8) throws IOException, SQLException{
        dout8=new DataOutputStream(s8.getOutputStream());
        din8=new DataInputStream(s8.getInputStream());
        String num,date,name = "";
        num=din8.readUTF();
        date=din8.readUTF();
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery("select * from train where train_number ='"+num+"' AND date = '"+date+"'");
        if(!rs.isBeforeFirst()){
            dout8.writeUTF("1");
        }
        else {
            while(rs.next()){
                name=rs.getString(2);
            }
            stmt=conn1.createStatement();
            int rs1=stmt.executeUpdate("delete from train where train_number ='"+num+"' AND date = '"+date+"'");
             stmt=conn1.createStatement();
             rs1=stmt.executeUpdate("insert into cancelledtrain (train_number,train_name,date) values ('"+num+"','"+name+"','"+date+"')");
             dout8.writeUTF("2");
             System.out.println("starting cancellation");
             stmt=conn1.createStatement();
             rs=stmt.executeQuery("select * from booking where trainnum='"+num+"' AND doj = '"+date+"'");
             while(rs.next()){
                 num="";
                 stmt=conn1.createStatement();
                 rs1=stmt.executeUpdate("delete from booking where pnr ='"+rs.getString(1)+"'");
                 stmt=conn1.createStatement();
                 num="insert into cancelledticket (pnr,username,trainname,trainnum,doj,p1n,p1a,p1g,p1b,p2n,p2a,p2g,p2b,p3n,p3a,p3g,p3b,p4n,p4a,p4g,p4b,p5n,p5a,p5g,p5b,source,destination,fare,distance,clas)";
                 num+=" values ";
                 rs1=stmt.executeUpdate("delete from booking where pnr ='"+rs.getString(1)+"'");
             }
        }
    }
    public static void handle9(Socket s9) throws IOException, SQLException{
        dout9=new DataOutputStream(s9.getOutputStream());
        din9=new DataInputStream(s9.getInputStream());
        String s=din9.readUTF();
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        System.out.println(s);
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery("select * from users where username ='"+s+"'");
        while(rs.next()){
            dout9.writeUTF(rs.getString(6));
        }
       // conn1.close();
    }
    public static void handle10(Socket s10) throws IOException, SQLException{
        dout10=new DataOutputStream(s10.getOutputStream());
        din10=new DataInputStream(s10.getInputStream());
        String sql=din10.readUTF();
        System.out.println(sql);
       // Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        stmt=conn1.createStatement();
        int rs1=stmt.executeUpdate(sql);
        System.out.println(rs1);
        //conn1.close();
    }
    public static void handle11(Socket s11) throws IOException, SQLException {
        dout11=new DataOutputStream(s11.getOutputStream());
        din11=new DataInputStream(s11.getInputStream());
        String sql=din11.readUTF();
       // Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        if(!rs.isBeforeFirst()){
            dout11.writeUTF("-1");
        }
        else {
               rs.next();
               {
                dout11.writeUTF(rs.getString(2));
                dout11.writeUTF(rs.getString(3));
                dout11.writeUTF(rs.getString(4));
                dout11.writeUTF(rs.getString(5));
                dout11.writeUTF(rs.getString(6));
                dout11.writeUTF(rs.getString(7));
                dout11.writeUTF(rs.getString(8));
                dout11.writeUTF(rs.getString(9));
                dout11.writeUTF(rs.getString(10));
                dout11.writeUTF(rs.getString(11));
                dout11.writeUTF(rs.getString(12));
                dout11.writeUTF(rs.getString(13));
                dout11.writeUTF(rs.getString(14));
                dout11.writeUTF(rs.getString(15));
                dout11.writeUTF(rs.getString(16));
                dout11.writeUTF(rs.getString(17));
                dout11.writeUTF(rs.getString(18));
                dout11.writeUTF(rs.getString(19));
                dout11.writeUTF(rs.getString(20));
                dout11.writeUTF(rs.getString(21));
                dout11.writeUTF(rs.getString(22));
                dout11.writeUTF(rs.getString(23));
                dout11.writeUTF(rs.getString(24));
                dout11.writeUTF(rs.getString(25));
                dout11.writeUTF(rs.getString(26));
                dout11.writeUTF(rs.getString(27));
                dout11.writeUTF(rs.getString(1));
            }
        }
        
    }
    public static void handle12(Socket s12) throws IOException, SQLException{
        dout12=new DataOutputStream(s12.getOutputStream());
        din12=new DataInputStream(s12.getInputStream());
        //String s=din12.readUTF();
       // Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery("select * from booking");
        if(!rs.isBeforeFirst()){
            dout12.writeUTF("-1");
        }
        else {
            rs.next();
            String str=rs.getString(1);
            int j,i;
            j=Integer.parseInt(str);
            while(rs.next()){
                str=rs.getString(1);
                i=Integer.parseInt(str);
                if(i>j){
                    j=i;
                }
            }
            dout12.writeUTF(j+"");
        }
        System.out.println("done12");
    }
    public static void handle13(Socket s13) throws IOException, SQLException{
        dout13=new DataOutputStream(s13.getOutputStream());
        din13=new DataInputStream(s13.getInputStream());
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        Statement stmt;
        stmt=conn1.createStatement();
        String s=din13.readUTF();
        System.out.println(s);
        ResultSet rs=stmt.executeQuery(s);
        if(!rs.isBeforeFirst()){
            dout13.writeUTF("-1");
        }
        else {
            while(rs.next()){
                dout13.writeUTF(rs.getString(1));
                 dout13.writeUTF(rs.getString(3));
                  dout13.writeUTF(rs.getString(5));
                   dout13.writeUTF(rs.getString(26));
                    dout13.writeUTF(rs.getString(27));
                     dout13.writeUTF(rs.getString(30));
            }
            dout13.writeUTF("-1");
        }
    }
    public static void handle14(Socket s14) throws IOException, SQLException{
        dout14=new DataOutputStream(s14.getOutputStream());
        din14=new DataInputStream(s14.getInputStream());
        //Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.64.2/test","root","root");
        String pnr=din14.readUTF();
        Statement stmt;
        stmt=conn1.createStatement();
        System.out.println(pnr);
        ResultSet rs=stmt.executeQuery("select * from booking where pnr = '"+pnr+"'");
        if(!rs.isBeforeFirst()){
            dout14.writeUTF("-1");
        }
        else {
        rs.next();
        dout14.writeUTF(rs.getString(2));
        dout14.writeUTF(rs.getString(3));
        dout14.writeUTF(rs.getString(4));
        dout14.writeUTF(rs.getString(5));
        dout14.writeUTF(rs.getString(6));
        dout14.writeUTF(rs.getString(7));
        dout14.writeUTF(rs.getString(8));
        dout14.writeUTF(rs.getString(9));
        dout14.writeUTF(rs.getString(10));
        dout14.writeUTF(rs.getString(11));
        dout14.writeUTF(rs.getString(12));
        dout14.writeUTF(rs.getString(13));
        dout14.writeUTF(rs.getString(14));
        dout14.writeUTF(rs.getString(15));
        dout14.writeUTF(rs.getString(16));
        dout14.writeUTF(rs.getString(17));
        dout14.writeUTF(rs.getString(18));
        dout14.writeUTF(rs.getString(19));
        dout14.writeUTF(rs.getString(20));
        dout14.writeUTF(rs.getString(21));
        dout14.writeUTF(rs.getString(22));
        dout14.writeUTF(rs.getString(23));
        dout14.writeUTF(rs.getString(24));
        dout14.writeUTF(rs.getString(25));
        dout14.writeUTF(rs.getString(26));
        dout14.writeUTF(rs.getString(27));
        dout14.writeUTF(rs.getString(28));
        dout14.writeUTF(rs.getString(29));
        dout14.writeUTF(rs.getString(30));
        dout14.writeUTF(rs.getString(31));
        
        dout14.writeUTF(rs.getString(32));}
        System.out.println("donesend");
    }
    public static void handle15(Socket s15) throws IOException, SQLException{
        dout15=new DataOutputStream(s15.getOutputStream());
        din15=new DataInputStream(s15.getInputStream());
        String sql=din15.readUTF();
        Statement stmt;
        stmt=conn1.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        System.out.println(sql);
        if(!rs.isBeforeFirst()){
            dout15.writeUTF("-1");
        }
        else {
            rs.next();
            dout15.writeUTF(rs.getString(4));
            dout15.writeUTF(rs.getString(13));
        }
        
    }
    public static void handle16(Socket s16) throws IOException, SQLException{
        dout16=new DataOutputStream(s16.getOutputStream());
        din16=new DataInputStream(s16.getInputStream());
        Statement stmt;
        String pnr=din16.readUTF();
        stmt=conn1.createStatement();
        System.out.println(pnr);
        ResultSet rs=stmt.executeQuery("select * from cancelledticket where pnr = '"+pnr+"'");
        rs.next();
        dout16.writeUTF(rs.getString(2));
        dout16.writeUTF(rs.getString(3));
        dout16.writeUTF(rs.getString(4));
        dout16.writeUTF(rs.getString(5));
        dout16.writeUTF(rs.getString(6));
        dout16.writeUTF(rs.getString(7));
        dout16.writeUTF(rs.getString(8));
        dout16.writeUTF(rs.getString(9));
        dout16.writeUTF(rs.getString(10));
        dout16.writeUTF(rs.getString(11));
        dout16.writeUTF(rs.getString(12));
        dout16.writeUTF(rs.getString(13));
        dout16.writeUTF(rs.getString(14));
        dout16.writeUTF(rs.getString(15));
        dout16.writeUTF(rs.getString(16));
        dout16.writeUTF(rs.getString(17));
        dout16.writeUTF(rs.getString(18));
        dout16.writeUTF(rs.getString(19));
        dout16.writeUTF(rs.getString(20));
        dout16.writeUTF(rs.getString(21));
        dout16.writeUTF(rs.getString(22));
        dout16.writeUTF(rs.getString(23));
        dout16.writeUTF(rs.getString(24));
        dout16.writeUTF(rs.getString(25));
        dout16.writeUTF(rs.getString(26));
        dout16.writeUTF(rs.getString(27));
        dout16.writeUTF(rs.getString(28));
        dout16.writeUTF(rs.getString(29));
        dout16.writeUTF(rs.getString(30));
        
    }
    public static void handle17(Socket s17)throws IOException, SQLException{
        dout17=new DataOutputStream(s17.getOutputStream());
        din17=new DataInputStream(s17.getInputStream());
        String num=din17.readUTF();
        Statement stmt;
        stmt=conn1.createStatement();
        System.out.println(num);
        ResultSet rs=stmt.executeQuery("select * from train where train_number = '"+num+"'");
        if(!rs.isBeforeFirst()){
            dout17.writeUTF("-1");
        }
        else {
            rs.next();
            System.out.println("Train found!!!");
            dout17.writeUTF(rs.getString(2));
            System.out.println("Train found!!!");
            dout17.writeUTF(rs.getString(15));
            System.out.println("Train found!!!");
        }
    }
    
}
