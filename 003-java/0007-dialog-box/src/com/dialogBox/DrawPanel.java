package com.dialogBox;

import javax.swing.*;
import java.awt.*;

//JPanel is superclass and DrawPanel is a subclass
public class DrawPanel extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0,0,width,height);

        g.drawLine(0,height,width,0);

        g.drawLine(0,height,200,0);


    }

}
