import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TempAppFrame extends JFrame implements ItemListener {

    public TempAppFrame() {
        Options selectionOptions = new Options();
        selectionOptions.addItemListener(this);

        add(selectionOptions);

        // Settings for the frame
        this.setTitle("Temperature Converter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);



    }

    public void itemStateChanged(ItemEvent e) {

    }

}
