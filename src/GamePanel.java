
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GamePanel extends JPanel
{
    JButton P1 = new JButton();
    JButton OP1 = new JButton();
    JButton OP2 = new JButton();
    JButton OP3 = new JButton();
    JLabel goaline = new JLabel("----------------------Goal Line-----------------------------------------------Goal Line-----------------------------------------------Goal Line-----------------------------------------------Goal Line------------------------------------------------------------------");
    
    int playerspeed = 10;
    private int playerx = 500;
    
    GamePanel()
    {
        super();
        setBackground(Color.green);
        setLayout(null);
        
        add(goaline); //Placing goal line at y = 50
        goaline.setBounds(new Rectangle(0, 50, 1000, 30)); 
        
        add(P1);
        add(OP1);
        add(OP2);
        add(OP3);
    }
    
    public void colorchoices(int playercolor) {
        if(playercolor == 1) {
            P1.setBackground(Color.BLUE);
        }
        else if(playercolor == 2) {
            P1.setBackground(Color.RED);
        }
        else if(playercolor == 3) {
            P1.setBackground(Color.YELLOW);
        }
    }
    
    public JButton getP1() {
        return P1;
    }
    
    public JButton getOP1() {
        return OP1;
    }
    
    public int getplayerx() {
        return playerx;
    }
    
    public void setplayerx(int x) {
        this.playerx = x;
    }
    
    
}
