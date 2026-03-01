package javacore.Dconstrutores.dominio;

public class TimeFutebol {
    private String nome;
    private String cidade;
    private int anofundacao;
    private  String apelidotime;
    private String estadio;

    //Construtor criado por mim!
    public TimeFutebol(String nome, String cidade, int anofundacao, String apelidotime){
        this();
        this.nome = nome;
        this.cidade = cidade;
        this.anofundacao = anofundacao;
        this.apelidotime = apelidotime;
    }

    public TimeFutebol(String nome, String cidade, int anofundacao, String apelidotime, String estadio){
        this(nome, cidade, anofundacao, apelidotime);
        this.estadio = estadio;
    }

    public TimeFutebol(){
        System.out.println("Dentro do construtor sem argumentos");
    }


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cidade);
        System.out.println(this.anofundacao + " - Ano de fundação");
        System.out.println(this.apelidotime + " - Apelido do Clube");
        System.out.println(this.estadio + " - Estadio");
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getEstadio() {
        return estadio;
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

