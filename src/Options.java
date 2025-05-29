import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Options extends JComboBox implements ItemListener {
    public Options() {
        String[] options = {"Celsius", "Fahrenheit", "Kelvin"};
        this.addItem(options[0]);
        this.addItem(options[1]);
        this.addItem(options[2]);

        this.addItemListener((ItemListener) this);
    }
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println(e.getItem().toString());
        }
    }




}
