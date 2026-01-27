package execicios.java.introducao;

//crie variaveis para campos descritos entre <> e imprima a seguintte mensagem:
// eu <nome>, morando no endereco <endereco>, confirmo que recebi o salario de <salario>
// na data <data>

public class ExercicioTiposPrimitivos {
    public static void main(String[] args){
        String  nome = ("Leonardo");
        String  endereco = ("Rua a, lot messejana, N:30, Bairro: Paupina");
        double  salario = (3000);
        String data = ("26/01/2026");
        String relatorio = (" Eu " + nome + ", morando no endereço: " + endereco + ", confirmo que recebi o salario de " + salario + " reais na data " + data);

        System.out.println(relatorio);
    }

}
