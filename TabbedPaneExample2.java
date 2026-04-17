//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan

package Lab5;

import java.awt.Color;

import javax.swing.*;  
    public class TabbedPaneExample2 {  
    JFrame f;  
    TabbedPaneExample2(){  
        f=new JFrame();  
        
        JPanel p1=new JPanel();  
        JPanel p2=new JPanel();  
        JPanel p3=new JPanel();
        p1.setBackground(Color.cyan);
        p2.setBackground(Color.magenta);
        p3.setBackground(Color.yellow);
        JTabbedPane tp=new JTabbedPane();  
        tp.setBounds(50,50,200,200);  
        tp.add("cyan",p1);  
        tp.add("magenta",p2);  
        tp.add("yellow",p3);    
        f.add(tp);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
    public static void main(String[] args) {  
        new TabbedPaneExample2();  
    }} 

