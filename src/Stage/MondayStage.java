package Stage;

import Bingo.BingoGame;

import javax.swing.*;


public class MondayStage extends BingoGame {
    private JLabel mondayBackground;

    public MondayStage() {
        super();

        //create Background
        mondayBackground = new JLabel();
        mondayBackground.setBounds(0, 0, 1310, 715);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("image/Bg3.png")); // เพิ่มBackground
        mondayBackground.setIcon(bgIcon);
        add(mondayBackground);
    }
}
