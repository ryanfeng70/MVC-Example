import javax.swing.*;


public class InitialFrame extends JFrame

{
    private InitiallPanel cp;
    
    InitialFrame(InitiallPanel cp1)
    {
        super("MVC RunningBack Game");
        LayoutSetupMAC();
        
        cp = cp1;
        
        add(cp);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize (1000, 1000);
        setVisible(true);
    }
    public InitiallPanel getIp() {
        return cp;
    }

    public void setIp(InitiallPanel cp) {
        this.cp = cp;
    }
    
    void LayoutSetupMAC()
    {
    // On some MACs it might be necessary to have the statement below 
    //for the background color of the button to appear    
       try 
        {
          UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
         } catch (Exception e) 
         {
                e.printStackTrace();
          }                
    //------------------------------------------------------           
    }
    
}
