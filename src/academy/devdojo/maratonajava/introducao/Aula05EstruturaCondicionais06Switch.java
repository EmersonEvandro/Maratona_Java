package academy.devdojo.maratonajava.introducao;

import java.text.BreakIterator;

public class Aula05EstruturaCondicionais06Switch {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final da semana
        //Considerando 1 como domingo

        byte dia = 7;

        if (dia == 1 || dia == 7){
            switch (dia) {
                case 1:
                    System.out.println("É domingo e se trata do final de semana");
                    break;
                case 7:
                    System.out.println("É sabado e se trata do final de semana");
                    break;
            }
        } else {
            switch (dia){
                case 2:
                    System.out.println("É segunda e se trata de um dia útil");
                    break;
                case 3:
                    System.out.println("É terça e se trata de um dia útil");
                    break;
                case 4:
                    System.out.println("É quarta e se trata de um dia útil");
                    break;
                case 5:
                    System.out.println("É quinta e se trata de um dia útil");
                    break;
                case 6:
                    System.out.println("É sexta e se trata de um dia útil");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
        //Resolução do exercicio
//        byte dia = 1;
//        switch (dia){
//            case 1:
//            case 7:
//            System.out.println("FDS");
//            break;
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//            case 6:
//                System.out.println("Dia útil");
//                break;
//            default:
//                System.out.println("Opção inválida");
//                break;
        }
    }
