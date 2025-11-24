package academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Teste;

import academy.devdojo.maratonajava.javacore.Oexeptions.Exeptions.Dominio.LoginInvalidoExeptions;

import java.util.Scanner;

public class LoginInvalidoTeste01{
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExeptions e) {
            throw new RuntimeException(e);
        }
    }
    public static void logar() throws LoginInvalidoExeptions{
        Scanner sc = new Scanner(System.in);
        String nomeBD = "Goku";
        String senhaBD = "ssj";
        System.out.println("Usuario: ");
        String usuarioDG = sc.nextLine();
        System.out.println("Senha: ");
        String senhaDG = sc.nextLine();
        if (!nomeBD.equals(usuarioDG) || !senhaBD.equals(senhaDG)){
            throw new LoginInvalidoExeptions("Usuario ou senha Invalido");
        }
        System.out.println("Usuario logado com sucesso");
    }

}
