package project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class da2 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
	  private JButton jhome;
	  public da2() {
  	 JPanel panel = new JPanel();
       JPanel panelA = new JPanel();
       JPanel panelB = new JPanel();
       JPanel panelC = new JPanel();
       panel.setLayout(new BorderLayout());
       panelC.setLayout(new GridLayout(2,1,10,10));
       panelB.setLayout(new GridLayout(2,2,10,10));
       
       JLabel label = new JLabel("�Ƹ޸�ĭ"); //���� ��
       jhome = new JButton("�ڷΰ���");  //Ȩ��ư
           

       
       JButton jjim = new JButton("�ٳ��� �������� ���"); //���ư
       jjim.addActionListener(e->
       {
          jjim.setText("���̹� ���ϼ̽��ϴ� ��");
       }); 
       jjim.addActionListener(new ActionListener() {
           // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
           @Override
           public void actionPerformed(ActionEvent e){
             BufferedWriter bw = null;
         try {
            bw = new BufferedWriter(new FileWriter("list.txt",true));
         } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
              PrintWriter pw = new PrintWriter(bw,true);
              pw.write("�Ƹ޸�ĭ ");
              pw.flush();
              pw.close();
           }      
       });
      
       
       JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
       JButton button2 = new JButton("");
       JButton button3 = new JButton("");
       ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\da21.png");
       ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\da22.png");
       ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\da23.png");
       button1.setIcon(icon);
       button2.setIcon(icon1);
       button3.setIcon(icon2);
       JLabel label1 = new JLabel("�� 053-882-4910  ");
       JLabel label2 = new JLabel("�� �޴� :�ػ깰 ũ�� 6500 �丶�� �ػ깰 6500");
      
       
       panelA.add(label);
       panelA.add(jhome);
       jhome.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              dispose(); 
           }
           
       });
       panelA.add(jjim);
       panelB.add(button1);
       panelB.add(button2);
       panelB.add(button3);
       panelC.add(label1);
       panelC.add(label2);
       panelB.add(panelC);
       panel.add(panelA,BorderLayout.NORTH);
       panel.add(panelB,BorderLayout.CENTER);
       add(panel);
       setVisible(true);
       setSize(650,550);
       setLocation(500,300);
    }
      
   }