package javacore.intrometodos.dominio;

//Cria os atributos
//Cria o construtor que recebe os dados
//Cria métodoimprime (mostra os dados)
//Cria métodocalcularMedia (soma/divide/mostra)
//Na classe Main, cria 3 funcionários e testa os métodos

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;



    public Funcionario(String nome, int idade, double salario1, double salario2, double salario3) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = new double[]{salario1, salario2, salario3};
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios[0]);
        System.out.println(this.salarios[1]);
        System.out.println(this.salarios[2]);
    }

    public void calcularMedia() {
        double media;

        media = (this.salarios[0] + this.salarios[1] + this.salarios[2]) / 3;

        System.out.println(media);
    }

}

