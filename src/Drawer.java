import java.awt.*;

public class Drawer {
    
    /*
     * This method takes a shape with some
     * type, position, size and color
     * and draws it 
     * 
     * Please take a look on documentation of
     * java.awt.Graphics object
     */
    public static void drawShape(Graphics graphics, Shape shape) {
        /*
         * You will be drawing it using methods like
         * graphics.setColor(...)
         * graphics.fillRect(...)
         * graphics.getClipBounds().getWidth()
         * etc.
         * 
         * The mechanics of drawing on ANY widget:
         * 
         * We create an anonymous J{Any widget} class
         * 
         * var widget = new J(literally anything) () {
         *          
         *      // and here we override its public void paint() method
         *      @Override public void paint(Graphics graphics) {
         *          // creating some shapes and drawing them
         *          Shape triangle = new Shape("triangle", ...);
         *          Drawer.drawShape(graphics, triangle);
         *      }
         * }
         */
    }

}
