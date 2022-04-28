package Bingo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MondayStage extends JPanel {
    public static String nameStage = "Monday";
    public static final int WIDTH = 1295;
    public static final int LENGTH = 715;

    private JButton reset;
    private JButton bingo;
    private JButton nextNum;
    private JButton start;
    private JButton stop;
    private Container layout;
    private Container boxLayout;

    private BingoNumbers bingoNumbers;
    private BingoGrid dummyGrid;
    private BingoClick clickGrid;


    private MouseListener mouseListener;
    private ActionListener timer;
    private ActionListener buttonListener;
    private final int DELAY;
    private boolean startGame = false;
    private boolean winner = false;

    /**
     * Constructs the game window
     */
    public MondayStage() {

        setSize(WIDTH, LENGTH);


        //JButtons
        reset = new JButton();
        bingo = new JButton();
        nextNum = new JButton();
        start = new JButton();
        stop = new JButton();

        //add JButtons to the panel
        ImageIcon buttonIcon;

        //start
        add(start);
        start.setBounds(0, 0, 200, 89);
        start.setBackground(null);
        start.setContentAreaFilled(false);
        start.setFocusPainted(false);
        start.setBorderPainted(false);
        start.setToolTipText("NEXT");

        buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/startButton.png")); // เพิ่มรูปปุ่ม
        start.setIcon(buttonIcon);

        //stop
        add(stop);
        stop.setBounds(0, 0, 200, 89);
        stop.setBackground(null);
        stop.setContentAreaFilled(false);
        stop.setFocusPainted(false);
        stop.setBorderPainted(false);
        stop.setToolTipText("NEXT");

        buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/closeButton.png")); // เพิ่มรูปปุ่ม
        stop.setIcon(buttonIcon);

        //reset
        add(reset);
        reset.setBounds(0, 0, 200, 89);
        reset.setBackground(null);
        reset.setContentAreaFilled(false);
        reset.setFocusPainted(false);
        reset.setBorderPainted(false);
        reset.setToolTipText("NEXT");

        buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/reButton.png")); // เพิ่มรูปปุ่ม
        reset.setIcon(buttonIcon);

        //bingo
        add(bingo);
        bingo.setBounds(0, 0, 200, 89);
        bingo.setBackground(null);
        bingo.setContentAreaFilled(false);
        bingo.setFocusPainted(false);
        bingo.setBorderPainted(false);
        bingo.setToolTipText("NEXT");

        buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/bingoButton.png")); // เพิ่มรูปปุ่ม
        bingo.setIcon(buttonIcon);

        //nextnum
        add(nextNum);
        nextNum.setBounds(0, 0, 200, 89);
        nextNum.setBackground(null);
        nextNum.setContentAreaFilled(false);
        nextNum.setFocusPainted(false);
        nextNum.setBorderPainted(false);
        nextNum.setToolTipText("NEXT");

        buttonIcon = new ImageIcon(getClass().getClassLoader().getResource("image/randomButton.png")); // เพิ่มรูปปุ่ม
        nextNum.setIcon(buttonIcon);

        //creates tooltips for buttons
        reset.setToolTipText("Resets the game");
        bingo.setToolTipText("I have bingo!");
        nextNum.setToolTipText("Call next number");
        start.setToolTipText("Starts/resumes the game");
        stop.setToolTipText("Stops/pauses the game");

        //adds ActionListeners to buttons
        buttonListener = new ButtonListener();
        reset.addActionListener(buttonListener);
        bingo.addActionListener(buttonListener);
        nextNum.addActionListener(buttonListener);
        start.addActionListener(buttonListener);
        stop.addActionListener(buttonListener);

        //layout = this.getContentPane();
        //layout.add(panel, "South");
        //setVisible(true);

        mouseListener = new MouseClickListener();
        timer = new MyTimer();
        DELAY = 3500;
        Timer t = new Timer(DELAY, timer);
        t.start();

        clickGrid = new BingoClick();

        bingoNumbers = new BingoNumbers();

        add(clickGrid);
        setVisible(true);

        add(bingoNumbers);
        setVisible(true);

        clickGrid.addMouseListener(mouseListener);
        setVisible(true);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //font anti-aliasing
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        int fontSize = 45;
        int bigFont = 80;
        Font font = new Font("SansSerif", Font.PLAIN, fontSize);
        g2.setFont(font);

        String call = "High Score :" + BingoScore.getHighScore();
        g2.drawString(call, 1020, 200);
    }
    //the timer
    class MyTimer implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (startGame && !winner) {
                bingoNumbers.generateNumber();
                clickGrid.isCalled();
                clickGrid.setWinnerMessage("");
                bingoNumbers.repaint();
            }
        }
    }

    //The Mouse listener
    class MouseClickListener implements MouseListener {
        public void mousePressed(MouseEvent event) {
            int x = event.getX();
            int y = event.getY();
            clickGrid.highlightSquare(x, y);
        }

        public void mouseReleased(MouseEvent event) {}

        public void mouseClicked (MouseEvent event) {}

        public void mouseEntered(MouseEvent event) {}

        public void mouseExited(MouseEvent event) {}
    }

    //the button listener
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            Object source = event.getSource();
            if (source == reset) { //resets the boards and the bingo number callings
                clickGrid.initializeGrid();
                bingoNumbers.numbers.clear();
                winner = false;
            } else if (source == bingo) { //checks if the human grid has won
                if (!winner) {
                    if (clickGrid.checkWin()) {
                        clickGrid.setWinnerMessage("WINNER: HUMAN");
                        winner = true;
                    } else {
                        clickGrid.setWinnerMessage("Sorry, you haven't gotten bingo.");
                    }
                }
            } else if (source == nextNum) { //calls the next bingo number and checks for winner
                if (!winner) {
                    bingoNumbers.generateNumber();
                    clickGrid.setWinnerMessage("");
                    clickGrid.isCalled();

                }
            } else if (source == start) { //starts the game
                startGame = true;
            } else if (source == stop) { //stops/pauses the game
                startGame = false;
            }
            clickGrid.repaint();
            bingoNumbers.repaint();
            layout.repaint();
        }
    }
}

