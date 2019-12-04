package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class JPanel01 extends JPanel{
	   
	   private JButton button1;
	   private hw win;
	   private JLabel label1;
	   private JLabel label2;
	   private JLabel mem1;
	   private JLabel mem2;
	   
	   public JPanel01(hw win) {
	      
	         this.setLayout(null);
	          this.win = win;
	          this.setSize(700,400);
	          
	          button1 = new JButton("START");
	          button1.setBounds(315, 285, 75,45);
	          this.add(button1);

	          label1 = new JLabel("���� �� ����?");
	          label1.setFont(new Font("Serif", Font.BOLD, 40));
	          label1.setBounds(230,50, 700, 60);
	          add(label1);
	          
	          label2 = new JLabel("���� : ");
	          label2.setFont(new Font("Serif", Font.BOLD, 20));
	          label2.setBounds(500, 210, 200, 100);
	          add(label2);
	          
	          mem1 = new JLabel("������, �輱��");
	          mem1.setFont(new Font("Serif", Font.BOLD, 20));
	          mem1.setBounds(500, 240, 300, 100);
	          add(mem1);
	          mem2 = new JLabel("������, �ۼ���");
	          mem2.setFont(new Font("Serif", Font.BOLD, 20));
	          mem2.setBounds(500, 270, 300, 100);
	          add(mem2);
	      
	          button1.addActionListener(new MyActionListener());
	   }
	class MyActionListener implements ActionListener { //2�� ȭ�� ���
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        win.changeHome();
	    }
	 }
	}
    
class JPanel02 extends JPanel{
	
	private hw win;
	private JButton home;
	private JButton north;
	private JButton south;
	private JButton east;
	private JButton west;
	private JButton zzim;
	
	private JLabel label1; 
	
	public JPanel02(hw win) {

		this.setBackground(Color.white);
		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);
		
		label1 = new JLabel();
		label1.setBounds(140, 40, 490, 285);
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\map.jpg");
		label1.setIcon(icon);
		this.add(label1);
		home = new JButton("HOME");
		home.setBounds(585, 10, 70, 30);
		this.add(home);
		
		north = new JButton("�Ϲ�");
		north.setBounds(300, 10, 60, 30);
		this.add(north);
		north.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change2_3("North");
			}
		});
		
		south = new JButton("����/�ʹ�");
		south.setBounds(285, 320, 90, 30);
		this.add(south);
		south.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change2_3("South");
			}
		});
		east = new JButton("����");
		east.setBounds(520, 170, 60, 30);
		this.add(east);
		east.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change2_3("East");
			}
		});
		
		west = new JButton("����");
		west.setBounds(55, 170, 60, 30);
		this.add(west);
		west.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new seo();
			}
		});
		
		zzim = new JButton("����");
		zzim.setBounds(585, 320, 80, 30);
		this.add(zzim);
		zzim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeSpecial();
			}
		});
}
}
	
class JPanel03 extends JPanel{

	private hw win;
	private JButton usa;
	private JButton korea;
	private JButton japan;
	private JButton china;
	private JButton back;

	private JLabel labelusa; 
	private JLabel labelkorea; 
	private JLabel labeljapan; 
	private JLabel labelchina;
	
	//0 = North , 1 = South, 2 = East, 3 = West
	public int WhichDoor;
	
	public JPanel03(hw win) {

		
		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelusa = new JLabel("�� ��");
		labelusa.setBounds(190, 170, 80, 40);
		this.add(labelusa);
		labelkorea = new JLabel("�� ��");
		labelkorea.setBounds(410, 170, 80, 40);
		this.add(labelkorea);
		labeljapan = new JLabel("�� ��");
		labeljapan.setBounds(200, 320, 80, 40);
		this.add(labeljapan);
		labelchina = new JLabel("�� ��");
		labelchina.setBounds(415, 320, 80, 40);
		this.add(labelchina);
		
		usa = new JButton("���");
		usa.setBounds(120, 50, 180, 130);
		ImageIcon uuu = new ImageIcon("D:\\eclipse-workspace\\project\\usa.jpg");
		usa.setIcon(uuu);
		this.add(usa);
		usa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change3_4("usa", WhichDoor);
			}
		});
		
		korea = new JButton("�ѽ�");
		ImageIcon kkk = new ImageIcon("D:\\eclipse-workspace\\project\\korea.jpg");
		korea.setIcon(kkk);
		korea.setBounds(340, 50, 180, 130);
		this.add(korea);
		korea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change3_4("korea", WhichDoor);
			}
		});
		
		japan = new JButton("�Ͻ�");
		japan.setBounds(340, 200, 180, 130);
		ImageIcon jjj = new ImageIcon("D:\\eclipse-workspace\\project\\japan.jpg");
		japan.setIcon(jjj);
		this.add(japan);
		japan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change3_4("japan", WhichDoor);
			}
		});
		
		china = new JButton("�߽�");
		china.setBounds(120, 200, 180, 130);
		ImageIcon ccc = new ImageIcon("D:\\eclipse-workspace\\project\\china.jpg");
		china.setIcon(ccc);
		this.add(china);
		china.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change3_4("china", WhichDoor);
			}
		});
		
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeHome();
			}
		});
	
}
}

