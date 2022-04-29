package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Main.MainDisplay.window;

public class InputNameScreen  extends JPanel{

    public static JPanel inputNameScreen;
    private JLabel inputNameBackground;

    public InputNameScreen(){
        //create panel
        inputNameScreen = new JPanel();
        inputNameScreen.setBounds(0, 0, 1310, 715); //ขนาดรูป
        inputNameScreen.setBackground(Color.black);
        inputNameScreen.setLayout(null);
        //window.add(inputNameScreen);

        //create Background
        inputNameBackground = new JLabel();
        inputNameBackground.setBounds(0, 0, 1310, 715);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("image/screen_InputName copy.png")); // เพิ่มBackground
        inputNameBackground.setIcon(bgIcon);

        //create box for enter name
        JTextField txtName = new JTextField();
        txtName.setSelectedTextColor(Color.black);
        txtName.setBounds(656, 350, 250, 50);

        //crate set name button
        JButton setButton = new JButton();
        setButton.setBounds(550, 450, 200, 89);
        setButton.setBackground(null);
        setButton.setContentAreaFilled(false);
        setButton.setFocusPainted(false);
        setButton.setBorderPainted(false);
        ImageIcon setbuttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/setButton copy.png")); // เพิ่มรูปปุ่ม
        setButton.setIcon(setbuttonIcon);
        setButton.setToolTipText("SET YOUR NAME");

        setButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                window.getContentPane().removeAll();
                //MainDisplay.window.add(new Dialog1());
                window.validate();
            }
        });

        inputNameScreen.add(txtName);
        inputNameScreen.add(setButton);
        inputNameScreen.add(inputNameBackground);

        setButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(inputNameScreen, "Hi, WELCOME " + txtName.getText() + " to The Bingo Days.", "Hi", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        window.setVisible(true);
    }
}
