package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Estudante;
import maratonajava.javacore.Gassociacao.dominio.Professor;
import maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SistemaDeSeminarioTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Chico", "Backend");
        Seminario seminario = new Seminario("Desenvolvimento FullStack", "Rua: A", professor);
        Estudante estudante1 = new Estudante("Leonardo", 29);

        seminario.adicionaEstudante(estudante1);

        seminario.imprime();
    }
}