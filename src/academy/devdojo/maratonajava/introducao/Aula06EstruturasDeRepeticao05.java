package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        int valorCarro = 40000;

        for (int qtdParc = valorCarro; qtdParc >= 1; qtdParc--) {
            int valorParcela = valorCarro / qtdParc;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcelas " +qtdParc+ " R$ " +valorParcela);
        }

    }
}
