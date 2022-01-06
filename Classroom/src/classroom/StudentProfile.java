
package classroom;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class StudentProfile extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6; 
    public String uid;
    
    
    
    StudentProfile(String stduid){
        
        super("University Virtual Classroom: Student");
        uid = stduid;
        
        setSize(1920,1030);
        setBackground(Color.white);
        
        b1 = new JButton();
        
        ImageIcon bicon1 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon15.png"));
        Image bimage1 = bicon1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(bimage1));
        b1.setBounds(200,100,200,200);
        b1.setBorder(new Project.RoundedBorder(30));
        add(b1);
        
        b2 = new JButton();
        
        ImageIcon bicon2 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon7.png"));
        Image bimage2 = bicon2.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(bimage2));
        b2.setBounds(600,100,200,200);
        b2.setBorder(new Project.RoundedBorder(30));
        add(b2);
        
        b3 = new JButton();
        
        ImageIcon bicon3 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon13.jpg"));
        Image bimage3 = bicon3.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b3.setIcon(new ImageIcon(bimage3));
        b3.setBounds(1000,100,200,200);
        b3.setBorder(new Project.RoundedBorder(30));
        add(b3);
        
        b4 = new JButton();
        
        ImageIcon bicon4 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon16.png"));
        Image bimage4 = bicon4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b4.setIcon(new ImageIcon(bimage4));
        b4.setBounds(200,400,200,200);
        b4.setBorder(new Project.RoundedBorder(30));
        
        add(b4);
        
        b5 = new JButton();
        
        ImageIcon bicon5 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon8.png"));
        Image bimage5 = bicon5.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b5.setIcon(new ImageIcon(bimage5));
        b5.setBounds(600,400,200,200);
        b5.setBorder(new Project.RoundedBorder(30));
        
        add(b5);
        
        b6 = new JButton();
        
        ImageIcon bicon6 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon12.png"));
        Image bimage6 = bicon6.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b6.setIcon(new ImageIcon(bimage6));
        b6.setBounds(1000,400,200,200);
        b6.setBorder(new Project.RoundedBorder(30));
        
        add(b6);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        
        JLabel id = new JLabel("UID No.: "+stduid);
        id.setBounds(100,50,1000,30);
        id.setFont(new Font("serif",Font.BOLD,25));
        add(id);
        
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("classroom/icons/fifth.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        add(l1);
        
        
        
        JMenuBar mb  = new JMenuBar();
        
        JMenu attendance_detail = new JMenu("Attendance Detail");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        attendance_detail.setForeground(Color.BLACK);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);
        attendance_detail.add(b1);
        
        b1.addActionListener(this);
        
        JMenu exam = new JMenu("Examination");
        JMenuItem c1 = new JMenuItem("Examination Details");
        
        exam.setForeground(Color.BLACK);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon30 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon16.png"));
        Image image31 = icon30.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        c1.setIcon(new ImageIcon(image31));
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
        
        c1.addActionListener(this);
        
        
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        report.setForeground(Color.BLACK);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLACK);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
        
        s2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon16 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon8.png"));
        Image image17 = icon16.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s2.setIcon(new ImageIcon(image17));
        s2.setMnemonic('H');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s2.setBackground(Color.WHITE);
        
        s2.addActionListener(this);
        
        JMenu classMaterials = new JMenu("Class Materials");
        JMenuItem cm1 = new JMenuItem("Class Material");
        JMenuItem cm2 = new JMenuItem("Class Links");
        classMaterials.setForeground(Color.BLACK);
        
        cm1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon15 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon15.png"));
        Image image16 = icon16.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        cm1.setIcon(new ImageIcon(image16));
        cm1.setMnemonic('O');
        cm1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        cm1.setBackground(Color.WHITE);
        attendance_detail.add(cm1);
        
        cm2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon34 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon11.png"));
        Image image35 = icon34.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        cm2.setIcon(new ImageIcon(image35));
        cm2.setMnemonic('E');
        cm2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
        cm2.setBackground(Color.WHITE);
        exam.add(cm2);
        
        cm1.addActionListener(this);
        cm2.addActionListener(this);

        JMenu utility = new JMenu("Utility");
        JMenuItem ut1 = new JMenuItem("Notepad");
        JMenuItem ut2 = new JMenuItem("Calculator");
        JMenuItem ut3 = new JMenuItem("Web Browser");
        utility.setForeground(Color.BLACK); 
        

        ut1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon18 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon9.png"));
        Image image19 = icon18.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut1.setIcon(new ImageIcon(image19));
        ut1.setMnemonic('I');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        

        ut2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon20 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon10.png"));
        Image image21 = icon20.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut2.setIcon(new ImageIcon(image21));
        ut2.setMnemonic('J');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        

        ut3.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon11.png"));
        Image image10 = icon10.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ut3.setIcon(new ImageIcon(image10));
        ut3.setMnemonic('K');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);
 
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        

        JMenu exit = new JMenu("Exit");
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.BLACK);
        

        ex.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon12.png"));
        Image image11 = icon11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ex.setIcon(new ImageIcon(image11));
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        ex.addActionListener(this);
        
        
        report.add(r1);
        
        fee.add(s1);
        fee.add(s2);
        
        classMaterials.add(cm1);
        classMaterials.add(cm2);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        exit.add(ex);
        
        mb.add(attendance_detail);
        mb.add(exam);
        mb.add(report);
        mb.add(fee);
        mb.add(utility);
        mb.add(classMaterials);
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
        setVisible(false);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new s_StudentAttendanceDetail(uid).setVisible(true);
        }
        else if(ae.getSource()==b2){
            new StudentFeeForm(uid).setVisible(true);
        }
        else if(ae.getSource()==b3){
            new Student_UpdateStudent(uid).f.setVisible(true);
        }
        else if(ae.getSource()==b4){
            new s_ExaminationDetails(uid).setVisible(true);
        }
        else if(ae.getSource()==b5){
            new ClassLinks().f.setVisible(true);
        }
        else if(ae.getSource()==b6){
            System.exit(0);
        }
        
        String msg = ae.getActionCommand();
        if(msg.equals("Update Students")){
            new Student_UpdateStudent(uid).f.setVisible(true);
           
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure().setVisible(true);
           
        }
        else if(msg.equals("Student Fee Form")){
            new StudentFeeForm(uid).setVisible(true);
           
        }
        else if(msg.equals("Class Material")){
            new ClassMaterials().setVisible(true);
        }
        else if(msg.equals("Class Links")){
            new ClassLinks().f.setVisible(true);
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){ }
        }else if(msg.equals("Web Browser")){
            
            try{
                Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            }catch(Exception e){ }
            
        }else if(msg.equals("Exit")){
            System.exit(0);
        }else if(msg.equals("Student Attendance Detail")){
            new s_StudentAttendanceDetail(uid).setVisible(true);
        }else if(msg.equals("Examination Details")){
            new s_ExaminationDetails(uid).setVisible(true);
        }
        
    }
    
    
    public static void main(String[] args){
        new StudentProfile("123").setVisible(true);
    }
    
}
