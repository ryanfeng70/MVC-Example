import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class NavController {
    private NavModel model;
    private NavView view;
    private Timer aimoves;
    private Timer checktackle;
    
    NavController(NavModel imodel, NavView iview)   {
        this.model = imodel;   
        this.view = iview;
        
        KeyboardListener();
        buttonlistener();
        view.setplayerpositions();
    
        view.getIframe().getIp().getTp().getslider().addChangeListener(new ChangeListener() { //Slider class
            public void stateChanged(ChangeEvent e) {  Object source = e.getSource();
                if (source == view.getIframe().getIp().getTp().getslider()) {
                    
                    view.getIframe().getIp().getTp().setspeed(view.getIframe().getIp().getTp().getslider().getValue());
                    aimoves.setDelay(view.getIframe().getIp().getTp().getspeed());
                    view.getIframe().getIp().getGp().requestFocusInWindow();
                    
                    } 
                }
            });
        
        aimoves = new Timer(model.getPloc().get_aimove_delay(), new ActionListener() { //AI to chase the main player
            public void actionPerformed(ActionEvent event) { //MVC redo: Got rid of Object obj = event because redundant
                model.ailogic(); 
                ai_setbounds_after_moving();         
            }            
        });
        aimoves.start();

        
        checktackle = new Timer(model.getPloc().getchecktackle_delay(), new ActionListener() { //Checking for tackles
            public void actionPerformed(ActionEvent e) {
                if( model.checkintersections()) { //Checks for opponent buttons touching main player button (tackle)
                    view.getIframe().getIp().getTp().increasemisses(); //Updates scoreboard
                    model.resetallplayers(); 
                    }   
                }
            });
            checktackle.start();
    
    }
    
    public void ai_setbounds_after_moving() {
        view.getIframe().getIp().getGp().OP1.setBounds(model.getop1_loc().getplayerx(),model.getop1_loc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );
        view.getIframe().getIp().getGp().OP2.setBounds(model.getop2_loc().getplayerx(),model.getop2_loc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );
        view.getIframe().getIp().getGp().OP3.setBounds(model.getop3_loc().getplayerx(),model.getop3_loc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );
    }
    
    public void buttonlistener() { //Selects player button's color (Choices for the running back team)
        view.getIframe().getIp().getTp().getcalcolor().addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {             
            view.getIframe().getIp().getGp().setcalcolor(); //Berkely team yellow
            view.getIframe().getIp().getGp().requestFocusInWindow(); //Makes focus go back to keyboard controls
            }
        });
        
        view.getIframe().getIp().getTp().getosucolor().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {           
            view.getIframe().getIp().getGp().setosucolor(); //OSU team red
            view.getIframe().getIp().getGp().requestFocusInWindow();
            }
        });
        
        view.getIframe().getIp().getTp().getpsucolor().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {            
            view.getIframe().getIp().getGp().setpsucolor(); //PSU team blue
            view.getIframe().getIp().getGp().requestFocusInWindow();
            }
        });
        
    }                

    public void KeyboardListener()  {
        view.getIframe().getIp().getGp().addKeyListener(new KeyAdapter()    {
            public void keyPressed(KeyEvent evt) {
                int kk = evt.getKeyCode(); //Player movements controled by keyboard
                
                    if(kk ==  evt.VK_LEFT)  {model.getPloc().moveleft();} 
               else if(kk ==  evt.VK_RIGHT) {model.getPloc().moveright();}
               else if(kk ==  evt.VK_UP)    {model.getPloc().moveup();}
               else if(kk ==  evt.VK_DOWN)  {model.getPloc().movedown();}
               
                view.getIframe().getIp().getGp().P1.setBounds(model.getPloc().getplayerx(), model.getPloc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );
                
                if(model.getPloc().getplayery() == model.getPloc().gettouchdownline_y() ) { //Checking for touchdowns at y = 50 (touchdown line)
                    view.getIframe().getIp().getTp().increasescore(); //Updating scorebord
                    model.resetallplayers();
                    }
                }
            }            
        ); 
        view.getIframe().getIp().getGp().requestFocusInWindow(); //Makes focus go back to keyboard controls
    } 

}
