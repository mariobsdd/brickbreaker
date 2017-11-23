/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbreaker;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author mario
 */
public class Main extends JFrame implements Constants {
    
    //Variables
	private static JFrame frame;
	private static Board board;
	private static Container pane;
	private static Dimension dim;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Set look and feel to that of OS
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        frame = new JFrame("Rompe Ladrillos");
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        board = new Board(WINDOW_WIDTH, WINDOW_HEIGHT);

        pane = frame.getContentPane();
        pane.add(board);

        //Place frame in the middle of the screen
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

        //Sets the icon of the program
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("img/Icon.png"));

        frame.setVisible(true);
    } 
}
