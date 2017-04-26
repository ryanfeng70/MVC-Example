import java.awt.*;
import javax.swing.*;

public class InitiallPanel extends JPanel   {
    private TopPanel tp;
    private GamePanel gp;
    
    public InitiallPanel(TopPanel tp1, GamePanel gp1)   {
        super();
        setBackground(Color.green);
        BorderLayout bl = new BorderLayout();
        setLayout(bl);
        
        tp = tp1;
        gp = gp1;
        
        add(tp,BorderLayout.NORTH);
        add(gp, BorderLayout.CENTER);        
    }

    public TopPanel getTp() {
        return tp;
    }

    public void setTp(TopPanel tp) {
        this.tp = tp;
    }

    public GamePanel getGp() {
        return gp;
    }

    public void setGp(GamePanel gp) {
        this.gp = gp;
    }
    
}
