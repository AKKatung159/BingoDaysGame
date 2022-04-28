package Main;

import Bingo.MondayStage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseStageScreen extends JPanel {
    public static JPanel chooseStageScreen;
    private JLabel chooseStageBackground;

    public ChooseStageScreen(){
        //create panel
        chooseStageScreen = new JPanel();
        chooseStageScreen.setBounds(0, 0, 1310, 715); //ขนาดรูป
        chooseStageScreen.setBackground(Color.black);
        chooseStageScreen.setLayout(null);
        MainDisplay.window.add(chooseStageScreen);

        //create Background
        chooseStageBackground = new JLabel();
        chooseStageBackground.setBounds(0, 0, 1310, 715);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("image/Bg3.png")); // เพิ่มBackground
        chooseStageBackground.setIcon(bgIcon);

        //Monday button
        createMondayButton();

        //Tuesday button
        createTuesdayButton();

        //Wednesday button
        createWednesdayButton();

        //Thursday button
        createThursdayButton();

        //Friday button
        createFridayButton();

        //Saturday button
        createSaturdayButton();

        //Sunday button
        createSundayButton();

        //crate return button
        JButton returnButton = new JButton();
        returnButton.setBounds(1090, 3, 90, 88);
        returnButton.setBackground(null);
        returnButton.setContentAreaFilled(false);
        returnButton.setFocusPainted(false);
        returnButton.setBorderPainted(false);
        returnButton.setToolTipText("RETURN");

        ImageIcon returnButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/rebutton.png")); // เพิ่มรูปปุ่ม
        returnButton.setIcon(returnButtonIcon);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                MainDisplay.window.add(new MondayStage());
                MainDisplay.window.validate();
            }
        });

        //crate close button
        JButton closeButton = new JButton();
        closeButton.setBounds(1180, 4, 90, 88);
        closeButton.setBackground(null);
        closeButton.setContentAreaFilled(false);
        closeButton.setFocusPainted(false);
        closeButton.setBorderPainted(false);
        closeButton.setToolTipText("CLOSE");

        ImageIcon closeButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/Xbutton.png")); // เพิ่มรูปปุ่ม
        closeButton.setIcon(closeButtonIcon);

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                MainDisplay.window.add(new StartScreen());
                MainDisplay.window.validate();
            }
        });

        chooseStageScreen.add(closeButton);
        chooseStageScreen.add(returnButton);
        chooseStageScreen.add(chooseStageBackground);

    }


    public void createMondayButton() {
        //create button
        JButton mondayButton = new JButton();
        mondayButton.setBounds(150, 130, 200, 248);
        mondayButton.setBackground(null);
        mondayButton.setContentAreaFilled(false);
        mondayButton.setFocusPainted(false);
        mondayButton.setBorderPainted(false);
        mondayButton.setToolTipText("MONDAY");

        ImageIcon mondayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/mon.png")); // เพิ่มรูปปุ่ม
        mondayButton.setIcon(mondayButtonIcon);

        mondayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                //MainDisplay.window.add(new InputNameScreen());
                MainDisplay.window.validate();
            }
        });
        chooseStageScreen.add(mondayButton);
    }

        public void createTuesdayButton() {
            //create button
            JButton tuesdayButton = new JButton();
            tuesdayButton.setBounds(400, 130, 200, 248);
            tuesdayButton.setBackground(null);
            tuesdayButton.setContentAreaFilled(false);
            tuesdayButton.setFocusPainted(false);
            tuesdayButton.setBorderPainted(false);
            tuesdayButton.setToolTipText("TUESDAY");

            ImageIcon tuesdayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/tue.png")); // เพิ่มรูปปุ่ม
            tuesdayButton.setIcon(tuesdayButtonIcon);

            tuesdayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    MainDisplay.window.getContentPane().removeAll();
                    //MainDisplay.window.add(new InputNameScreen());
                    MainDisplay.window.validate();
                }
            });
            chooseStageScreen.add(tuesdayButton);
        }

    public void createWednesdayButton() {
        //create button
        JButton wednesdayButton = new JButton();
        wednesdayButton.setBounds(650, 130, 200, 248);
        wednesdayButton.setBackground(null);
        wednesdayButton.setContentAreaFilled(false);
        wednesdayButton.setFocusPainted(false);
        wednesdayButton.setBorderPainted(false);
        wednesdayButton.setToolTipText("WEDNESDAY");

        ImageIcon wednesdayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/wed.png")); // เพิ่มรูปปุ่ม
        wednesdayButton.setIcon(wednesdayButtonIcon);

        wednesdayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                //MainDisplay.window.add(new InputNameScreen());
                MainDisplay.window.validate();
            }
        });
        chooseStageScreen.add(wednesdayButton);
    }

    public void createThursdayButton() {
        //create button
        JButton thursdayButton = new JButton();
        thursdayButton.setBounds(900, 130, 200, 248);
        thursdayButton.setBackground(null);
        thursdayButton.setContentAreaFilled(false);
        thursdayButton.setFocusPainted(false);
        thursdayButton.setBorderPainted(false);
        thursdayButton.setToolTipText("THURSDAY");

        ImageIcon thursdayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/thu.png")); // เพิ่มรูปปุ่ม
        thursdayButton.setIcon(thursdayButtonIcon);

        thursdayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                //MainDisplay.window.add(new InputNameScreen());
                MainDisplay.window.validate();
            }
        });
        chooseStageScreen.add(thursdayButton);
    }

    public void createFridayButton() {
        //create button
        JButton fridayButton = new JButton();
        fridayButton.setBounds(300, 390, 200, 248);
        fridayButton.setBackground(null);
        fridayButton.setContentAreaFilled(false);
        fridayButton.setFocusPainted(false);
        fridayButton.setBorderPainted(false);
        fridayButton.setToolTipText("FRIDAY");

        ImageIcon fridayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/fri.png")); // เพิ่มรูปปุ่ม
        fridayButton.setIcon(fridayButtonIcon);

        fridayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                //MainDisplay.window.add(new InputNameScreen());
                MainDisplay.window.validate();
            }
        });
        chooseStageScreen.add(fridayButton);
    }

    public void createSaturdayButton() {
        //create button
        JButton saturdayButton = new JButton();
        saturdayButton.setBounds(550, 390, 200, 248);
        saturdayButton.setBackground(null);
        saturdayButton.setContentAreaFilled(false);
        saturdayButton.setFocusPainted(false);
        saturdayButton.setBorderPainted(false);
        saturdayButton.setToolTipText("SATURDAY");

        ImageIcon saturdayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/sat.png")); // เพิ่มรูปปุ่ม
        saturdayButton.setIcon(saturdayButtonIcon);

        saturdayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                //MainDisplay.window.add(new InputNameScreen());
                MainDisplay.window.validate();
            }
        });
        chooseStageScreen.add(saturdayButton);
    }

    public void createSundayButton() {
        //create button
        JButton sundayButton = new JButton();
        sundayButton.setBounds(800, 390, 200, 248);
        sundayButton.setBackground(null);
        sundayButton.setContentAreaFilled(false);
        sundayButton.setFocusPainted(false);
        sundayButton.setBorderPainted(false);
        sundayButton.setToolTipText("SUNDAY");

        ImageIcon sundayButtonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/sun.png")); // เพิ่มรูปปุ่ม
        sundayButton.setIcon(sundayButtonIcon);

        sundayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainDisplay.window.getContentPane().removeAll();
                //MainDisplay.window.add(new InputNameScreen());
                MainDisplay.window.validate();
            }
        });
        chooseStageScreen.add(sundayButton);
    }
}

