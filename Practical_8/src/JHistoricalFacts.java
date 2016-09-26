import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Created by Jake on 19/09/2016.
 */
public class JHistoricalFacts extends JFrame implements ActionListener {
    FlowLayout flow = new FlowLayout();
    JTextField textBox = new JTextField(25);
    JButton button = new JButton("Button");
    String[] quoteArray = new String[5];

    public JHistoricalFacts(String s)
    {
        super(s);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(textBox);
        add(button);
        button.addActionListener(this);

        super.setSize(300, 200);
        quoteArray[0] = "Q1";
        quoteArray[1] = "Q2";
        quoteArray[2] = "Q3";
        quoteArray[3] = "Q4";
        quoteArray[4] = "Q5";
        textBox.setText(quoteArray[0]);


    }
    public static void main(String[] args) {
        JHistoricalFacts frame = new JHistoricalFacts("More Shitty Quotes");
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        textBox.setText(quoteArray[new Random().nextInt(5)]);
    }
}
