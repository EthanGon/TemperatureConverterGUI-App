import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TempAppFrame extends JFrame implements ItemListener, ActionListener {

    JButton convert = new JButton("Convert");
    JTextField valueText = new JTextField();

    JLabel fromText = new JLabel("From: ");
    JLabel toText = new JLabel("To: ");

    public TempAppFrame() {
        Font font = new Font("Serif", Font.BOLD, 25);
        Border labelBorder = BorderFactory.createLineBorder(Color.black);

        // Label and temp selection for "FROM" text

        fromText.setFont(font);
        fromText.setBorder(labelBorder);
        Options o1 = new Options();
        fromText.setBounds(10, 10, 80, 25);
        o1.setBounds(100, 10, 200, 25);

        // Label and temp selection for "TO" text

        toText.setFont(font);
        toText.setBorder(labelBorder);
        toText.setBounds(10, 40, 80, 25);
        Options o2 = new Options();
        o2.setBounds(100, 40, 200, 25);

        valueText.setBorder(labelBorder);
        valueText.setFont(font);
        valueText.setBorder(labelBorder);
        valueText.setBounds(100, 80, 200, 25);
        valueText.setEditable(true);
        
        convert.setFont(font);
        convert.addActionListener(this);
        convert.setFocusable(false);
        convert.setBounds(100, 120, 200, 25);

        // Adds label for "From" and "To", and options menu;
        this.add(fromText);
        this.add(o1);
        this.add(toText);
        this.add(o2);
        this.add(valueText);
        this.add(convert);


        // Settings for the frame
        ImageIcon icon = new ImageIcon("temperature.png");
        this.setIconImage(icon.getImage());

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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            System.out.println("Convert button pressed");
            String from = valueText.getText();
            String to = valueText.getText();
            System.out.println("From: " + from);
            System.out.println("To: " + to);
        }
    }

}
