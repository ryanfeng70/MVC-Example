class NavModel  {
    private playerlocation p1, op1, op2, op3;
    
    public NavModel()   {
        p1 = new playerlocation();
        op1 = new playerlocation();
        op2 = new playerlocation();
        op3 = new playerlocation();
        
        resetallplayers();
    }
    
    public void resetallplayers(){
        p1.setplayerx(450);
        p1.setplayery(800);
        
        op1.setplayerx(50);
        op1.setplayery(150);
        
        op2.setplayerx(450);
        op2.setplayery(150);
        
        op3.setplayerx(850);
        op3.setplayery(150);
    }
    
    public boolean checkintersections(){
        boolean tackled = false;
        
        if( p1.getrect().intersects(op1.getrect()) || p1.getrect().intersects(op2.getrect()) || p1.getrect().intersects(op3.getrect())) { //Checks for opponent buttons touching main player button (tackle)
            tackled = true;
        }
        
        return tackled;
    }
    
    public void ailogic(){
        int px = p1.getplayerx(); int py = p1.getplayery(); //Gets players' most recent location (xy coordinates)                  
        int op1_x = op1.getplayerx(); int op1_y = op1.getplayery();
        int op2_x = op2.getplayerx(); int op2_y = op2.getplayery();
        int op3_x = op3.getplayerx(); int op3_y = op3.getplayery();
            
        if(px > op1_x) { op1.moveright(); } //op1 moves
        if(py > op1_y) { op1.movedown();  }
        if(px < op1_x) { op1.moveleft();  }
        if(py < op1_y) { op1.moveup();    }
                    
        if(px > op2_x) { op2.moveright(); } //op2 moves
        if(py > op2_y) { op2.movedown();  }
        if(px < op2_x) { op2.moveleft();  }
        if(py < op2_y) { op2.moveup();    }
                    
        if(px > op3_x) { op3.moveright(); } //op3 moves
        if(py > op3_y) { op3.movedown();  }
        if(px < op3_x) { op3.moveleft();  }
        if(py < op3_y) { op3.moveup();    }
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
