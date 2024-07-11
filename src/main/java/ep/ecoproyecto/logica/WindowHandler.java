package ep.ecoproyecto.logica;
import ep.ecoproyecto.gui.PanelJuego;
import ep.ecoproyecto.logica.net.packets.Packet01Disconnect;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
/**
 *
 * @author C-A-F
 */
public class WindowHandler implements WindowListener{
    
    private final PanelJuego pJuego;

    public WindowHandler(PanelJuego pJuego) {
        this.pJuego = pJuego;
        this.pJuego.frame.addWindowListener(this);
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Packet01Disconnect packet = new Packet01Disconnect(this.pJuego.jugador.getUsername());
        packet.writeData(this.pJuego.socketCliente);
    }

    @Override
    public void windowClosed(WindowEvent e) {
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
