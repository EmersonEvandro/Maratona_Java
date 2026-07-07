package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //Estrutura Condicionais  - IF
        if(true) {
            System.out.println("Dentro do If");
        }
        System.out.println("Fora do If");

        //Maior de idade
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        //Else If

    }
}
