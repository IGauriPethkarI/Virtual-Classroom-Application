/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3;
    public JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    JComboBox<String> d;

    Login(){

        super("Login");

        setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(90,-20,150,150);
        add(l3);
        
        l1 = new JLabel("Username");
        l1.setBounds(40,100,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,150,100,30);
        add(l2);
        
        l3 = new JLabel("User Type");
        l3.setBounds(40,200,100,30);
        add(l3);
 
        t1=new JTextField();
        t1.setBounds(150,100,150,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(150,150,150,30);
        add(t2);
        
        String[] optionsToChoose = {"admin","teacher","student"};
        d = new JComboBox<>(optionsToChoose);
        d.setBounds(150,200,150,30);
        add(d);

        b1 = new JButton("Login");
        b1.setBounds(40,250,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(180,250,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(350,350);
        setLocation(500,300);

    }

    public void actionPerformed(ActionEvent ae){

        try{
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            String w = d.getItemAt(d.getSelectedIndex());
            
            String q = "select * from multilogin where username='"+u+"' and password='"+v+"' and usertype='"+w+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
                if(d.getSelectedIndex() == 0){
                    new Project().setVisible(true);
                    setVisible(false);
                }
                else if(d.getSelectedIndex() == 1){
                    new TeacherProfile(u).setVisible(true);
                    setVisible(false);
                }
                else{
                    new StudentProfile(u).setVisible(true);
                    setVisible(false);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] arg){
        Login l = new Login();
    }
}