
package canvaspaint;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.Graphics2D;


public class CanvasArea extends JComponent {

    // coordinates of cursor/mouse
  private int previous_X,previous_Y,current_X, current_Y ;

    // Image in which we're going to draw
  private Image figure;

    // g2 is an object of Graphics
  private Graphics2D graphics_obj;


  public CanvasArea() {

    setDoubleBuffered(false);

    addMouseListener(new MouseAdapter() {

      public void mousePressed(MouseEvent event) {

        // storing coordinates of mouse
        previous_X = event.getX();
        previous_Y = event.getY();
      }
    });

    addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseDragged(MouseEvent current_obj) {

        // storing coordinates of mouse during mouse drag
        current_X = current_obj.getX();
        current_Y = current_obj.getY();

        if (graphics_obj != null)
        {
          // draw line if g2 context not null
          graphics_obj.drawLine(previous_X, previous_Y, current_X, current_Y);
          // clear screen to repaint
          repaint();
          // store current coords x,y as olds x,y
          previous_X = current_X;
          previous_Y = current_Y;
        }
      }
    });
  }


  // method to clear
  public void clear() {

    // set paint to white color
    graphics_obj.setPaint(Color.white);

    // clear everything and fill in rectangle
    graphics_obj.fillRect(0, 0, getSize().width, getSize().height);

    // set paint to black color
    graphics_obj.setPaint(Color.black);

    // repainting
    repaint();
  }

   //method for paint components
  protected void paintComponent(Graphics obj) {

      // null image check
      if (figure == null)
      {
       // creating the image
      figure = createImage(getSize().width, getSize().height);

      graphics_obj = (Graphics2D) figure.getGraphics();

      // enable rendering
      graphics_obj.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

      // clear drawn area
      clear();

      }
      //setting back to null
      obj.drawImage(figure, 0, 0, null);
  }


}
