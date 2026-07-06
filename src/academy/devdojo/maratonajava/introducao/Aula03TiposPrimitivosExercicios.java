package academy.devdojo.maratonajava.introducao;

import java.net.SocketOption;

/* Pratica
* Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensage:
* Eu <nome>. morando no endereço <endereço> confirmo que recebi o <salario>, na <data>*/
public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name = "Fernando";
        String address = "Rua do Salario, nº 25";
        double wage = 5555.51;
        String date = "05/07/2026";
        String relatorio = "Eu "+name+" morando no endereço "+address+" confirmo que recebi o "+wage+", na "+date;

        System.out.println(relatorio);
    }
}
