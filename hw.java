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

	          label1 = new JLabel("오늘 뭐 먹지?");
	          label1.setFont(new Font("Serif", Font.BOLD, 40));
	          label1.setBounds(230,50, 700, 60);
	          add(label1);
	          
	          label2 = new JLabel("조원 : ");
	          label2.setFont(new Font("Serif", Font.BOLD, 20));
	          label2.setBounds(500, 210, 200, 100);
	          add(label2);
	          
	          mem1 = new JLabel("박진아, 김선욱");
	          mem1.setFont(new Font("Serif", Font.BOLD, 20));
	          mem1.setBounds(500, 240, 300, 100);
	          add(mem1);
	          mem2 = new JLabel("손종영, 송수민");
	          mem2.setFont(new Font("Serif", Font.BOLD, 20));
	          mem2.setBounds(500, 270, 300, 100);
	          add(mem2);
	      
	          button1.addActionListener(new MyActionListener());
	   }
	class MyActionListener implements ActionListener { //2번 화면 출력
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
		
		north = new JButton("북문");
		north.setBounds(300, 10, 60, 30);
		this.add(north);
		north.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change2_3("North");
			}
		});
		
		south = new JButton("정문/쪽문");
		south.setBounds(285, 320, 90, 30);
		this.add(south);
		south.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change2_3("South");
			}
		});
		east = new JButton("동문");
		east.setBounds(520, 170, 60, 30);
		this.add(east);
		east.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change2_3("East");
			}
		});
		
		west = new JButton("서문");
		west.setBounds(55, 170, 60, 30);
		this.add(west);
		west.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new seo();
			}
		});
		
		zzim = new JButton("찜목록");
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

		labelusa = new JLabel("양 식");
		labelusa.setBounds(190, 170, 80, 40);
		this.add(labelusa);
		labelkorea = new JLabel("한 식");
		labelkorea.setBounds(410, 170, 80, 40);
		this.add(labelkorea);
		labeljapan = new JLabel("중 식");
		labeljapan.setBounds(200, 320, 80, 40);
		this.add(labeljapan);
		labelchina = new JLabel("일 식");
		labelchina.setBounds(415, 320, 80, 40);
		this.add(labelchina);
		
		usa = new JButton("양식");
		usa.setBounds(120, 50, 180, 130);
		ImageIcon uuu = new ImageIcon("D:\\eclipse-workspace\\project\\usa.jpg");
		usa.setIcon(uuu);
		this.add(usa);
		usa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change3_4("usa", WhichDoor);
			}
		});
		
		korea = new JButton("한식");
		ImageIcon kkk = new ImageIcon("D:\\eclipse-workspace\\project\\korea.jpg");
		korea.setIcon(kkk);
		korea.setBounds(340, 50, 180, 130);
		this.add(korea);
		korea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change3_4("korea", WhichDoor);
			}
		});
		
		japan = new JButton("일식");
		japan.setBounds(340, 200, 180, 130);
		ImageIcon jjj = new ImageIcon("D:\\eclipse-workspace\\project\\japan.jpg");
		japan.setIcon(jjj);
		this.add(japan);
		japan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change3_4("japan", WhichDoor);
			}
		});
		
		china = new JButton("중식");
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

class JPanel04 extends JPanel{        // 찜패널

    private hw win;
    public JLabel label;
    public JPanel04(hw win) {
        this.win = win;
 
        JButton bt = new JButton("나의 찜목록 보기");
        JButton btn = new JButton("뒤로가기");
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
		labeltwo = new JLabel("벨로");
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

		labelone = new JLabel("대독장");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("한끼갈비");
		labeltwo.setBounds(370, 160, 80, 40);
		this.add(labeltwo);
		labelthree = new JLabel("소담한");
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

		labelone = new JLabel("텐코쿠");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("이층남자의 면과 밥");
		labeltwo.setBounds(330, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("마사");
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

		labelone = new JLabel("면탐정");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("야끼한남자 경대점");
		labeltwo.setBounds(330, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("홍콩반점");
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

		labelone = new JLabel("금상갈비촌");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("사랑받는 돼지국밥");
		labeltwo.setBounds(330, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("색계");
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

		labelone = new JLabel("다이나믹치킨");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("아메리칸");
		labeltwo.setBounds(360, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("오마이파스타");
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

		labelone = new JLabel("삐떡");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("선택떡볶이");
		labeltwo.setBounds(360, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("조아라");
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

		labelone = new JLabel("경복반점");
		labelone.setBounds(100, 137, 100, 80);
		this.add(labelone);
		labeltwo = new JLabel("기황후");
		labeltwo.setBounds(370, 160, 180, 40);
		this.add(labeltwo);
		labelthree = new JLabel("용궁");
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

	      labelone = new JLabel("몽땅피자");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("브리또 익스프레스");
	      labeltwo.setBounds(350, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("돈가스백작");
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

	      labelone = new JLabel("종이밥");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("우리분식");
	      labeltwo.setBounds(370, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("모이다식탁");
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

	      labelone = new JLabel("열도분식");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("정식당");
	      labeltwo.setBounds(380, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("초밥집");
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

	      labelone = new JLabel("라쿵푸 마라탕");
	      labelone.setBounds(100, 137, 100, 80);
	      this.add(labelone);
	      labeltwo = new JLabel("감래등");
	      labeltwo.setBounds(380, 160, 180, 40);
	      this.add(labeltwo);
	      labelthree = new JLabel("짬마담");
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
   
    
   public void changeSpecial(){ //찜
        
		getContentPane().removeAll();
        getContentPane().add(jpanel04); //찜목록 panel 추가
        revalidate();
        repaint();
    }
    
    public void changeNext(String panelName) {
    	        
    			//북문 시작
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
    	        //북문 끝
    	        
    	        //동문 시작
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
    	        //동문 끝
    	        
    	        
    	       
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
            getContentPane().add(jpanel01); //서문패널 추가
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
        	labeldoor.setText("북문의 맛집");
        	jpanel03.WhichDoor = 0;
        }
        else if(doorName.equals("South")) {
        	labeldoor.setText("정문/쪽문의 맛집");
        	jpanel03.WhichDoor = 1;
        }
        else if(doorName.equals("East")) {
        	labeldoor.setText("동문의 맛집");
        	jpanel03.WhichDoor = 2;
        }
        else if(doorName.equals("West")) {
        	labeldoor.setText("서문의 맛집");
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