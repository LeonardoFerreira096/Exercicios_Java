package javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private String endereco;
    private Professor professor;
    private Estudante[] estudantes;

    public void imprime() {
        System.out.println("Título: " + this.titulo);
        if (professor == null) return;
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("-------------");
        if (estudantes == null) return;
        for (Estudante estudante : estudantes) {
            System.out.println("Nome: " + estudante.getNome());
            System.out.println("Idade: " + estudante.getIdade());
        }
        System.out.println("-------------");
        System.out.println("Endereço: " + this.endereco);
    }

    public void adicionaEstudante(Estudante estudante) {
        if (estudantes == null) {
            estudantes = new Estudante[1];
            estudantes[0] = estudante;
        } else {
            Estudante[] novo = new Estudante[estudantes.length + 1];
            for (int i = 0; i < estudantes.length; i++) {
                novo[i] = estudantes[i];
            }
            novo[estudantes.length] = estudante;
            estudantes = novo;
        }
    }

    public Seminario(String titulo, String endereco, Professor professor) {
        this.titulo = titulo;
        this.endereco = endereco;
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}