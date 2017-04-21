
class NavView
{
    private InitialFrame iframe;
    private NavModel model;
    
    NavView(NavModel model, InitialFrame frame) 
    {
        this.model = model;
        iframe = frame;
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
