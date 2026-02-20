package javacore.sobrecargademetodos.dominio;

public class TimeFutebol {
    private String nome;
    private String cidade;
    private int anofundacao;
    private  String apelidotime;

    public void init(String nome, String cidade, int anofundacao){
        this.nome = nome;
        this.cidade = cidade;
        this.anofundacao = anofundacao;

    }

    public void init(String nome, String cidade, int anofundacao, String apelidotime){
        this.init(nome,cidade,anofundacao);
        this.apelidotime = apelidotime;
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cidade);
        System.out.println(this.anofundacao + " - Ano de fundação");
        System.out.println(this.apelidotime + " - Apelido do Clube");
    }

    public void setApelidotime(String apelidotime) {
        this.apelidotime = apelidotime;
    }

    public String getApelidotime(){
        return this.apelidotime;
    }

    public  void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public  void setCidade(String cidade){
        this.cidade = cidade;
    }


    public  String getCidade(){
        return this.cidade;
    }

    public  void setAnoFundacao(int anofundacao){
        this.anofundacao = anofundacao;
    }

    public int getAnofundacao(){
        return this.anofundacao;
    }
}

