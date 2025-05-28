import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TempAppFrame extends JFrame implements ItemListener {

    JComboBox selection;

    public TempAppFrame() {
        selection = new JComboBox();
        String[] options = {"Celsius", "Fahrenheit", "Kelvin"};
        selection = new JComboBox(options);
        selection.addItemListener(this);
        selection.setBounds(10, 10, 100, 20);

        add(selection);



        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);



    }

    public void itemStateChanged(ItemEvent e) {

    }

}
