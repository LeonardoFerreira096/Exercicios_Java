package javacore.intrometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 3);
    }

    public  void subtraiDoisNumeros(){
        System.out.println(20 - 3);
    }

    //Metodo com parametro
    public  void multiplicarDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);

    }

    //metodo com retorno != de void(com saída mas sem retorno)
    public double dividirDoisNumeros(double num1, double num2){
        return num1 / num2;
    }
}
