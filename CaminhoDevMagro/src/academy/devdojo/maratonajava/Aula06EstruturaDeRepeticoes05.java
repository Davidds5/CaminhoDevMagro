package academy.devdojo.maratonajava;

public class Aula06EstruturaDeRepeticoes05 {
    // dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    // condicao valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);

        }

    }
}
