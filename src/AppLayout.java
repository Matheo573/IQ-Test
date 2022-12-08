/*
 * Class responsible for
 * creating, accessing and operating with
 * application layout (widgets)
 * 
 * for now it just creates the layout
 * later it will have some public fields / getters
 */
public class AppLayout {

    /*
     * Here you should declare private class fields
     * Each field will represent some widget
     * 
     * our widgets will be:
     * JFrame window: contains all the rest widgets
     * JPanel testPanel: 9x9 grid, contains tiles (JPanels) with pictures
     * JPanel optionPanel: JPanel with FlowLayout, contains 3 JButtons
     */

    /*
     * Contructor of class will
     * contruct the window, attach 
     * all the widgets to it and 
     * finally display the window
     * 
     * so when we write 
     * new AppLayout();
     * window appears
     */
    public AppLayout() {
        createWindow();
        createTestPanel();
        attachTilesToTestPanel();
        createOptionPanel();
        attachButtonsToOptionPanel();
        packAndShowWindow();
    }

    /*
     * The rest of the implementation is
     * a bunch of private functions
     * that operate on our private fields (widgets)
     * 
     * I think the names are pretty much
     * self-explonatory
     */
    private void createWindow() {

    }

    private void createTestPanel() {

    }

    private void createOptionPanel() {

    }

    private void attachTilesToTestPanel() {

    }

    private void attachButtonsToOptionPanel() {

    }

    private void packAndShowWindow() {

    }
}