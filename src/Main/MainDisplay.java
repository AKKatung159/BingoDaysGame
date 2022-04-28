package Main;

import Bingo.MondayStage;

import javax.swing.*;
import java.awt.*;

import static Main.StartScreen.startScreen;

public class MainDisplay {
    public static JFrame window;


    public MainDisplay(){
        //create window
        window = new JFrame();
        window.setSize(1295, 715); //ขนาดหน้าต่าง
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setTitle("Bingo Days Game"); //ชื่อบนหัวหน้าต่าง
        window.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));  //ไอคอน
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //กดปิดwindow
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        //new StartScreen();
        new MondayStage();
        //new HowToPlayScreen();





    }
}
