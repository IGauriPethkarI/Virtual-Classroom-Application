package classroom;

import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Project extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6; 
    
    
    Project(){
        super("University Virtual Classroom: Admin");
        
        setSize(1920,1030);
        
        
        b1 = new JButton();
        
        ImageIcon bicon1 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/addTeacher.jpg"));
        Image bimage1 = bicon1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(bimage1));
        b1.setBounds(200,100,200,200);
        b1.setBorder(new RoundedBorder(30));
        add(b1);
        
        b2 = new JButton();
        
        ImageIcon bicon2 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/addStudent.jpg"));
        Image bimage2 = bicon2.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(bimage2));
        b2.setBounds(600,100,200,200);
        b2.setBorder(new RoundedBorder(30));
        add(b2);
        
        b3 = new JButton();
        
        ImageIcon bicon3 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon13.jpg"));
        Image bimage3 = bicon3.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b3.setIcon(new ImageIcon(bimage3));
        b3.setBounds(1000,100,200,200);
        b3.setBorder(new RoundedBorder(30));
        add(b3);
        
        b4 = new JButton();
        
        ImageIcon bicon4 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon16.png"));
        Image bimage4 = bicon4.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b4.setIcon(new ImageIcon(bimage4));
        b4.setBounds(200,400,200,200);
        b4.setBorder(new RoundedBorder(30));
        
        add(b4);
        
        b5 = new JButton();
        
        ImageIcon bicon5 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon9.png"));
        Image bimage5 = bicon5.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b5.setIcon(new ImageIcon(bimage5));
        b5.setBounds(600,400,200,200);
        b5.setBorder(new RoundedBorder(30));
        
        add(b5);
        
        b6 = new JButton();
        
        ImageIcon bicon6 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon12.png"));
        Image bimage6 = bicon6.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        b6.setIcon(new ImageIcon(bimage6));
        b6.setBounds(1000,400,200,200);
        b6.setBorder(new RoundedBorder(30));
        
        add(b6);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("classroom/icons/first.jpg"));
        Image i3 = ic.getImage().getScaledInstance(1900, 950,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
        JMenuBar mb  = new JMenuBar();
        
        JMenu master = new JMenu("Master");
        JMenuItem m1 = new JMenuItem("New Faculty");
        JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLACK);
        
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        m1.setIcon(new ImageIcon(image1));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        m2.setIcon(new ImageIcon(image2));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
    
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        

  
        JMenu user = new JMenu("Details");
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.BLACK);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon3.png"));
        Image image4 = icon4.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u1.setIcon(new ImageIcon(image4));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon4.jpg"));
        Image image5 = icon5.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        u2.setIcon(new ImageIcon(image5));
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        JMenu attendance = new JMenu("Attendance");
        
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.BLACK);
        
        a2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon25 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon15.png"));
        Image image26 = icon25.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        a2.setIcon(new ImageIcon(image26));
        a2.setMnemonic('N');
        a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);

        a2.addActionListener(this);
        
        
        
        JMenu attendance_detail = new JMenu("Attendance Detail");
        JMenuItem b1 = new JMenuItem("Student Attendance Detail");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Detail");
        attendance_detail.setForeground(Color.BLACK);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon27 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon15.png"));
        Image image28 = icon27.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b1.setIcon(new ImageIcon(image28));
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);
        attendance_detail.add(b1);
        
        b2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon29 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon14.jpg"));
        Image image30 = icon29.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        b2.setIcon(new ImageIcon(image30));
        b2.setMnemonic('P');
        b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        b2.setBackground(Color.WHITE);
        attendance_detail.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
      
        JMenu report = new JMenu("Update Details");
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.BLACK);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon5.png"));
        Image image7 = icon7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r1.setIcon(new ImageIcon(image7));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        
        r1.addActionListener(this);
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon iconn = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon6.png"));
        Image imagee = iconn.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        r2.setIcon(new ImageIcon(imagee));
        r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        r2.setBackground(Color.WHITE);
        
        r2.addActionListener(this);
        
        JMenu fee = new JMenu("Fee Details");
        JMenuItem s1 = new JMenuItem("Fee Structure");
        fee.setForeground(Color.BLACK);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        ImageIcon icon14 = new ImageIcon(ClassLoader.getSystemResource("classroom/icons/icon7.png"));
        Image image15 = icon14.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT);
        s1.setIcon(new ImageIcon(image15));
        s1.setMnemonic('G');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        s1.setBackground(Color.WHITE);
        
        s1.addActionListener(this);
       

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
        
        

        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
        report.add(r2);
        
        fee.add(s1);
      
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
        
        exit.add(ex);
         
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_detail);
    
        mb.add(report);
        mb.add(fee);
        mb.add(utility);
        
        mb.add(exit);
        
        setJMenuBar(mb);    
        
        setFont(new Font("Senserif",Font.BOLD,16));
         
    }
    
    public static class RoundedBorder implements Border {

        public int radius;


        RoundedBorder(int radius) {
            this.radius = radius;
        }


        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }


        public boolean isBorderOpaque() {
            return true;
        }


        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1){
            new AddTeacher().f.setVisible(true);
        }
        else if(ae.getSource()==b2){
            new AddStudent().f.setVisible(true);
        }
        else if(ae.getSource()==b3){
            new TeacherDetails().setVisible(true);
            new StudentDetails().setVisible(true);
        }
        else if(ae.getSource()==b4){
            new UpdateTeacher().f.setVisible(true);
        }
        else if(ae.getSource()==b5){
            new UpdateStudent().f.setVisible(true);
        }
        else if(ae.getSource()==b6){
            System.exit(0);
        }
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            new AddStudent().f.setVisible(true);
            
        }else if(msg.equals("New Faculty")){
            new AddTeacher().f.setVisible(true);
            
        }else if(msg.equals("Student Details")){
            new StudentDetails().setVisible(true);
            
        }else if(msg.equals("Teacher Details")){
            new TeacherDetails().setVisible(true);
           
        }
        else if(msg.equals("Update Students")){
            new UpdateStudent().f.setVisible(true);
           
        }
        else if(msg.equals("Update Teachers")){
            new UpdateTeacher().f.setVisible(true);
           
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure().setVisible(true);
           
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
        }else if(msg.equals("Student Attendance")){
            new StudentAttendance().setVisible(true);
        }else if(msg.equals("Teacher Attendance")){
            new TeacherAttendance().setVisible(true);
        }else if(msg.equals("Student Attendance Detail")){
            new StudentAttendanceDetail().setVisible(true);
        }else if(msg.equals("Teacher Attendance Detail")){
            new TeacherAttendanceDetail().setVisible(true);
        }else if(msg.equals("Examination Details")){
            new ExaminationDetails().setVisible(true);
        }else if(msg.equals("Enter Marks")){
            new EnterMarks().setVisible(true);
        }
        
    }
    
    
    public static void main(String[] args){
        new Project().setVisible(true);
    }
    
}
