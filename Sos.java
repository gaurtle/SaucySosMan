 

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Sos {
    int x, dx;//x coord and change in x
    int y;//y coord and change in y
    double dy;
    Image sos;
    public Sos()
    {
        ImageIcon i = new ImageIcon("Sos.png");
        sos = i.getImage();
        x = 75;
        y = 172;
        dy = 0;
    }
    public Rectangle getBounds()
    {
        return new Rectangle(x,y,100,200);
    }
    public void move()
    {
        x+=dx;
        y+=dy;
        if(y >=  172)
        {
            dy = 0;
        }
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Image getImage()
    {
        return sos;
    }
    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT)
        {
            dx = -2;
        }
        if(key == KeyEvent.VK_RIGHT)
        {
            dx = 2;
        }
        if(key == KeyEvent.VK_A)
        {
            dx = -2;
        }
        if(key == KeyEvent.VK_D)
        {
            dx = 2;
        }
        if(key == KeyEvent.VK_UP)
        {
            dy = -5;
        }
        if(key == KeyEvent.VK_W)
        {
            dy = -5;
        }
    }
    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_LEFT)
        {
            dx = 0;
        }
        if(key == KeyEvent.VK_RIGHT)
        {
            dx = 0;
        }
        if(key == KeyEvent.VK_A)
        {
            dx = 0;
        }
        if(key == KeyEvent.VK_D)
        {
            dx = 0;
        }
        if(key == KeyEvent.VK_UP)
        {
            dy = 2;
        }
        if(key == KeyEvent.VK_W)
        {
            dy = 2;
        }
    }
}
