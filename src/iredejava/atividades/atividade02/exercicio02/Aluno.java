package iredejava.atividades.atividade02.exercicio02;

//2. Crie uma classe Aluno com atributos privados nome e nota. Implemente métodos get
//e set para ambos. No método setNota, adicione uma vericação para garantir que o
//valor da nota esteja entre 0 e 10. Caso esteja fora desse intervalo, não permita a
//alteração.

public class Aluno {
    private String nome;
    private int nota ;

    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.setNota(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if (nota >= 0 && nota <= 10){
            System.out.println("Nota Alterada com sucesso!");
            this.nota = nota;
        } else{
            System.out.println("Não é possivel alterar a nota");
        }

    }
}
