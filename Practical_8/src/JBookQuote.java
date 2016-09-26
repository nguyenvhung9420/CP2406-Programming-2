import javax.swing.*;
import java.awt.*;


/**
 * Created by Jake on 19/09/2016.
 */
public class JBookQuote extends JFrame{

    FlowLayout flow = new FlowLayout();
    JTextField textBox = new JTextField(25);

    public JBookQuote(String s)
    {
        super("Some Shitty Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(textBox);
        textBox.setText(s);
        super.setSize(100, 200);
    }
    public static void main(String[] args) {
        JBookQuote frame = new JBookQuote("Quote");
        frame.setVisible(true);
    }




}
