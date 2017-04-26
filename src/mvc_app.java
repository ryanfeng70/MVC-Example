
public class mvc_app {

    public static void main(String[] args) 
    {
        NavModel model = new NavModel();
        TopPanel tp = new TopPanel();
        GamePanel gp = new GamePanel();
        InitiallPanel ip = new InitiallPanel(tp, gp);
        InitialFrame frame = new InitialFrame(ip);
        NavView view = new NavView(model, frame);
        NavController controller = new NavController(model, view);
        
    }
    
}
