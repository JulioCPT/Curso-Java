import java.awt.*;
import javax.swing.*;

public class LinesRectsOvalsJPanel extends JPanel 
{
   // display various lines, rectangles and ovals
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      this.setBackground(Color.WHITE);

      g.setColor(Color.RED);
      g.drawLine(5, 30, 380, 30);
      g.setFont(new Font("Arial", Font.PLAIN, 22)); 
      g.drawString("Senac", 155, 25);

      g.setColor(Color.BLUE);
      g.drawRect(5, 40, 90, 55);
      g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22)); 
      g.drawString("Senac", 20, 73); g.fillRect(100, 40, 90, 55);
      g.fillRect(100, 40, 90, 55);
      g.setColor(Color.RED);
      g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 22)); 
      g.drawString("Senac", 117, 73); 


      g.setColor(Color.BLACK);
      g.fillRoundRect(195, 40, 90, 55, 50, 50);
      g.setColor(Color.YELLOW);
      g.setFont(new Font("Arial", Font.BOLD, 22));
      g.drawString("Senac", 207, 73); 
      g.setColor(Color.BLACK);
      g.setFont(new Font("Arial", Font.BOLD, 22)); 
      g.drawString("Senac", 303, 73); 
      g.drawRoundRect(290, 40, 90, 55, 20, 20);

      g.setColor(Color.GREEN);   
      g.draw3DRect(5, 100, 90, 55, true);
      g.setFont(new Font("Monospaced", Font.ITALIC, 22)); 
      g.drawString("Senac", 15, 133); 
      g.fill3DRect(100, 100, 90, 55, false);
      g.setColor(Color.BLUE);
      g.setFont(new Font("Monospaced", Font.ITALIC, 22)); 
      g.drawString("Senac", 110, 133); 

      g.setColor(Color.MAGENTA);
      g.drawOval(195, 100, 90, 55);
      g.setFont(new Font("SansSerif", Font.PLAIN, 22)); 
      g.drawString("Senac", 208, 133);
      g.fillOval(290, 100, 90, 55);
      g.setColor(Color.BLACK);
      g.setFont(new Font("SansSerif", Font.PLAIN, 22)); 
      g.drawString("Senac", 302, 133);
   } 
} // end class LinesRectsOvalsJPanel