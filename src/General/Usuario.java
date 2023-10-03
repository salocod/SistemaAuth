package General;
public class Usuario {
    
    private boolean isLogged;

    public Usuario() {
        
    }

    public boolean getLog() {
        return isLogged;
    }

    public boolean changeLog() {
        if(isLogged) {
            return isLogged = false;
        } else {
            return isLogged = true;
        }
    }

}
