package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //Padrão de inicialização do tipos: byte, short, int, long, float e double o valor é 0;
        // char '\u00000'
        // boolean false
        //String null
        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[2];

        System.out.println(nomes);
    }
}
