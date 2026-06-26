package iredejava.atividades.atividade02.exercicio07;

public class TesteExercicio07 {
    public static void main(String[] args) {
        Animal [] fazerSom = new Animal[2];
        fazerSom[0] = new Cachorro();
        fazerSom[1] = new Gato();
        

        for (Animal animal : fazerSom) {
            animal.fazerSom();
        }
    }

}