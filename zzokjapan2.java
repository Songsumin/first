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

class zzokjapan2 extends JFrame{ //5번 장면 그냥 예시로 넣은 것 여기에 나중에 추가하기
	  private JButton jhome;
	  public zzokjapan2() {
  	 JPanel panel = new JPanel();
       JPanel panelA = new JPanel();
       JPanel panelB = new JPanel();
       JPanel panelC = new JPanel();
       panel.setLayout(new BorderLayout());
       panelC.setLayout(new GridLayout(2,1,10,10));
       panelB.setLayout(new GridLayout(2,2,10,10));
       
       JLabel label = new JLabel("정식당"); //가게 명
       jhome = new JButton("뒤로가기");  //홈버튼
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
               File f = new File("list.txt"); 
                  try( PrintWriter output = new PrintWriter( f ); ) {
                     output.print("쪽문 정식당") ;
                } catch (IOException e1) {
                     e1.printStackTrace();
                }
              }
           
       });
      
       
       JButton button1 = new JButton(""); //사진 3장 및 전화번호, 메뉴
       JButton button2 = new JButton("");
       JButton button3 = new JButton("");
       ImageIcon icon = new ImageIcon("D:\\eclipse-workspace\\project\\bj31.png");
       ImageIcon icon1 = new ImageIcon("D:\\eclipse-workspace\\project\\zj22.png");
       ImageIcon icon2 = new ImageIcon("D:\\eclipse-workspace\\project\\zj21.png");
       button1.setIcon(icon);
       button2.setIcon(icon1);
       button3.setIcon(icon2);
       JLabel label1 = new JLabel("● 053-951-0860");
       JLabel label2 = new JLabel("● 메뉴 : 초밥A세트 11000 연어 광어 초밥 13000 ");
      
       
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
