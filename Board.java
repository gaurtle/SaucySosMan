 

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import javax.swing.*;
public class Board extends JPanel implements ActionListener,Runnable {
    Sos sos;
    Image img;
    Timer time;
    ImageIcon i;
    obstacle obst;
    obstacle obst1;
    boolean lose;
    public Board()
    {
        sos = new Sos();
        addKeyListener(new ActionListener());
        setFocusable(true);//this is for keybinding
        i = new ImageIcon("background.png");
        img = i.getImage();
        time = new Timer(2, this);//updates every 5 miliseconds
        time.start();
        obst = new obstacle(700,0, "obstacle.png");
        obst1 = new obstacle(400, -150 , "obstacle2.png");
    }
    public void actionPerformed(ActionEvent e)
    {
        checkCollisions();
        sos.move();
        repaint();
    }
    public void checkCollisions()
    {   
        Rectangle r1 = obst1.getBounds();
        Rectangle r2 = new Rectangle(obst1.getBounds());
        Rectangle r3 = new Rectangle(sos.getBounds());
        if(sos.getBounds().intersects(obst.getBounds())||sos.getBounds().intersects(obst1.getBounds()))
        {
            lose = true;
        }
    }
    public void paint(Graphics g)
    {
        if(lose)
        {
            System.exit(0);
        }
        if(sos.getX()>=1200)
        {
            System.exit(0);
            System.out.println("YOU WON CONGRODUOLATION");
        }
        super.paint(g);
        Graphics2D graphics = (Graphics2D) g;
        graphics.drawImage(img, 0, 0, null);
        graphics.drawImage(sos.getImage(), sos.getX(), sos.getY(), null);
        graphics.drawImage(obst.getImage(),obst.getX(),obst.getY(),null);
        graphics.drawImage(obst1.getImage(), obst1.getX(), obst1.getY(), null);
    }
    private class ActionListener extends KeyAdapter
    {
        public void keyReleased(KeyEvent e)
        {
            sos.keyReleased(e);
        }
        public void keyPressed(KeyEvent e)
        {
            sos.keyPressed(e);
        }
    }
    public void run()
    {
        
    }
}

