package project;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



   class seo extends JFrame {
      seo() {
         JPanel panel1 =new JPanel();
         JPanel panel2 =new JPanel();
         JPanel panel =new JPanel();
         setTitle("�����̿��뤾�� ");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new GridLayout(1,2));
         JLabel f1= new JLabel ("                         In ������ ����        "
               + ""
               + ""
               + "                    ");
      
      
         ImageIcon pressedIcon = new ImageIcon("D:\\eclipse-workspace\\project\\ȭ��ǥ.jpg   ");
         
         JButton btn=new JButton();
         btn.addActionListener(new ActionListener() {
          
               @Override
               public void actionPerformed(ActionEvent e) {
                  dispose(); // Ŭ���� pnlY ������ �ҷ�����(Ȩȭ�� �θ���)
               }
               
           });
         
         JLabel f2= new JLabel ("         ������,,,����\n");
         JLabel f3= new JLabel ("          �ٸ� �������� �ȳ��ҰԿ䢾");
        
         btn.setIcon(pressedIcon); 
         btn.setLocation(100,200);
          panel1.add(f1);
          panel2.add(btn);
          
          panel.add(panel1);
          panel.add(panel2);
          panel2.add(f2);   
          panel2.add(f3);   
         
         add(panel);
         
         setLocation(500,300);
         setSize(650,550);
         setVisible(true);
      }
      
      
      public static void main(String [] args) {
         seo b=new seo();
      }
   }
   class pnlY extends JFrame{
      public pnlY() {
         setSize(700,400);
         setLocation(500,300);
         setTitle("Ȩȭ��");
         setVisible(true);
         
      }
   }
