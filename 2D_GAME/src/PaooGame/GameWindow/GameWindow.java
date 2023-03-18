package PaooGame.GameWindow;

import PaooGame.Game;
import PaooGame.KeyHandler;
import PaooGame.Mouse.Mouse;
import PaooGame.Ui;
import PaooGame.entity.LifeCastel;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class GameWindow
{
    private JFrame  wndFrame;
    private String  wndTitle;
    private int     wndWidth;
    private int     wndHeight;
    public boolean verifiareTimer=false;

     Game gp;
    Graphics g;
    private Canvas  canvas;
    JLabel counterLabel;
    Font font1 = new Font("Arial", Font.PLAIN, 40);
    Timer timer = null;
    public int second;
    public int minute;
    String ddSecond, ddMinute;
    DecimalFormat dFormat = new DecimalFormat("00");
    public static boolean verificarePrintesa1=false;
    public static boolean verificarePrintesa2=false;
    public static boolean verificarePrintesa=false;
    public static boolean verificarePrintesa3=false;
    public static boolean verificareInamici=false;

    public GameWindow(String title, int width, int height,Game gp){
        wndTitle    = title;
        wndWidth    = width;
        wndHeight   = height;
        wndFrame    = null;
        this.gp=gp;

    }
    public void setKeyListener(KeyHandler keyH){
        wndFrame.addKeyListener(keyH);
    }
    public void setMouseListener(Mouse keyH){canvas.addMouseListener(keyH);
    }

    public void countdownTimer() {

        timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                second--;
                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);
                counterLabel.setText(ddMinute + ":" + ddSecond);
                if(second%2==0&&gp.life.verificareCastel1==0) {
                    LifeCastel.inamici1++;
                }
                if(second%2==0&&gp.life.verificareCastel2==0){
                    LifeCastel.inamici2++;
                }
                if(second%2==0&&gp.life.verificareCastel3==0){
                    LifeCastel.inamici3++;

                }

                if(second==-1) {
                    second = 59;
                    minute--;
                    ddSecond = dFormat.format(second);
                    ddMinute = dFormat.format(minute);
                    counterLabel.setText(ddMinute + ":" + ddSecond);
                }
                if(minute==0 && second==0) {
                    gp.gameState=gp.gameOver;
                    gp.stopMusic();
                    timer.stop();
                }
                if(minute==3&&second>=46&&second<58)
                {
                    verificarePrintesa=true;
                }
                else{
                    verificarePrintesa=false;
                }
                if(minute==3&&second>=54&&second<58)
                {
                    verificarePrintesa1=true;
                }
                else{
                    verificarePrintesa1=false;
                }
                if(minute==3&&second>=50&&second<54)
                {
                    verificarePrintesa2=true;
                }
                else{
                    verificarePrintesa2=false;
                }
                if(minute==3&&second>=46&&second<50)
                {
                    verificarePrintesa3=true;
                }
                else{
                    verificarePrintesa3=false;
                }

                if(minute==3&&second==30&&gp.life.verificarePermisiune){
                    verificareInamici=true;
                }

            }
        });
    }

    public void startTimer(int second,int minute){
        this.second =second;
        this.minute=minute;
        countdownTimer();
        timer.start();

    }
    public void start(){
        countdownTimer();
        timer.start();

    }
    public void stoptimer(){
        timer.stop();
    }
    public void BuildGameWindow()
    {
        if(wndFrame != null)
        {
            return;
        }

        wndFrame = new JFrame(wndTitle);
        wndFrame.setSize(wndWidth, wndHeight);
        wndFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wndFrame.setResizable(false);
        wndFrame.setLocationRelativeTo(null);
        wndFrame.setVisible(true);
        wndFrame.setFocusable(true);


        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(wndWidth, wndHeight));
        canvas.setMaximumSize(new Dimension(wndWidth, wndHeight));
        canvas.setMinimumSize(new Dimension(wndWidth, wndHeight));
        wndFrame.add(canvas);
        wndFrame.pack();

    }
    public void drawClock(String chr){


            counterLabel = new JLabel("");
            counterLabel.setBounds(0, 0, 150, 50);
            counterLabel.setHorizontalAlignment(JLabel.CENTER);
            counterLabel.setFont(font1);
            counterLabel.setText(chr);


            wndFrame.setVisible(true);
            wndFrame.add(counterLabel);
            wndFrame.add(canvas);
            wndFrame.pack();



    }
    public void removeClock()
    {
        wndFrame.remove(counterLabel);
    }


    public int GetWndWidth()
    {
        return wndWidth;
    }
    public int GetWndHeight()
    {
        return wndHeight;
    }
    public Canvas GetCanvas() {
        return canvas;
    }
}
