package execicios.java.introducao;

public class ExeDeSwitchCase {
    public static void main(String[] args) {
        byte Dia = 4;
        String nomeDia = "";

        switch (Dia) {
            case 1:
                nomeDia = "Domingo";
                System.out.println(nomeDia);
                break;
            case 2:
                nomeDia = "Segunda";
                System.out.println(nomeDia);
                break;
            case 3:
                nomeDia = "Terça";
                System.out.println(nomeDia);
                break;
            case 4:
                nomeDia = "Quarta";
                System.out.println(nomeDia);
                break;
            case 5:
                nomeDia = "Quinta";
                System.out.println(nomeDia);
                break;
            case 6:
                nomeDia = "Sexta";
                System.out.println(nomeDia);
                break;
            case 7:
                nomeDia = "Sábado";
                System.out.println(nomeDia);
                break;
            default:
                System.out.println("Número Inválido");
        }

        if (Dia == 1 || Dia == 7) {
            System.out.println("É fim de semana!");
        } else if (Dia >= 2 && Dia <= 6) {
            System.out.println("É dia de semana");
        }
        else {
            System.out.println("Numero inválido");
        }
    }
}