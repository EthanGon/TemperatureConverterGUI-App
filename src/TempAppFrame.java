import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TempAppFrame extends JFrame implements ItemListener {

    public TempAppFrame() {
        Font font = new Font("Serif", Font.BOLD, 25);
        Border label1Border = BorderFactory.createLineBorder(Color.black);
        JLabel fromText = new JLabel("From: ");
        fromText.setFont(font);
        fromText.setBorder(label1Border);
        Options o1 = new Options();

        fromText.setBounds(10, 10, 80, 25);
        o1.setBounds(100, 10, 200, 25);

        Font font2 = new Font("Serif", Font.BOLD, 25);
        Border label2Border = BorderFactory.createLineBorder(Color.black);
        JLabel toText = new JLabel("To: ");
        toText.setFont(font2);
        toText.setBorder(label2Border);
        Options o2 = new Options();

        toText.setBounds(10, 40, 80, 25);
        o2.setBounds(100, 40, 200, 25);

        this.add(fromText);
        this.add(o1);

        this.add(toText);
        this.add(o2);


        // Settings for the frame
        this.setTitle("Temperature Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);




    }

    public void itemStateChanged(ItemEvent e) {

    }

}
