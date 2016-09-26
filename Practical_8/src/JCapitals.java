import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by Jake on 19/09/2016.
 */
public class JCapitals extends JFrame implements ItemListener {

    FlowLayout flow = new FlowLayout();
    JComboBox capital = new JComboBox();
    JLabel aLabel = new JLabel("Paulos's American Pie");
    String[] cities = {"cheese", "sausage", "pepperoni", "onion", "green pepper", "green olive", "black olive"};

    public JCapitals(String title) {
        super(title);
        setLayout(flow);
        capital.addItemListener(this);
        capital.addItem("cheese");
        capital.addItem("sausage");
        capital.addItem("pepperoni");
        capital.addItem("onion");
        capital.addItem("green pepper");
        capital.addItem("green olive");
        capital.addItem("black olive");
        add(capital);
        add(aLabel);

    }

    public static void main(String[] arguments)
    {
        JCapitals frame = new JCapitals("Capitals");
        frame.setSize(200, 150);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getSource();
        if(source == capital){
            aLabel.setText(cities[capital.getSelectedIndex()]);
        }
    }
}
