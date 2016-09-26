import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jake on 19/09/2016.
 */
public class JFrameDisableButton extends JFrame implements ActionListener {
    FlowLayout flow = new FlowLayout();
    JButton button = new JButton("Click Me");

    public JFrameDisableButton(String s)
    {
        super(s);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(button);
        button.addActionListener(this);
        super.setSize(300, 100);
    }
    public static void main(String[] args) {
        JFrameDisableButton frame = new JFrameDisableButton("Click the Button");
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setEnabled(false);
        button.setText("Y u do");
    }

}