class JPanel04 extends JPanel{        // ���г�

    private hw win;
    public JLabel label;
    public JPanel04(hw win) {
        this.win = win;
 
        JButton bt = new JButton("���� ���� ����");
        JButton btn = new JButton("�ڷΰ���");
        label = new JLabel(" ");
        add(btn);
        add(bt);
        add(label);
        btn.addActionListener(new MyActionListener3());
        bt.addActionListener(new MyActionListener4()); 
    }
    
    
    
    class MyActionListener3 implements ActionListener {         
        @Override
        public void actionPerformed(ActionEvent e) {
            win.changeHome();
           }
        }
    
    
    
    class MyActionListener4 implements ActionListener {         
        @Override
        public void actionPerformed(ActionEvent e) {
  
             File f = new File("list.txt"); 
              try(Scanner input = new Scanner( f ); ) {
                  while( input.hasNext() ) {
                      String Name = input.next();
                      label = new JLabel(Name);
                      add(label);
                  }
                  input.close();
                   } catch (IOException e1) {
                  e1.printStackTrace();
                   }
              win.changeSpecial();
           }
        }
    }

class JPanelNusa extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelNusa(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("1992 Steak&Pub");
		labelone.setBounds(80, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("����");
		labeltwo.setBounds(380, 160, 80, 40);
		this.add(labeltwo);
		labelthree = new JLabel("Meta Pizza");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\1992.jpg");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ba1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\bello.jpg");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ba2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\meta.jpg");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ba3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
	
}
}
class JPanelNkorea extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelNkorea(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("�뵶��");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("�ѳ�����");
		labeltwo.setBounds(370, 160, 80, 40);
		this.add(labeltwo);
		labelthree = new JLabel("�Ҵ���");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\ddj.jpg");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bk1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\hankki.jpg");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bk2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\sodam.jpg");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bk3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
	
}
}
class JPanelNjapan extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelNjapan(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("������");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("���������� ��� ��");
		labeltwo.setBounds(330, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("����");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\tenkoku.jpg");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bj1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\2floor.jpg");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bj2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\masa.jpg");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bj3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
}
}

class JPanelNchina extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelNchina(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("��Ž��");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("�߳��ѳ��� �����");
		labeltwo.setBounds(330, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("ȫ�����");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\mtj.jpg");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bc1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\yakki.jpg");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bc2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\hkbj.jpg");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bc3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
}
}
class JPanelEkorea extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelEkorea(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("�ݻ󰥺���");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("����޴� ��������");
		labeltwo.setBounds(330, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("����");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\dk11.png");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dk1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\dk21.png");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dk2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\dk31.png");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dk3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
}
}
class JPanelEusa extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelEusa(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("���̳���ġŲ");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("�Ƹ޸�ĭ");
		labeltwo.setBounds(360, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("�������Ľ�Ÿ");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\da11.png");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new da1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\da21.png");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new da2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\da31.png");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new da3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
}
}
class JPanelEjapan extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelEjapan(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("�߶�");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("���ö�����");
		labeltwo.setBounds(360, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("���ƶ�");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\dj11.png");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dj1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\dj21.png");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dj2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\dj32.png");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dj3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
}
}
class JPanelEchina extends JPanel{

	private hw win;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton back;

	private JLabel labelone; 
	private JLabel labeltwo; 
	private JLabel labelthree;
	
