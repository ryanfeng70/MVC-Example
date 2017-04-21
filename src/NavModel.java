
class NavModel 
{
    private playerlocation p1, op1, op2, op3;
    
    
    public NavModel() 
    {
        p1 = new playerlocation();
        op1 = new playerlocation();
        op2 = new playerlocation();
        op3 = new playerlocation();
        
        p1.setplayerx(400);
        p1.setplayery(800);
        
        op1.setplayerx(50);
        op1.setplayery(150);
        
        op2.setplayerx(450);
        op2.setplayery(150);
        
        op3.setplayerx(850);
        op3.setplayery(150);
    }

    public playerlocation getPloc() {
        return p1;
    }

    public void setPloc(playerlocation player1) {
        this.p1 = player1;
    }
    
    public playerlocation getop1_loc() {
        return op1;
    }

    public void setop1_loc(playerlocation player1) {
        this.op1 = player1;
    }
    
    public playerlocation getop2_loc() {
        return op2;
    }

    public void setop2_loc(playerlocation player1) {
        this.op2 = player1;
    }
    
    public playerlocation getop3_loc() {
        return op3;
    }

    public void setop3_loc(playerlocation player1) {
        this.op3 = player1;
    }
    
}
