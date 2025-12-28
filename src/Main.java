
class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirInformacoes() {
        System.out.println("INFORMAÇÕES DO LIVRO ");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Número de Páginas: " + numeroPaginas);
        System.out.println("\n");
    }

    public boolean ehLivroAntigo() {
        int anoAtual = 2025;
        int idade = anoAtual - anoPublicacao;
        return idade > 50;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}


public class Main {
    public static void main(String[] args) {

        Livro livro1 = new Livro("1984", "George Orwell", 1949, 328);
        Livro livro2 = new Livro("Clean Code", "Robert Martin", 2008, 464);
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis", 1899, 256);


        livro1.exibirInformacoes();
        livro2.exibirInformacoes();
        livro3.exibirInformacoes();

        System.out.println("O livro '" + livro1.getTitulo() + "' é antigo? " +
                (livro1.ehLivroAntigo() ? "Sim" : "Não"));

        System.out.println("O livro '" + livro2.getTitulo() + "' é antigo? " +
                (livro2.ehLivroAntigo() ? "Sim" : "Não"));

        System.out.println("O livro '" + livro3.getTitulo() + "' é antigo? " +
                (livro3.ehLivroAntigo() ? "Sim" : "Não"));

        System.out.println("\n--- Modificando o número de páginas do livro 2 ---");
        livro2.setNumeroPaginas(500);
        System.out.println("Novo número de páginas: " + livro2.getNumeroPaginas());
    }
}
