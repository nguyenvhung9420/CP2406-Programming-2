// Creates a frame with a specified size
// Twice as tall as wide
// The size is a constructor argument
import javax.swing.*;
import java.awt.*;

public class DebugFourteen1 extends JFrame
{
   public DebugFourteen1(int size)
   {
      super("This is my frame");
      super.setSize(size, size * 2);
      super.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   }
   public static void main(String[] args)
   {
      DebugFourteen1 frame = new DebugFourteen1(100);
      frame.setVisible(true);
   } 
}
