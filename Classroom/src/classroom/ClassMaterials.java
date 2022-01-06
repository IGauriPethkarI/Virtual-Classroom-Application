
package classroom;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.net.URI;
import java.sql.*;
import java.util.*;

public class ClassMaterials extends JFrame implements ActionListener{
    
    
    JPanel contentPane;
    JLabel id,id1,id2,id3,id4;
    JTextField t,t1,t2,t3,t4;
    JButton b,b1,b2;
    Choice c;
    int y = 120;
    
    ClassMaterials(){
        super("Class Materials");
        setBounds(700, 200, 400, 450);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
        
        id1 = new JLabel("Class Materials");
        id1.setBounds(50,20,200,40);
	id1.setFont(new Font("Trebuchet MS", Font.ITALIC, 20));
        contentPane.add(id1);
        
        b1=new JButton("Back");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(260,20,70,40);
        contentPane.add(b1);
        
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
        
        c.setBounds(100, 85, 150, 30);
	contentPane.add(c);
        
        b2 = new JButton("Search");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	b2.setFont(new Font("Tahoma", Font.BOLD, 14));
	b2.setBounds(260, 80, 100, 30);
	contentPane.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        
    }
    public void displayField(String title,String url){
        
        
        id3 = new JLabel();
        
        id3.setBounds(25,135,200,40);
        id3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        contentPane.add(id3);
        
        b = new JButton("Click to Open");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
	b.setFont(new Font("Tahoma", Font.BOLD, 14));
	b.setBounds(200, 180, 150, 30);
	contentPane.add(b);
        
        b.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            this.setVisible(false);
        }
        else if(ae.getSource()==b2){
            try{
                conn c1 = new conn();
                String z = c.getSelectedItem();
                
                String q = "select * from class_material where title = '"+z+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    String title = rs.getString(2);
                    String url = rs.getString(3);
                    displayField(title,url);
                    id3.setText(title);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==b){
            try{
                conn c1 = new conn();
                String z = c.getSelectedItem();
                String q = "select * from class_material where title = '"+z+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    
                    String url = rs.getString(3);
                    Desktop browser = Desktop.getDesktop();
                    browser.browse(new URI(url));
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }

    public static void main(String[] args){
        new ClassMaterials().setVisible(true);
       
    }
}