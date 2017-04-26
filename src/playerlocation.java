import java.awt.Rectangle;

class playerlocation {
    private int P1_x ;
    private int P1_y ;
    private int buttonwidth_x = 80; //MVC Redo: made button dimensions variables that can be altered, rather than hard coding
    private int buttonheight_y = 30;
    private int delay = 10;
    private int checktackle_delay = 5;
    private int aimove_delay = 1000; //Initial speed of opponents
    private int touchdownline_y = 50;

    public Rectangle getrect(){
        Rectangle rect = new Rectangle(P1_x, P1_y, buttonwidth_x, buttonheight_y);
        return rect;
    }
    
    public int getbuttonwidth_x() {
        return buttonwidth_x;
    }
    
    public int getbuttonheight_y() {
        return buttonheight_y;
    }
    
    public int gettouchdownline_y(){
        return touchdownline_y;
    }
    
    public void settouchdownline_y(int newline){
        this.touchdownline_y = newline;
    }
    
    public int getchecktackle_delay(){
        return checktackle_delay;
    }
    
    public int get_aimove_delay(){
        return aimove_delay; 
    }
    
    public void setplayerx(int i){
        this.P1_x = i;     
    }
    
    public int getplayerx() {
        return P1_x;
    }
    
    public void setplayery(int i){
        this.P1_y = i;     
    }
    
    public int getplayery() {
        return P1_y;
    }
    
    public void setdelay(int del){
        this.delay = del;
    }
    
    public int getdelay(){
        return delay;
    }
    
    public void moveleft() {
        P1_x = P1_x - delay;
    }
    
    public void moveright() {
        P1_x = P1_x + delay;
    }
    
    public void moveup() {
        P1_y = P1_y - delay;
    }
    
    public void movedown() {
        P1_y = P1_y + delay;
    }
    
}
