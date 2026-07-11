package academy.devdojo.maratonajava.introducao;

import java.security.cert.CertPathValidatorException;

public class Aula05EstruturaCondicionais05Switch {
    public static void main(String[] args) {
        //imprima o dia da semana, considerando 1 como domingo
        byte dia = 5;
        // tipo primitivo utilizados em switch: char, int, byte, short, enum, String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        char sexo = 'F';

        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }


//        if (dia == 1){
//            System.out.println("Domingo");
//        } else if (dia == 2){
//            System.out.println("Segunda");
//        }
    }
}
