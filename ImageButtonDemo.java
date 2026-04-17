//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
//is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
//implementing the event handling mechanism with addActionListener( ).


package Lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo extends JFrame implements ActionListener {

    JButton btnClock, btnHourGlass;
    JLabel message;

    public ImageButtonDemo() {
        // Set frame properties
        setTitle("Image Button Demo");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        btnClock = new JButton(clockIcon);
        btnHourGlass = new JButton(hourGlassIcon);

        // Add Action Listener
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Label to display message
        message = new JLabel("Press any button");

        // Add components to frame
        add(btnClock);
        add(btnHourGlass);
        add(message);

        setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClock) {
            message.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            message.setText("Hour Glass is pressed");
        }
    }

    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}