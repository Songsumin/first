package project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class zzokjapan2 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
	  private JButton jhome;
	  public zzokjapan2() {
  	 JPanel panel = new JPanel();
       JPanel panelA = new JPanel();
       JPanel panelB = new JPanel();
       JPanel panelC = new JPanel();
       panel.setLayout(new BorderLayout());
       panelC.setLayout(new GridLayout(2,1,10,10));
       panelB.setLayout(new GridLayout(2,2,10,10));
       
       JLabel label = new JLabel("���Ĵ�"); //���� ��
       jhome = new JButton("�ڷΰ���");  //Ȩ��ư
       jhome.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
              dispose(); 
           }
           
       });
           

       
       JButton jjim = new JButton("�ٳ��� �������� ���"); //���ư
       jjim.addActionListener(e->
       {
          jjim.setText("���̹� ���ϼ̽��ϴ� ��");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // ������� ��ư "�� â ����"�� ��ư�� �������� �߻��ϴ� �ൿ�� ����
           @Override
           public void actionPerformed(ActionEvent e){
               File f = new File("list.txt"); 
                  try( PrintWriter output = new PrintWriter( f ); ) {
                     output.print("�ʹ� ���Ĵ�") ;
                } catch (IOException e1) {
                     e1.printStackTrace();
                }
              }
           
       });
      
       
       JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
       JButton button2 = new JButton("");
       JButton button3 = new JButton("");
       ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj31.png");
       ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\zj22.png");
       ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\zj21.png");
       button1.setIcon(icon);
       button2.setIcon(icon1);
       button3.setIcon(icon2);
       JLabel label1 = new JLabel("�� 053-951-0860");
       JLabel label2 = new JLabel("�� �޴� : �ʹ�A��Ʈ 11000 ���� ���� �ʹ� 13000 ");
      
       
       panelA.add(label);
       panelA.add(jhome);
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
