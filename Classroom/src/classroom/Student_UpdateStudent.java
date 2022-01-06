
package classroom;

import java.awt.*;
import java.io.File;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Student_UpdateStudent implements ActionListener {
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1,lab2,lab3,img;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    JButton b,b1,b2,b3; 
    String id_emp;
    byte[] photo = null;
    String imgPath = null;
    
    Student_UpdateStudent(String uid){
        f=new JFrame("Update Student details");
        f.setSize(900,670);
        f.setLocation(450,150);
        f.setBackground(Color.white);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter your roll number");
        l1.setBounds(300,98,200,30);
        l1.setFont(new Font("serif",Font.ITALIC,20));
        f.add(l1);
        
        t12 = new JTextField();
        t12.setEditable(false);
        t12.setBounds(500,100,200,30);
        t12.setText(uid);
        f.add(t12);
        
        b2 = new JButton("Run");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720,100,100,30);
        f.add(b2);
        b2.addActionListener(this);

        id8 = new JLabel("Update Student Details:");
        id8.setBounds(50,10,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,40));
        id8.setForeground(Color.black);
        f.add(id8);


        id1 = new JLabel("Name");
        id1.setBounds(50,170,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        f.add(id1);

        t1 = new JTextField();
        t1.setEditable(false);
        t1.setBounds(200,170,150,30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,370,150,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        f.add(id2);

        t2=new JTextField();
        t2.setEditable(false);
        t2.setBounds(600,370,150,30);
        f.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        f.add(id3);

        t3=new JTextField();
        t3.setBounds(200,220,150,30);
        f.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,420,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        f.add(id4);

        t4=new JTextField();
        t4.setEditable(false);
        t4.setBounds(600,420,150,30);
        f.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,270,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        f.add(id5);

        t5=new JTextField();
        t5.setBounds(200,270,150,30);
        f.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,470,150,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        f.add(id6);

        t6=new JTextField();
        t6.setBounds(600,470,150,30);
        f.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,320,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        f.add(id7);

        t7=new JTextField();
        t7.setBounds(200,320,150,30);
        f.add(t7);

        id12= new JLabel("Roll No");
        id12.setBounds(50,420,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        f.add(id12);

        t11=new JTextField();   
        t11.setEditable(false);
        t11.setBounds(200,420,150,30);
        f.add(t11);

        lab=new JLabel("Course");
        lab.setBounds(50,370,130,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        f.add(lab);
            
        t13=new JTextField();   
        t13.setEditable(false);
        t13.setBounds(200,370,150,30);
        f.add(t13);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(50,470,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        f.add(lab2);
            
        t14=new JTextField();   
        t14.setEditable(false);
        t14.setBounds(200,470,150,30);
        f.add(t14);
        
        lab3=new JLabel("Password");
        lab3.setBounds(50,520,200,30);
	lab3.setFont(new Font("serif",Font.BOLD,20));
        f.add(lab3);
            
        t16=new JTextField();   
        t16.setBounds(200,520,150,30);
        f.add(t16);
        
        img = new JLabel();   
        img.setBounds(520,170,140,140);
        img.setOpaque(true);
        img.setBackground(Color.white);
        img.setMinimumSize(new Dimension(140, 140));
        img.setMaximumSize(new Dimension(140, 140));
        f.add(img);
        
        t15 = new JTextField("Upload Photo");
        t15.setBounds(470,320,120,30);
        f.add(t15);
        
        b3 = new JButton("Upload");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(600,320,100,30);
        f.add(b3);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,570,150,40);
        
        f.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,570,150,40);
        
        f.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        b3.addActionListener(this);
        
        f.setVisible(true);
    }

    public ImageIcon ResizeImg(String ImagePath, byte[] pic){
        ImageIcon myImg = null;
        if(ImagePath != null){
            myImg = new ImageIcon(ImagePath);
        }
        else{
            myImg = new ImageIcon(pic);
        }
        
        Image img = myImg.getImage();
        Image newImg = img.getScaledInstance(140,140,Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b){
            try{
                conn con = new conn();
                String str = "update student set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',age='"+t3.getText()+"', dob='"+t4.getText()+"',address='"+t5.getText()+"',phone='"+t6.getText()+"',email='"+t7.getText()+"',class_x='"+t8.getText()+"',class_xii='"+t9.getText()+"',aadhar='"+t10.getText()+"',course='"+t13.getText()+"',branch='"+t14.getText()+"' where rollno='"+t12.getText()+"'";
                con.s.executeUpdate(str);
                String q = "update multilogin set password='"+t16.getText()+"' where username='"+t12.getText()+"'";
                con.s.executeUpdate(q);
                
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new StudentDetails();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
        }
        if(ae.getSource() == b2){
            InputStream input;
            FileOutputStream output;
            try{
                conn con = new conn();
                String str = "select * from student where rollno = '"+t12.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);
                
                if(rs.next()){
                    f.setVisible(true);
             

                    t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));
                    t11.setText(rs.getString(11));
                    t13.setText(rs.getString(12));
                    t14.setText(rs.getString(13));
                    
                }
                
                String q= "select password from multilogin where username = '"+t12.getText()+"'";
                rs = con.s.executeQuery(q);
                
                if(rs.next()){
                    f.setVisible(true);
                    t16.setText(rs.getString(1));
                }
                
                String s = "select * from user_photo where id = '"+t12.getText()+"'";
                rs = con.s.executeQuery(s);
                
                File tfile = new File("second.png");
                output = new FileOutputStream(tfile);
                
                if(rs.next()){
                    f.setVisible(true);
                    String path1 = rs.getString(2);
                    t15.setText(path1);
                    
                    input = rs.getBinaryStream("photo");
                    byte buffer[] = new byte[1024];
                    while(input.read(buffer)>0){
                        output.write(buffer);
                    }
                    String path = tfile.getAbsolutePath();
                    ImageIcon myimg = new ImageIcon(path);
                    Image img1 = myimg.getImage();
                    Image newimg = img1.getScaledInstance(img.getWidth(),img.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon image = new ImageIcon(newimg);
                    img.setIcon(image);
                }
                

                
            }catch(Exception ex){}
        
            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);
        }
        
        else if(ae.getSource() == b3){
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","jpeg","gif","png");
            chooser.addChoosableFileFilter(filter);
            
            int result = chooser.showSaveDialog(null);
            
            if(result == JFileChooser.APPROVE_OPTION){
                File f = chooser.getSelectedFile();
                String path = f.getAbsolutePath();
                img.setIcon(ResizeImg(path,null));
                imgPath = path;
                t15.setText(path);
            }
            else if(result == JFileChooser.CANCEL_OPTION){
                System.out.println("No File Selected");
            }
            
            try{
                conn con = new conn();
                File image = new File(imgPath);
                FileInputStream fis = new FileInputStream(image);
                String s = "SELECT EXISTS(SELECT * from user_photo WHERE id='"+t12.getText() +"')";
                ResultSet rs = con.s.executeQuery(s);
                if(rs.next()){
                    String g = rs.getString(1);
                    System.out.println(g);
                    System.out.println(g.getClass().getName());
                    String q;
                    
                    if (g == "1"){
                        q = "update user_photo values('"+t12.getText() +"','"+imgPath+"','"+fis+"')";
                        con.s.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Photo Updated");
                    }
                    else{
                        q = "insert into user_photo values('"+t12.getText() +"','"+imgPath+"','"+fis+"')";
                        con.s.executeUpdate(q);
                        JOptionPane.showMessageDialog(null,"Photo Uploaded");
                    }
                }
                
                
                
            }catch(Exception ex){}
        }
    }

    public static void main(String[] arg){
        new Student_UpdateStudent("20003905").f.setVisible(true);
    }
}