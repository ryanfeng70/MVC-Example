import java.awt.Color;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

class TopPanel extends JPanel {
    private JButton touchdown;
    private JButton missed;
    private JButton psucolor;
    private JButton osucolor;
    private JButton calcolor;
    private JSlider slider;
    private int min = 100;     //Fastest delay
    private int max = 1700;    //Slowest delay
    private int initial = 900; //Initial delay (halfway between)
    private int speed = initial;
    private int touchdownscore = 0;
    private int miss_score = 0;
    
    TopPanel()
    {
        super();
        setBackground(Color.gray);
        touchdown = new JButton("Touchdowns: " + touchdownscore );
        missed = new JButton("Tackles: " + miss_score);
        psucolor = new JButton("PSU Colors");
        osucolor = new JButton("OSU Colors");
        calcolor = new JButton("CAL Colors");
        
        slider = new JSlider(JSlider.HORIZONTAL, min, max, initial);
        slider.setName("Opponent Speed");
        slider.setMajorTickSpacing(200);
        Hashtable labelTable = new Hashtable(); //this is how oracle docs said I should label JSlider ticks
        labelTable.put( new Integer( min ), new JLabel("Faster") );
        labelTable.put( new Integer( min + 750 ), new JLabel("(Opponent's Speed)") );
        labelTable.put( new Integer( max ), new JLabel("Slower") );
        slider.setLabelTable( labelTable );
        
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        
        add(touchdown);
        add(missed);
        add(psucolor);
        add(osucolor);
        add(calcolor);
        add(slider);
    }
    
    public void increasescore(){
        touchdownscore++;
        touchdown.setText("Touchdowns: " + touchdownscore);
    }
    
    public void increasemisses(){
        miss_score++;
        missed.setText("Tackles: " + miss_score);
    }

    public JSlider getslider() {
        return slider;
    }
    
    public int getmin(){
        return min;
    }
    
    public int getmax(){
        return max;
    }
    
    public int getspeed(){
        return speed;
    }
    
    public void setspeed(int newspeed){
        speed = newspeed;
    }
    
    public JButton gettouchdown() {
        return touchdown;
    }

    public void settouchdown(JButton button1) {
        this.touchdown = button1;
    }
    
    public JButton getmisses() {
        return missed;
    }

    public void setmisses(JButton button1) {
        this.missed = button1;
    }
    
    public JButton getcalcolor() {
        return calcolor;
    }
    
    public JButton getosucolor() {
        return osucolor;
    }
    
    public JButton getpsucolor() {
        return psucolor;
    }
    
}
