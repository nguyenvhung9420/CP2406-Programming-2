import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Jake on 19/09/2016.
 */
public class JBookQuote2 extends JFrame implements ActionListener {

    FlowLayout flow = new FlowLayout();
    JTextField textBox = new JTextField(25);
    JButton button = new JButton("Button");

    public JBookQuote2(String s)
    {
        super("Some Shitty Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(textBox);
        add(button);
        button.addActionListener(this);
        textBox.setText(s);
        super.setSize(300, 200);
    }
    public static void main(String[] args) {
        JBookQuote2 frame = new JBookQuote2("Quote");
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        textBox.setText("Some shitting book");
    }
}
