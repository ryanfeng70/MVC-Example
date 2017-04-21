
class playerlocation {
    private int P1_x ;
    private int P1_y ;
    int team;
    
    public void setteamColor(int i){
        this.team = i;     
    }
    
    public int getteamColor() {
        return team;
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
    
    public void moveleft() {
        P1_x = P1_x - 10;
    }
    
    public void moveright() {
        P1_x = P1_x + 10;
    }
    
    public void moveup() {
        P1_y = P1_y - 10;
    }
    
    public void movedown() {
        P1_y = P1_y + 10;
    }
    
}