	public JPanelEchina(hw win) {

		this.setLayout(null);
		this.win = win;
		this.setSize(700,400);

		labelone = new JLabel("�溹����");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("��Ȳ��");
		labeltwo.setBounds(370, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("���");
		labelthree.setBounds(260, 325, 80, 40);
		this.add(labelthree);
		
		one = new JButton("");
		one.setBounds(5, 5, 250, 165);
		ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\dc31.png");
		one.setIcon(o);
		this.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dc1();
			}
		});
		
		two = new JButton("");
		ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\dc32.png");
		two.setIcon(tw);
		two.setBounds(270, 5, 250, 165);
		this.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dc2();
			}
		});
		
		three = new JButton("");
		three.setBounds(5, 185, 250, 165);
		ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\zc33.png");
		three.setIcon(tr);
		this.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new dc3();
			}
		});
				
		back = new JButton("");
		ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
		back.setIcon(icon);
		back.setBounds(600, 10, 70, 70);
		this.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.changeBack4_3();
			}
		});
}
}

class JPanelSusa extends JPanel{

	   private hw win;
	   private JButton one;
	   private JButton two;
	   private JButton three;
	   private JButton back;

	   private JLabel labelone; 
	   private JLabel labeltwo; 
	   private JLabel labelthree;
	   
	   public JPanelSusa(hw win) {

	      this.setLayout(null);
	      this.win = win;
	      this.setSize(700,400);

	      labelone = new JLabel("��������");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("�긮�� �ͽ�������");
	      labeltwo.setBounds(350, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("����������");
	      labelthree.setBounds(260, 325, 80, 40);
	      this.add(labelthree);
	      
	      one = new JButton("");
	      one.setBounds(5, 5, 250, 165);
	      ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\za12.png");
	      one.setIcon(o);
	      this.add(one);
	      one.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            new zzokAma1();
	         }
	      });
	      
	      two = new JButton("");
	      ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\za22.png");
	      two.setIcon(tw);
	      two.setBounds(270, 5, 250, 165);
	      this.add(two);
	      two.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokAma2();
	         }
	      });
	      
	      three = new JButton("");
	      three.setBounds(5, 185, 250, 165);
	      ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\za32.png");
	      three.setIcon(tr);
	      this.add(three);
	      three.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokAma3();
	         }
	      });
	            
	      back = new JButton("");
	      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
	      back.setIcon(icon);
	      back.setBounds(600, 10, 70, 70);
	      this.add(back);
	      back.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            win.changeBack4_3();
	         }
	      });
	}
	}
	class JPanelSkorea extends JPanel{

	   private hw win;
	   private JButton one;
	   private JButton two;
	   private JButton three;
	   private JButton back;

	   private JLabel labelone; 
	   private JLabel labeltwo; 
	   private JLabel labelthree;
	   
	   public JPanelSkorea(hw win) {

	      this.setLayout(null);
	      this.win = win;
	      this.setSize(700,400);

	      labelone = new JLabel("���̹�");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("�츮�н�");
	      labeltwo.setBounds(370, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("���̴ٽ�Ź");
	      labelthree.setBounds(260, 325, 80, 40);
	      this.add(labelthree);
	      
	      one = new JButton("");
	      one.setBounds(5, 5, 250, 165);
	      ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\zh12.png");
	      one.setIcon(o);
	      this.add(one);
	      one.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokKorea1();
	         }
	      });
	      
	      two = new JButton("");
	      ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\zh22.png");
	      two.setIcon(tw);
	      two.setBounds(270, 5, 250, 165);
	      this.add(two);
	      two.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokKorea2();
	         }
	      });
	      
	      three = new JButton("");
	      three.setBounds(5, 185, 250, 165);
	      ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\zh32.png");
	      three.setIcon(tr);
	      this.add(three);
	      three.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokKorea3();
	         }
	      });
	            
	      back = new JButton("");
	      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
	      back.setIcon(icon);
	      back.setBounds(600, 10, 70, 70);
	      this.add(back);
	      back.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            win.changeBack4_3();
	         }
	      });
	}
	}
	class JPanelSjapan extends JPanel{

	   private hw win;
	   private JButton one;
	   private JButton two;
	   private JButton three;
	   private JButton back;

	   private JLabel labelone; 
	   private JLabel labeltwo; 
	   private JLabel labelthree;
	   
	   public JPanelSjapan(hw win) {

	      this.setLayout(null);
	      this.win = win;
	      this.setSize(700,400);

	      labelone = new JLabel("�����н�");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("���Ĵ�");
	      labeltwo.setBounds(380, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("�ʹ���");
	      labelthree.setBounds(260, 325, 80, 40);
	      this.add(labelthree);
	      
	      one = new JButton();
	      one.setBounds(5, 5, 250, 165);
	      ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\zj12.png");
	      one.setIcon(o);
	      this.add(one);
	      one.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokjapan1();
	         }
	      });
	      
	      two = new JButton("");
	      ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\zj22.png");
	      two.setIcon(tw);
	      two.setBounds(270, 5, 250, 165);
	      this.add(two);
	      two.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokjapan2();
	         }
	      });
	      
	      three = new JButton("");
	      three.setBounds(5, 185, 250, 165);
	      ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\zj32.png");
	      three.setIcon(tr);
	      this.add(three);
	      three.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokjapan3();
	         }
	      });
	            
	      back = new JButton("");
	      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
	      back.setIcon(icon);
	      back.setBounds(600, 10, 70, 70);
	      this.add(back);
	      back.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            win.changeBack4_3();
	         }
	      });
	}
	}
	class JPanelSchina extends JPanel{

	   private hw win;
	   private JButton one;
	   private JButton two;
	   private JButton three;
	   private JButton back;

	   private JLabel labelone; 
	   private JLabel labeltwo; 
	   private JLabel labelthree;
	   
	   public JPanelSchina(hw win) {

	      this.setLayout(null);
	      this.win = win;
	      this.setSize(700,400);

	      labelone = new JLabel("����Ǫ ������");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("������");
	      labeltwo.setBounds(380, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("«����");
	      labelthree.setBounds(260, 325, 80, 40);
	      this.add(labelthree);
	      
	      one = new JButton("");
	      one.setBounds(5, 5, 250, 165);
	      ImageIcon o = new ImageIcon("D:\\eclipse-workspace\\project\\zc12.png");
	      one.setIcon(o);
	      this.add(one);
	      one.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokChina1();
	         }
	      });
	      
	      two = new JButton("");
	      ImageIcon tw = new ImageIcon("D:\\eclipse-workspace\\project\\zc22.png");
	      two.setIcon(tw);
	      two.setBounds(270, 5, 250, 165);
	      this.add(two);
	      two.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokChina2();
	         }
	      });
	      
	      three = new JButton("");
	      three.setBounds(5, 185, 250, 165);
	      ImageIcon tr = new ImageIcon("D:\\eclipse-workspace\\project\\zc32.png");
	      three.setIcon(tr);
	      this.add(three);
	      three.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 new zzokChina3();
	         }
	      });
	            
	      back = new JButton("");
	      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\back.jpg");
	      back.setIcon(icon);
	      back.setBounds(600, 10, 70, 70);
	      this.add(back);
	      back.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            win.changeBack4_3();
	         }
	      });
	}
	}

