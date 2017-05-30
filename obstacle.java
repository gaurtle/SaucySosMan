
/**
 * Write a description of class obstacle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Rectangle;
import java.awt.*;
import javax.swing.ImageIcon;
public class obstacle
{
    Image img;
    int x, y;
    boolean isVisible=true;
    public obstacle(int X, int Y, String location)
    {
        x = X;
        y = Y;
        ImageIcon i = new ImageIcon(location);
        img = i.getImage();
    }
    public Rectangle getBounds()
    {
        return new Rectangle(x,y,50,100);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public boolean getVisible()
    {
        return isVisible;
    }
    public Image getImage()
    {
        return img;
    }
}
