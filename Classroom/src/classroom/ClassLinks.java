/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.net.URI;
import java.sql.*;
import java.util.*;

public class ClassLinks extends JFrame implements ActionListener{
    
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6;
    JButton b,b1,b2,b3,b4,b5;
    
    ClassLinks(){
        f=new JFrame("Class Links");
        f.setSize(490,400);
        f.setLocation(450,150); 
        f.setBackground(Color.white);
        f.setLayout(null);
        
        id1 = new JLabel("Google Meet Links for Classes");
        id1.setBounds(50,10,500,50);
        id1.setFont(new Font("serif",Font.ITALIC,20));
        id1.setForeground(Color.black);
        f.add(id1);
        
        b=new JButton("Back");   
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(320,20,70,40);
        f.add(b);
        
        id2 = new JLabel("Electronic Devices");
        id2.setBounds(50,90,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.add(id2);
        
        id3 = new JLabel("Network Theory");
        id3.setBounds(50,140,200,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        f.add(id3);
        
        id4 = new JLabel("Control Systems");
        id4.setBounds(50,190,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        f.add(id4);
        
        id5 = new JLabel("Digital Signal Processing");
        id5.setBounds(50,240,200,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        f.add(id5);
        
        id6 = new JLabel("Micro Controllers");
        id6.setBounds(50,290,200,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        f.add(id6);
        
        b1=new JButton("Join");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(300,93,100,30);
        f.add(b1);
        
        b2=new JButton("Join");   
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,143,100,30);
        f.add(b2);
        
        b3=new JButton("Join");   
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300,193,100,30);
        f.add(b3);
        
        b4=new JButton("Join");   
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(300,243,100,30);
        f.add(b4);
        
        b5=new JButton("Join");   
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(300,293,100,30);
        f.add(b5);
    }
    
     public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            this.setVisible(false);
        }
        else if(ae.getSource()==b1 || ae.getSource()==b2 || ae.getSource()==b3 || ae.getSource()==b4 || ae.getSource()==b5 ){
            try{
                String url = "https://meet.google.com/";
                Desktop browser = Desktop.getDesktop();
                browser.browse(new URI(url));
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }
    
    public static void main(String[] args){
        new ClassLinks().f.setVisible(true);
    }
    
}
