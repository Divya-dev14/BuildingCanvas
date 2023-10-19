# BuildingCanvas

A. Set up a Development Environment :
● We had downloaded Java 19.0.2 and used the environment 'Apache
NetBeans 16' as a code editor to compile and run our java program.
● For Image, Graphics, Mouse events libraries, Java Swing and AWT
were used. AWT is Java's library for graphics and user interface
widget toolkit and Swing is a further extension of AWT.
● We had created a project named 'CanvasPaint' and linked Java
Swing libraries to this project.
● Project Environment : MacBook Pro, Java 19.0.2, Apache NetBeans
16, Java AWT and Swing.


B. Instantiating a Canvas
● We had created a package called CanvasPaint and added two
classes : CanvasArea, ShowPaint to this package.
● In the show_drawing() method of ShowPaint class, at line number 48,
the canvas window frame was instantiated.
● To this window frame, the content, layout border and width, height of
650 has been set from line number 51 to 78.
● When we click on the Run button in NetBeans IDE, then a blank
canvas board will be initiated. Users will be able to draw on this
canvas board.

C.Listening for Mouse or Touch Events
● To handle events in Java we have used SWING and in that we have
two abstract classes “AddMouseListener” and
“AddMouseMotionListener” which has two functions which are
namely “mousePressed” {Line 39 CanvasArea.Java} and
“mouseDragged” {Line 48 CanvasArea.Java}
● We then used the function “mouseDragged” which captures the
movement when the user draws anything on the canvas with object
MouseEvent.
● mousePressed and mouseDragged are constantly storing the
coordinates of the mouse during the drag.
● Repaint method {Line 59 CanvasArea.Java} was used to clear screen
to repaint on the canvas so the user can redraw on the canvas
● paintComponent {Line 86 CanvasArea.Java} is used to render the
paint on canvas board

D. Clearing the Canvas.
● Clear {Line 70 CanvasArea.java} is a method which is used to set the
canvas back to original as it clears the drawing that the user has
made on the canvas using the mouse.
● SetPaint {Line 73 CanvasArea.java} is a function that sets the canvas
back to white
● The clear method is being called in the main file {ShowPaint.java Line
33} from where it clears the canvas using a button ‘Clear’ that is
made available for the user.