public class hw extends JFrame{
	

	private JLabel labeldoor = new JLabel();
	 
    public JPanel01 jpanel01 = null;
    public JPanel02 jpanel02 = null;
    public JPanel03 jpanel03 = null;
    public JPanel04 jpanel04 = null;

    public JPanelNusa jpanelNusa = null;
    public JPanelNkorea jpanelNkorea = null;
    public JPanelNjapan jpanelNjapan = null;
    public JPanelNchina jpanelNchina = null;
    
    public JPanelEusa jpanelEusa = null;
    public JPanelEkorea jpanelEkorea = null;
    public JPanelEjapan jpanelEjapan = null;
    public JPanelEchina jpanelEchina = null;
    
    public JPanelSusa jpanelSusa = null;
    public JPanelSkorea jpanelSkorea = null;
    public JPanelSjapan jpanelSjapan = null;
    public JPanelSchina jpanelSchina = null;
   
    
   public void changeSpecial(){ //��
        
		getContentPane().removeAll();
        getContentPane().add(jpanel04); //���� panel �߰�
        revalidate();
        repaint();
    }
    
    public void changeNext(String panelName) {
    	        
    			//�Ϲ� ����
    	        if(panelName.equals("panelNusaOne")){
    	            getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNusaTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNusaThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNkoreaOne")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNkoreaTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }else if(panelName.equals("panelNkoreaThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNjapanOne")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNjapanTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNjapanThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNchinaOne")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNchinaTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelNchinaThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        //�Ϲ� ��
    	        
    	        //���� ����
    	        else if(panelName.equals("panelEkoreaOne")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEkoreaTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEkoreaThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEusaOne")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEusaTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }else if(panelName.equals("panelEusaThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEjapanOne")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEjapanTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEjapanThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEchinaOne")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEchinaTwo")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else if(panelName.equals("panelEchinaOneThree")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        //���� ��
    	        
    	        
    	       
    	        else if(panelName.equals("panelZ")) {
    	        	getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    	        else {
    	            getContentPane().removeAll();
    	            getContentPane().add(jpanel01);
    	            revalidate();
    	            repaint();
    	        }
    		}


    public void changeWest(){
        
    		getContentPane().removeAll();
            getContentPane().add(jpanel01); //�����г� �߰�
            revalidate();
            repaint();
	}
    
    public void changeHome(){
        
    		getContentPane().removeAll();
            getContentPane().add(jpanel02);
            revalidate();
            repaint();
	}
    public void changeBack4_3() {
        getContentPane().removeAll();
        getContentPane().add(jpanel03);
        revalidate();
        repaint();
    }
    
    public void change2_3(String doorName){
        
        getContentPane().removeAll();
        getContentPane().add(jpanel03);
        jpanel03.add(labeldoor);
        labeldoor.setBounds(130, -30, 500, 100);
        labeldoor.setFont(new Font("Serif",Font.BOLD, 20));
        
        if(doorName.equals("North")){
        	labeldoor.setText("�Ϲ��� ����");
        	jpanel03.WhichDoor = 0;
        }
        else if(doorName.equals("South")) {
        	labeldoor.setText("����/�ʹ��� ����");
        	jpanel03.WhichDoor = 1;
        }
        else if(doorName.equals("East")) {
        	labeldoor.setText("������ ����");
        	jpanel03.WhichDoor = 2;
        }
        else if(doorName.equals("West")) {
        	labeldoor.setText("������ ����");
        	jpanel03.WhichDoor = 3;
        }
        else {
 
        }
        revalidate();
        repaint();
	}


    public void change3_4(String foodstyle, int whichDoor){
        getContentPane().removeAll();
    //0 = North , 1 = South, 2 = East, 3 = West
     
      if(foodstyle.equals("usa")){
         
         if(whichDoor == 0) {
            getContentPane().add(jpanelNusa);
         }
         else if(whichDoor==1){
            getContentPane().add(jpanelSusa);
            
         }
         else if(whichDoor == 2) {
            getContentPane().add(jpanelEusa);
            
         }
         else if(whichDoor == 3) {
            
         }
    }
    else if(foodstyle.equals("korea")) {
       
       if(whichDoor == 0) {
        getContentPane().add(jpanelNkorea);
        
       }
       else if(whichDoor==1){
        getContentPane().add(jpanelSkorea);
          
       }
       else if(whichDoor == 2) {
        getContentPane().add(jpanelEkorea);
          
       }
       else if(whichDoor == 3) {
          
       }

     }
    else if(foodstyle.equals("japan")) {
       if(whichDoor == 0) {
        getContentPane().add(jpanelNjapan);
        
       }
       else if(whichDoor==1){
        getContentPane().add(jpanelSjapan);
          
       }
       else if(whichDoor == 2) {
        getContentPane().add(jpanelEjapan);
       }
       else if(whichDoor == 3) {
          
       }
       
    }
    else if(foodstyle.equals("china")) {
       if(whichDoor == 0) {
        getContentPane().add(jpanelNchina);
        
       }
       else if(whichDoor==1){
        getContentPane().add(jpanelSchina);
          
       }
       else if(whichDoor == 2) {
        getContentPane().add(jpanelEchina);
          
       }
       else if(whichDoor == 3) {
          
       }
       
    }
      
   revalidate();
   repaint();
     
  }

    
	public static void main(String[] args) {
		
		 hw win = new hw();            
	        
		 win.setTitle("test");
		 win.jpanel01= new JPanel01(win);
	     win.jpanel02 = new JPanel02(win);
	     win.jpanel03 = new JPanel03(win);
	     win.jpanel04 = new JPanel04(win);
	     win.jpanelNusa = new JPanelNusa(win);
	     win.jpanelNkorea = new JPanelNkorea(win);
	     win.jpanelNjapan = new JPanelNjapan(win);
	     win.jpanelNchina = new JPanelNchina(win);

	     win.jpanelEusa = new JPanelEusa(win);
	     win.jpanelEkorea = new JPanelEkorea(win);
	     win.jpanelEjapan = new JPanelEjapan(win);
	     win.jpanelEchina = new JPanelEchina(win);
		 
	     win.jpanelSusa = new JPanelSusa(win);
	     win.jpanelSkorea = new JPanelSkorea(win);
	     win.jpanelSjapan = new JPanelSjapan(win);
	     win.jpanelSchina = new JPanelSchina(win); 
	    
	        win.add(win.jpanel01);
	        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        win.setSize(700,400);
	        win.setLocation(500,300);
	        win.setVisible(true);
	}
}