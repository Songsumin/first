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

class ba1 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public ba1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("1992 steak&pub"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\ba11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\ba12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\ba13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-5569");
      JLabel label2 = new JLabel("● 메뉴 : 아란 치니 8,500원, 봉골레 크림 파스타 8,500원 ");
     
      
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


class ba2 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public ba2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("벨로"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("벨로");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\ba21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\ba22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\ba23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-954-1206");
      JLabel label2 = new JLabel("● 메뉴 : 까르보나라 8,900원, 닭가슴살 스테이크 9,900원 ");
     
      
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


class ba3 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public ba3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("META PIZZA"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\ba31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\ba32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\ba33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-6767");
      JLabel label2 = new JLabel("● 메뉴 : 미트 디럭스 19,000원, 프리마베라 18,500원 ");
     
      
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

class bk1 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bk1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("대독장"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("대독장");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bk11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bk12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bk13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-5569");
      JLabel label2 = new JLabel("● 메뉴 : 김치찌개 6,500원, 매콤 불고기 (소) 10,000원, (대)15,000원");
     
      
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


class bk2 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bk2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("한끼갈비"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("한끼갈비");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bk21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bk22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bk23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-954-1206");
      JLabel label2 = new JLabel("● 메뉴 : 매운 갈비찜 8,000원, 묵은지 갈비찜 9,000원 ");
     
      
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


class bk3 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bk3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("소담한"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("소담한");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bk31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bk32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bk33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-6767");
      JLabel label2 = new JLabel("● 메뉴 : 대패한판 (2~3인) 18,000원, (3~4인) 28,000원 ");
     
      
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

class bj1 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bj1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("텐코쿠"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("텐코쿠");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bj12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bj13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-5569");
      JLabel label2 = new JLabel("● <차슈동 7000원>,<돈코츠라멘 7500원>");
     
      
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


class bj2 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bj2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("이층남자의 면과 밥"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("이층남자의 면과 밥");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bj22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bj23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-954-1206");
      JLabel label2 = new JLabel("● <가츠동 4900원>,<치킨 카레동 5800원>");
     
      
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


class bj3 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bj3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("마사"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("마사");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bj32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bj33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-6767");
      JLabel label2 = new JLabel("● <마사 모둠 10000원> ");
     
      
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

class bc1 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bc1() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("면탐정"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("면탐정");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bc11.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bc12.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bc13.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-5569");
      JLabel label2 = new JLabel("● <빨간 짬뽕(단품) 5500원>,<치즈 허니 피자(단품) 9500원>");
     
      
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


class bc2 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bc2() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("홍콩반점"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("홍콩반점");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bc21.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bc22.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bc23.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-954-1206");
      JLabel label2 = new JLabel("● <탕수육 : 11000원>,<짜장면 : 4000원>");
     
      
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


class bc3 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
    
    
    
    public bc3() {
     JPanel panel = new JPanel();
      JPanel panelA = new JPanel();
      JPanel panelB = new JPanel();
      JPanel panelC = new JPanel();
      panel.setLayout(new BorderLayout());
      panelC.setLayout(new GridLayout(2,1,10,10));
      panelB.setLayout(new GridLayout(2,2,10,10));
      
      JLabel label = new JLabel("야끼한남자"); //가게 명
      JButton jhome = new JButton("뒤로가기");  //홈버튼
       jhome.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             dispose(); 
          }
          
      });
          

      
       JButton jjim = new JButton("☆나의 맛집으로 찜☆"); //찜버튼
       jjim.addActionListener(e->
       {
          jjim.setText("★이미 찜하셨습니다 ★");
       }); 
       
       jjim.addActionListener(new ActionListener() {
           // 만들어진 버튼 "새 창 띄우기"에 버튼이 눌러지면 발생하는 행동을 정의
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
        	   pw.write("야끼한남자");
        	  pw.flush();
      	   pw.close();
           }      
       });
          
              
    
      

     
      
      JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
      JButton button2 = new JButton("");
      JButton button3 = new JButton("");
      ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bc31.png");
      ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\bc32.png");
      ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\bc33.png");
      button1.setIcon(icon);
      button2.setIcon(icon1);
      button3.setIcon(icon2);
      JLabel label1 = new JLabel("● 053-939-6767");
      JLabel label2 = new JLabel("● <철판 야끼 11000원>,<군만두 : 3000원> ");
     
      
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