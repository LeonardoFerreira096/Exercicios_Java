package javacore.Isobrescrita.dominio;

public class Hq {
    private String nome;

    @Override
    public  String toString(){
        return "nome: " + nome;
    }


    public Hq(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
