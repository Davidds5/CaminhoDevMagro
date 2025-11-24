package academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Dominio;

public class LoginInvalidoExeptions extends Exception{
    public LoginInvalidoExeptions() {
        super("Login invalido");
    }

    public LoginInvalidoExeptions(String message) {
        super(message);
    }
}
