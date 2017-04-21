
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class NavController 
{
    private NavModel model;
    private NavView view;
    private int touchdowns = 0;
    private int misses = 0;
    
    NavController(NavModel model, NavView iview) 
    {
        this.model = model;   
        this.view = iview;
        
        KeyboardListener();
        buttonlistener();
        
        //set player initial positions
        view.getIframe().getIp().getGp().P1.setText("P1");
        view.getIframe().getIp().getGp().P1.setBounds(model.getPloc().getplayerx(), model.getPloc().getplayery(), 80, 30);

        view.getIframe().getIp().getGp().OP1.setText("OP1");
        view.getIframe().getIp().getGp().OP1.setBounds(model.getop1_loc().getplayerx(), model.getop1_loc().getplayery(), 80, 30);
        
        view.getIframe().getIp().getGp().OP2.setText("OP2");
        view.getIframe().getIp().getGp().OP2.setBounds(model.getop2_loc().getplayerx(), model.getop2_loc().getplayery(), 80, 30);
        
        view.getIframe().getIp().getGp().OP3.setText("OP3");
        view.getIframe().getIp().getGp().OP3.setBounds(model.getop3_loc().getplayerx(), model.getop3_loc().getplayery(), 80, 30);
        
        //timer, timer listener
        //update position for the op1,2,3
        //view update the op graphics using model op1,2,3
    }
    
    public void buttonlistener() { //Selects player button's color (Choices for the running back team)
        view.getIframe().getIp().getTp().getcalcolor().addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {             
            view.getIframe().getIp().getGp().P1.setBackground(Color.YELLOW); //PSU team blue
            }
        } );
        
        view.getIframe().getIp().getTp().getosucolor().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {           
            view.getIframe().getIp().getGp().P1.setBackground(Color.RED); //OSU team blue
            }
        } );
        
        view.getIframe().getIp().getTp().getpsucolor().addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {            
            view.getIframe().getIp().getGp().P1.setBackground(Color.BLUE); //PSU team blue
            }
        } );
        
    }
    

    public NavModel getModel() {
        return model;
    }

    public void setModel(NavModel model) {
        this.model = model;
    }

    public NavView getView() {
        return view;
    }

    public void setView(NavView view) {
        this.view = view;
    }                 

    private void KeyboardListener()  
    {
        getView().getIframe().getIp().getGp().addKeyListener(new KeyAdapter() 
                {
                    public void keyPressed(KeyEvent evt) 
                    {
                    int kk = evt.getKeyCode(); //Player movements controled by keyboard
                         if(kk ==  evt.VK_LEFT)  {model.getPloc().moveleft();} 
                    else if(kk ==  evt.VK_RIGHT) {model.getPloc().moveright();}
                    else if(kk ==  evt.VK_UP)    {model.getPloc().moveup();}
                    else if(kk ==  evt.VK_DOWN)  {model.getPloc().movedown();}
                    view.getIframe().getIp().getGp().P1.setBounds(model.getPloc().getplayerx(), model.getPloc().getplayery(), 80, 30);
                    
                    if(model.getPloc().getplayery() == 50) //Checking for touchdowns
                        {
                        System.out.println("You Won");
                        touchdowns++; //Increasing touchdowns by 1
                        view.getIframe().getIp().getTp().gettouchdown().setText("Touchdowns: "+touchdowns);                       
                        }
                    }
                 }            
            ); 
        getView().getIframe().getIp().getGp().requestFocusInWindow();
    }
    
    private void opponentmovement() 
    {
        
    }
}
