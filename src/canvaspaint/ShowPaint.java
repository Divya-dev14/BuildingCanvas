
package canvaspaint;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;


public class ShowPaint {

  //instantiating drawarea
  CanvasArea canvasArea;

  //clear button declaration
  JButton clear_button;

  //instantiating actionlistener
  ActionListener actionListener = new ActionListener() {

  public void actionPerformed(ActionEvent e) {

      if(e.getSource() == clear_button)
      {
        //clearing draw area
        canvasArea.clear();
      }

    }
  };

  public static void main(String[] args)
  {
    // calling the method show_drawing
    new ShowPaint().show_drawing();
  }

  public void show_drawing()
  {
    // creating main frame
    JFrame frame = new JFrame("Canvas");

    //create container content
    Container content = frame.getContentPane();

    // set border layout on content pane
    content.setLayout(new BorderLayout());

    // creating a drawing area
    canvasArea = new CanvasArea();

    // add to content pane
    content.add(canvasArea, BorderLayout.CENTER);

    // create controls to apply colors
    JPanel controls = new JPanel();

    // applying clear
    clear_button = new JButton("Clear");

    //adding action listener
    clear_button.addActionListener(actionListener);

    //adding clear button
    controls.add(clear_button);

    // adding controls to content pane
    content.add(controls, BorderLayout.NORTH);

    // setting the width & size of frame to 650
    frame.setSize(650, 650);

    //  closing the frame operation
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // show the drawing result on frame
    frame.setVisible(true);

  }

}
