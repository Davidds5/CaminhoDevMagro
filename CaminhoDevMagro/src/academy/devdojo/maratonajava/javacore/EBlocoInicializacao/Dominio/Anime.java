package academy.devdojo.maratonajava.javacore.EBlocoInicializacao.Dominio;

public class Anime {
    private String nome;
    private static int[] eps = {1, 2, 3, 4, 5, 6, 7, 8};

    // 0 - o bloco de inicializacao e iniciado quando a JVM carrega a class
    // 1 - e alocado memoria para o objeto
    // 2 - cada atributo de classe e inicializada com valores defauts, ou seja null
    // 3 - bloco de inicializacao e executado
    // 4 - construtor e executado

    static {
        System.out.println("Dentro do bloco");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;

        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int ep : eps) {
            System.out.print(ep + " ");
        }
    }
    static {
        System.out.println("Bloco de inicializacao static 1");
    }

    static {
        System.out.println("Bloco de inicializacao static 2");

    }
    static {
        System.out.println("Bloco de inicializacao static 3");

    }
    {
        System.out.println("Bloco de inicializacao nao static ");

    }
}





