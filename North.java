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

class ba1 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public ba1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("1992 steak&pub"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("1992 steak&pub");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\ba11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\ba12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\ba13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-5569");
      JLabel label2 = new JLabel("�� �޴� : �ƶ� ġ�� 8,500��, ���� ũ�� �Ľ�Ÿ 8,500�� ");
     
      
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


class ba2 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public ba2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("����"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("����");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\ba21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\ba22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\ba23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-954-1206");
      JLabel label2 = new JLabel("�� �޴� : ������� 8,900��, �߰����� ������ũ 9,900�� ");
     
      
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


class ba3 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public ba3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("META PIZZA"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("META PIZZA");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\ba31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\ba32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\ba33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-6767");
      JLabel label2 = new JLabel("�� �޴� : ��Ʈ �𷰽� 19,000��, ���������� 18,500�� ");
     
      
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

class bk1 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bk1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("�뵶��"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("�뵶��");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bk11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bk12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bk13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-5569");
      JLabel label2 = new JLabel("�� �޴� : ��ġ� 6,500��, ���� �Ұ�� (��) 10,000��, (��)15,000��");
     
      
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


class bk2 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bk2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("�ѳ�����"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("�ѳ�����");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bk21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bk22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bk23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-954-1206");
      JLabel label2 = new JLabel("�� �޴� : �ſ� ������ 8,000��, ������ ������ 9,000�� ");
     
      
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


class bk3 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bk3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("�Ҵ���"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("�Ҵ���");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bk31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bk32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bk33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-6767");
      JLabel label2 = new JLabel("�� �޴� : �������� (2~3��) 18,000��, (3~4��) 28,000�� ");
     
      
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

class bj1 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bj1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("������"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("������");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bj12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bj13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-5569");
      JLabel label2 = new JLabel("�� <������ 7000��>,<��������� 7500��>");
     
      
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


class bj2 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bj2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("���������� ��� ��"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("���������� ��� ��");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bj22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bj23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-954-1206");
      JLabel label2 = new JLabel("�� <������ 4900��>,<ġŲ ī���� 5800��>");
     
      
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


class bj3 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bj3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("����"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("����");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bj32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bj33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-6767");
      JLabel label2 = new JLabel("�� <���� ��� 10000��> ");
     
      
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

class bc1 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bc1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("��Ž��"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("��Ž��");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bc11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bc12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bc13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-5569");
      JLabel label2 = new JLabel("�� <���� «��(��ǰ) 5500��>,<ġ�� ��� ����(��ǰ) 9500��>");
     
      
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


class bc2 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bc2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("ȫ�����"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("ȫ�����");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bc21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bc22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bc23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-954-1206");
      JLabel label2 = new JLabel("�� <������ : 11000��>,<¥��� : 4000��>");
     
      
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


class bc3 extends JFrame{ //5�� ��� �׳� ���÷� ���� �� ���⿡ ���߿� �߰��ϱ�
    
    
    
    public bc3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("�߳��ѳ���"); //���� ��
      JButton jhome = new JButton("�ڷΰ���");  //Ȩ��ư
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
        	  BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter("list.txt",true));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	   PrintWriter pw = new PrintWriter(bw,true);
        	   pw.write("�߳��ѳ���");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //���� 3�� �� ��ȭ��ȣ, �޴�
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bc31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bc32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bc33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("�� 053-939-6767");
      JLabel label2 = new JLabel("�� <ö�� �߳� 11000��>,<������ : 3000��> ");
     
      
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