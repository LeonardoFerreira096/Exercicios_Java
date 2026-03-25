package javacore.Hheranca.dominio;

import java.math.BigDecimal;

public class  Funcionario extends Pessoa {
    private BigDecimal salario;

    public  Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " +this.getNome()+ " recebi o salario de "+this.salario);
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

}
