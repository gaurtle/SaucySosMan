
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class ActionListener extends KeyAdapter
    {
        Sos sos = new Sos();
        public ActionListener()
        {
        }
        public void keyReleased(KeyEvent e)
        {
            sos.keyReleased(e);
        }
        public void keyPressed(KeyEvent e)
        {
            sos.keyPressed(e);
        }
    }