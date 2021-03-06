package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartScreen extends JPanel {
    public static JPanel startScreen;
    private JLabel startBackground;

    public StartScreen() {
        //create panel
        startScreen = new JPanel();
        startScreen.setBounds(0, 0, 1310, 715); //ขนาดรูป
        startScreen.setBackground(Color.black);
        startScreen.setLayout(null);
        MainDisplay.window.add(startScreen);

        //create Background
        startBackground = new JLabel();
        startBackground.setBounds(0, 0, 1310, 715);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("image/Bg1.png")); // เพิ่มBackground
        startBackground.setIcon(bgIcon);

        //create start button
        JButton startButton = new JButton();
        startButton.setBounds(550, 450, 200, 89);
        startButton.setBackground(null);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.setBorderPainted(false);
        startButton.setToolTipText("LET'S GET START");

        ImageIcon startButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/startButton.png")); // เพิ่มรูปปุ่ม
        startButton.setIcon(startButtonIcon);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                MainDisplay.window.add(new InputNameScreen());
                MainDisplay.window.validate();
            }
        });

        //create how to play Button
        JButton howToPlayButton = new JButton();
        howToPlayButton.setBounds(480, 560, 328, 87);
        howToPlayButton.setBackground(null);
        howToPlayButton.setContentAreaFilled(false);
        howToPlayButton.setFocusPainted(false);
        howToPlayButton.setBorderPainted(false);
        howToPlayButton.setToolTipText("HOW TO PLAY");

        ImageIcon howToPlayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/howTOplaybutton.png")); // เพิ่มรูปปุ่ม
        howToPlayButton.setIcon(howToPlayButtonIcon);

        howToPlayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                MainDisplay.window.add(new HowToPlayScreen());
                MainDisplay.window.validate();
            }
        });

        startScreen.add(startButton);
        startScreen.add(howToPlayButton);
        startScreen.add(startBackground);

    }

}
