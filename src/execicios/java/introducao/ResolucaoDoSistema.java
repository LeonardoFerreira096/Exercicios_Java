package execicios.java.introducao;

import java.awt.*;

public class ResolucaoDoSistema {
    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();

        System.out.println("A resolução do meu sistema é: ");
        System.out.println("Largura: " + resolucao.width + " pixels");
        System.out.println("Altura: " + resolucao.height + " pixels");

    }
}