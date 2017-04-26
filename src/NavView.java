
class NavView
{
    private InitialFrame iframe;
    private NavModel model;
    
    NavView(NavModel model, InitialFrame frame) 
    {
        this.model = model;
        this.iframe = frame;
    }
    
    public void setplayerpositions(){
        iframe.getIp().getGp().P1.setText("P1");
        iframe.getIp().getGp().P1.setBounds(model.getPloc().getplayerx(), model.getPloc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );

        iframe.getIp().getGp().OP1.setText("OP1");
        iframe.getIp().getGp().OP1.setBounds(model.getop1_loc().getplayerx(), model.getop1_loc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );
        
        iframe.getIp().getGp().OP2.setText("OP2");
        iframe.getIp().getGp().OP2.setBounds(model.getop2_loc().getplayerx(), model.getop2_loc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );
        
        iframe.getIp().getGp().OP3.setText("OP3");
        iframe.getIp().getGp().OP3.setBounds(model.getop3_loc().getplayerx(), model.getop3_loc().getplayery(), model.getPloc().getbuttonwidth_x(), model.getPloc().getbuttonheight_y() );
    }

    public InitialFrame getIframe() {
        return iframe;
    }

    public void setIframe(InitialFrame iframe) {
        this.iframe = iframe;
    }

    public NavModel getModel() {
        return model;
    }

    public void setModel(NavModel model) {
        this.model = model;
    }
    
}
