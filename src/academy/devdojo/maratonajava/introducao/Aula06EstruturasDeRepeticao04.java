package academy.devdojo.maratonajava.introducao;

import javax.sound.midi.Soundbank;
import java.text.BreakIterator;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado. Por exemplo 40000
    //Valor do carro pode ser dividido e 2 de 20000, 3  de 13333,333, 4 de 10000
    //Condição valorParcela >=1000;
    public static void main(String[] args) {

        int valorCarro = 40000;

        for (int qtdParc = 1; qtdParc <= valorCarro; qtdParc++) {
            int valorParcela = valorCarro / qtdParc;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcelas " +qtdParc+ " R$ " +valorParcela);
        }

    }
}
