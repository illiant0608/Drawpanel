package listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowCloseListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        Tools.windowExit();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        Tools.windowExit();
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
