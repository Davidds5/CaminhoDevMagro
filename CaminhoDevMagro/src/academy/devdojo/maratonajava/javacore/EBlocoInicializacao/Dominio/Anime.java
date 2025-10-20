package academy.devdojo.maratonajava.javacore.EBlocoInicializacao.Dominio;

public class Anime {
    private String nome;
    private int[] eps= {1, 2, 3,4 ,5 ,6 ,7 ,8 };

    // 1 - e alocado memoria para o objeto
    // 2 - cada atributo de classe e inicializada com valores defauts, ou seja null
    // 3 - bloco de inicializacao e executado
    // 4 - construtor e executado
    {
        // bloco de inicializacao
        System.out.println("Dentro do bloco");
    }

    public Anime() {

        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i +1;

        }
        for (int ep : eps){
            System.out.print(ep+" ");
        }


        }
    }

