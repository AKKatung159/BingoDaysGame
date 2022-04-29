package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HowToPlayScreen extends JPanel {
    public static JPanel howToPlayScreen;
    private JLabel howToPlayBackground;
    public HowToPlayScreen(){
//        //create panel
//        howToPlayScreen = new JPanel();
//        howToPlayScreen.setBounds(0, 0, 1310, 715); //ขนาดรูป
//        howToPlayScreen.setBackground(Color.black);
//        howToPlayScreen.setLayout(null);
//        MainDisplay.window.add(howToPlayScreen);
//
//        //create Background
//        howToPlayBackground = new JLabel();
//        howToPlayBackground.setBounds(0, 0, 1310, 715);
//        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("image/Bg2.png")); // เพิ่มBackground
//        howToPlayBackground.setIcon(bgIcon);
//
//        //create close button
//        JButton closeButton = new JButton();
//        closeButton.setBounds(1180, 4, 90, 88);
//        closeButton.setBackground(null);
//        closeButton.setContentAreaFilled(false);
//        closeButton.setFocusPainted(false);
//        closeButton.setBorderPainted(false);
//        closeButton.setToolTipText("CLOSE");
//
//        ImageIcon closeButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/Xbutton.png")); // เพิ่มรูปปุ่ม
//        closeButton.setIcon(closeButtonIcon);
//
//        closeButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                MainDisplay.window.getContentPane().removeAll();
//                MainDisplay.window.add(new StartScreen());
//                MainDisplay.window.validate();
//            }
//        });
//        howToPlayScreen.add(closeButton);
//        howToPlayScreen.add(howToPlayBackground);
    }
    public void paint(Graphics g){
        repaint();
        Toolkit t= Toolkit.getDefaultToolkit();
        Image i =t.getImage("src/image/Bg2.png");
        Image sb=t.getImage("src/image/startbutton.png");
        Image hb=t.getImage("src/image/howTOplaybutton.png");

        g.drawImage(i,0,0,this);
        //g.drawImage(sb,550, 450, 200, 89,this);
        //g.drawImage(hb,480, 560, 328, 87,this);
    }
}

