package com.company;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    public static void main(String args[])
    {
        MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((int)(screenSize.getWidth()/2 - frame.getSize().getWidth()/2), (int)(screenSize.getHeight()/2 - frame.getSize().getHeight()/2));




        frame.setResizable(false);
        frame.setTitle("Primul Gui Fereastra");//gui.setTitle("platformer game");
        frame.setVisible(true);

  /*      JTextField motto1 = new JTextField();
        JButton b = new JButton("Adauga");
        b. setBounds(50, 150, 100, 30);
        frame.add(b);
        frame.add(motto1);*/


      //  this.add(panel);
      //  this.add..
       // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);




    }
}
