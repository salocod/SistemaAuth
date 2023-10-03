package General;
public abstract class Usuario {
    
    private static boolean isLogged;

    public static boolean getLog() {
        return isLogged;
    }

    public static boolean changeLog() {
        if(isLogged) {
            return isLogged = false;
        } else {
            return isLogged = true;
        }
    }

}
