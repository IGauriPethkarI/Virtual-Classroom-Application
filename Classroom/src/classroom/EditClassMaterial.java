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
import java.sql.*;
import java.util.*;


public class EditClassMaterial extends JFrame implements ActionListener{
    
    JPanel contentPane;
    JLabel id,id1,id2,id3,id4;
    JTextField t,t1,t2,t3,t4;
    JButton b,b1,b2;
    Choice c;
    
    
    EditClassMaterial(){
        super("Class Materials");
        setBounds(700, 200, 400, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        c = new Choice();
        c.setForeground(new Color(47, 79, 79));
	c.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        try{
            conn c1 = new conn();
            ResultSet rs = c1.s.executeQuery("select * from class_material");
            while(rs.next()){
                c.add(rs.getString("title"));    
            }
        }catch(Exception e){ }
        
        c.setBounds(174, 100, 156, 20);
	contentPane.add(c);
        
        JLabel l1 = new JLabel("Select File");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setBounds(50, 100, 102, 22);
	contentPane.add(l1);
        
        b2 = new JButton("Delete");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(110,140,150,40);
        contentPane.add(b2);
        
        id1 = new JLabel("Edit Materials");
        id1.setBounds(50,20,200,40);
	id1.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
        contentPane.add(id1);
        
        b1=new JButton("Back");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(260,20,70,40);
        contentPane.add(b1);
        
        id2 = new JLabel("Add Title");
        id2.setFont(new Font("Tahoma", Font.BOLD, 14));
        id2.setBounds(50,200,100,30);
        contentPane.add(id2);
        
        id3 = new JLabel("Add Url");
        id3.setBounds(50,250,100,30);
        id3.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(id3);
        
        t1=new JTextField();
        t1.setBounds(150,200,200,30);
        contentPane.add(t1);

        t2=new JTextField();
        t2.setBounds(150,250,200,30);
        contentPane.add(t2);
        
        b = new JButton("Upload");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(100,300,150,40);
        
        contentPane.add(b);
        
        
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
        }
        else if(ae.getSource()==b){
            try{
                conn c1 = new conn();
                String u = t1.getText();
                String v = t2.getText();
                
                String r = "insert into class_material(title,url) values('"+u+"','"+v+"')";
                c1.s.executeUpdate(r);
                
                JOptionPane.showMessageDialog(null,"Class Material Inserted Successfully");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==b2){
            try{
                conn c1 = new conn();
                String z = c.getSelectedItem();
                
                String q = "delete from class_material where title = '"+z+"'";
                c1.s.executeUpdate(q);
                
                JOptionPane.showMessageDialog(null,"Class Material Deleted Successfully");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }   
        
    }

    public static void main(String[] args){
        new EditClassMaterial().setVisible(true);
       
    }
}
