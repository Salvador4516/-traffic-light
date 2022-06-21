package task_enum;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Traffic extends JComponent implements KeyListener {

    Image green_light = new ImageIcon("src/task_enum/3.png").getImage();
    Image yellow_light = new ImageIcon("src/task_enum/2.png").getImage();
    Image red_light = new ImageIcon("src/task_enum/1.png").getImage();

    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        Traffic_Light traffic_light = new Traffic_Light();
        switch (traffic_light.RandomLight()) {
            case "traffic lights:red" -> gr.drawImage(red_light, 0, 0, 350, 550, null);
            case "traffic lights:yellow" -> gr.drawImage(yellow_light, 0, 0, 350, 550, null);
            case "traffic lights:green" -> gr.drawImage(green_light, 0, 0, 350, 550, null);
        }

    }


    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        JFrame j = new JFrame();
        j.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        j.setSize(350, 550);
        j.setVisible(true);
        j.add(traffic);
        j.add(new Traffic());
        j.addKeyListener(traffic);
        System.out.println("Press UP if green light\nPress DOWN if red light\nPress SHIFT if yellow light");


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("You went to the green");
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("You stayed in place");
        }
        if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
            System.out.println("You prepare for start");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }
}
