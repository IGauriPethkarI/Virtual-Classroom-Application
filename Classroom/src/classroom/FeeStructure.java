/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16,bb17,bb18;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        setSize(1280,530);
        setLocation(100,100);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.BOLD,56));
        i1.setBounds(500,10,400,70);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(80,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,26));
        add(l1);
        
        l2 = new JLabel("CS");
        l2.setBounds(280,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,26));
        add(l2);
        
        l3 = new JLabel("IT");
        l3.setBounds(480,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,26));
        add(l3);
        
        l4 = new JLabel("EXTC");
        l4.setBounds(680,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,26));
        add(l4);
        
        l5 = new JLabel("ETRX");
        l5.setBounds(880,100,100,40);
        l5.setFont(new Font("serif",Font.BOLD,26));
        add(l5);
        
        l6 = new JLabel("MCA");
        l6.setBounds(1080,100,100,40);
        l6.setFont(new Font("serif",Font.BOLD,26));
        add(l6);
        
        l10 = new JLabel("Year 1");
        l10.setBounds(80,170,150,40);
        l10.setFont(new Font("serif",Font.BOLD,26));
        add(l10);
        
        l11 = new JLabel("Year 2");
        l11.setBounds(80,240,150,40);
        l11.setFont(new Font("serif",Font.BOLD,26));
        add(l11);
        
        l12 = new JLabel("Year 3");
        l12.setBounds(80,310,150,40);
        l12.setFont(new Font("serif",Font.BOLD,26));
        add(l12);
        
        l13 = new JLabel("Year 4");
        l13.setBounds(80,380,150,40);
        l13.setFont(new Font("serif",Font.BOLD,26));
        add(l13);
        
        bb5 = new JLabel("Rs 25000");
        bb5.setBounds(680,170,150,40);
        bb5.setFont(new Font("serif",Font.PLAIN,26));
        add(bb5);
        
        bb6 = new JLabel("Rs 25000");
        bb6.setBounds(680,240,150,40);
        bb6.setFont(new Font("serif",Font.PLAIN,26));
        add(bb6);
        
        bb7 = new JLabel("Rs 25000");
        bb7.setBounds(680,310,150,40);
        bb7.setFont(new Font("serif",Font.PLAIN,26));
        add(bb7);
        
        bb8 = new JLabel("Rs 25000");
        bb8.setBounds(680,380,150,40);
        bb8.setFont(new Font("serif",Font.PLAIN,26));
        add(bb8);
        
        bb9 = new JLabel("Rs 18000");
        bb9.setBounds(880,170,150,40);
        bb9.setFont(new Font("serif",Font.PLAIN,26));
        add(bb9);
        
        bb10 = new JLabel("Rs 18000");
        bb10.setBounds(880,240,150,40);
        bb10.setFont(new Font("serif",Font.PLAIN,26));
        add(bb10);
        
        bb11 = new JLabel("Rs 18000");
        bb11.setBounds(880,310,150,40);
        bb11.setFont(new Font("serif",Font.PLAIN,26));
        add(bb11);
        
        bb12 = new JLabel("Rs 18000");
        bb12.setBounds(880,380,150,40);
        bb12.setFont(new Font("serif",Font.PLAIN,26));
        add(bb12);
        
        
        m1 = new JLabel("Rs 65000");
        m1.setBounds(1080,170,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,26));
        add(m1);
        
        m2 = new JLabel("Rs 65000");
        m2.setBounds(1080,240,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,26));
        add(m2);
        
        m3 = new JLabel("Rs 65000");
        m3.setBounds(1080,310,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,26));
        add(m3);
        
        m4 = new JLabel("Rs 65000");
        m4.setBounds(1080,380,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,26));
        add(m4);
        
        b1 = new JLabel("Rs 43000");
        b1.setBounds(280,170,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,26));
        add(b1);
        
        b2 = new JLabel("Rs 43000");
        b2.setBounds(280,240,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,26));
        add(b2);
        
        b3 = new JLabel("Rs 43000");
        b3.setBounds(280,310,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,26));
        add(b3);
        
        b4 = new JLabel("Rs 43000");
        b4.setBounds(280,380,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,26));
        add(b4);

        bb1 = new JLabel("Rs 32000");
        bb1.setBounds(480,170,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,26));
        add(bb1);
        
        bb2 = new JLabel("Rs 32000");
        bb2.setBounds(480,240,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,26));
        add(bb2);
        
        bb3 = new JLabel("Rs 32000");
        bb3.setBounds(480,310,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,26));
        add(bb3);
        
        bb4 = new JLabel("Rs 32000");
        bb4.setBounds(480,380,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,26));
        add(bb4);
        
       
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}
