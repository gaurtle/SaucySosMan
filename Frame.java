
/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class Frame
{
    public static void main(String[] args)
    {
        Board boar = new Board();
        JFrame frame = new JFrame("SuperSosMan");
        frame.add(boar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400,800);
        frame.setVisible(true);
    }
}
