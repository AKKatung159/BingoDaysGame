package Main;

import javax.swing.*;
import java.awt.*;

public class StartScreen {
    private JPanel startScreen;
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

        startScreen.add(startBackground);

    }
}
