package javacore.Fmodificadorstatic.dominio;

public class ClubeFutebol {
    private String nome;
    private static int[] numerocamisa;
    //1
    // 2- alocado espcaço em memória do objeto
    // 3- cada atributo de classe é criado e inicializado com valores default ou oque for passado
    // 4- bloco de inicializacao é executado
    // 5 - construtor é exxecutado
    static {

        numerocamisa = new int[99];
        System.out.println("dentro do bloco de inicializacao");
        for (int i = 0; i < numerocamisa.length ; i++) {
            numerocamisa[i] = i + 1;
        }
    }
    public ClubeFutebol(String nome) {
        this.nome = nome;
    }

    public ClubeFutebol() {

        for (int numerocamisa : ClubeFutebol.numerocamisa) {
            System.out.print(numerocamisa + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getNumerocamisa() {
        return numerocamisa;
    }
}
