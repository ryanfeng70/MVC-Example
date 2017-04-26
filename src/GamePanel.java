import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GamePanel extends JPanel  {
    JButton P1 = new JButton();
    JButton OP1 = new JButton();
    JButton OP2 = new JButton();
    JButton OP3 = new JButton();
    JLabel goaline = new JLabel("----------------------Goal Line-----------------------------------------------Goal Line-----------------------------------------------Goal Line-----------------------------------------------Goal Line------------------------------------------------------------------");
    JLabel starting_line = new JLabel("----------------------Starting Line-----------------------------------------------Starting Line-----------------------------------------------Starting Line-----------------------------------------------Starting Line------------------------------------------------------------------");

    GamePanel() {
        super();
        setBackground(Color.green);
        setLayout(null);
        
        add(goaline); //Placing goal line at y = 50
        goaline.setBounds(new Rectangle(0, 50, 1000, 30)); 
        
        add(starting_line); 
        starting_line.setBounds(new Rectangle(0, 800, 1000, 30)); //Change 800 to 400 for Richard's computer, if that helps Richard
        
        add(P1);
        add(OP1);
        add(OP2);
        add(OP3);
    }
    
    public void setpsucolor() {
        P1.setBackground(Color.BLUE);
    }
    
    public void setosucolor() {
        P1.setBackground(Color.RED);
    }
    
    public void setcalcolor() {
        P1.setBackground(Color.YELLOW);
    }
    
    public JButton getP1() {
        return P1;
    }
    
    public JButton getOP1() {
        return OP1;
    }
    
    public JButton getOP2() {
        return OP2;
    }
    
    public JButton getOP3() {
        return OP3;
    }
    
}
