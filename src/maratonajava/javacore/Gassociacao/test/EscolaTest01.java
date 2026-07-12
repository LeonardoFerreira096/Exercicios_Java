package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Escola;
import maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Rosy Costa", "Matematica");
        Professor[] professores = {professor};
        Escola escola = new Escola ("EEEP Jaime Alencar", professores);

        escola.imprime();
    }
}
