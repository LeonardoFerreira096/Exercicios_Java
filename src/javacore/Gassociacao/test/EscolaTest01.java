package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Rosy Costa");
        Professor[] professors = {professor};
        Escola escola = new Escola ("EEEP Jaime Alencar", professors);

        escola.imprime();
    }
}
