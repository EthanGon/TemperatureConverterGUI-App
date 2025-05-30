import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TempAppFrame extends JFrame implements ItemListener, ActionListener {

    private JButton convert = new JButton("Convert");
    private static JTextField valueText = new JTextField();

    private JLabel fromText = new JLabel("From: ");
    private JLabel toText = new JLabel("To: ");
    private JLabel answerLabel = new JLabel("Answer: ");
    private JLabel answerText = new JLabel();

    private Options o1 = new Options();
    private Options o2 = new Options();

    private static final String[] userChoices = new String[2];

    public TempAppFrame() {
        Font font = new Font("Serif", Font.BOLD, 25);
        Border labelBorder = BorderFactory.createLineBorder(Color.black);

        // Label and temp selection for "FROM" text
        fromText.setFont(font);
        fromText.setBorder(labelBorder);
        fromText.setBounds(10, 10, 80, 25);
        o1.setBounds(100, 10, 200, 25);

        // Label and temp selection for "TO" text
        toText.setFont(font);
        toText.setBorder(labelBorder);
        toText.setBounds(10, 40, 80, 25);
        o2.setBounds(100, 40, 200, 25);

        // Answer Label
        answerLabel.setFont(font);
        answerLabel.setBorder(labelBorder);
        answerLabel.setBounds(10, 150, 100, 25);

        answerText.setFont(font);
        answerText.setBorder(labelBorder);
        answerText.setBounds(10, 180, 200, 50);

        // User input settings
        valueText.setBorder(labelBorder);
        valueText.setFont(font);
        valueText.setBorder(labelBorder);
        valueText.setBounds(100, 80, 200, 25);
        valueText.setEditable(true);

        // Convert button settings
        convert.setFont(font);
        convert.addActionListener(this);
        convert.setFocusable(false);
        convert.setBounds(100, 120, 200, 25);

        // Adds label for "From" and "To", and options menu;
        this.add(fromText);
        this.add(toText);
        this.add(o1);
        this.add(o2);
        this.add(valueText);
        this.add(convert);
        this.add(answerLabel);
        this.add(answerText);

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
            userChoices[0] = o1.getSelectedItem().toString().charAt(0) + "";
            userChoices[1] = o2.getSelectedItem().toString().charAt(0) + "";

            String ans = String.valueOf(getTemp());
            answerText.setText(ans);

        }
    }

    public static double getTemp() {
        if (userChoices[0].equals("C")) {
            return TempMaf.celsiusConvert(Double.parseDouble(valueText.getText()), userChoices[1]);

        } else if (userChoices[0].equals("F")) {
            return TempMaf.fahrenheitConvert(Double.parseDouble(valueText.getText()), userChoices[1]);
        } else {
            return TempMaf.kelvinConvert(Double.parseDouble(valueText.getText()), userChoices[1]);
        }
    }

}
