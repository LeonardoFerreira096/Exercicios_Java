package javacore.blocosdeinializacao.dominio;

public class ClubeFutebol {
    private String nome;
    private int[] numerocamisa;
    // 1- alocado espcaço em memória do objeto
    // 2- cada atributo de classe é criado e inicializado com valores default ou oque for passado
    // 3- bloco de inicializacao é executado
    // 4 - construtor é exxecutado
    {
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

        for (int numerocamisa : this.numerocamisa) {
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
