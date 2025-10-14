package academy.devdojo.maratonajava.javacore.IntroducaoMetodos.Dominio;

public class Calculadora {
    public void somarDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void multiplicarDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double dividirDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return (int) (num1/num2);
    }
    public double dividirDoisNumeros02(double num1, double num2) {
        if (num2 != 0) {
            return 0;
        }
        return 0;
    }
    public void dividirPorZero(double num1,double num2){
        if (num2 == 0){
            System.out.println("Nao existe divisao por zero");
        }
        else {
            System.out.println(num1/num2);
        }
    }
    public void mudarDoisNumeros(int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro de calculadora");
        System.out.println("Numero: " + numero1);
        System.out.println("Numero: " + numero2);

    }
    public void somarArrays(int [] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }

    }
}
