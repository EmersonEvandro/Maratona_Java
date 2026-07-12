package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprimir todos os numeros pares de 0 a 1000000
        //While
        int count = 0;
//        while(count < 1000000){
//            System.out.println(count);
//            count = count + 2;
//        }

        //do while
//        do {
//            System.out.println(count = count + 2);
//        } while (count < 1000000);

        for(int i = 0; i < 1000000; i = i + 2){
            System.out.println(i);
        }

        //Resolução Dev Dojo
        for(int i = 0; i <= 1000000; i++){
            if(i % 2 == 0){
                System.out.println((i));
            }
        }
    }
}
